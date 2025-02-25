// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetTopicInfluenceRequest} extends {@link RequestModel}
 *
 * <p>GetTopicInfluenceRequest</p>
 */
public class GetTopicInfluenceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopicId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long topicId;

    private GetTopicInfluenceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.topicId = builder.topicId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTopicInfluenceRequest create() {
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

    public static final class Builder extends Request.Builder<GetTopicInfluenceRequest, Builder> {
        private String regionId; 
        private Long topicId; 

        private Builder() {
            super();
        } 

        private Builder(GetTopicInfluenceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.topicId = request.topicId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the event.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder topicId(Long topicId) {
            this.putBodyParameter("TopicId", topicId);
            this.topicId = topicId;
            return this;
        }

        @Override
        public GetTopicInfluenceRequest build() {
            return new GetTopicInfluenceRequest(this);
        } 

    } 

}
