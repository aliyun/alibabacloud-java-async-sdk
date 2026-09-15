// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link GetVpcRouteEntrySummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpcRouteEntrySummaryResponseBody</p>
 */
public class GetVpcRouteEntrySummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteEntrySummarys")
    private java.util.List<RouteEntrySummarys> routeEntrySummarys;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<RouteEntrySummarys> getRouteEntrySummarys() {
        return this.routeEntrySummarys;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<RouteEntrySummarys> routeEntrySummarys; 

        private Builder() {
        } 

        private Builder(GetVpcRouteEntrySummaryResponseBody model) {
            this.requestId = model.requestId;
            this.routeEntrySummarys = model.routeEntrySummarys;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DC668356-BCB4-42FD-9BC3-FA2B2E04B634</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about all queried route tables.</p>
         */
        public Builder routeEntrySummarys(java.util.List<RouteEntrySummarys> routeEntrySummarys) {
            this.routeEntrySummarys = routeEntrySummarys;
            return this;
        }

        public GetVpcRouteEntrySummaryResponseBody build() {
            return new GetVpcRouteEntrySummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVpcRouteEntrySummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetVpcRouteEntrySummaryResponseBody</p>
     */
    public static class EntrySummarys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("RouteEntryType")
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

            private Builder() {
            } 

            private Builder(EntrySummarys model) {
                this.count = model.count;
                this.routeEntryType = model.routeEntryType;
            } 

            /**
             * <p>The number of entries in the list.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The type of the route. Valid values:</p>
             * <ul>
             * <li><strong>all</strong>: all route types.</li>
             * <li><strong>custom</strong>: custom routes.</li>
             * <li><strong>system</strong>: system routes.</li>
             * <li><strong>bgp</strong>: BGP routes.</li>
             * <li><strong>cen</strong>: Cloud Enterprise Network (CEN) routes.</li>
             * <li><strong>type_vpn_bgp_internal</strong>: BGP routes of VPN.</li>
             * <li><strong>ECR</strong>: Express Connect Router (ECR) routes.</li>
             * </ul>
             * <blockquote>
             * <p>The returned system routes are the system routes under the system route table.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
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
    /**
     * 
     * {@link GetVpcRouteEntrySummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetVpcRouteEntrySummaryResponseBody</p>
     */
    public static class RouteEntrySummarys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntrySummarys")
        private java.util.List<EntrySummarys> entrySummarys;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
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
        public java.util.List<EntrySummarys> getEntrySummarys() {
            return this.entrySummarys;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public static final class Builder {
            private java.util.List<EntrySummarys> entrySummarys; 
            private String routeTableId; 

            private Builder() {
            } 

            private Builder(RouteEntrySummarys model) {
                this.entrySummarys = model.entrySummarys;
                this.routeTableId = model.routeTableId;
            } 

            /**
             * <p>The collection of route entry counts by type in a single route table.</p>
             */
            public Builder entrySummarys(java.util.List<EntrySummarys> entrySummarys) {
                this.entrySummarys = entrySummarys;
                return this;
            }

            /**
             * <p>The ID of the route table.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-bp145q7glnuzdvzu2****</p>
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
