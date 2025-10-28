// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListClusterMembersResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterMembersResponseBody</p>
 */
public class ListClusterMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterMemberPage")
    private ClusterMemberPage clusterMemberPage;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListClusterMembersResponseBody model) {
            this.clusterMemberPage = model.clusterMemberPage;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the ECS instances in the cluster.</p>
         */
        public Builder clusterMemberPage(ClusterMemberPage clusterMemberPage) {
            this.clusterMemberPage = clusterMemberPage;
            return this;
        }

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>b197-40ab-9155-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterMembersResponseBody build() {
            return new ListClusterMembersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClusterMembersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterMembersResponseBody</p>
     */
    public static class ClusterMember extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterMemberId")
        private String clusterMemberId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("EcsId")
        private String ecsId;

        @com.aliyun.core.annotation.NameInMap("EcuId")
        private String ecuId;

        @com.aliyun.core.annotation.NameInMap("PrivateIp")
        private String privateIp;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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

            private Builder() {
            } 

            private Builder(ClusterMember model) {
                this.clusterId = model.clusterId;
                this.clusterMemberId = model.clusterMemberId;
                this.createTime = model.createTime;
                this.ecsId = model.ecsId;
                this.ecuId = model.ecuId;
                this.privateIp = model.privateIp;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>52984524-6d48-4bbd-85f2-a34b0e5b****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The ID of the ECS instance in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>adb03eeb-3adf-4d7e-afe1-03d1ad45****</p>
             */
            public Builder clusterMemberId(String clusterMemberId) {
                this.clusterMemberId = clusterMemberId;
                return this;
            }

            /**
             * <p>The timestamp when the ECS instance was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1573281038175</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2zej4i2jdf3ntwhj****</p>
             */
            public Builder ecsId(String ecsId) {
                this.ecsId = ecsId;
                return this;
            }

            /**
             * <p>The unique ID of the elastic compute unit (ECU). You can run the <code>dmidecode</code> command on the ECS instance to query the ECU ID.</p>
             * 
             * <strong>example:</strong>
             * <p>70ed3f59-b476-49aa-be09-9e6c375d****</p>
             */
            public Builder ecuId(String ecuId) {
                this.ecuId = ecuId;
                return this;
            }

            /**
             * <p>The private IP address for the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * <p>The state of the ECS instance. Valid values:</p>
             * <ul>
             * <li>1: The instance is running.</li>
             * <li>0: The instance is being converted.</li>
             * <li>-1: The instance fails to be converted.</li>
             * <li>-2: The instance is offline.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The timestamp when the ECS instance was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1573281041113</p>
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
    /**
     * 
     * {@link ListClusterMembersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterMembersResponseBody</p>
     */
    public static class ClusterMemberList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterMember")
        private java.util.List<ClusterMember> clusterMember;

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
        public java.util.List<ClusterMember> getClusterMember() {
            return this.clusterMember;
        }

        public static final class Builder {
            private java.util.List<ClusterMember> clusterMember; 

            private Builder() {
            } 

            private Builder(ClusterMemberList model) {
                this.clusterMember = model.clusterMember;
            } 

            /**
             * ClusterMember.
             */
            public Builder clusterMember(java.util.List<ClusterMember> clusterMember) {
                this.clusterMember = clusterMember;
                return this;
            }

            public ClusterMemberList build() {
                return new ClusterMemberList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListClusterMembersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterMembersResponseBody</p>
     */
    public static class ClusterMemberPage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterMemberList")
        private ClusterMemberList clusterMemberList;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
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

            private Builder() {
            } 

            private Builder(ClusterMemberPage model) {
                this.clusterMemberList = model.clusterMemberList;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The list of ECS instances in the cluster.</p>
             */
            public Builder clusterMemberList(ClusterMemberList clusterMemberList) {
                this.clusterMemberList = clusterMemberList;
                return this;
            }

            /**
             * <p>The page number of the returned page. If this parameter is not returned, the first page is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of ECS instances returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of pages returned when all ECS instances are returned based on the specified PageSize parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
