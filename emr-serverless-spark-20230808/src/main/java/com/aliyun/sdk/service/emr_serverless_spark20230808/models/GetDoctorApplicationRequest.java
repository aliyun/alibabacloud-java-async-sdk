// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link GetDoctorApplicationRequest} extends {@link RequestModel}
 *
 * <p>GetDoctorApplicationRequest</p>
 */
public class GetDoctorApplicationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("locale")
    private String locale;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("queryTime")
    private String queryTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private GetDoctorApplicationRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.runId = builder.runId;
        this.locale = builder.locale;
        this.queryTime = builder.queryTime;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDoctorApplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return locale
     */
    public String getLocale() {
        return this.locale;
    }

    /**
     * @return queryTime
     */
    public String getQueryTime() {
        return this.queryTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetDoctorApplicationRequest, Builder> {
        private String workspaceId; 
        private String runId; 
        private String locale; 
        private String queryTime; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetDoctorApplicationRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.runId = request.runId;
            this.locale = request.locale;
            this.queryTime = request.queryTime;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-d2d82aa09155****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>jr-d2d82aa09155****</p>
         */
        public Builder runId(String runId) {
            this.putPathParameter("runId", runId);
            this.runId = runId;
            return this;
        }

        /**
         * <p>The language of diagnostic information.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder locale(String locale) {
            this.putQueryParameter("locale", locale);
            this.locale = locale;
            return this;
        }

        /**
         * <p>The query time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01</p>
         */
        public Builder queryTime(String queryTime) {
            this.putQueryParameter("queryTime", queryTime);
            this.queryTime = queryTime;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetDoctorApplicationRequest build() {
            return new GetDoctorApplicationRequest(this);
        } 

    } 

}
