// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInspectionReportDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>GetInspectionReportDownloadUrlRequest</p>
 */
public class GetInspectionReportDownloadUrlRequest extends Request {
    @Body
    @NameInMap("DownloadReportListJson")
    private String downloadReportListJson;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    private GetInspectionReportDownloadUrlRequest(Builder builder) {
        super(builder);
        this.downloadReportListJson = builder.downloadReportListJson;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInspectionReportDownloadUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return downloadReportListJson
     */
    public String getDownloadReportListJson() {
        return this.downloadReportListJson;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<GetInspectionReportDownloadUrlRequest, Builder> {
        private String downloadReportListJson; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetInspectionReportDownloadUrlRequest request) {
            super(request);
            this.downloadReportListJson = request.downloadReportListJson;
            this.operaUid = request.operaUid;
        } 

        /**
         * DownloadReportListJson.
         */
        public Builder downloadReportListJson(String downloadReportListJson) {
            this.putBodyParameter("DownloadReportListJson", downloadReportListJson);
            this.downloadReportListJson = downloadReportListJson;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putBodyParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public GetInspectionReportDownloadUrlRequest build() {
            return new GetInspectionReportDownloadUrlRequest(this);
        } 

    } 

}
