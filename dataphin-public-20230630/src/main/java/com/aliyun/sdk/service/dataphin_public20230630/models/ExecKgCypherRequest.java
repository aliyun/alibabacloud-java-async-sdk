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
 * {@link ExecKgCypherRequest} extends {@link RequestModel}
 *
 * <p>ExecKgCypherRequest</p>
 */
public class ExecKgCypherRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private ExecCommand execCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ExecKgCypherRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.execCommand = builder.execCommand;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecKgCypherRequest create() {
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
     * @return execCommand
     */
    public ExecCommand getExecCommand() {
        return this.execCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ExecKgCypherRequest, Builder> {
        private String regionId; 
        private ExecCommand execCommand; 
        private Long opTenantId; 
        private String opUserId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ExecKgCypherRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.execCommand = request.execCommand;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.workspaceId = request.workspaceId;
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
        public Builder execCommand(ExecCommand execCommand) {
            String execCommandShrink = shrink(execCommand, "ExecCommand", "json");
            this.putBodyParameter("ExecCommand", execCommandShrink);
            this.execCommand = execCommand;
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
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f1d4559a4db044158305e2d89bccf81f</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ExecKgCypherRequest build() {
            return new ExecKgCypherRequest(this);
        } 

    } 

    /**
     * 
     * {@link ExecKgCypherRequest} extends {@link TeaModel}
     *
     * <p>ExecKgCypherRequest</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Params(Builder builder) {
            this.dataType = builder.dataType;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String dataType; 
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Params model) {
                this.dataType = model.dataType;
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>paramKey</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>paramValue</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExecKgCypherRequest} extends {@link TeaModel}
     *
     * <p>ExecKgCypherRequest</p>
     */
    public static class ExecCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Limit")
        private Integer limit;

        @com.aliyun.core.annotation.NameInMap("Params")
        private java.util.List<Params> params;

        @com.aliyun.core.annotation.NameInMap("Query")
        private String query;

        private ExecCommand(Builder builder) {
            this.limit = builder.limit;
            this.params = builder.params;
            this.query = builder.query;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecCommand create() {
            return builder().build();
        }

        /**
         * @return limit
         */
        public Integer getLimit() {
            return this.limit;
        }

        /**
         * @return params
         */
        public java.util.List<Params> getParams() {
            return this.params;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        public static final class Builder {
            private Integer limit; 
            private java.util.List<Params> params; 
            private String query; 

            private Builder() {
            } 

            private Builder(ExecCommand model) {
                this.limit = model.limit;
                this.params = model.params;
                this.query = model.query;
            } 

            /**
             * Limit.
             */
            public Builder limit(Integer limit) {
                this.limit = limit;
                return this;
            }

            /**
             * Params.
             */
            public Builder params(java.util.List<Params> params) {
                this.params = params;
                return this;
            }

            /**
             * Query.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            public ExecCommand build() {
                return new ExecCommand(this);
            } 

        } 

    }
}
