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
 * {@link ListImportedLogsByProdResponseBody} extends {@link TeaModel}
 *
 * <p>ListImportedLogsByProdResponseBody</p>
 */
public class ListImportedLogsByProdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListImportedLogsByProdResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
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

        public ListImportedLogsByProdResponseBody build() {
            return new ListImportedLogsByProdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListImportedLogsByProdResponseBody} extends {@link TeaModel}
     *
     * <p>ListImportedLogsByProdResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.autoImported = model.autoImported;
                this.cloudCode = model.cloudCode;
                this.imported = model.imported;
                this.importedUserCount = model.importedUserCount;
                this.logCode = model.logCode;
                this.logMdsCode = model.logMdsCode;
                this.logType = model.logType;
                this.modifyTime = model.modifyTime;
                this.prodCode = model.prodCode;
                this.totalUserCount = model.totalUserCount;
                this.unImportedUserCount = model.unImportedUserCount;
            } 

            /**
             * <p>Indicates whether the log is automatically added to the threat analysis feature within newly added accounts. Valid values:</p>
             * <ul>
             * <li>1: yes.</li>
             * <li>0: no.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2023-11-23 12:30:00</p>
             */
            public Builder autoImported(Integer autoImported) {
                this.autoImported = autoImported;
                return this;
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
             * <p>Indicates whether the log is added to the threat analysis feature. Valid values:</p>
             * <ul>
             * <li>1: yes.</li>
             * <li>0: no.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2023-11-23 12:30:00</p>
             */
            public Builder imported(Integer imported) {
                this.imported = imported;
                return this;
            }

            /**
             * <p>The number of users who have added the log.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder importedUserCount(Integer importedUserCount) {
                this.importedUserCount = importedUserCount;
                return this;
            }

            /**
             * <p>The code of the log.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_siem_waf_xxxxx</p>
             */
            public Builder logCode(String logCode) {
                this.logCode = logCode;
                return this;
            }

            /**
             * <p>The display code of the log.</p>
             * 
             * <strong>example:</strong>
             * <p>${siem.prod. cloud_siem_waf_xxxxx}</p>
             */
            public Builder logMdsCode(String logMdsCode) {
                this.logMdsCode = logMdsCode;
                return this;
            }

            /**
             * <p>The type of log. Valid values:</p>
             * <ul>
             * <li>1: the log produced by other product</li>
             * <li>2: the predefined log</li>
             * <li>3: the custom log</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder logType(Integer logType) {
                this.logType = logType;
                return this;
            }

            /**
             * <p>The time when the log was last added.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-23 12:30:00</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The code of the cloud service to which the log belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>qcloud_waf</p>
             */
            public Builder prodCode(String prodCode) {
                this.prodCode = prodCode;
                return this;
            }

            /**
             * <p>The total number of users who have the log.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder totalUserCount(Integer totalUserCount) {
                this.totalUserCount = totalUserCount;
                return this;
            }

            /**
             * <p>The number of users who have not added the log.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
