// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterMembersResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterMembersResponseBody</p>
 */
public class ListClusterMembersResponseBody extends TeaModel {
    @NameInMap("ClusterMemberPage")
    private ClusterMemberPage clusterMemberPage;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListClusterMembersResponseBody(Builder builder) {
        this.clusterMemberPage = builder.clusterMemberPage;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterMembersResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterMemberPage
     */
    public ClusterMemberPage getClusterMemberPage() {
        return this.clusterMemberPage;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ClusterMemberPage clusterMemberPage; 
        private Integer code; 
        private String message; 
        private String requestId; 

        /**
         * The information about the ECS instances in the cluster.
         */
        public Builder clusterMemberPage(ClusterMemberPage clusterMemberPage) {
            this.clusterMemberPage = clusterMemberPage;
            return this;
        }

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The message that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterMembersResponseBody build() {
            return new ListClusterMembersResponseBody(this);
        } 

    } 

    public static class ClusterMember extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterMemberId")
        private String clusterMemberId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("EcsId")
        private String ecsId;

        @NameInMap("EcuId")
        private String ecuId;

        @NameInMap("PrivateIp")
        private String privateIp;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private ClusterMember(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterMemberId = builder.clusterMemberId;
            this.createTime = builder.createTime;
            this.ecsId = builder.ecsId;
            this.ecuId = builder.ecuId;
            this.privateIp = builder.privateIp;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterMember create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterMemberId
         */
        public String getClusterMemberId() {
            return this.clusterMemberId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return ecsId
         */
        public String getEcsId() {
            return this.ecsId;
        }

        /**
         * @return ecuId
         */
        public String getEcuId() {
            return this.ecuId;
        }

        /**
         * @return privateIp
         */
        public String getPrivateIp() {
            return this.privateIp;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterMemberId; 
            private Long createTime; 
            private String ecsId; 
            private String ecuId; 
            private String privateIp; 
            private Integer status; 
            private Long updateTime; 

            /**
             * The ID of the cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The ID of the ECS instance in the cluster.
             */
            public Builder clusterMemberId(String clusterMemberId) {
                this.clusterMemberId = clusterMemberId;
                return this;
            }

            /**
             * The timestamp when the ECS instance was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the ECS instance.
             */
            public Builder ecsId(String ecsId) {
                this.ecsId = ecsId;
                return this;
            }

            /**
             * The unique ID of the elastic compute unit (ECU). You can run the `dmidecode` command on the ECS instance to query the ECU ID.
             */
            public Builder ecuId(String ecuId) {
                this.ecuId = ecuId;
                return this;
            }

            /**
             * The private IP address for the ECS instance.
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * The state of the ECS instance. Valid values:
             * <p>
             * 
             * *   1: The instance is running.
             * *   0: The instance is being converted.
             * *   \-1: The instance fails to be converted.
             * *   \-2: The instance is offline.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The timestamp when the ECS instance was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ClusterMember build() {
                return new ClusterMember(this);
            } 

        } 

    }
    public static class ClusterMemberList extends TeaModel {
        @NameInMap("ClusterMember")
        private java.util.List < ClusterMember> clusterMember;

        private ClusterMemberList(Builder builder) {
            this.clusterMember = builder.clusterMember;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterMemberList create() {
            return builder().build();
        }

        /**
         * @return clusterMember
         */
        public java.util.List < ClusterMember> getClusterMember() {
            return this.clusterMember;
        }

        public static final class Builder {
            private java.util.List < ClusterMember> clusterMember; 

            /**
             * ClusterMember.
             */
            public Builder clusterMember(java.util.List < ClusterMember> clusterMember) {
                this.clusterMember = clusterMember;
                return this;
            }

            public ClusterMemberList build() {
                return new ClusterMemberList(this);
            } 

        } 

    }
    public static class ClusterMemberPage extends TeaModel {
        @NameInMap("ClusterMemberList")
        private ClusterMemberList clusterMemberList;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalSize")
        private Integer totalSize;

        private ClusterMemberPage(Builder builder) {
            this.clusterMemberList = builder.clusterMemberList;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterMemberPage create() {
            return builder().build();
        }

        /**
         * @return clusterMemberList
         */
        public ClusterMemberList getClusterMemberList() {
            return this.clusterMemberList;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private ClusterMemberList clusterMemberList; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalSize; 

            /**
             * The list of ECS instances in the cluster.
             */
            public Builder clusterMemberList(ClusterMemberList clusterMemberList) {
                this.clusterMemberList = clusterMemberList;
                return this;
            }

            /**
             * The page number of the returned page. If this parameter is not returned, the first page is returned.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of ECS instances returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of pages returned when all ECS instances are returned based on the specified PageSize parameter.
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public ClusterMemberPage build() {
                return new ClusterMemberPage(this);
            } 

        } 

    }
}
