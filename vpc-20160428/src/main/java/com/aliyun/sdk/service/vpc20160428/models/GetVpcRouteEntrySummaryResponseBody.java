// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVpcRouteEntrySummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpcRouteEntrySummaryResponseBody</p>
 */
public class GetVpcRouteEntrySummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RouteEntrySummarys")
    private java.util.List < RouteEntrySummarys> routeEntrySummarys;

    private GetVpcRouteEntrySummaryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.routeEntrySummarys = builder.routeEntrySummarys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpcRouteEntrySummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routeEntrySummarys
     */
    public java.util.List < RouteEntrySummarys> getRouteEntrySummarys() {
        return this.routeEntrySummarys;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RouteEntrySummarys> routeEntrySummarys; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the routes in the route tables.
         */
        public Builder routeEntrySummarys(java.util.List < RouteEntrySummarys> routeEntrySummarys) {
            this.routeEntrySummarys = routeEntrySummarys;
            return this;
        }

        public GetVpcRouteEntrySummaryResponseBody build() {
            return new GetVpcRouteEntrySummaryResponseBody(this);
        } 

    } 

    public static class EntrySummarys extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("RouteEntryType")
        private String routeEntryType;

        private EntrySummarys(Builder builder) {
            this.count = builder.count;
            this.routeEntryType = builder.routeEntryType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntrySummarys create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return routeEntryType
         */
        public String getRouteEntryType() {
            return this.routeEntryType;
        }

        public static final class Builder {
            private Integer count; 
            private String routeEntryType; 

            /**
             * The number of entries returned.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The type of the route. Valid values:
             * <p>
             * 
             * *   **All**: all route types
             * *   **Custom**: a custom route
             * *   **System**: a system route
             * *   **BGP**: a BGP route
             * *   **CEN**: a CEN route
             */
            public Builder routeEntryType(String routeEntryType) {
                this.routeEntryType = routeEntryType;
                return this;
            }

            public EntrySummarys build() {
                return new EntrySummarys(this);
            } 

        } 

    }
    public static class RouteEntrySummarys extends TeaModel {
        @NameInMap("EntrySummarys")
        private java.util.List < EntrySummarys> entrySummarys;

        @NameInMap("RouteTableId")
        private String routeTableId;

        private RouteEntrySummarys(Builder builder) {
            this.entrySummarys = builder.entrySummarys;
            this.routeTableId = builder.routeTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteEntrySummarys create() {
            return builder().build();
        }

        /**
         * @return entrySummarys
         */
        public java.util.List < EntrySummarys> getEntrySummarys() {
            return this.entrySummarys;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public static final class Builder {
            private java.util.List < EntrySummarys> entrySummarys; 
            private String routeTableId; 

            /**
             * The information about the routes of different types in one route table.
             */
            public Builder entrySummarys(java.util.List < EntrySummarys> entrySummarys) {
                this.entrySummarys = entrySummarys;
                return this;
            }

            /**
             * The ID of the route table.
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            public RouteEntrySummarys build() {
                return new RouteEntrySummarys(this);
            } 

        } 

    }
}
