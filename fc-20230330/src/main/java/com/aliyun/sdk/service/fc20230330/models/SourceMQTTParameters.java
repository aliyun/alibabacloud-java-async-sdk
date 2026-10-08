// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link SourceMQTTParameters} extends {@link TeaModel}
 *
 * <p>SourceMQTTParameters</p>
 */
public class SourceMQTTParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("Topic")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SourceMQTTParameters model) {
            this.instanceId = model.instanceId;
            this.regionId = model.regionId;
            this.topic = model.topic;
        } 

        /**
         * <p>The ID of the ApsaraMQ for MQTT instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mqtt-****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region in which the ApsaraMQ for MQTT instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the topic in the ApsaraMQ for MQTT instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testTopic</p>
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
