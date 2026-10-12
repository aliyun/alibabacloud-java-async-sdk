// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
    @com.aliyun.core.annotation.NameInMap("CollectionName")
    private String collectionName;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private Collection(Builder builder) {
        this.collectionName = builder.collectionName;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.ownerId = builder.ownerId;
        this.userId = builder.userId;
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
     * @return collectionName
     */
    public String getCollectionName() {
        return this.collectionName;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String collectionName; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String ownerId; 
        private String userId; 

        private Builder() {
        } 

        private Builder(Collection model) {
            this.collectionName = model.collectionName;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.ownerId = model.ownerId;
            this.userId = model.userId;
        } 

        /**
         * <p>The name of the collection. The name must be globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>AI4D</p>
         */
        public Builder collectionName(String collectionName) {
            this.collectionName = collectionName;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-21T17:12:35Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The last update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-21T17:12:35Z</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>155770209******</p>
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The ID of the user that created the collection.</p>
         * 
         * <strong>example:</strong>
         * <p>155770209******</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Collection build() {
            return new Collection(this);
        } 

    } 

}
