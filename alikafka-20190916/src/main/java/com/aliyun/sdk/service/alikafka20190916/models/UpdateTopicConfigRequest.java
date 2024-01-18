// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTopicConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateTopicConfigRequest</p>
 */
public class UpdateTopicConfigRequest extends Request {
    @Query
    @NameInMap("Config")
    @Validation(required = true)
    private String config;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    @Query
    @NameInMap("Value")
    @Validation(required = true)
    private String value;

    private UpdateTopicConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.topic = builder.topic;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTopicConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
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

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<UpdateTopicConfigRequest, Builder> {
        private String config; 
        private String instanceId; 
        private String regionId; 
        private String topic; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTopicConfigRequest request) {
            super(request);
            this.config = request.config;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.topic = request.topic;
            this.value = request.value;
        } 

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Topic.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public UpdateTopicConfigRequest build() {
            return new UpdateTopicConfigRequest(this);
        } 

    } 

}
