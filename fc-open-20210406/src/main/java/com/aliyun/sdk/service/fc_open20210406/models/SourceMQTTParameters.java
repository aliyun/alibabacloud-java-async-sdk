// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SourceMQTTParameters} extends {@link TeaModel}
 *
 * <p>SourceMQTTParameters</p>
 */
public class SourceMQTTParameters extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private SourceMQTTParameters(Builder builder) {
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SourceMQTTParameters create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder {
        private String instanceId; 
        private String regionId; 
        private String topic; 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * Topic.
         */
        public Builder topic(String topic) {
            this.topic = topic;
            return this;
        }

        public SourceMQTTParameters build() {
            return new SourceMQTTParameters(this);
        } 

    } 

}
