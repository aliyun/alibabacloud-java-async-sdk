// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DsgQuerySensResultRequest} extends {@link RequestModel}
 *
 * <p>DsgQuerySensResultRequest</p>
 */
public class DsgQuerySensResultRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Col")
    private String col;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DbType")
    private String dbType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeName")
    private String nodeName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderField")
    private String orderField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SchemaName")
    private String schemaName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SensStatus")
    private String sensStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SensitiveId")
    private String sensitiveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SensitiveName")
    private String sensitiveName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Table")
    private String table;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The name of the field.
         */
        public Builder col(String col) {
            this.putBodyParameter("Col", col);
            this.col = col;
            return this;
        }

        /**
         * The type of the database. Valid values:
         * <p>
         * 
         * *   **ODPS.ODPS**
         * *   **HOLO.POSTGRES**
         * *   **EMR**
         */
        public Builder dbType(String dbType) {
            this.putBodyParameter("DbType", dbType);
            this.dbType = dbType;
            return this;
        }

        /**
         * The sensitivity level of the field.
         */
        public Builder level(String level) {
            this.putBodyParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * The name of a data category.
         */
        public Builder nodeName(String nodeName) {
            this.putBodyParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * The sorting method.
         * <p>
         * 
         * *   DESC
         * *   ASC
         */
        public Builder order(String order) {
            this.putBodyParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * The field used for sorting.
         * <p>
         * 
         * *   gmt_create
         * *   gmt_modified
         */
        public Builder orderField(String orderField) {
            this.putBodyParameter("OrderField", orderField);
            this.orderField = orderField;
            return this;
        }

        /**
         * The page number. Pages start from page 1.
         */
        public Builder pageNo(Integer pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries per page. Default value: 10. Maximum value: 20.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The name of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace page to obtain the workspace name.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * The name of the schema.
         */
        public Builder schemaName(String schemaName) {
            this.putBodyParameter("SchemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        /**
         * The sensitivity status of the field.
         * <p>
         * 
         * *   1: indicates sensitive.
         * *   \-1: indicates non-sensitive.
         */
        public Builder sensStatus(String sensStatus) {
            this.putBodyParameter("SensStatus", sensStatus);
            this.sensStatus = sensStatus;
            return this;
        }

        /**
         * The sensitive field ID.
         */
        public Builder sensitiveId(String sensitiveId) {
            this.putBodyParameter("SensitiveId", sensitiveId);
            this.sensitiveId = sensitiveId;
            return this;
        }

        /**
         * The name of the sensitive field.
         */
        public Builder sensitiveName(String sensitiveName) {
            this.putBodyParameter("SensitiveName", sensitiveName);
            this.sensitiveName = sensitiveName;
            return this;
        }

        /**
         * The name of the table.
         */
        public Builder table(String table) {
            this.putBodyParameter("Table", table);
            this.table = table;
            return this;
        }

        /**
         * The tenant ID. To obtain the tenant ID, perform the following steps: Log on to the [DataWorks console](https://workbench.data.aliyun.com/console). Find your workspace and go to the DataStudio page. On the DataStudio page, click the logon username in the upper-right corner and click User Info in the Menu section.
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
