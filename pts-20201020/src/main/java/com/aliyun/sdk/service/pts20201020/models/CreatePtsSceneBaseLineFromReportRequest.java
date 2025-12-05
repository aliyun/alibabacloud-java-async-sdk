// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

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
 * {@link CreatePtsSceneBaseLineFromReportRequest} extends {@link RequestModel}
 *
 * <p>CreatePtsSceneBaseLineFromReportRequest</p>
 */
public class CreatePtsSceneBaseLineFromReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reportId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    private CreatePtsSceneBaseLineFromReportRequest(Builder builder) {
        super(builder);
        this.reportId = builder.reportId;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePtsSceneBaseLineFromReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<CreatePtsSceneBaseLineFromReportRequest, Builder> {
        private String reportId; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePtsSceneBaseLineFromReportRequest request) {
            super(request);
            this.reportId = request.reportId;
            this.sceneId = request.sceneId;
        } 

        /**
         * <p>The ID of the report. For more information, see the <a href="https://help.aliyun.com/document_detail/201321.html">table</a> provided in this topic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HNB78HB</p>
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The ID of the scene. For more information, see the <a href="https://help.aliyun.com/document_detail/201321.html">table</a> provided in this topic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VCB78HB</p>
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public CreatePtsSceneBaseLineFromReportRequest build() {
            return new CreatePtsSceneBaseLineFromReportRequest(this);
        } 

    } 

}
