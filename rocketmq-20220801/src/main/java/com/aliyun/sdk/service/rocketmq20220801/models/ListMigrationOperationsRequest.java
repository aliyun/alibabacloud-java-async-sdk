// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link ListMigrationOperationsRequest} extends {@link RequestModel}
 *
 * <p>ListMigrationOperationsRequest</p>
 */
public class ListMigrationOperationsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("migrationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long migrationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("stageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("businessStatus")
    private java.util.List<String> businessStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filter")
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("operationStatus")
    private java.util.List<String> operationStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("operationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100000000, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000, minimum = 10)
    private Integer pageSize;

    private ListMigrationOperationsRequest(Builder builder) {
        super(builder);
        this.migrationId = builder.migrationId;
        this.stageType = builder.stageType;
        this.businessStatus = builder.businessStatus;
        this.filter = builder.filter;
        this.instanceId = builder.instanceId;
        this.operationStatus = builder.operationStatus;
        this.operationType = builder.operationType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMigrationOperationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return migrationId
     */
    public Long getMigrationId() {
        return this.migrationId;
    }

    /**
     * @return stageType
     */
    public String getStageType() {
        return this.stageType;
    }

    /**
     * @return businessStatus
     */
    public java.util.List<String> getBusinessStatus() {
        return this.businessStatus;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return operationStatus
     */
    public java.util.List<String> getOperationStatus() {
        return this.operationStatus;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListMigrationOperationsRequest, Builder> {
        private Long migrationId; 
        private String stageType; 
        private java.util.List<String> businessStatus; 
        private String filter; 
        private String instanceId; 
        private java.util.List<String> operationStatus; 
        private String operationType; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListMigrationOperationsRequest request) {
            super(request);
            this.migrationId = request.migrationId;
            this.stageType = request.stageType;
            this.businessStatus = request.businessStatus;
            this.filter = request.filter;
            this.instanceId = request.instanceId;
            this.operationStatus = request.operationStatus;
            this.operationType = request.operationType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>135</p>
         */
        public Builder migrationId(Long migrationId) {
            this.putPathParameter("migrationId", migrationId);
            this.migrationId = migrationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MIGRATE_MESSAGE</p>
         */
        public Builder stageType(String stageType) {
            this.putPathParameter("stageType", stageType);
            this.stageType = stageType;
            return this;
        }

        /**
         * businessStatus.
         */
        public Builder businessStatus(java.util.List<String> businessStatus) {
            String businessStatusShrink = shrink(businessStatus, "businessStatus", "simple");
            this.putQueryParameter("businessStatus", businessStatusShrink);
            this.businessStatus = businessStatus;
            return this;
        }

        /**
         * filter.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * operationStatus.
         */
        public Builder operationStatus(java.util.List<String> operationStatus) {
            String operationStatusShrink = shrink(operationStatus, "operationStatus", "simple");
            this.putQueryParameter("operationStatus", operationStatusShrink);
            this.operationStatus = operationStatus;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IMPORT_CONSUMER_GROUP</p>
         */
        public Builder operationType(String operationType) {
            this.putQueryParameter("operationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListMigrationOperationsRequest build() {
            return new ListMigrationOperationsRequest(this);
        } 

    } 

}
