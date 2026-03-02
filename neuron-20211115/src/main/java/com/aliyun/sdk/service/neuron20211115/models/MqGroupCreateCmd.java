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
 * {@link MqGroupCreateCmd} extends {@link TeaModel}
 *
 * <p>MqGroupCreateCmd</p>
 */
public class MqGroupCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("env")
    private String env;

    @com.aliyun.core.annotation.NameInMap("laneId")
    private Long laneId;

    @com.aliyun.core.annotation.NameInMap("laneName")
    private String laneName;

    @com.aliyun.core.annotation.NameInMap("messageType")
    private Integer messageType;

    @com.aliyun.core.annotation.NameInMap("protocolType")
    private String protocolType;

    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("serviceId")
    private String serviceId;

    private MqGroupCreateCmd(Builder builder) {
        this.env = builder.env;
        this.laneId = builder.laneId;
        this.laneName = builder.laneName;
        this.messageType = builder.messageType;
        this.protocolType = builder.protocolType;
        this.remark = builder.remark;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MqGroupCreateCmd create() {
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
     * @return laneId
     */
    public Long getLaneId() {
        return this.laneId;
    }

    /**
     * @return laneName
     */
    public String getLaneName() {
        return this.laneName;
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
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    public static final class Builder {
        private String env; 
        private Long laneId; 
        private String laneName; 
        private Integer messageType; 
        private String protocolType; 
        private String remark; 
        private String serviceId; 

        private Builder() {
        } 

        private Builder(MqGroupCreateCmd model) {
            this.env = model.env;
            this.laneId = model.laneId;
            this.laneName = model.laneName;
            this.messageType = model.messageType;
            this.protocolType = model.protocolType;
            this.remark = model.remark;
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
         * laneId.
         */
        public Builder laneId(Long laneId) {
            this.laneId = laneId;
            return this;
        }

        /**
         * laneName.
         */
        public Builder laneName(String laneName) {
            this.laneName = laneName;
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
         * serviceId.
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public MqGroupCreateCmd build() {
            return new MqGroupCreateCmd(this);
        } 

    } 

}
