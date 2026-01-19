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
 * {@link TriggerReportSendRequest} extends {@link RequestModel}
 *
 * <p>TriggerReportSendRequest</p>
 */
public class TriggerReportSendRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reportTemplateId;

    private TriggerReportSendRequest(Builder builder) {
        super(builder);
        this.reportTemplateId = builder.reportTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerReportSendRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reportTemplateId
     */
    public String getReportTemplateId() {
        return this.reportTemplateId;
    }

    public static final class Builder extends Request.Builder<TriggerReportSendRequest, Builder> {
        private String reportTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(TriggerReportSendRequest request) {
            super(request);
            this.reportTemplateId = request.reportTemplateId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crt-xxx</p>
         */
        public Builder reportTemplateId(String reportTemplateId) {
            this.putBodyParameter("ReportTemplateId", reportTemplateId);
            this.reportTemplateId = reportTemplateId;
            return this;
        }

        @Override
        public TriggerReportSendRequest build() {
            return new TriggerReportSendRequest(this);
        } 

    } 

}
