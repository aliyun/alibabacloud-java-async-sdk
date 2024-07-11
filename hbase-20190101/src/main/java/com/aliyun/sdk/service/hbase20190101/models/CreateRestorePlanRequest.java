// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRestorePlanRequest} extends {@link RequestModel}
 *
 * <p>CreateRestorePlanRequest</p>
 */
public class CreateRestorePlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreAllTable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean restoreAllTable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreByCopy")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean restoreByCopy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreToDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String restoreToDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tables")
    private String tables;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetClusterId;

    private CreateRestorePlanRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.restoreAllTable = builder.restoreAllTable;
        this.restoreByCopy = builder.restoreByCopy;
        this.restoreToDate = builder.restoreToDate;
        this.tables = builder.tables;
        this.targetClusterId = builder.targetClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRestorePlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return restoreAllTable
     */
    public Boolean getRestoreAllTable() {
        return this.restoreAllTable;
    }

    /**
     * @return restoreByCopy
     */
    public Boolean getRestoreByCopy() {
        return this.restoreByCopy;
    }

    /**
     * @return restoreToDate
     */
    public String getRestoreToDate() {
        return this.restoreToDate;
    }

    /**
     * @return tables
     */
    public String getTables() {
        return this.tables;
    }

    /**
     * @return targetClusterId
     */
    public String getTargetClusterId() {
        return this.targetClusterId;
    }

    public static final class Builder extends Request.Builder<CreateRestorePlanRequest, Builder> {
        private String clusterId; 
        private Boolean restoreAllTable; 
        private Boolean restoreByCopy; 
        private String restoreToDate; 
        private String tables; 
        private String targetClusterId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRestorePlanRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.restoreAllTable = request.restoreAllTable;
            this.restoreByCopy = request.restoreByCopy;
            this.restoreToDate = request.restoreToDate;
            this.tables = request.tables;
            this.targetClusterId = request.targetClusterId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * RestoreAllTable.
         */
        public Builder restoreAllTable(Boolean restoreAllTable) {
            this.putQueryParameter("RestoreAllTable", restoreAllTable);
            this.restoreAllTable = restoreAllTable;
            return this;
        }

        /**
         * RestoreByCopy.
         */
        public Builder restoreByCopy(Boolean restoreByCopy) {
            this.putQueryParameter("RestoreByCopy", restoreByCopy);
            this.restoreByCopy = restoreByCopy;
            return this;
        }

        /**
         * RestoreToDate.
         */
        public Builder restoreToDate(String restoreToDate) {
            this.putQueryParameter("RestoreToDate", restoreToDate);
            this.restoreToDate = restoreToDate;
            return this;
        }

        /**
         * Tables.
         */
        public Builder tables(String tables) {
            this.putQueryParameter("Tables", tables);
            this.tables = tables;
            return this;
        }

        /**
         * TargetClusterId.
         */
        public Builder targetClusterId(String targetClusterId) {
            this.putQueryParameter("TargetClusterId", targetClusterId);
            this.targetClusterId = targetClusterId;
            return this;
        }

        @Override
        public CreateRestorePlanRequest build() {
            return new CreateRestorePlanRequest(this);
        } 

    } 

}
