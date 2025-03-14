// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link SaveCustomizeReportConfigResponseBody} extends {@link TeaModel}
 *
 * <p>SaveCustomizeReportConfigResponseBody</p>
 */
public class SaveCustomizeReportConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ReportId")
    private Long reportId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SaveCustomizeReportConfigResponseBody(Builder builder) {
        this.reportId = builder.reportId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveCustomizeReportConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reportId
     */
    public Long getReportId() {
        return this.reportId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long reportId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SaveCustomizeReportConfigResponseBody model) {
            this.reportId = model.reportId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the report.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder reportId(Long reportId) {
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11472B29-1A1C-5D7F-944B-7CD84319****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SaveCustomizeReportConfigResponseBody build() {
            return new SaveCustomizeReportConfigResponseBody(this);
        } 

    } 

}
