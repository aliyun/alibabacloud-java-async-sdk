// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserKubeConfigStatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserKubeConfigStatesResponseBody</p>
 */
public class ListUserKubeConfigStatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("page")
    private Page page;

    @com.aliyun.core.annotation.NameInMap("states")
    private java.util.List < States> states;

    private ListUserKubeConfigStatesResponseBody(Builder builder) {
        this.page = builder.page;
        this.states = builder.states;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserKubeConfigStatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    /**
     * @return states
     */
    public java.util.List < States> getStates() {
        return this.states;
    }

    public static final class Builder {
        private Page page; 
        private java.util.List < States> states; 

        /**
         * The pagination information.
         */
        public Builder page(Page page) {
            this.page = page;
            return this;
        }

        /**
         * The status of the kubeconfig files.
         */
        public Builder states(java.util.List < States> states) {
            this.states = states;
            return this;
        }

        public ListUserKubeConfigStatesResponseBody build() {
            return new ListUserKubeConfigStatesResponseBody(this);
        } 

    } 

    public static class Page extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("page_number")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("page_size")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total_count")
        private Integer totalCount;

        private Page(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
    public static class States extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cert_expire_time")
        private String certExpireTime;

        @com.aliyun.core.annotation.NameInMap("cert_state")
        private String certState;

        @com.aliyun.core.annotation.NameInMap("cluster_id")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("cluster_name")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("cluster_state")
        private String clusterState;

        private States(Builder builder) {
            this.certExpireTime = builder.certExpireTime;
            this.certState = builder.certState;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterState = builder.clusterState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static States create() {
            return builder().build();
        }

        /**
         * @return certExpireTime
         */
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        /**
         * @return certState
         */
        public String getCertState() {
            return this.certState;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return clusterState
         */
        public String getClusterState() {
            return this.clusterState;
        }

        public static final class Builder {
            private String certExpireTime; 
            private String certState; 
            private String clusterId; 
            private String clusterName; 
            private String clusterState; 

            /**
             * The expiration date of the certificate used in a kubeconfig file. Format: the UTC time in the RFC3339 format.
             */
            public Builder certExpireTime(String certExpireTime) {
                this.certExpireTime = certExpireTime;
                return this;
            }

            /**
             * The current status of the certificate used in a kubeconfig file. Valid values:
             * <p>
             * 
             * *   Expired: The certificate is expired.
             * *   Unexpired: The certificate is not expired.
             * *   Unissued: The certificate is not issued.
             * *   Unknown: The status of the certificate is unknown.
             * *   Removed: The certificate is removed. An issue record is found for the certificate.
             */
            public Builder certState(String certState) {
                this.certState = certState;
                return this;
            }

            /**
             * The cluster ID.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The cluster name.
             * <p>
             * 
             * The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). The name cannot start with a hyphen (-).
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The status of the cluster. Valid values:
             * <p>
             * 
             * *   `initial`: The cluster is being created.
             * *   `failed`: The cluster failed to be created.
             * *   `running`: The cluster is running.
             * *   `updating`: The cluster is being upgraded.
             * *   `updating_failed`: The cluster failed to be updated.
             * *   `scaling`: The cluster is being scaled.
             * *   `waiting`: The cluster is waiting for connection requests.
             * *   `disconnected`: The cluster is disconnected.
             * *   `stopped`: The cluster is stopped.
             * *   `deleting`: The cluster is being deleted.
             * *   `deleted`: The cluster is deleted.
             * *   `delete_failed`: The cluster failed to be deleted.
             */
            public Builder clusterState(String clusterState) {
                this.clusterState = clusterState;
                return this;
            }

            public States build() {
                return new States(this);
            } 

        } 

    }
}
