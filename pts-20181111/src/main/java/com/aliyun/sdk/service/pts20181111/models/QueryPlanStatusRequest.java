// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20181111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPlanStatusRequest} extends {@link RequestModel}
 *
 * <p>QueryPlanStatusRequest</p>
 */
public class QueryPlanStatusRequest extends Request {
    @Query
    @NameInMap("ReportId")
    @Validation(required = true)
    private Long reportId;

    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private Long sceneId;

    private QueryPlanStatusRequest(Builder builder) {
        super(builder);
        this.reportId = builder.reportId;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPlanStatusRequest create() {
        return builder().build();
    }

    @Override
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
     * @return sceneId
     */
    public Long getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<QueryPlanStatusRequest, Builder> {
        private Long reportId; 
        private Long sceneId; 

        private Builder() {
            super();
        } 

        private Builder(QueryPlanStatusRequest request) {
            super(request);
            this.reportId = request.reportId;
            this.sceneId = request.sceneId;
        } 

        /**
         * ReportId.
         */
        public Builder reportId(Long reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(Long sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public QueryPlanStatusRequest build() {
            return new QueryPlanStatusRequest(this);
        } 

    } 

}
