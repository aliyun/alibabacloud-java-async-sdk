// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetPipelineByIdRequest} extends {@link RequestModel}
 *
 * <p>GetPipelineByIdRequest</p>
 */
public class GetPipelineByIdRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Context")
    @com.aliyun.core.annotation.Validation(required = true)
    private Context context;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private QueryId queryId;

    private GetPipelineByIdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.context = builder.context;
        this.opTenantId = builder.opTenantId;
        this.queryId = builder.queryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineByIdRequest create() {
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
     * @return context
     */
    public Context getContext() {
        return this.context;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return queryId
     */
    public QueryId getQueryId() {
        return this.queryId;
    }

    public static final class Builder extends Request.Builder<GetPipelineByIdRequest, Builder> {
        private String regionId; 
        private Context context; 
        private Long opTenantId; 
        private QueryId queryId; 

        private Builder() {
            super();
        } 

        private Builder(GetPipelineByIdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.context = request.context;
            this.opTenantId = request.opTenantId;
            this.queryId = request.queryId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder context(Context context) {
            String contextShrink = shrink(context, "Context", "json");
            this.putBodyParameter("Context", contextShrink);
            this.context = context;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder queryId(QueryId queryId) {
            String queryIdShrink = shrink(queryId, "QueryId", "json");
            this.putBodyParameter("QueryId", queryIdShrink);
            this.queryId = queryId;
            return this;
        }

        @Override
        public GetPipelineByIdRequest build() {
            return new GetPipelineByIdRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetPipelineByIdRequest} extends {@link TeaModel}
     *
     * <p>GetPipelineByIdRequest</p>
     */
    public static class Context extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Env")
        @com.aliyun.core.annotation.Validation(required = true)
        private String env;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        private Context(Builder builder) {
            this.env = builder.env;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Context create() {
            return builder().build();
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private String env; 
            private Long projectId; 

            private Builder() {
            } 

            private Builder(Context model) {
                this.env = model.env;
                this.projectId = model.projectId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DEV</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public Context build() {
                return new Context(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPipelineByIdRequest} extends {@link TeaModel}
     *
     * <p>GetPipelineByIdRequest</p>
     */
    public static class QueryId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private Long pipelineId;

        private QueryId(Builder builder) {
            this.fileId = builder.fileId;
            this.nodeId = builder.nodeId;
            this.pipelineId = builder.pipelineId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryId create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return pipelineId
         */
        public Long getPipelineId() {
            return this.pipelineId;
        }

        public static final class Builder {
            private Long fileId; 
            private String nodeId; 
            private Long pipelineId; 

            private Builder() {
            } 

            private Builder(QueryId model) {
                this.fileId = model.fileId;
                this.nodeId = model.nodeId;
                this.pipelineId = model.pipelineId;
            } 

            /**
             * FileId.
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * PipelineId.
             */
            public Builder pipelineId(Long pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            public QueryId build() {
                return new QueryId(this);
            } 

        } 

    }
}
