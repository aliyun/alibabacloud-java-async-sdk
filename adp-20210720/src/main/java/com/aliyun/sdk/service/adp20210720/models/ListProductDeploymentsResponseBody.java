// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductDeploymentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductDeploymentsResponseBody</p>
 */
public class ListProductDeploymentsResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private ListProductDeploymentsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductDeploymentsResponseBody create() {
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

        public ListProductDeploymentsResponseBody build() {
            return new ListProductDeploymentsResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("envParams")
        private String envParams;

        @NameInMap("envUID")
        private String envUID;

        @NameInMap("oldProductVersion")
        private String oldProductVersion;

        @NameInMap("packageContentType")
        private String packageContentType;

        @NameInMap("packageInfoUID")
        private String packageInfoUID;

        @NameInMap("packageType")
        private String packageType;

        @NameInMap("productName")
        private String productName;

        @NameInMap("productVersion")
        private String productVersion;

        @NameInMap("status")
        private String status;

        @NameInMap("uid")
        private String uid;

        private List(Builder builder) {
            this.envParams = builder.envParams;
            this.envUID = builder.envUID;
            this.oldProductVersion = builder.oldProductVersion;
            this.packageContentType = builder.packageContentType;
            this.packageInfoUID = builder.packageInfoUID;
            this.packageType = builder.packageType;
            this.productName = builder.productName;
            this.productVersion = builder.productVersion;
            this.status = builder.status;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return envParams
         */
        public String getEnvParams() {
            return this.envParams;
        }

        /**
         * @return envUID
         */
        public String getEnvUID() {
            return this.envUID;
        }

        /**
         * @return oldProductVersion
         */
        public String getOldProductVersion() {
            return this.oldProductVersion;
        }

        /**
         * @return packageContentType
         */
        public String getPackageContentType() {
            return this.packageContentType;
        }

        /**
         * @return packageInfoUID
         */
        public String getPackageInfoUID() {
            return this.packageInfoUID;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productVersion
         */
        public String getProductVersion() {
            return this.productVersion;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String envParams; 
            private String envUID; 
            private String oldProductVersion; 
            private String packageContentType; 
            private String packageInfoUID; 
            private String packageType; 
            private String productName; 
            private String productVersion; 
            private String status; 
            private String uid; 

            /**
             * envParams.
             */
            public Builder envParams(String envParams) {
                this.envParams = envParams;
                return this;
            }

            /**
             * envUID.
             */
            public Builder envUID(String envUID) {
                this.envUID = envUID;
                return this;
            }

            /**
             * oldProductVersion.
             */
            public Builder oldProductVersion(String oldProductVersion) {
                this.oldProductVersion = oldProductVersion;
                return this;
            }

            /**
             * packageContentType.
             */
            public Builder packageContentType(String packageContentType) {
                this.packageContentType = packageContentType;
                return this;
            }

            /**
             * packageInfoUID.
             */
            public Builder packageInfoUID(String packageInfoUID) {
                this.packageInfoUID = packageInfoUID;
                return this;
            }

            /**
             * packageType.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
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
             * productVersion.
             */
            public Builder productVersion(String productVersion) {
                this.productVersion = productVersion;
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
