// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTopicListRequest} extends {@link RequestModel}
 *
 * <p>GetTopicListRequest</p>
 */
public class GetTopicListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topic")
    private String topic;

    private GetTopicListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTopicListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<GetTopicListRequest, Builder> {
        private String currentPage; 
        private String instanceId; 
        private String pageSize; 
        private String regionId; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(GetTopicListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.topic = request.topic;
        } 

        /**
         * The page number. Default value: 1
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the instance to which the topics that you want to query belong.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the topic that you want to query.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public GetTopicListRequest build() {
            return new GetTopicListRequest(this);
        } 

    } 

}
