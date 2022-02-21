// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishMqttMessageRequest} extends {@link RequestModel}
 *
 * <p>PublishMqttMessageRequest</p>
 */
public class PublishMqttMessageRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private String appKey;

    @Query
    @NameInMap("Message")
    @Validation(required = true)
    private String message;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("QoS")
    @Validation(maximum = 2)
    private Integer qoS;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private PublishMqttMessageRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.message = builder.message;
        this.projectId = builder.projectId;
        this.qoS = builder.qoS;
        this.regionId = builder.regionId;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishMqttMessageRequest create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return qoS
     */
    public Integer getQoS() {
        return this.qoS;
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

    public static final class Builder extends Request.Builder<PublishMqttMessageRequest, Builder> {
        private String appKey; 
        private String message; 
        private String projectId; 
        private Integer qoS; 
        private String regionId; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(PublishMqttMessageRequest response) {
            super(response);
            this.appKey = response.appKey;
            this.message = response.message;
            this.projectId = response.projectId;
            this.qoS = response.qoS;
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
         * Message.
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
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
         * QoS.
         */
        public Builder qoS(Integer qoS) {
            this.putQueryParameter("QoS", qoS);
            this.qoS = qoS;
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
        public PublishMqttMessageRequest build() {
            return new PublishMqttMessageRequest(this);
        } 

    } 

}
