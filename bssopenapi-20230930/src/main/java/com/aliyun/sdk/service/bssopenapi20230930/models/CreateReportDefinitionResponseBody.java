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
 * {@link CreateReportDefinitionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateReportDefinitionResponseBody</p>
 */
public class CreateReportDefinitionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BeginBillingCycle")
    private String beginBillingCycle;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubscribeCreateTime")
    private String subscribeCreateTime;

    private CreateReportDefinitionResponseBody(Builder builder) {
        this.beginBillingCycle = builder.beginBillingCycle;
        this.metadata = builder.metadata;
        this.ossBucketName = builder.ossBucketName;
        this.ossBucketOwnerAccountId = builder.ossBucketOwnerAccountId;
        this.ossBucketPath = builder.ossBucketPath;
        this.reportSourceName = builder.reportSourceName;
        this.reportSourceType = builder.reportSourceType;
        this.reportTaskId = builder.reportTaskId;
        this.reportType = builder.reportType;
        this.requestId = builder.requestId;
        this.subscribeCreateTime = builder.subscribeCreateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReportDefinitionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginBillingCycle
     */
    public String getBeginBillingCycle() {
        return this.beginBillingCycle;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subscribeCreateTime
     */
    public String getSubscribeCreateTime() {
        return this.subscribeCreateTime;
    }

    public static final class Builder {
        private String beginBillingCycle; 
        private Object metadata; 
        private String ossBucketName; 
        private Long ossBucketOwnerAccountId; 
        private String ossBucketPath; 
        private String reportSourceName; 
        private String reportSourceType; 
        private Long reportTaskId; 
        private String reportType; 
        private String requestId; 
        private String subscribeCreateTime; 

        private Builder() {
        } 

        private Builder(CreateReportDefinitionResponseBody model) {
            this.beginBillingCycle = model.beginBillingCycle;
            this.metadata = model.metadata;
            this.ossBucketName = model.ossBucketName;
            this.ossBucketOwnerAccountId = model.ossBucketOwnerAccountId;
            this.ossBucketPath = model.ossBucketPath;
            this.reportSourceName = model.reportSourceName;
            this.reportSourceType = model.reportSourceType;
            this.reportTaskId = model.reportTaskId;
            this.reportType = model.reportType;
            this.requestId = model.requestId;
            this.subscribeCreateTime = model.subscribeCreateTime;
        } 

        /**
         * <p>The start billing cycle for push. After successful subscription, the system automatically pushes data from the start billing cycle to the current time. This parameter is invalid for monthly bill PDF subscriptions and does not re-push historical data. Data within the last year can be pushed.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05</p>
         */
        public Builder beginBillingCycle(String beginBillingCycle) {
            this.beginBillingCycle = beginBillingCycle;
            return this;
        }

        /**
         * <p>The response struct metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The name of the OSS bucket for file storage.</p>
         * 
         * <strong>example:</strong>
         * <p>sh-bill</p>
         */
        public Builder ossBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * <p>The UID of the OSS owner that stores the files. If this is a Bid/Reseller subscription and you need to push to a sub-account\&quot;s OSS, specify this parameter. The account must be a sub-account of the calling account, and the AliyunConsumeDump2OSSRole permission must be granted to this account. Regular users do not need to specify this parameter. The default value is the calling account.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567812345678</p>
         */
        public Builder ossBucketOwnerAccountId(Long ossBucketOwnerAccountId) {
            this.ossBucketOwnerAccountId = ossBucketOwnerAccountId;
            return this;
        }

        /**
         * <p>The OSS bucket storage path.</p>
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
         * <p>The subscription source. Valid values: OSS or MC.</p>
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
         * <p>123123</p>
         */
        public Builder reportTaskId(Long reportTaskId) {
            this.reportTaskId = reportTaskId;
            return this;
        }

        /**
         * <p>The subscription type. Valid values:</p>
         * <ul>
         * <li>consumeDetailBillV2: consumption details (supported only for OSS/MC subscriptions).</li>
         * <li>splitDetailBillV2: split details (supported only for OSS/MC subscriptions).</li>
         * <li>costDetailBillV2: cost details (supported only for OSS/MC subscriptions).</li>
         * <li>monthBillOverview: monthly bill summary (supported only for OSS/MSC_EMAIL subscriptions).</li>
         * <li>focus: FOCUS bill (supported only for OSS/MC subscriptions).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>consumeDetailBillV2</p>
         */
        public Builder reportType(String reportType) {
            this.reportType = reportType;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>340CAB45-0637-5875-9BE4-EFD5750F6BA5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The subscription creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-21 10:36:31</p>
         */
        public Builder subscribeCreateTime(String subscribeCreateTime) {
            this.subscribeCreateTime = subscribeCreateTime;
            return this;
        }

        public CreateReportDefinitionResponseBody build() {
            return new CreateReportDefinitionResponseBody(this);
        } 

    } 

}
