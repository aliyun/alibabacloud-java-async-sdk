// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceInstanceResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListServiceInstanceResourcesRequest</p>
 */
public class ListServiceInstanceResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTimeEnd")
    private String expireTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTimeStart")
    private String expireTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceARN")
    private java.util.List < String > resourceARN;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceResourceType")
    private String serviceInstanceResourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    private ListServiceInstanceResourcesRequest(Builder builder) {
        super(builder);
        this.expireTimeEnd = builder.expireTimeEnd;
        this.expireTimeStart = builder.expireTimeStart;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.resourceARN = builder.resourceARN;
        this.serviceInstanceId = builder.serviceInstanceId;
        this.serviceInstanceResourceType = builder.serviceInstanceResourceType;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceInstanceResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expireTimeEnd
     */
    public String getExpireTimeEnd() {
        return this.expireTimeEnd;
    }

    /**
     * @return expireTimeStart
     */
    public String getExpireTimeStart() {
        return this.expireTimeStart;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceARN
     */
    public java.util.List < String > getResourceARN() {
        return this.resourceARN;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    /**
     * @return serviceInstanceResourceType
     */
    public String getServiceInstanceResourceType() {
        return this.serviceInstanceResourceType;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListServiceInstanceResourcesRequest, Builder> {
        private String expireTimeEnd; 
        private String expireTimeStart; 
        private Integer maxResults; 
        private String nextToken; 
        private String payType; 
        private String regionId; 
        private java.util.List < String > resourceARN; 
        private String serviceInstanceId; 
        private String serviceInstanceResourceType; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceInstanceResourcesRequest request) {
            super(request);
            this.expireTimeEnd = request.expireTimeEnd;
            this.expireTimeStart = request.expireTimeStart;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.payType = request.payType;
            this.regionId = request.regionId;
            this.resourceARN = request.resourceARN;
            this.serviceInstanceId = request.serviceInstanceId;
            this.serviceInstanceResourceType = request.serviceInstanceResourceType;
            this.tag = request.tag;
        } 

        /**
         * End time of resource usage. 
         * <p>
         * <notice>Note: Only supports querying service instances on private deployments.></notice>
         */
        public Builder expireTimeEnd(String expireTimeEnd) {
            this.putQueryParameter("ExpireTimeEnd", expireTimeEnd);
            this.expireTimeEnd = expireTimeEnd;
            return this;
        }

        /**
         * Start time of resource usage. 
         * <p>
         * <notice>Note: Only supports querying service instances on private deployments.></notice>
         */
        public Builder expireTimeStart(String expireTimeStart) {
            this.putQueryParameter("ExpireTimeStart", expireTimeStart);
            this.expireTimeStart = expireTimeStart;
            return this;
        }

        /**
         * The number of entries per page. Valid values: 1 to 100. Default value: 20.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the next query. Valid values:
         * <p>
         * 
         * *   If **NextToken** is not returned, it indicates that no additional results exist.
         * *   If **NextToken** was returned in the previous query, specify the value to obtain the next set of results.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The billing method of the read-only instance. Valid values:
         * <p>
         * 
         * *   **Postpaid**: pay-as-you-go
         * *   **Prepaid**: subscription
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * The region ID. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: China (Hangzhou).
         * *   ap-southeast-1: Singapore.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The Alibaba Cloud Resource Name (ARN) of a resource.
         */
        public Builder resourceARN(java.util.List < String > resourceARN) {
            this.putQueryParameter("ResourceARN", resourceARN);
            this.resourceARN = resourceARN;
            return this;
        }

        /**
         * The ID of the service instance.
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        /**
         * Service Instance resource type，include AliyunResource and ContainerResource.
         */
        public Builder serviceInstanceResourceType(String serviceInstanceResourceType) {
            this.putQueryParameter("ServiceInstanceResourceType", serviceInstanceResourceType);
            this.serviceInstanceResourceType = serviceInstanceResourceType;
            return this;
        }

        /**
         * The tag key and value.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ListServiceInstanceResourcesRequest build() {
            return new ListServiceInstanceResourcesRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
