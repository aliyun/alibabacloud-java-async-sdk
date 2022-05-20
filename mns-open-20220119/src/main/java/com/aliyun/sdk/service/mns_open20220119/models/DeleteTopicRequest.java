// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTopicRequest} extends {@link RequestModel}
 *
 * <p>DeleteTopicRequest</p>
 */
public class DeleteTopicRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TopicName")
    @Validation(required = true)
    private String topicName;

    private DeleteTopicRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.topicName = builder.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTopicRequest create() {
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
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    public static final class Builder extends Request.Builder<DeleteTopicRequest, Builder> {
        private String regionId; 
        private String topicName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTopicRequest request) {
            super(request);
            this.regionId = request.regionId;
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
         * TopicName.
         */
        public Builder topicName(String topicName) {
            this.putQueryParameter("TopicName", topicName);
            this.topicName = topicName;
            return this;
        }

        @Override
        public DeleteTopicRequest build() {
            return new DeleteTopicRequest(this);
        } 

    } 

}
