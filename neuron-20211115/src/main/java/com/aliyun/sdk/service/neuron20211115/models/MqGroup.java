// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link MqGroup} extends {@link TeaModel}
 *
 * <p>MqGroup</p>
 */
public class MqGroup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("env")
    private String env;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("messageType")
    private Integer messageType;

    @com.aliyun.core.annotation.NameInMap("protocolType")
    private String protocolType;

    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("serviceId")
    private String serviceId;

    private MqGroup(Builder builder) {
        this.env = builder.env;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.groupId = builder.groupId;
        this.id = builder.id;
        this.messageType = builder.messageType;
        this.protocolType = builder.protocolType;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MqGroup create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return messageType
     */
    public Integer getMessageType() {
        return this.messageType;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    public static final class Builder {
        private String env; 
        private String gmtCreate; 
        private String gmtModified; 
        private String groupId; 
        private Long id; 
        private Integer messageType; 
        private String protocolType; 
        private String remark; 
        private String requestId; 
        private String serviceId; 

        private Builder() {
        } 

        private Builder(MqGroup model) {
            this.env = model.env;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.groupId = model.groupId;
            this.id = model.id;
            this.messageType = model.messageType;
            this.protocolType = model.protocolType;
            this.remark = model.remark;
            this.requestId = model.requestId;
            this.serviceId = model.serviceId;
        } 

        /**
         * env.
         */
        public Builder env(String env) {
            this.env = env;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * groupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * messageType.
         */
        public Builder messageType(Integer messageType) {
            this.messageType = messageType;
            return this;
        }

        /**
         * protocolType.
         */
        public Builder protocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }

        /**
         * remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * serviceId.
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public MqGroup build() {
            return new MqGroup(this);
        } 

    } 

}
