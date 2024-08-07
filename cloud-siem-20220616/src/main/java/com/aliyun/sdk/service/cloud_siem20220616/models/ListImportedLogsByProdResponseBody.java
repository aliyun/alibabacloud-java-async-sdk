// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListImportedLogsByProdResponseBody} extends {@link TeaModel}
 *
 * <p>ListImportedLogsByProdResponseBody</p>
 */
public class ListImportedLogsByProdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The data returned.
         */
        public Builder data(java.util.List < Data> data) {
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

        public ListImportedLogsByProdResponseBody build() {
            return new ListImportedLogsByProdResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoImported")
        private Integer autoImported;

        @com.aliyun.core.annotation.NameInMap("CloudCode")
        private String cloudCode;

        @com.aliyun.core.annotation.NameInMap("Imported")
        private Integer imported;

        @com.aliyun.core.annotation.NameInMap("ImportedUserCount")
        private Integer importedUserCount;

        @com.aliyun.core.annotation.NameInMap("LogCode")
        private String logCode;

        @com.aliyun.core.annotation.NameInMap("LogMdsCode")
        private String logMdsCode;

        @com.aliyun.core.annotation.NameInMap("LogType")
        private Integer logType;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("ProdCode")
        private String prodCode;

        @com.aliyun.core.annotation.NameInMap("TotalUserCount")
        private Integer totalUserCount;

        @com.aliyun.core.annotation.NameInMap("UnImportedUserCount")
        private Integer unImportedUserCount;

        private Data(Builder builder) {
            this.autoImported = builder.autoImported;
            this.cloudCode = builder.cloudCode;
            this.imported = builder.imported;
            this.importedUserCount = builder.importedUserCount;
            this.logCode = builder.logCode;
            this.logMdsCode = builder.logMdsCode;
            this.logType = builder.logType;
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
         * @return logType
         */
        public Integer getLogType() {
            return this.logType;
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
            private Integer logType; 
            private String modifyTime; 
            private String prodCode; 
            private Integer totalUserCount; 
            private Integer unImportedUserCount; 

            /**
             * Indicates whether the log is automatically added to the threat analysis feature within newly added accounts. Valid values:
             * <p>
             * 
             * *   1: yes.
             * *   0: no.
             */
            public Builder autoImported(Integer autoImported) {
                this.autoImported = autoImported;
                return this;
            }

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
             * Indicates whether the log is added to the threat analysis feature. Valid values:
             * <p>
             * 
             * *   1: yes.
             * *   0: no.
             */
            public Builder imported(Integer imported) {
                this.imported = imported;
                return this;
            }

            /**
             * The number of users who have added the log.
             */
            public Builder importedUserCount(Integer importedUserCount) {
                this.importedUserCount = importedUserCount;
                return this;
            }

            /**
             * The code of the log.
             */
            public Builder logCode(String logCode) {
                this.logCode = logCode;
                return this;
            }

            /**
             * The display code of the log.
             */
            public Builder logMdsCode(String logMdsCode) {
                this.logMdsCode = logMdsCode;
                return this;
            }

            /**
             * The type of log. Valid values:
             * <p>
             *  - 1: the log produced by other product
             *  - 2: the predefined log
             *  - 3: the custom log
             */
            public Builder logType(Integer logType) {
                this.logType = logType;
                return this;
            }

            /**
             * The time when the log was last added.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The code of the cloud service to which the log belongs.
             */
            public Builder prodCode(String prodCode) {
                this.prodCode = prodCode;
                return this;
            }

            /**
             * The total number of users who have the log.
             */
            public Builder totalUserCount(Integer totalUserCount) {
                this.totalUserCount = totalUserCount;
                return this;
            }

            /**
             * The number of users who have not added the log.
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
