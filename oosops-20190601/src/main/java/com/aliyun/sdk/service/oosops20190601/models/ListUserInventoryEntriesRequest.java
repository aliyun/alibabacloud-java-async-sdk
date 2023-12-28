// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserInventoryEntriesRequest} extends {@link RequestModel}
 *
 * <p>ListUserInventoryEntriesRequest</p>
 */
public class ListUserInventoryEntriesRequest extends Request {
    @Query
    @NameInMap("AliUid")
    @Validation(required = true)
    private String aliUid;

    @Query
    @NameInMap("Filter")
    private java.util.List < Filter> filter;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TypeName")
    @Validation(required = true)
    private String typeName;

    private ListUserInventoryEntriesRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.filter = builder.filter;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.typeName = builder.typeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserInventoryEntriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
    }

    /**
     * @return filter
     */
    public java.util.List < Filter> getFilter() {
        return this.filter;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return typeName
     */
    public String getTypeName() {
        return this.typeName;
    }

    public static final class Builder extends Request.Builder<ListUserInventoryEntriesRequest, Builder> {
        private String aliUid; 
        private java.util.List < Filter> filter; 
        private String instanceId; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String typeName; 

        private Builder() {
            super();
        } 

        private Builder(ListUserInventoryEntriesRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.filter = request.filter;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.typeName = request.typeName;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(String aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * Filter.
         */
        public Builder filter(java.util.List < Filter> filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TypeName.
         */
        public Builder typeName(String typeName) {
            this.putQueryParameter("TypeName", typeName);
            this.typeName = typeName;
            return this;
        }

        @Override
        public ListUserInventoryEntriesRequest build() {
            return new ListUserInventoryEntriesRequest(this);
        } 

    } 

    public static class Filter extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("Value")
        private java.util.List < String > value;

        private Filter(Builder builder) {
            this.name = builder.name;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public java.util.List < String > getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String operator; 
            private java.util.List < String > value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(java.util.List < String > value) {
                this.value = value;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}
