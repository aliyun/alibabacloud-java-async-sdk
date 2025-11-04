// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link EntityMediaBasicInfo} extends {@link TeaModel}
 *
 * <p>EntityMediaBasicInfo</p>
 */
public class EntityMediaBasicInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("Biz")
    private String biz;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("EntityId")
    private String entityId;

    @com.aliyun.core.annotation.NameInMap("EntityMediaId")
    private String entityMediaId;

    @com.aliyun.core.annotation.NameInMap("ModifiedTime")
    private String modifiedTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private EntityMediaBasicInfo(Builder builder) {
        this.appId = builder.appId;
        this.biz = builder.biz;
        this.createTime = builder.createTime;
        this.entityId = builder.entityId;
        this.entityMediaId = builder.entityMediaId;
        this.modifiedTime = builder.modifiedTime;
        this.status = builder.status;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EntityMediaBasicInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return biz
     */
    public String getBiz() {
        return this.biz;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
    }

    /**
     * @return entityMediaId
     */
    public String getEntityMediaId() {
        return this.entityMediaId;
    }

    /**
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder {
        private String appId; 
        private String biz; 
        private String createTime; 
        private String entityId; 
        private String entityMediaId; 
        private String modifiedTime; 
        private String status; 
        private String userData; 

        private Builder() {
        } 

        private Builder(EntityMediaBasicInfo model) {
            this.appId = model.appId;
            this.biz = model.biz;
            this.createTime = model.createTime;
            this.entityId = model.entityId;
            this.entityMediaId = model.entityMediaId;
            this.modifiedTime = model.modifiedTime;
            this.status = model.status;
            this.userData = model.userData;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * Biz.
         */
        public Builder biz(String biz) {
            this.biz = biz;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * EntityId.
         */
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * EntityMediaId.
         */
        public Builder entityMediaId(String entityMediaId) {
            this.entityMediaId = entityMediaId;
            return this;
        }

        /**
         * ModifiedTime.
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        public EntityMediaBasicInfo build() {
            return new EntityMediaBasicInfo(this);
        } 

    } 

}
