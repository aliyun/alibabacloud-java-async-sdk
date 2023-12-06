// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductInstancesResponseBody</p>
 */
public class ListProductInstancesResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private ListProductInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String msg; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public ListProductInstancesResponseBody build() {
            return new ListProductInstancesResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("clusterUID")
        private String clusterUID;

        @NameInMap("continuousDeployment")
        private Boolean continuousDeployment;

        @NameInMap("namespace")
        private String namespace;

        @NameInMap("productName")
        private String productName;

        @NameInMap("productUID")
        private String productUID;

        @NameInMap("productVersion")
        private String productVersion;

        @NameInMap("productVersionSpecUID")
        private String productVersionSpecUID;

        @NameInMap("productVersionUID")
        private String productVersionUID;

        @NameInMap("status")
        private String status;

        @NameInMap("timeout")
        private Long timeout;

        @NameInMap("uid")
        private String uid;

        private List(Builder builder) {
            this.clusterUID = builder.clusterUID;
            this.continuousDeployment = builder.continuousDeployment;
            this.namespace = builder.namespace;
            this.productName = builder.productName;
            this.productUID = builder.productUID;
            this.productVersion = builder.productVersion;
            this.productVersionSpecUID = builder.productVersionSpecUID;
            this.productVersionUID = builder.productVersionUID;
            this.status = builder.status;
            this.timeout = builder.timeout;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return clusterUID
         */
        public String getClusterUID() {
            return this.clusterUID;
        }

        /**
         * @return continuousDeployment
         */
        public Boolean getContinuousDeployment() {
            return this.continuousDeployment;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productUID
         */
        public String getProductUID() {
            return this.productUID;
        }

        /**
         * @return productVersion
         */
        public String getProductVersion() {
            return this.productVersion;
        }

        /**
         * @return productVersionSpecUID
         */
        public String getProductVersionSpecUID() {
            return this.productVersionSpecUID;
        }

        /**
         * @return productVersionUID
         */
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timeout
         */
        public Long getTimeout() {
            return this.timeout;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String clusterUID; 
            private Boolean continuousDeployment; 
            private String namespace; 
            private String productName; 
            private String productUID; 
            private String productVersion; 
            private String productVersionSpecUID; 
            private String productVersionUID; 
            private String status; 
            private Long timeout; 
            private String uid; 

            /**
             * clusterUID.
             */
            public Builder clusterUID(String clusterUID) {
                this.clusterUID = clusterUID;
                return this;
            }

            /**
             * continuousDeployment.
             */
            public Builder continuousDeployment(Boolean continuousDeployment) {
                this.continuousDeployment = continuousDeployment;
                return this;
            }

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * productName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * productUID.
             */
            public Builder productUID(String productUID) {
                this.productUID = productUID;
                return this;
            }

            /**
             * productVersion.
             */
            public Builder productVersion(String productVersion) {
                this.productVersion = productVersion;
                return this;
            }

            /**
             * productVersionSpecUID.
             */
            public Builder productVersionSpecUID(String productVersionSpecUID) {
                this.productVersionSpecUID = productVersionSpecUID;
                return this;
            }

            /**
             * productVersionUID.
             */
            public Builder productVersionUID(String productVersionUID) {
                this.productVersionUID = productVersionUID;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * timeout.
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("list")
        private java.util.List < List> list;

        @NameInMap("pageNum")
        private Integer pageNum;

        @NameInMap("pageSize")
        private Integer pageSize;

        @NameInMap("total")
        private Integer total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * list.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * pageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
