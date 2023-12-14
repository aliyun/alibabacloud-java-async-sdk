// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListImportedLogsByProdResponseBody} extends {@link TeaModel}
 *
 * <p>ListImportedLogsByProdResponseBody</p>
 */
public class ListImportedLogsByProdResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private ListImportedLogsByProdResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImportedLogsByProdResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListImportedLogsByProdResponseBody build() {
            return new ListImportedLogsByProdResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AutoImported")
        private Integer autoImported;

        @NameInMap("CloudCode")
        private String cloudCode;

        @NameInMap("Imported")
        private Integer imported;

        @NameInMap("ImportedUserCount")
        private Integer importedUserCount;

        @NameInMap("LogCode")
        private String logCode;

        @NameInMap("LogMdsCode")
        private String logMdsCode;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("ProdCode")
        private String prodCode;

        @NameInMap("TotalUserCount")
        private Integer totalUserCount;

        @NameInMap("UnImportedUserCount")
        private Integer unImportedUserCount;

        private Data(Builder builder) {
            this.autoImported = builder.autoImported;
            this.cloudCode = builder.cloudCode;
            this.imported = builder.imported;
            this.importedUserCount = builder.importedUserCount;
            this.logCode = builder.logCode;
            this.logMdsCode = builder.logMdsCode;
            this.modifyTime = builder.modifyTime;
            this.prodCode = builder.prodCode;
            this.totalUserCount = builder.totalUserCount;
            this.unImportedUserCount = builder.unImportedUserCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return autoImported
         */
        public Integer getAutoImported() {
            return this.autoImported;
        }

        /**
         * @return cloudCode
         */
        public String getCloudCode() {
            return this.cloudCode;
        }

        /**
         * @return imported
         */
        public Integer getImported() {
            return this.imported;
        }

        /**
         * @return importedUserCount
         */
        public Integer getImportedUserCount() {
            return this.importedUserCount;
        }

        /**
         * @return logCode
         */
        public String getLogCode() {
            return this.logCode;
        }

        /**
         * @return logMdsCode
         */
        public String getLogMdsCode() {
            return this.logMdsCode;
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
         * @return totalUserCount
         */
        public Integer getTotalUserCount() {
            return this.totalUserCount;
        }

        /**
         * @return unImportedUserCount
         */
        public Integer getUnImportedUserCount() {
            return this.unImportedUserCount;
        }

        public static final class Builder {
            private Integer autoImported; 
            private String cloudCode; 
            private Integer imported; 
            private Integer importedUserCount; 
            private String logCode; 
            private String logMdsCode; 
            private String modifyTime; 
            private String prodCode; 
            private Integer totalUserCount; 
            private Integer unImportedUserCount; 

            /**
             * AutoImported.
             */
            public Builder autoImported(Integer autoImported) {
                this.autoImported = autoImported;
                return this;
            }

            /**
             * CloudCode.
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
                return this;
            }

            /**
             * Imported.
             */
            public Builder imported(Integer imported) {
                this.imported = imported;
                return this;
            }

            /**
             * ImportedUserCount.
             */
            public Builder importedUserCount(Integer importedUserCount) {
                this.importedUserCount = importedUserCount;
                return this;
            }

            /**
             * LogCode.
             */
            public Builder logCode(String logCode) {
                this.logCode = logCode;
                return this;
            }

            /**
             * LogMdsCode.
             */
            public Builder logMdsCode(String logMdsCode) {
                this.logMdsCode = logMdsCode;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * ProdCode.
             */
            public Builder prodCode(String prodCode) {
                this.prodCode = prodCode;
                return this;
            }

            /**
             * TotalUserCount.
             */
            public Builder totalUserCount(Integer totalUserCount) {
                this.totalUserCount = totalUserCount;
                return this;
            }

            /**
             * UnImportedUserCount.
             */
            public Builder unImportedUserCount(Integer unImportedUserCount) {
                this.unImportedUserCount = unImportedUserCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
