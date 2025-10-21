// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link GetTopicRequest} extends {@link RequestModel}
 *
 * <p>GetTopicRequest</p>
 */
public class GetTopicRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicId")
    private Long topicId;

    private GetTopicRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.topicId = builder.topicId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTopicRequest create() {
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
     * @return topicId
     */
    public Long getTopicId() {
        return this.topicId;
    }

    public static final class Builder extends Request.Builder<GetTopicRequest, Builder> {
        private String regionId; 
        private Long topicId; 

        private Builder() {
            super();
        } 

        private Builder(GetTopicRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.topicId = request.topicId;
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
         * TopicId.
         */
        public Builder topicId(Long topicId) {
            this.putQueryParameter("TopicId", topicId);
            this.topicId = topicId;
            return this;
        }

        @Override
        public GetTopicRequest build() {
            return new GetTopicRequest(this);
        } 

    } 

}
