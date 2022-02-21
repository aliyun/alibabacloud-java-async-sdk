// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMqttTopicSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>DescribeMqttTopicSubscriptionRequest</p>
 */
public class DescribeMqttTopicSubscriptionRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private String appKey;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private DescribeMqttTopicSubscriptionRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMqttTopicSubscriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
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

    public static final class Builder extends Request.Builder<DescribeMqttTopicSubscriptionRequest, Builder> {
        private String appKey; 
        private String projectId; 
        private String regionId; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMqttTopicSubscriptionRequest response) {
            super(response);
            this.appKey = response.appKey;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.topic = response.topic;
        } 

        /**
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
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

        @Override
        public DescribeMqttTopicSubscriptionRequest build() {
            return new DescribeMqttTopicSubscriptionRequest(this);
        } 

    } 

}
