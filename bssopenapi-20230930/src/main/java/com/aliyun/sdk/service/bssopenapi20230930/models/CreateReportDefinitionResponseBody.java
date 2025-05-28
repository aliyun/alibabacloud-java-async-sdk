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
         * BeginBillingCycle.
         */
        public Builder beginBillingCycle(String beginBillingCycle) {
            this.beginBillingCycle = beginBillingCycle;
            return this;
        }

        /**
         * Metadata.
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * OssBucketName.
         */
        public Builder ossBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * OssBucketOwnerAccountId.
         */
        public Builder ossBucketOwnerAccountId(Long ossBucketOwnerAccountId) {
            this.ossBucketOwnerAccountId = ossBucketOwnerAccountId;
            return this;
        }

        /**
         * OssBucketPath.
         */
        public Builder ossBucketPath(String ossBucketPath) {
            this.ossBucketPath = ossBucketPath;
            return this;
        }

        /**
         * ReportSourceName.
         */
        public Builder reportSourceName(String reportSourceName) {
            this.reportSourceName = reportSourceName;
            return this;
        }

        /**
         * ReportSourceType.
         */
        public Builder reportSourceType(String reportSourceType) {
            this.reportSourceType = reportSourceType;
            return this;
        }

        /**
         * ReportTaskId.
         */
        public Builder reportTaskId(Long reportTaskId) {
            this.reportTaskId = reportTaskId;
            return this;
        }

        /**
         * ReportType.
         */
        public Builder reportType(String reportType) {
            this.reportType = reportType;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubscribeCreateTime.
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
