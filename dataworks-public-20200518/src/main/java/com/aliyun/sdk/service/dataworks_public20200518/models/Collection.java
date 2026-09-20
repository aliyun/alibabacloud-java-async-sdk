// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Collection} extends {@link TeaModel}
 *
 * <p>Collection</p>
 */
public class Collection extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CollectionType")
    private String collectionType;

    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("Level")
    private Integer level;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("OwnerName")
    private String ownerName;

    @com.aliyun.core.annotation.NameInMap("QualifiedName")
    private String qualifiedName;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private Long updateTime;

    private Collection(Builder builder) {
        this.collectionType = builder.collectionType;
        this.comment = builder.comment;
        this.createTime = builder.createTime;
        this.level = builder.level;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.ownerName = builder.ownerName;
        this.qualifiedName = builder.qualifiedName;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Collection create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collectionType
     */
    public String getCollectionType() {
        return this.collectionType;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return level
     */
    public Integer getLevel() {
        return this.level;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return ownerName
     */
    public String getOwnerName() {
        return this.ownerName;
    }

    /**
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String collectionType; 
        private String comment; 
        private Long createTime; 
        private Integer level; 
        private String name; 
        private String ownerId; 
        private String ownerName; 
        private String qualifiedName; 
        private Long updateTime; 

        private Builder() {
        } 

        private Builder(Collection model) {
            this.collectionType = model.collectionType;
            this.comment = model.comment;
            this.createTime = model.createTime;
            this.level = model.level;
            this.name = model.name;
            this.ownerId = model.ownerId;
            this.ownerName = model.ownerName;
            this.qualifiedName = model.qualifiedName;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>The type of the collection. Valid values:</p>
         * <ul>
         * <li><strong>ALBUM</strong>: data album</li>
         * <li><strong>ALBUM_CATEGORY</strong>: category in a data album</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>album</p>
         */
        public Builder collectionType(String collectionType) {
            this.collectionType = collectionType;
            return this;
        }

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1668600147617</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The level of the collection. This parameter takes effect only if the CollectionType parameter is set to ALBUM_CATEGORY. Maximum value: 4.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder level(Integer level) {
            this.level = level;
            return this;
        }

        /**
         * <p>The name of the collection.</p>
         * 
         * <strong>example:</strong>
         * <p>collectionName</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account that is used by the collection owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1234444</p>
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The name of the collection owner.</p>
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        public Builder ownerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        /**
         * <p>The unique identifier of the collection.</p>
         * 
         * <strong>example:</strong>
         * <p>album.12334</p>
         */
        public Builder qualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1668600148617</p>
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Collection build() {
            return new Collection(this);
        } 

    } 

}
