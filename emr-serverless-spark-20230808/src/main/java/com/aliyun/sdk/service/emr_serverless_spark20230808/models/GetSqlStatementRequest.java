// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSqlStatementRequest} extends {@link RequestModel}
 *
 * <p>GetSqlStatementRequest</p>
 */
public class GetSqlStatementRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("statementId")
    private String statementId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private GetSqlStatementRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.statementId = builder.statementId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSqlStatementRequest create() {
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
     * @return statementId
     */
    public String getStatementId() {
        return this.statementId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetSqlStatementRequest, Builder> {
        private String workspaceId; 
        private String statementId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetSqlStatementRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.statementId = request.statementId;
            this.regionId = request.regionId;
        } 

        /**
         * The workspace ID.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * The interactive query ID.
         */
        public Builder statementId(String statementId) {
            this.putPathParameter("statementId", statementId);
            this.statementId = statementId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetSqlStatementRequest build() {
            return new GetSqlStatementRequest(this);
        } 

    } 

}
