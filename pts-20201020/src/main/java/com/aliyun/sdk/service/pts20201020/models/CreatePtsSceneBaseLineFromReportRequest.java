// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePtsSceneBaseLineFromReportRequest} extends {@link RequestModel}
 *
 * <p>CreatePtsSceneBaseLineFromReportRequest</p>
 */
public class CreatePtsSceneBaseLineFromReportRequest extends Request {
    @Query
    @NameInMap("ReportId")
    @Validation(required = true)
    private String reportId;

    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
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
         * ReportId.
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * SceneId.
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
