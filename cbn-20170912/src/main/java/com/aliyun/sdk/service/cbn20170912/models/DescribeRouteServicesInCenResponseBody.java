// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link DescribeRouteServicesInCenResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRouteServicesInCenResponseBody</p>
 */
public class DescribeRouteServicesInCenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteServiceEntries")
    private RouteServiceEntries routeServiceEntries;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeRouteServicesInCenResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.routeServiceEntries = builder.routeServiceEntries;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRouteServicesInCenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routeServiceEntries
     */
    public RouteServiceEntries getRouteServiceEntries() {
        return this.routeServiceEntries;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private RouteServiceEntries routeServiceEntries; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeRouteServicesInCenResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.routeServiceEntries = model.routeServiceEntries;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>196C99CA-6997-5951-9721-AE89720DF856</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the cloud services.</p>
         */
        public Builder routeServiceEntries(RouteServiceEntries routeServiceEntries) {
            this.routeServiceEntries = routeServiceEntries;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRouteServicesInCenResponseBody build() {
            return new DescribeRouteServicesInCenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRouteServicesInCenResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteServicesInCenResponseBody</p>
     */
    public static class Cidrs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private java.util.List<String> cidr;

        private Cidrs(Builder builder) {
            this.cidr = builder.cidr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cidrs create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public java.util.List<String> getCidr() {
            return this.cidr;
        }

        public static final class Builder {
            private java.util.List<String> cidr; 

            private Builder() {
            } 

            private Builder(Cidrs model) {
                this.cidr = model.cidr;
            } 

            /**
             * Cidr.
             */
            public Builder cidr(java.util.List<String> cidr) {
                this.cidr = cidr;
                return this;
            }

            public Cidrs build() {
                return new Cidrs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRouteServicesInCenResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteServicesInCenResponseBody</p>
     */
    public static class RouteServiceEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessRegionId")
        private String accessRegionId;

        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("Cidrs")
        private Cidrs cidrs;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("HostRegionId")
        private String hostRegionId;

        @com.aliyun.core.annotation.NameInMap("HostVpcId")
        private String hostVpcId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private RouteServiceEntry(Builder builder) {
            this.accessRegionId = builder.accessRegionId;
            this.cenId = builder.cenId;
            this.cidrs = builder.cidrs;
            this.description = builder.description;
            this.host = builder.host;
            this.hostRegionId = builder.hostRegionId;
            this.hostVpcId = builder.hostVpcId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteServiceEntry create() {
            return builder().build();
        }

        /**
         * @return accessRegionId
         */
        public String getAccessRegionId() {
            return this.accessRegionId;
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return cidrs
         */
        public Cidrs getCidrs() {
            return this.cidrs;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return hostRegionId
         */
        public String getHostRegionId() {
            return this.hostRegionId;
        }

        /**
         * @return hostVpcId
         */
        public String getHostVpcId() {
            return this.hostVpcId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String accessRegionId; 
            private String cenId; 
            private Cidrs cidrs; 
            private String description; 
            private String host; 
            private String hostRegionId; 
            private String hostVpcId; 
            private String status; 

            private Builder() {
            } 

            private Builder(RouteServiceEntry model) {
                this.accessRegionId = model.accessRegionId;
                this.cenId = model.cenId;
                this.cidrs = model.cidrs;
                this.description = model.description;
                this.host = model.host;
                this.hostRegionId = model.hostRegionId;
                this.hostVpcId = model.hostVpcId;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the region where the cloud service is accessed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder accessRegionId(String accessRegionId) {
                this.accessRegionId = accessRegionId;
                return this;
            }

            /**
             * <p>The ID of the CEN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-pfa6ugf3xl0qsd****</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The service addresses of the cloud service.</p>
             */
            public Builder cidrs(Cidrs cidrs) {
                this.cidrs = cidrs;
                return this;
            }

            /**
             * <p>The description of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>descname</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The service address of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>100.118.28.0/24</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The region ID of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder hostRegionId(String hostRegionId) {
                this.hostRegionId = hostRegionId;
                return this;
            }

            /**
             * <p>The ID of the VPC associated with the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1h8vbrbcgohcju5****</p>
             */
            public Builder hostVpcId(String hostVpcId) {
                this.hostVpcId = hostVpcId;
                return this;
            }

            /**
             * <p>The status of the cloud service. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Active</strong></li>
             * <li><strong>Deleting</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RouteServiceEntry build() {
                return new RouteServiceEntry(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRouteServicesInCenResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteServicesInCenResponseBody</p>
     */
    public static class RouteServiceEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteServiceEntry")
        private java.util.List<RouteServiceEntry> routeServiceEntry;

        private RouteServiceEntries(Builder builder) {
            this.routeServiceEntry = builder.routeServiceEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteServiceEntries create() {
            return builder().build();
        }

        /**
         * @return routeServiceEntry
         */
        public java.util.List<RouteServiceEntry> getRouteServiceEntry() {
            return this.routeServiceEntry;
        }

        public static final class Builder {
            private java.util.List<RouteServiceEntry> routeServiceEntry; 

            private Builder() {
            } 

            private Builder(RouteServiceEntries model) {
                this.routeServiceEntry = model.routeServiceEntry;
            } 

            /**
             * RouteServiceEntry.
             */
            public Builder routeServiceEntry(java.util.List<RouteServiceEntry> routeServiceEntry) {
                this.routeServiceEntry = routeServiceEntry;
                return this;
            }

            public RouteServiceEntries build() {
                return new RouteServiceEntries(this);
            } 

        } 

    }
}
