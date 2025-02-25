// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDSEntityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDSEntityResponseBody</p>
 */
public class DescribeDSEntityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreateUserId")
    private String createUserId;

    @com.aliyun.core.annotation.NameInMap("CreateUserName")
    private String createUserName;

    @com.aliyun.core.annotation.NameInMap("EntityId")
    private Long entityId;

    @com.aliyun.core.annotation.NameInMap("EntityName")
    private String entityName;

    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private String modifyTime;

    @com.aliyun.core.annotation.NameInMap("ModifyUserId")
    private String modifyUserId;

    @com.aliyun.core.annotation.NameInMap("ModifyUserName")
    private String modifyUserName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SysEntityCode")
    private String sysEntityCode;

    private DescribeDSEntityResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.createUserId = builder.createUserId;
        this.createUserName = builder.createUserName;
        this.entityId = builder.entityId;
        this.entityName = builder.entityName;
        this.entityType = builder.entityType;
        this.modifyTime = builder.modifyTime;
        this.modifyUserId = builder.modifyUserId;
        this.modifyUserName = builder.modifyUserName;
        this.requestId = builder.requestId;
        this.sysEntityCode = builder.sysEntityCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDSEntityResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createUserId
     */
    public String getCreateUserId() {
        return this.createUserId;
    }

    /**
     * @return createUserName
     */
    public String getCreateUserName() {
        return this.createUserName;
    }

    /**
     * @return entityId
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * @return entityName
     */
    public String getEntityName() {
        return this.entityName;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return modifyUserId
     */
    public String getModifyUserId() {
        return this.modifyUserId;
    }

    /**
     * @return modifyUserName
     */
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sysEntityCode
     */
    public String getSysEntityCode() {
        return this.sysEntityCode;
    }

    public static final class Builder {
        private String createTime; 
        private String createUserId; 
        private String createUserName; 
        private Long entityId; 
        private String entityName; 
        private String entityType; 
        private String modifyTime; 
        private String modifyUserId; 
        private String modifyUserName; 
        private String requestId; 
        private String sysEntityCode; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreateUserId.
         */
        public Builder createUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }

        /**
         * CreateUserName.
         */
        public Builder createUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }

        /**
         * EntityId.
         */
        public Builder entityId(Long entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * EntityName.
         */
        public Builder entityName(String entityName) {
            this.entityName = entityName;
            return this;
        }

        /**
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * ModifyTime.
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * ModifyUserId.
         */
        public Builder modifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }

        /**
         * ModifyUserName.
         */
        public Builder modifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SysEntityCode.
         */
        public Builder sysEntityCode(String sysEntityCode) {
            this.sysEntityCode = sysEntityCode;
            return this;
        }

        public DescribeDSEntityResponseBody build() {
            return new DescribeDSEntityResponseBody(this);
        } 

    } 

}
