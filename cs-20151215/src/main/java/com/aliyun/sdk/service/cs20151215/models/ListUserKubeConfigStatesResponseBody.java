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
         * page.
         */
        public Builder page(Page page) {
            this.page = page;
            return this;
        }

        /**
         * states.
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
             * page_number.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * page_size.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total_count.
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
             * cert_expire_time.
             */
            public Builder certExpireTime(String certExpireTime) {
                this.certExpireTime = certExpireTime;
                return this;
            }

            /**
             * cert_state.
             */
            public Builder certState(String certState) {
                this.certState = certState;
                return this;
            }

            /**
             * cluster_id.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * cluster_name.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * cluster_state.
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
