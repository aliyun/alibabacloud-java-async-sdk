// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataanalysisgbi20240823.models;

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
 * {@link RunDataResultAnalysisRequest} extends {@link RequestModel}
 *
 * <p>RunDataResultAnalysisRequest</p>
 */
public class RunDataResultAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("analysisMode")
    private String analysisMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sqlData")
    private SqlData sqlData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RunDataResultAnalysisRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.analysisMode = builder.analysisMode;
        this.requestId = builder.requestId;
        this.sqlData = builder.sqlData;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunDataResultAnalysisRequest create() {
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
     * @return analysisMode
     */
    public String getAnalysisMode() {
        return this.analysisMode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sqlData
     */
    public SqlData getSqlData() {
        return this.sqlData;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RunDataResultAnalysisRequest, Builder> {
        private String regionId; 
        private String analysisMode; 
        private String requestId; 
        private SqlData sqlData; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunDataResultAnalysisRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.analysisMode = request.analysisMode;
            this.requestId = request.requestId;
            this.sqlData = request.sqlData;
            this.workspaceId = request.workspaceId;
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
         * analysisMode.
         */
        public Builder analysisMode(String analysisMode) {
            this.putBodyParameter("analysisMode", analysisMode);
            this.analysisMode = analysisMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FF76AD3F-8B32-567E-819B-0D3738917006</p>
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * sqlData.
         */
        public Builder sqlData(SqlData sqlData) {
            this.putBodyParameter("sqlData", sqlData);
            this.sqlData = sqlData;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-2v3934xtp49esw64</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public RunDataResultAnalysisRequest build() {
            return new RunDataResultAnalysisRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunDataResultAnalysisRequest} extends {@link TeaModel}
     *
     * <p>RunDataResultAnalysisRequest</p>
     */
    public static class SqlData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("column")
        private java.util.List<String> column;

        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<java.util.Map<String, String>> data;

        private SqlData(Builder builder) {
            this.column = builder.column;
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SqlData create() {
            return builder().build();
        }

        /**
         * @return column
         */
        public java.util.List<String> getColumn() {
            return this.column;
        }

        /**
         * @return data
         */
        public java.util.List<java.util.Map<String, String>> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List<String> column; 
            private java.util.List<java.util.Map<String, String>> data; 

            private Builder() {
            } 

            private Builder(SqlData model) {
                this.column = model.column;
                this.data = model.data;
            } 

            /**
             * column.
             */
            public Builder column(java.util.List<String> column) {
                this.column = column;
                return this;
            }

            /**
             * data.
             */
            public Builder data(java.util.List<java.util.Map<String, String>> data) {
                this.data = data;
                return this;
            }

            public SqlData build() {
                return new SqlData(this);
            } 

        } 

    }
}
