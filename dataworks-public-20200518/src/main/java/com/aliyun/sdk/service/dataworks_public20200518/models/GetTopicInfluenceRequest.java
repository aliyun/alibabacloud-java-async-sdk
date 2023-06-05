// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTopicInfluenceRequest} extends {@link RequestModel}
 *
 * <p>GetTopicInfluenceRequest</p>
 */
public class GetTopicInfluenceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("TopicId")
    @Validation(required = true)
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TopicId.
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
