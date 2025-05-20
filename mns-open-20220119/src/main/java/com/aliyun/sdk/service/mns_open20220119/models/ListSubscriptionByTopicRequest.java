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
 * {@link ListSubscriptionByTopicRequest} extends {@link RequestModel}
 *
 * <p>ListSubscriptionByTopicRequest</p>
 */
public class ListSubscriptionByTopicRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointType")
    private String endpointType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointValue")
    private String endpointValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Long pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionName")
    private String subscriptionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicName")
    private String topicName;

    private ListSubscriptionByTopicRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endpointType = builder.endpointType;
        this.endpointValue = builder.endpointValue;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.subscriptionName = builder.subscriptionName;
        this.topicName = builder.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubscriptionByTopicRequest create() {
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
     * @return endpointType
     */
    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * @return endpointValue
     */
    public String getEndpointValue() {
        return this.endpointValue;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return subscriptionName
     */
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    /**
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    public static final class Builder extends Request.Builder<ListSubscriptionByTopicRequest, Builder> {
        private String regionId; 
        private String endpointType; 
        private String endpointValue; 
        private Long pageNum; 
        private Long pageSize; 
        private String subscriptionName; 
        private String topicName; 

        private Builder() {
            super();
        } 

        private Builder(ListSubscriptionByTopicRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endpointType = request.endpointType;
            this.endpointValue = request.endpointValue;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.subscriptionName = request.subscriptionName;
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
         * EndpointType.
         */
        public Builder endpointType(String endpointType) {
            this.putQueryParameter("EndpointType", endpointType);
            this.endpointType = endpointType;
            return this;
        }

        /**
         * EndpointValue.
         */
        public Builder endpointValue(String endpointValue) {
            this.putQueryParameter("EndpointValue", endpointValue);
            this.endpointValue = endpointValue;
            return this;
        }

        /**
         * <p>The page number. Valid values: 1 to 100000000. If you set this parameter to a value smaller than 1, the value of this parameter is 1 by default. If you set this parameter to a value greater than 100000000, the value of this parameter is 100000000 by default.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Long pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page. Value values: 10 to 50. If you set this parameter to a value smaller than 10, the value of this parameter is 10 by default. If you set this parameter to a value greater than 50, the value of this parameter is 50 by default.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-subscription</p>
         */
        public Builder subscriptionName(String subscriptionName) {
            this.putQueryParameter("SubscriptionName", subscriptionName);
            this.subscriptionName = subscriptionName;
            return this;
        }

        /**
         * <p>The topic name.</p>
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
        public ListSubscriptionByTopicRequest build() {
            return new ListSubscriptionByTopicRequest(this);
        } 

    } 

}
