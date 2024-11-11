// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataanalysisgbi20240823.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunDataAnalysisRequest} extends {@link RequestModel}
 *
 * <p>RunDataAnalysisRequest</p>
 */
public class RunDataAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("generateSqlOnly")
    private Boolean generateSqlOnly;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("specificationType")
    private String specificationType;

    private RunDataAnalysisRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.generateSqlOnly = builder.generateSqlOnly;
        this.query = builder.query;
        this.sessionId = builder.sessionId;
        this.specificationType = builder.specificationType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunDataAnalysisRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return generateSqlOnly
     */
    public Boolean getGenerateSqlOnly() {
        return this.generateSqlOnly;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return specificationType
     */
    public String getSpecificationType() {
        return this.specificationType;
    }

    public static final class Builder extends Request.Builder<RunDataAnalysisRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private Boolean generateSqlOnly; 
        private String query; 
        private String sessionId; 
        private String specificationType; 

        private Builder() {
            super();
        } 

        private Builder(RunDataAnalysisRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.generateSqlOnly = request.generateSqlOnly;
            this.query = request.query;
            this.sessionId = request.sessionId;
            this.specificationType = request.specificationType;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-2v3934xtp49esw64</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * generateSqlOnly.
         */
        public Builder generateSqlOnly(Boolean generateSqlOnly) {
            this.putBodyParameter("generateSqlOnly", generateSqlOnly);
            this.generateSqlOnly = generateSqlOnly;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * specificationType.
         */
        public Builder specificationType(String specificationType) {
            this.putBodyParameter("specificationType", specificationType);
            this.specificationType = specificationType;
            return this;
        }

        @Override
        public RunDataAnalysisRequest build() {
            return new RunDataAnalysisRequest(this);
        } 

    } 

}
