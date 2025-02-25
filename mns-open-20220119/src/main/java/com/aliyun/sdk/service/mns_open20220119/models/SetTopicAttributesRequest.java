// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

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
 * {@link SetTopicAttributesRequest} extends {@link RequestModel}
 *
 * <p>SetTopicAttributesRequest</p>
 */
public class SetTopicAttributesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableLogging")
    private Boolean enableLogging;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxMessageSize")
    private Long maxMessageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicName;

    private SetTopicAttributesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.enableLogging = builder.enableLogging;
        this.maxMessageSize = builder.maxMessageSize;
        this.topicName = builder.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetTopicAttributesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    public static final class Builder extends Request.Builder<SetTopicAttributesRequest, Builder> {
        private String regionId; 
        private Boolean enableLogging; 
        private Long maxMessageSize; 
        private String topicName; 

        private Builder() {
            super();
        } 

        private Builder(SetTopicAttributesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.enableLogging = request.enableLogging;
            this.maxMessageSize = request.maxMessageSize;
            this.topicName = request.topicName;
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
         * <p>Specifies whether to enable the log management feature. Valid values:</p>
         * <ul>
         * <li>true: enabled.</li>
         * <li>false: disabled. Default value: false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder enableLogging(Boolean enableLogging) {
            this.putQueryParameter("EnableLogging", enableLogging);
            this.enableLogging = enableLogging;
            return this;
        }

        /**
         * <p>The maximum length of the message that is sent to the topic. Valid values: 1024 to 65536. Unit: bytes. Default value: 65536.</p>
         * 
         * <strong>example:</strong>
         * <p>65536</p>
         */
        public Builder maxMessageSize(Long maxMessageSize) {
            this.putQueryParameter("MaxMessageSize", maxMessageSize);
            this.maxMessageSize = maxMessageSize;
            return this;
        }

        /**
         * <p>The name of the topic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder topicName(String topicName) {
            this.putQueryParameter("TopicName", topicName);
            this.topicName = topicName;
            return this;
        }

        @Override
        public SetTopicAttributesRequest build() {
            return new SetTopicAttributesRequest(this);
        } 

    } 

}
