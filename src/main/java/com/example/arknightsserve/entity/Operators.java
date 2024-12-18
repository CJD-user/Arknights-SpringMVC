package com.example.arknightsserve.entity;

import java.io.Serializable;

/**
 * operators
 * @author 
 */
public class Operators implements Serializable {
    private Integer id;

    private String thumbnail;

    private String fullimage;

    private String halfimg;

    private String name;

    private String cardtop;

    private String star;

    private String starlevel;

    private Integer type;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getFullimage() {
        return fullimage;
    }

    public void setFullimage(String fullimage) {
        this.fullimage = fullimage;
    }

    public String getHalfimg() {
        return halfimg;
    }

    public void setHalfimg(String halfimg) {
        this.halfimg = halfimg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardtop() {
        return cardtop;
    }

    public void setCardtop(String cardtop) {
        this.cardtop = cardtop;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getStarlevel() {
        return starlevel;
    }

    public void setStarlevel(String starlevel) {
        this.starlevel = starlevel;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Operators other = (Operators) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getThumbnail() == null ? other.getThumbnail() == null : this.getThumbnail().equals(other.getThumbnail()))
            && (this.getFullimage() == null ? other.getFullimage() == null : this.getFullimage().equals(other.getFullimage()))
            && (this.getHalfimg() == null ? other.getHalfimg() == null : this.getHalfimg().equals(other.getHalfimg()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCardtop() == null ? other.getCardtop() == null : this.getCardtop().equals(other.getCardtop()))
            && (this.getStar() == null ? other.getStar() == null : this.getStar().equals(other.getStar()))
            && (this.getStarlevel() == null ? other.getStarlevel() == null : this.getStarlevel().equals(other.getStarlevel()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getThumbnail() == null) ? 0 : getThumbnail().hashCode());
        result = prime * result + ((getFullimage() == null) ? 0 : getFullimage().hashCode());
        result = prime * result + ((getHalfimg() == null) ? 0 : getHalfimg().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCardtop() == null) ? 0 : getCardtop().hashCode());
        result = prime * result + ((getStar() == null) ? 0 : getStar().hashCode());
        result = prime * result + ((getStarlevel() == null) ? 0 : getStarlevel().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", thumbnail=").append(thumbnail);
        sb.append(", fullimage=").append(fullimage);
        sb.append(", halfimg=").append(halfimg);
        sb.append(", name=").append(name);
        sb.append(", cardtop=").append(cardtop);
        sb.append(", star=").append(star);
        sb.append(", starlevel=").append(starlevel);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}