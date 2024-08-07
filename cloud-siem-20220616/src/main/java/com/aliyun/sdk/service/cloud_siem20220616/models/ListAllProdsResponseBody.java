// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAllProdsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAllProdsResponseBody</p>
 */
public class ListAllProdsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAllProdsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAllProdsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAllProdsResponseBody build() {
            return new ListAllProdsResponseBody(this);
        } 

    } 

    public static class ProdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloudCode")
        private String cloudCode;

        @com.aliyun.core.annotation.NameInMap("ImportedLogCount")
        private Integer importedLogCount;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("ProdCode")
        private String prodCode;

        @com.aliyun.core.annotation.NameInMap("TotalLogCount")
        private Integer totalLogCount;

        private ProdList(Builder builder) {
            this.cloudCode = builder.cloudCode;
            this.importedLogCount = builder.importedLogCount;
            this.modifyTime = builder.modifyTime;
            this.prodCode = builder.prodCode;
            this.totalLogCount = builder.totalLogCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProdList create() {
            return builder().build();
        }

        /**
         * @return cloudCode
         */
        public String getCloudCode() {
            return this.cloudCode;
        }

        /**
         * @return importedLogCount
         */
        public Integer getImportedLogCount() {
            return this.importedLogCount;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return prodCode
         */
        public String getProdCode() {
            return this.prodCode;
        }

        /**
         * @return totalLogCount
         */
        public Integer getTotalLogCount() {
            return this.totalLogCount;
        }

        public static final class Builder {
            private String cloudCode; 
            private Integer importedLogCount; 
            private String modifyTime; 
            private String prodCode; 
            private Integer totalLogCount; 

            /**
             * The code of the cloud service provider. Valid values:
             * <p>
             * 
             * *   qcloud: Tencent Cloud.
             * *   aliyun: Alibaba Cloud.
             * *   hcloud: Huawei Cloud.
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
                return this;
            }

            /**
             * The number of logs within the cloud service that are added to the threat analysis feature.
             */
            public Builder importedLogCount(Integer importedLogCount) {
                this.importedLogCount = importedLogCount;
                return this;
            }

            /**
             * The time when the logs within the cloud service were last added to the threat analysis feature.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The code of the cloud service.
             */
            public Builder prodCode(String prodCode) {
                this.prodCode = prodCode;
                return this;
            }

            /**
             * The total number of logs within the cloud service.
             */
            public Builder totalLogCount(Integer totalLogCount) {
                this.totalLogCount = totalLogCount;
                return this;
            }

            public ProdList build() {
                return new ProdList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ProdList")
        private java.util.List < ProdList> prodList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.prodList = builder.prodList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return prodList
         */
        public java.util.List < ProdList> getProdList() {
            return this.prodList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private java.util.List < ProdList> prodList; 
            private Integer totalCount; 

            /**
             * The page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
             * The cloud services.
             */
            public Builder prodList(java.util.List < ProdList> prodList) {
                this.prodList = prodList;
                return this;
            }

            /**
             * The total number of logs.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
