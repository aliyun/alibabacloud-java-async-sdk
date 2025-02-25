// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link ListUserKubeConfigStatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserKubeConfigStatesResponseBody</p>
 */
public class ListUserKubeConfigStatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("page")
    private Page page;

    @com.aliyun.core.annotation.NameInMap("states")
    private java.util.List<States> states;

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
    public java.util.List<States> getStates() {
        return this.states;
    }

    public static final class Builder {
        private Page page; 
        private java.util.List<States> states; 

        /**
         * <p>The pagination information.</p>
         */
        public Builder page(Page page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The status of the kubeconfig files.</p>
         */
        public Builder states(java.util.List<States> states) {
            this.states = states;
            return this;
        }

        public ListUserKubeConfigStatesResponseBody build() {
            return new ListUserKubeConfigStatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserKubeConfigStatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserKubeConfigStatesResponseBody</p>
     */
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
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link ListUserKubeConfigStatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserKubeConfigStatesResponseBody</p>
     */
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
             * <p>The expiration date of the certificate used in a kubeconfig file. Format: the UTC time in the RFC3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-30T07:41:50Z</p>
             */
            public Builder certExpireTime(String certExpireTime) {
                this.certExpireTime = certExpireTime;
                return this;
            }

            /**
             * <p>The current status of the certificate used in a kubeconfig file. Valid values:</p>
             * <ul>
             * <li>Expired: The certificate is expired.</li>
             * <li>Unexpired: The certificate is not expired.</li>
             * <li>Unissued: The certificate is not issued.</li>
             * <li>Unknown: The status of the certificate is unknown.</li>
             * <li>Removed: The certificate is removed. An issue record is found for the certificate.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unissued</p>
             */
            public Builder certState(String certState) {
                this.certState = certState;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c5b5e80b0b64a4bf6939d2d8fbbc5****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * <p>The name must be 1 to 63 characters in length, and can contain digits, underscores (_), and hyphens (-). The name must start with a letter or number.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster-demo</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The status of the cluster. Valid values:</p>
             * <ul>
             * <li><code>initial</code>: The cluster is being created.</li>
             * <li><code>failed</code>: The cluster failed to be created.</li>
             * <li><code>running</code>: The cluster is running.</li>
             * <li><code>updating</code>: The cluster is being upgraded.</li>
             * <li><code>updating_failed</code>: The cluster failed to be updated.</li>
             * <li><code>scaling</code>: The cluster is being scaled.</li>
             * <li><code>stopped</code>: The cluster is stopped.</li>
             * <li><code>deleting</code>: The cluster is being deleted.</li>
             * <li><code>deleted</code>: The cluster is deleted.</li>
             * <li><code>delete_failed</code>: The cluster failed to be deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
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
