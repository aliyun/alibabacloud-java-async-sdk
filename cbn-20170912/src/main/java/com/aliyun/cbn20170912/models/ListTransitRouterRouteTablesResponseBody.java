// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListTransitRouterRouteTablesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterRouteTablesResponseBody</p>
 */
public class ListTransitRouterRouteTablesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("TransitRouterRouteTables")
    private java.util.List < TransitRouterRouteTables> transitRouterRouteTables;


    private ListTransitRouterRouteTablesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.transitRouterRouteTables = builder.transitRouterRouteTables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterRouteTablesResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return transitRouterRouteTables
     */
    public java.util.List < TransitRouterRouteTables> getTransitRouterRouteTables() {
        return this.transitRouterRouteTables;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < TransitRouterRouteTables> transitRouterRouteTables; 

        /**
         * <p>MaxResults.</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>NextToken.</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>TotalCount.</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>TransitRouterRouteTables.</p>
         */
        public Builder transitRouterRouteTables(java.util.List < TransitRouterRouteTables> transitRouterRouteTables) {
            this.transitRouterRouteTables = transitRouterRouteTables;
            return this;
        }

        public ListTransitRouterRouteTablesResponseBody build() {
            return new ListTransitRouterRouteTablesResponseBody(this);
        } 

    } 

    public static class TransitRouterRouteTables extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("TransitRouterRouteTableDescription")
        private String transitRouterRouteTableDescription;

        @NameInMap("TransitRouterRouteTableId")
        private String transitRouterRouteTableId;

        @NameInMap("TransitRouterRouteTableName")
        private String transitRouterRouteTableName;

        @NameInMap("TransitRouterRouteTableStatus")
        private String transitRouterRouteTableStatus;

        @NameInMap("TransitRouterRouteTableType")
        private String transitRouterRouteTableType;


        private TransitRouterRouteTables(Builder builder) {
            this.createTime = builder.createTime;
            this.transitRouterRouteTableDescription = builder.transitRouterRouteTableDescription;
            this.transitRouterRouteTableId = builder.transitRouterRouteTableId;
            this.transitRouterRouteTableName = builder.transitRouterRouteTableName;
            this.transitRouterRouteTableStatus = builder.transitRouterRouteTableStatus;
            this.transitRouterRouteTableType = builder.transitRouterRouteTableType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransitRouterRouteTables create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return transitRouterRouteTableDescription
         */
        public String getTransitRouterRouteTableDescription() {
            return this.transitRouterRouteTableDescription;
        }

        /**
         * @return transitRouterRouteTableId
         */
        public String getTransitRouterRouteTableId() {
            return this.transitRouterRouteTableId;
        }

        /**
         * @return transitRouterRouteTableName
         */
        public String getTransitRouterRouteTableName() {
            return this.transitRouterRouteTableName;
        }

        /**
         * @return transitRouterRouteTableStatus
         */
        public String getTransitRouterRouteTableStatus() {
            return this.transitRouterRouteTableStatus;
        }

        /**
         * @return transitRouterRouteTableType
         */
        public String getTransitRouterRouteTableType() {
            return this.transitRouterRouteTableType;
        }

        public static final class Builder {
            private String createTime; 
            private String transitRouterRouteTableDescription; 
            private String transitRouterRouteTableId; 
            private String transitRouterRouteTableName; 
            private String transitRouterRouteTableStatus; 
            private String transitRouterRouteTableType; 

            /**
             * <p>CreateTime.</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>TransitRouterRouteTableDescription.</p>
             */
            public Builder transitRouterRouteTableDescription(String transitRouterRouteTableDescription) {
                this.transitRouterRouteTableDescription = transitRouterRouteTableDescription;
                return this;
            }

            /**
             * <p>TransitRouterRouteTableId.</p>
             */
            public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
                this.transitRouterRouteTableId = transitRouterRouteTableId;
                return this;
            }

            /**
             * <p>TransitRouterRouteTableName.</p>
             */
            public Builder transitRouterRouteTableName(String transitRouterRouteTableName) {
                this.transitRouterRouteTableName = transitRouterRouteTableName;
                return this;
            }

            /**
             * <p>TransitRouterRouteTableStatus.</p>
             */
            public Builder transitRouterRouteTableStatus(String transitRouterRouteTableStatus) {
                this.transitRouterRouteTableStatus = transitRouterRouteTableStatus;
                return this;
            }

            /**
             * <p>TransitRouterRouteTableType.</p>
             */
            public Builder transitRouterRouteTableType(String transitRouterRouteTableType) {
                this.transitRouterRouteTableType = transitRouterRouteTableType;
                return this;
            }

            public TransitRouterRouteTables build() {
                return new TransitRouterRouteTables(this);
            } 

        } 

    }
}
