// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListAllProdsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAllProdsResponseBody build() {
            return new ListAllProdsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAllProdsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllProdsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ProdList model) {
                this.cloudCode = model.cloudCode;
                this.importedLogCount = model.importedLogCount;
                this.modifyTime = model.modifyTime;
                this.prodCode = model.prodCode;
                this.totalLogCount = model.totalLogCount;
            } 

            /**
             * <p>The code of the cloud service provider. Valid values:</p>
             * <ul>
             * <li>qcloud: Tencent Cloud.</li>
             * <li>aliyun: Alibaba Cloud.</li>
             * <li>hcloud: Huawei Cloud.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>hcloud</p>
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
                return this;
            }

            /**
             * <p>The number of logs within the cloud service that are added to the threat analysis feature.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder importedLogCount(Integer importedLogCount) {
                this.importedLogCount = importedLogCount;
                return this;
            }

            /**
             * <p>The time when the logs within the cloud service were last added to the threat analysis feature.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-23 12:12:12</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The code of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>sas</p>
             */
            public Builder prodCode(String prodCode) {
                this.prodCode = prodCode;
                return this;
            }

            /**
             * <p>The total number of logs within the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>19</p>
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
    /**
     * 
     * {@link ListAllProdsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllProdsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ProdList")
        private java.util.List<ProdList> prodList;

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
        public java.util.List<ProdList> getProdList() {
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
            private java.util.List<ProdList> prodList; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.prodList = model.prodList;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
             * <p>The cloud services.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder prodList(java.util.List<ProdList> prodList) {
                this.prodList = prodList;
                return this;
            }

            /**
             * <p>The total number of logs.</p>
             * 
             * <strong>example:</strong>
             * <p>19</p>
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
