// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTopicRequest} extends {@link RequestModel}
 *
 * <p>CreateTopicRequest</p>
 */
public class CreateTopicRequest extends Request {
    @Body
    @NameInMap("EnableLogging")
    @Validation(required = true)
    private Boolean enableLogging;

    @Body
    @NameInMap("MaxMessageSize")
    @Validation(required = true)
    private Long maxMessageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("TopicName")
    @Validation(required = true)
    private String topicName;

    private CreateTopicRequest(Builder builder) {
        super(builder);
        this.enableLogging = builder.enableLogging;
        this.maxMessageSize = builder.maxMessageSize;
        this.regionId = builder.regionId;
        this.topicName = builder.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTopicRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableLogging
     */
    public Boolean getEnableLogging() {
        return this.enableLogging;
    }

    /**
     * @return maxMessageSize
     */
    public Long getMaxMessageSize() {
        return this.maxMessageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    public static final class Builder extends Request.Builder<CreateTopicRequest, Builder> {
        private Boolean enableLogging; 
        private Long maxMessageSize; 
        private String regionId; 
        private String topicName; 

        private Builder() {
            super();
        } 

        private Builder(CreateTopicRequest request) {
            super(request);
            this.enableLogging = request.enableLogging;
            this.maxMessageSize = request.maxMessageSize;
            this.regionId = request.regionId;
            this.topicName = request.topicName;
        } 

        /**
         * EnableLogging.
         */
        public Builder enableLogging(Boolean enableLogging) {
            this.putBodyParameter("EnableLogging", enableLogging);
            this.enableLogging = enableLogging;
            return this;
        }

        /**
         * MaxMessageSize.
         */
        public Builder maxMessageSize(Long maxMessageSize) {
            this.putBodyParameter("MaxMessageSize", maxMessageSize);
            this.maxMessageSize = maxMessageSize;
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
         * TopicName.
         */
        public Builder topicName(String topicName) {
            this.putBodyParameter("TopicName", topicName);
            this.topicName = topicName;
            return this;
        }

        @Override
        public CreateTopicRequest build() {
            return new CreateTopicRequest(this);
        } 

    } 

}
