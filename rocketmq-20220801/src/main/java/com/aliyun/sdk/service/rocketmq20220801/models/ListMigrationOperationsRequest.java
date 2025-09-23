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
    @com.aliyun.core.annotation.NameInMap("filter")
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

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
        this.filter = builder.filter;
        this.instanceId = builder.instanceId;
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
        private String filter; 
        private String instanceId; 
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
            this.filter = request.filter;
            this.instanceId = request.instanceId;
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
