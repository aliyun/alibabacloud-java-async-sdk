// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link CreateReportTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateReportTemplateResponseBody</p>
 */
public class CreateReportTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ReportTemplateId")
    private String reportTemplateId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateReportTemplateResponseBody(Builder builder) {
        this.reportTemplateId = builder.reportTemplateId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReportTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reportTemplateId
     */
    public String getReportTemplateId() {
        return this.reportTemplateId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String reportTemplateId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateReportTemplateResponseBody model) {
            this.reportTemplateId = model.reportTemplateId;
            this.requestId = model.requestId;
        } 

        /**
         * ReportTemplateId.
         */
        public Builder reportTemplateId(String reportTemplateId) {
            this.reportTemplateId = reportTemplateId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateReportTemplateResponseBody build() {
            return new CreateReportTemplateResponseBody(this);
        } 

    } 

}
