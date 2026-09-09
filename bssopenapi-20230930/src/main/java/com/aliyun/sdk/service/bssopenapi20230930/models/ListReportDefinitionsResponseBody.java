// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link ListReportDefinitionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListReportDefinitionsResponseBody</p>
 */
public class ListReportDefinitionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("ReportDefinitions")
    private java.util.List<ReportDefinitions> reportDefinitions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListReportDefinitionsResponseBody(Builder builder) {
        this.metadata = builder.metadata;
        this.reportDefinitions = builder.reportDefinitions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListReportDefinitionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return reportDefinitions
     */
    public java.util.List<ReportDefinitions> getReportDefinitions() {
        return this.reportDefinitions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Object metadata; 
        private java.util.List<ReportDefinitions> reportDefinitions; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListReportDefinitionsResponseBody model) {
            this.metadata = model.metadata;
            this.reportDefinitions = model.reportDefinitions;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The metadata of the response struct.</p>
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The data list.</p>
         */
        public Builder reportDefinitions(java.util.List<ReportDefinitions> reportDefinitions) {
            this.reportDefinitions = reportDefinitions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListReportDefinitionsResponseBody build() {
            return new ListReportDefinitionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListReportDefinitionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListReportDefinitionsResponseBody</p>
     */
    public static class ReportDefinitions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginBillingCycle")
        private String beginBillingCycle;

        @com.aliyun.core.annotation.NameInMap("OssBucketName")
        private String ossBucketName;

        @com.aliyun.core.annotation.NameInMap("OssBucketOwnerAccountId")
        private Long ossBucketOwnerAccountId;

        @com.aliyun.core.annotation.NameInMap("OssBucketPath")
        private String ossBucketPath;

        @com.aliyun.core.annotation.NameInMap("ReportSourceName")
        private String reportSourceName;

        @com.aliyun.core.annotation.NameInMap("ReportSourceType")
        private String reportSourceType;

        @com.aliyun.core.annotation.NameInMap("ReportTaskId")
        private Long reportTaskId;

        @com.aliyun.core.annotation.NameInMap("ReportType")
        private String reportType;

        @com.aliyun.core.annotation.NameInMap("SelectedFields")
        private java.util.List<String> selectedFields;

        @com.aliyun.core.annotation.NameInMap("SubscribeCreateTime")
        private String subscribeCreateTime;

        private ReportDefinitions(Builder builder) {
            this.beginBillingCycle = builder.beginBillingCycle;
            this.ossBucketName = builder.ossBucketName;
            this.ossBucketOwnerAccountId = builder.ossBucketOwnerAccountId;
            this.ossBucketPath = builder.ossBucketPath;
            this.reportSourceName = builder.reportSourceName;
            this.reportSourceType = builder.reportSourceType;
            this.reportTaskId = builder.reportTaskId;
            this.reportType = builder.reportType;
            this.selectedFields = builder.selectedFields;
            this.subscribeCreateTime = builder.subscribeCreateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportDefinitions create() {
            return builder().build();
        }

        /**
         * @return beginBillingCycle
         */
        public String getBeginBillingCycle() {
            return this.beginBillingCycle;
        }

        /**
         * @return ossBucketName
         */
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        /**
         * @return ossBucketOwnerAccountId
         */
        public Long getOssBucketOwnerAccountId() {
            return this.ossBucketOwnerAccountId;
        }

        /**
         * @return ossBucketPath
         */
        public String getOssBucketPath() {
            return this.ossBucketPath;
        }

        /**
         * @return reportSourceName
         */
        public String getReportSourceName() {
            return this.reportSourceName;
        }

        /**
         * @return reportSourceType
         */
        public String getReportSourceType() {
            return this.reportSourceType;
        }

        /**
         * @return reportTaskId
         */
        public Long getReportTaskId() {
            return this.reportTaskId;
        }

        /**
         * @return reportType
         */
        public String getReportType() {
            return this.reportType;
        }

        /**
         * @return selectedFields
         */
        public java.util.List<String> getSelectedFields() {
            return this.selectedFields;
        }

        /**
         * @return subscribeCreateTime
         */
        public String getSubscribeCreateTime() {
            return this.subscribeCreateTime;
        }

        public static final class Builder {
            private String beginBillingCycle; 
            private String ossBucketName; 
            private Long ossBucketOwnerAccountId; 
            private String ossBucketPath; 
            private String reportSourceName; 
            private String reportSourceType; 
            private Long reportTaskId; 
            private String reportType; 
            private java.util.List<String> selectedFields; 
            private String subscribeCreateTime; 

            private Builder() {
            } 

            private Builder(ReportDefinitions model) {
                this.beginBillingCycle = model.beginBillingCycle;
                this.ossBucketName = model.ossBucketName;
                this.ossBucketOwnerAccountId = model.ossBucketOwnerAccountId;
                this.ossBucketPath = model.ossBucketPath;
                this.reportSourceName = model.reportSourceName;
                this.reportSourceType = model.reportSourceType;
                this.reportTaskId = model.reportTaskId;
                this.reportType = model.reportType;
                this.selectedFields = model.selectedFields;
                this.subscribeCreateTime = model.subscribeCreateTime;
            } 

            /**
             * <p>The start billing cycle for push. After the subscription is created, the system automatically pushes data from the start billing cycle to the current time. This parameter does not take effect for monthly bill PDF subscriptions, and historical data is not re-pushed. Data within the last year can be pushed.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05</p>
             */
            public Builder beginBillingCycle(String beginBillingCycle) {
                this.beginBillingCycle = beginBillingCycle;
                return this;
            }

            /**
             * <p>The name of the OSS bucket that stores the files.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-bill</p>
             */
            public Builder ossBucketName(String ossBucketName) {
                this.ossBucketName = ossBucketName;
                return this;
            }

            /**
             * <p>The UID of the OSS bucket owner that stores the files. Specify this parameter when a Bid/Reseller subscription needs to push data to the OSS bucket of a sub-account. The specified account must be a sub-account of the calling account and must be granted the AliyunConsumeDump2OSSRole permission. Regular users do not need to specify this parameter. The calling account is used by default.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567812345678</p>
             */
            public Builder ossBucketOwnerAccountId(Long ossBucketOwnerAccountId) {
                this.ossBucketOwnerAccountId = ossBucketOwnerAccountId;
                return this;
            }

            /**
             * <p>The storage path of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>bill/</p>
             */
            public Builder ossBucketPath(String ossBucketPath) {
                this.ossBucketPath = ossBucketPath;
                return this;
            }

            /**
             * <p>The subscription source name.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder reportSourceName(String reportSourceName) {
                this.reportSourceName = reportSourceName;
                return this;
            }

            /**
             * <p>The subscription source. Valid values: OSS and MC.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder reportSourceType(String reportSourceType) {
                this.reportSourceType = reportSourceType;
                return this;
            }

            /**
             * <p>The bill subscription task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123321</p>
             */
            public Builder reportTaskId(Long reportTaskId) {
                this.reportTaskId = reportTaskId;
                return this;
            }

            /**
             * <p>The subscription type. Valid values:</p>
             * <ul>
             * <li>BillingItemDetailForBillingPeriod: billable item consumption details.</li>
             * <li>InstanceDetailForBillingPeriod: instance consumption details.</li>
             * <li>BillingItemDetailMonthly: billable item consumption summary by billing cycle.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BillingItemDetailForBillingPeriod</p>
             */
            public Builder reportType(String reportType) {
                this.reportType = reportType;
                return this;
            }

            /**
             * SelectedFields.
             */
            public Builder selectedFields(java.util.List<String> selectedFields) {
                this.selectedFields = selectedFields;
                return this;
            }

            /**
             * <p>The time when the subscription was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-21 10:36:31</p>
             */
            public Builder subscribeCreateTime(String subscribeCreateTime) {
                this.subscribeCreateTime = subscribeCreateTime;
                return this;
            }

            public ReportDefinitions build() {
                return new ReportDefinitions(this);
            } 

        } 

    }
}
