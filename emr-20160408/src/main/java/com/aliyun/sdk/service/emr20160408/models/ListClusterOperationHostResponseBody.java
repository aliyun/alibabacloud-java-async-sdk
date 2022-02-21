// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterOperationHostResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterOperationHostResponseBody</p>
 */
public class ListClusterOperationHostResponseBody extends TeaModel {
    @NameInMap("ClusterOperationHostList")
    private ClusterOperationHostList clusterOperationHostList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListClusterOperationHostResponseBody(Builder builder) {
        this.clusterOperationHostList = builder.clusterOperationHostList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterOperationHostResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterOperationHostList
     */
    public ClusterOperationHostList getClusterOperationHostList() {
        return this.clusterOperationHostList;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private ClusterOperationHostList clusterOperationHostList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ClusterOperationHostList.
         */
        public Builder clusterOperationHostList(ClusterOperationHostList clusterOperationHostList) {
            this.clusterOperationHostList = clusterOperationHostList;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListClusterOperationHostResponseBody build() {
            return new ListClusterOperationHostResponseBody(this);
        } 

    } 

    public static class ClusterOperationHost extends TeaModel {
        @NameInMap("HostId")
        private String hostId;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("Percentage")
        private String percentage;

        @NameInMap("Status")
        private String status;

        private ClusterOperationHost(Builder builder) {
            this.hostId = builder.hostId;
            this.hostName = builder.hostName;
            this.percentage = builder.percentage;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterOperationHost create() {
            return builder().build();
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return percentage
         */
        public String getPercentage() {
            return this.percentage;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String hostId; 
            private String hostName; 
            private String percentage; 
            private String status; 

            /**
             * HostId.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * Percentage.
             */
            public Builder percentage(String percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ClusterOperationHost build() {
                return new ClusterOperationHost(this);
            } 

        } 

    }
    public static class ClusterOperationHostList extends TeaModel {
        @NameInMap("ClusterOperationHost")
        private java.util.List < ClusterOperationHost> clusterOperationHost;

        private ClusterOperationHostList(Builder builder) {
            this.clusterOperationHost = builder.clusterOperationHost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterOperationHostList create() {
            return builder().build();
        }

        /**
         * @return clusterOperationHost
         */
        public java.util.List < ClusterOperationHost> getClusterOperationHost() {
            return this.clusterOperationHost;
        }

        public static final class Builder {
            private java.util.List < ClusterOperationHost> clusterOperationHost; 

            /**
             * ClusterOperationHost.
             */
            public Builder clusterOperationHost(java.util.List < ClusterOperationHost> clusterOperationHost) {
                this.clusterOperationHost = clusterOperationHost;
                return this;
            }

            public ClusterOperationHostList build() {
                return new ClusterOperationHostList(this);
            } 

        } 

    }
}
