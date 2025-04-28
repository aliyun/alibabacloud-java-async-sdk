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
 * {@link GetTableLineageByTaskIdRequest} extends {@link RequestModel}
 *
 * <p>GetTableLineageByTaskIdRequest</p>
 */
public class GetTableLineageByTaskIdRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TableLineageByTaskIdQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private TableLineageByTaskIdQuery tableLineageByTaskIdQuery;

    private GetTableLineageByTaskIdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.tableLineageByTaskIdQuery = builder.tableLineageByTaskIdQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableLineageByTaskIdRequest create() {
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return tableLineageByTaskIdQuery
     */
    public TableLineageByTaskIdQuery getTableLineageByTaskIdQuery() {
        return this.tableLineageByTaskIdQuery;
    }

    public static final class Builder extends Request.Builder<GetTableLineageByTaskIdRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private TableLineageByTaskIdQuery tableLineageByTaskIdQuery; 

        private Builder() {
            super();
        } 

        private Builder(GetTableLineageByTaskIdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.tableLineageByTaskIdQuery = request.tableLineageByTaskIdQuery;
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
        public Builder tableLineageByTaskIdQuery(TableLineageByTaskIdQuery tableLineageByTaskIdQuery) {
            String tableLineageByTaskIdQueryShrink = shrink(tableLineageByTaskIdQuery, "TableLineageByTaskIdQuery", "json");
            this.putBodyParameter("TableLineageByTaskIdQuery", tableLineageByTaskIdQueryShrink);
            this.tableLineageByTaskIdQuery = tableLineageByTaskIdQuery;
            return this;
        }

        @Override
        public GetTableLineageByTaskIdRequest build() {
            return new GetTableLineageByTaskIdRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetTableLineageByTaskIdRequest} extends {@link TeaModel}
     *
     * <p>GetTableLineageByTaskIdRequest</p>
     */
    public static class TableLineageByTaskIdQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NeedNotExistObject")
        private Boolean needNotExistObject;

        @com.aliyun.core.annotation.NameInMap("TaskEnv")
        private String taskEnv;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String taskId;

        private TableLineageByTaskIdQuery(Builder builder) {
            this.needNotExistObject = builder.needNotExistObject;
            this.taskEnv = builder.taskEnv;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableLineageByTaskIdQuery create() {
            return builder().build();
        }

        /**
         * @return needNotExistObject
         */
        public Boolean getNeedNotExistObject() {
            return this.needNotExistObject;
        }

        /**
         * @return taskEnv
         */
        public String getTaskEnv() {
            return this.taskEnv;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Boolean needNotExistObject; 
            private String taskEnv; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(TableLineageByTaskIdQuery model) {
                this.needNotExistObject = model.needNotExistObject;
                this.taskEnv = model.taskEnv;
                this.taskId = model.taskId;
            } 

            /**
             * NeedNotExistObject.
             */
            public Builder needNotExistObject(Boolean needNotExistObject) {
                this.needNotExistObject = needNotExistObject;
                return this;
            }

            /**
             * TaskEnv.
             */
            public Builder taskEnv(String taskEnv) {
                this.taskEnv = taskEnv;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>n_123</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public TableLineageByTaskIdQuery build() {
                return new TableLineageByTaskIdQuery(this);
            } 

        } 

    }
}
