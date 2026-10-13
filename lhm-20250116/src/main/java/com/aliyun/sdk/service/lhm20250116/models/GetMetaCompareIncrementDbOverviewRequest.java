// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetMetaCompareIncrementDbOverviewRequest} extends {@link RequestModel}
 *
 * <p>GetMetaCompareIncrementDbOverviewRequest</p>
 */
public class GetMetaCompareIncrementDbOverviewRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("catalogName")
    private String catalogName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isSummary")
    private Boolean isSummary;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    private GetMetaCompareIncrementDbOverviewRequest(Builder builder) {
        super(builder);
        this.catalogName = builder.catalogName;
        this.dbName = builder.dbName;
        this.isSummary = builder.isSummary;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaCompareIncrementDbOverviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogName
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return isSummary
     */
    public Boolean getIsSummary() {
        return this.isSummary;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetMetaCompareIncrementDbOverviewRequest, Builder> {
        private String catalogName; 
        private String dbName; 
        private Boolean isSummary; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetMetaCompareIncrementDbOverviewRequest request) {
            super(request);
            this.catalogName = request.catalogName;
            this.dbName = request.dbName;
            this.isSummary = request.isSummary;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The name of the catalog. In a multi-catalog environment, it is used to locate the catalog where the destination database resides.</p>
         * 
         * <strong>example:</strong>
         * <p>fluss_e2e_dlf_catalog</p>
         */
        public Builder catalogName(String catalogName) {
            this.putBodyParameter("catalogName", catalogName);
            this.catalogName = catalogName;
            return this;
        }

        /**
         * <p>The name of the database for which you want to query incremental changes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ods_eaps</p>
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("dbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>Specifies whether to return only summary statistics.</p>
         */
        public Builder isSummary(Boolean isSummary) {
            this.putBodyParameter("isSummary", isSummary);
            this.isSummary = isSummary;
            return this;
        }

        /**
         * <p>The ID of the metadata comparison task, which is obtained from the return value of the create or save comparison task API operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder taskId(Long taskId) {
            this.putBodyParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetMetaCompareIncrementDbOverviewRequest build() {
            return new GetMetaCompareIncrementDbOverviewRequest(this);
        } 

    } 

}
