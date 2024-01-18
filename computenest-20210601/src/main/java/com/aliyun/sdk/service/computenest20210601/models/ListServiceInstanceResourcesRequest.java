// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceInstanceResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListServiceInstanceResourcesRequest</p>
 */
public class ListServiceInstanceResourcesRequest extends Request {
    @Query
    @NameInMap("ExpireTimeEnd")
    private String expireTimeEnd;

    @Query
    @NameInMap("ExpireTimeStart")
    private String expireTimeStart;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PayType")
    private String payType;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceARN")
    private java.util.List < String > resourceARN;

    @Query
    @NameInMap("ServiceInstanceId")
    @Validation(required = true)
    private String serviceInstanceId;

    @Query
    @NameInMap("ServiceInstanceResourceType")
    private String serviceInstanceResourceType;

    @Query
    @NameInMap("Tag")
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
         * ExpireTimeEnd.
         */
        public Builder expireTimeEnd(String expireTimeEnd) {
            this.putQueryParameter("ExpireTimeEnd", expireTimeEnd);
            this.expireTimeEnd = expireTimeEnd;
            return this;
        }

        /**
         * ExpireTimeStart.
         */
        public Builder expireTimeStart(String expireTimeStart) {
            this.putQueryParameter("ExpireTimeStart", expireTimeStart);
            this.expireTimeStart = expireTimeStart;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
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
         * ResourceARN.
         */
        public Builder resourceARN(java.util.List < String > resourceARN) {
            this.putQueryParameter("ResourceARN", resourceARN);
            this.resourceARN = resourceARN;
            return this;
        }

        /**
         * ServiceInstanceId.
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        /**
         * ServiceInstanceResourceType.
         */
        public Builder serviceInstanceResourceType(String serviceInstanceResourceType) {
            this.putQueryParameter("ServiceInstanceResourceType", serviceInstanceResourceType);
            this.serviceInstanceResourceType = serviceInstanceResourceType;
            return this;
        }

        /**
         * Tag.
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
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
