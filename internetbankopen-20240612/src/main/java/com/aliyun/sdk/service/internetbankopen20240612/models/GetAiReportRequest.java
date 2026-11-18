// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.internetbankopen20240612.models;

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
 * {@link GetAiReportRequest} extends {@link RequestModel}
 *
 * <p>GetAiReportRequest</p>
 */
public class GetAiReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("callId")
    private String callId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("reportId")
    private String reportId;

    private GetAiReportRequest(Builder builder) {
        super(builder);
        this.callId = builder.callId;
        this.reportId = builder.reportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    public static final class Builder extends Request.Builder<GetAiReportRequest, Builder> {
        private String callId; 
        private String reportId; 

        private Builder() {
            super();
        } 

        private Builder(GetAiReportRequest request) {
            super(request);
            this.callId = request.callId;
            this.reportId = request.reportId;
        } 

        /**
         * <p>The data call ID, which is obtained from the callId returned by InvokeDataProduct. You must specify either this parameter or reportId. You cannot specify both or leave both empty. The value must start with call- and be 1 to 64 characters in length. It can contain only ASCII letters, digits, underscores (_), and hyphens (-). The value is case-sensitive, and leading and trailing spaces are not trimmed. If the format is invalid, InvalidParameter.CallId is returned. If both parameters are specified or left empty, InvalidParameter.ReportReference is returned. This parameter is used to query the status of per-use reports. If you use this ID to query a periodic report, WAITING_PERIOD is always returned. Use the ReportId from the list instead.</p>
         * 
         * <strong>example:</strong>
         * <p>call-3f2b8c1e-6d4a-4b7e-9a1c-2e5f7d8b9c0a</p>
         */
        public Builder callId(String callId) {
            this.putQueryParameter("callId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * <p>The report ID, which is obtained from the ReportId returned by ListProductReports or the Report.ReportId in the previous available result of GetAiReport. You must specify either this parameter or callId. You cannot specify both or leave both empty. The value must start with report- and be 1 to 64 characters in length. It can contain only ASCII letters, digits, underscores (_), and hyphens (-). The value is case-sensitive, and leading and trailing spaces are not trimmed. If the format is invalid, InvalidParameter.ReportId is returned. If both parameters are specified or left empty, InvalidParameter.ReportReference is returned. You can only query reports that belong to the current Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>report-3f2b8c1e-6d4a-4b7e-9a1c-2e5f7d8b9c0a</p>
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("reportId", reportId);
            this.reportId = reportId;
            return this;
        }

        @Override
        public GetAiReportRequest build() {
            return new GetAiReportRequest(this);
        } 

    } 

}
