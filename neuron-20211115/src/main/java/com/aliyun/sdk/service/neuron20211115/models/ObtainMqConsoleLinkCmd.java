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
 * {@link ObtainMqConsoleLinkCmd} extends {@link TeaModel}
 *
 * <p>ObtainMqConsoleLinkCmd</p>
 */
public class ObtainMqConsoleLinkCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("env")
    private String env;

    @com.aliyun.core.annotation.NameInMap("groupType")
    private String groupType;

    @com.aliyun.core.annotation.NameInMap("mqGroupId")
    private String mqGroupId;

    @com.aliyun.core.annotation.NameInMap("pbcId")
    private Long pbcId;

    @com.aliyun.core.annotation.NameInMap("serviceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("topicName")
    private String topicName;

    private ObtainMqConsoleLinkCmd(Builder builder) {
        this.env = builder.env;
        this.groupType = builder.groupType;
        this.mqGroupId = builder.mqGroupId;
        this.pbcId = builder.pbcId;
        this.serviceName = builder.serviceName;
        this.topicName = builder.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObtainMqConsoleLinkCmd create() {
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
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return mqGroupId
     */
    public String getMqGroupId() {
        return this.mqGroupId;
    }

    /**
     * @return pbcId
     */
    public Long getPbcId() {
        return this.pbcId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    public static final class Builder {
        private String env; 
        private String groupType; 
        private String mqGroupId; 
        private Long pbcId; 
        private String serviceName; 
        private String topicName; 

        private Builder() {
        } 

        private Builder(ObtainMqConsoleLinkCmd model) {
            this.env = model.env;
            this.groupType = model.groupType;
            this.mqGroupId = model.mqGroupId;
            this.pbcId = model.pbcId;
            this.serviceName = model.serviceName;
            this.topicName = model.topicName;
        } 

        /**
         * env.
         */
        public Builder env(String env) {
            this.env = env;
            return this;
        }

        /**
         * groupType.
         */
        public Builder groupType(String groupType) {
            this.groupType = groupType;
            return this;
        }

        /**
         * mqGroupId.
         */
        public Builder mqGroupId(String mqGroupId) {
            this.mqGroupId = mqGroupId;
            return this;
        }

        /**
         * pbcId.
         */
        public Builder pbcId(Long pbcId) {
            this.pbcId = pbcId;
            return this;
        }

        /**
         * serviceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * topicName.
         */
        public Builder topicName(String topicName) {
            this.topicName = topicName;
            return this;
        }

        public ObtainMqConsoleLinkCmd build() {
            return new ObtainMqConsoleLinkCmd(this);
        } 

    } 

}
