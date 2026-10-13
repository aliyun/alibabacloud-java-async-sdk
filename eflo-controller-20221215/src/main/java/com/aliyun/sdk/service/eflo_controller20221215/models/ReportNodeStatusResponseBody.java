// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ReportNodeStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ReportNodeStatusResponseBody</p>
 */
public class ReportNodeStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("ReportId")
    private String reportId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ReportNodeStatusResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.errorMessage = builder.errorMessage;
        this.reportId = builder.reportId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportNodeStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String errorMessage; 
        private String reportId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ReportNodeStatusResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.errorMessage = model.errorMessage;
            this.reportId = model.reportId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource Not Found</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The fault report ID.</p>
         * 
         * <strong>example:</strong>
         * <p>156837191934</p>
         */
        public Builder reportId(String reportId) {
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DA4F08D4-DA54-5407-84B9-108C71D75B17</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReportNodeStatusResponseBody build() {
            return new ReportNodeStatusResponseBody(this);
        } 

    } 

}
