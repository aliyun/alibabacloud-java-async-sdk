// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.List < Filters> filters;

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
        this.filters = builder.filters;
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
     * @return filters
     */
    public java.util.List < Filters> getFilters() {
        return this.filters;
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
        private java.util.List < Filters> filters; 
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
            this.filters = request.filters;
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
         * <p>End time of resource usage. 
         * <notice>Note: Only supports querying service instances on private deployments.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-01T12:00:00</p>
         */
        public Builder expireTimeEnd(String expireTimeEnd) {
            this.putQueryParameter("ExpireTimeEnd", expireTimeEnd);
            this.expireTimeEnd = expireTimeEnd;
            return this;
        }

        /**
         * <p>Start time of resource usage. 
         * <notice>Note: Only supports querying service instances on private deployments.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-01T12:00:00</p>
         */
        public Builder expireTimeStart(String expireTimeStart) {
            this.putQueryParameter("ExpireTimeStart", expireTimeStart);
            this.expireTimeStart = expireTimeStart;
            return this;
        }

        /**
         * <p>The filter conditions. Vaild values:</p>
         * <ul>
         * <li><p>ExpireTimeStart：
         * Query start time for Subscription resource expiration.
         * <notice>Notice Note: Only supports querying service instances on private deployments.&gt;Notice: </p>
         * </li>
         * <li><p>ExpireTimeEnd：Query end time for Subscription resource expiration.
         * <notice>Notice Note: Only supports querying service instances on private deployments.&gt;Notice: </p>
         * </li>
         * <li><p>PayType：The billing method of the read-only instance. 
         * <notice>Notice Note: Only supports querying service instances on private deployments.<notice> </p>
         * <p> Valid values:</p>
         * <ul>
         * <li><p>PayAsYouGo</p>
         * </li>
         * <li><p>Subscription</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>ResourceARN：The Alibaba Cloud Resource Name (ARN) of a resource.</p>
         * </li>
         * </ul>
         */
        public Builder filters(java.util.List < Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that determines the start point of the next query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is not returned, it indicates that no additional results exist.</li>
         * <li>If <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AAAAAc3HCuYhJi/wvpk4xOr0VLbAx7BkQzyYC+ONO+WudHGKEdB0uWSY7AGnM3qCgm/Ynge7zU6NWdbj0Tegyajyqyc=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The billing method of the read-only instance. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go</li>
         * <li><strong>Prepaid</strong>: subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The region ID. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: China (Hangzhou).</li>
         * <li>ap-southeast-1: Singapore.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of a resource.</p>
         */
        public Builder resourceARN(java.util.List < String > resourceARN) {
            this.putQueryParameter("ResourceARN", resourceARN);
            this.resourceARN = resourceARN;
            return this;
        }

        /**
         * <p>The ID of the service instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>si-d8a0cc2a1ee04dce****</p>
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        /**
         * <p>Service Instance resource type，include AliyunResource and ContainerResource.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunResource</p>
         */
        public Builder serviceInstanceResourceType(String serviceInstanceResourceType) {
            this.putQueryParameter("ServiceInstanceResourceType", serviceInstanceResourceType);
            this.serviceInstanceResourceType = serviceInstanceResourceType;
            return this;
        }

        /**
         * <p>The tag key and value.</p>
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

    /**
     * 
     * {@link ListServiceInstanceResourcesRequest} extends {@link TeaModel}
     *
     * <p>ListServiceInstanceResourcesRequest</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List < String > values;

        private Filters(Builder builder) {
            this.name = builder.name;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private String name; 
            private java.util.List < String > values; 

            /**
             * <p>Vaild values:</p>
             * <ul>
             * <li>ExpireTimeStart</li>
             * <li>ExpireTimeEnd</li>
             * <li>PayType</li>
             * <li>ResourceARN</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ExpireTimeStart</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the filter condition.</p>
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceInstanceResourcesRequest} extends {@link TeaModel}
     *
     * <p>ListServiceInstanceResourcesRequest</p>
     */
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
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
