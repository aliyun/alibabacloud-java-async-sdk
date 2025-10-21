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
 * {@link DeleteTopicRequest} extends {@link RequestModel}
 *
 * <p>DeleteTopicRequest</p>
 */
public class DeleteTopicRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicIdList")
    private java.util.List<Long> topicIdList;

    private DeleteTopicRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.topicIdList = builder.topicIdList;
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
     * @return topicIdList
     */
    public java.util.List<Long> getTopicIdList() {
        return this.topicIdList;
    }

    public static final class Builder extends Request.Builder<DeleteTopicRequest, Builder> {
        private String regionId; 
        private java.util.List<Long> topicIdList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTopicRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.topicIdList = request.topicIdList;
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
         * TopicIdList.
         */
        public Builder topicIdList(java.util.List<Long> topicIdList) {
            String topicIdListShrink = shrink(topicIdList, "TopicIdList", "json");
            this.putQueryParameter("TopicIdList", topicIdListShrink);
            this.topicIdList = topicIdList;
            return this;
        }

        @Override
        public DeleteTopicRequest build() {
            return new DeleteTopicRequest(this);
        } 

    } 

}
