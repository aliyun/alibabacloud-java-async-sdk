// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DsgQuerySensResultRequest} extends {@link RequestModel}
 *
 * <p>DsgQuerySensResultRequest</p>
 */
public class DsgQuerySensResultRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Col")
    private String col;

    @Body
    @NameInMap("DbType")
    private String dbType;

    @Body
    @NameInMap("Level")
    private String level;

    @Body
    @NameInMap("NodeName")
    private String nodeName;

    @Body
    @NameInMap("Order")
    private String order;

    @Body
    @NameInMap("OrderField")
    private String orderField;

    @Body
    @NameInMap("PageNo")
    private Integer pageNo;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("ProjectName")
    private String projectName;

    @Body
    @NameInMap("SchemaName")
    private String schemaName;

    @Body
    @NameInMap("SensStatus")
    private String sensStatus;

    @Body
    @NameInMap("SensitiveId")
    private String sensitiveId;

    @Body
    @NameInMap("SensitiveName")
    private String sensitiveName;

    @Body
    @NameInMap("Table")
    private String table;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    private DsgQuerySensResultRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.col = builder.col;
        this.dbType = builder.dbType;
        this.level = builder.level;
        this.nodeName = builder.nodeName;
        this.order = builder.order;
        this.orderField = builder.orderField;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.projectName = builder.projectName;
        this.schemaName = builder.schemaName;
        this.sensStatus = builder.sensStatus;
        this.sensitiveId = builder.sensitiveId;
        this.sensitiveName = builder.sensitiveName;
        this.table = builder.table;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgQuerySensResultRequest create() {
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
     * @return col
     */
    public String getCol() {
        return this.col;
    }

    /**
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return orderField
     */
    public String getOrderField() {
        return this.orderField;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @return sensStatus
     */
    public String getSensStatus() {
        return this.sensStatus;
    }

    /**
     * @return sensitiveId
     */
    public String getSensitiveId() {
        return this.sensitiveId;
    }

    /**
     * @return sensitiveName
     */
    public String getSensitiveName() {
        return this.sensitiveName;
    }

    /**
     * @return table
     */
    public String getTable() {
        return this.table;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<DsgQuerySensResultRequest, Builder> {
        private String regionId; 
        private String col; 
        private String dbType; 
        private String level; 
        private String nodeName; 
        private String order; 
        private String orderField; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String projectName; 
        private String schemaName; 
        private String sensStatus; 
        private String sensitiveId; 
        private String sensitiveName; 
        private String table; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DsgQuerySensResultRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.col = request.col;
            this.dbType = request.dbType;
            this.level = request.level;
            this.nodeName = request.nodeName;
            this.order = request.order;
            this.orderField = request.orderField;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.projectName = request.projectName;
            this.schemaName = request.schemaName;
            this.sensStatus = request.sensStatus;
            this.sensitiveId = request.sensitiveId;
            this.sensitiveName = request.sensitiveName;
            this.table = request.table;
            this.tenantId = request.tenantId;
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
         * Col.
         */
        public Builder col(String col) {
            this.putBodyParameter("Col", col);
            this.col = col;
            return this;
        }

        /**
         * DbType.
         */
        public Builder dbType(String dbType) {
            this.putBodyParameter("DbType", dbType);
            this.dbType = dbType;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(String level) {
            this.putBodyParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * NodeName.
         */
        public Builder nodeName(String nodeName) {
            this.putBodyParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putBodyParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * OrderField.
         */
        public Builder orderField(String orderField) {
            this.putBodyParameter("OrderField", orderField);
            this.orderField = orderField;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * SchemaName.
         */
        public Builder schemaName(String schemaName) {
            this.putBodyParameter("SchemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        /**
         * SensStatus.
         */
        public Builder sensStatus(String sensStatus) {
            this.putBodyParameter("SensStatus", sensStatus);
            this.sensStatus = sensStatus;
            return this;
        }

        /**
         * SensitiveId.
         */
        public Builder sensitiveId(String sensitiveId) {
            this.putBodyParameter("SensitiveId", sensitiveId);
            this.sensitiveId = sensitiveId;
            return this;
        }

        /**
         * SensitiveName.
         */
        public Builder sensitiveName(String sensitiveName) {
            this.putBodyParameter("SensitiveName", sensitiveName);
            this.sensitiveName = sensitiveName;
            return this;
        }

        /**
         * Table.
         */
        public Builder table(String table) {
            this.putBodyParameter("Table", table);
            this.table = table;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public DsgQuerySensResultRequest build() {
            return new DsgQuerySensResultRequest(this);
        } 

    } 

}
