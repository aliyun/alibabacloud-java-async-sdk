// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
         * <p>The name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>col</p>
         */
        public Builder col(String col) {
            this.putBodyParameter("Col", col);
            this.col = col;
            return this;
        }

        /**
         * <p>The type of the database. Valid values:</p>
         * <ul>
         * <li><strong>ODPS.ODPS</strong></li>
         * <li><strong>HOLO.POSTGRES</strong></li>
         * <li><strong>EMR</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ODPS.ODPS</p>
         */
        public Builder dbType(String dbType) {
            this.putBodyParameter("DbType", dbType);
            this.dbType = dbType;
            return this;
        }

        /**
         * <p>The sensitivity level of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder level(String level) {
            this.putBodyParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>The name of a data category.</p>
         * 
         * <strong>example:</strong>
         * <p>Personal information</p>
         */
        public Builder nodeName(String nodeName) {
            this.putBodyParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * <p>The sorting method. Valid values:</p>
         * <ul>
         * <li>DESC</li>
         * <li>ASC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder order(String order) {
            this.putBodyParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The field used for sorting.</p>
         * <ul>
         * <li>gmt_create</li>
         * <li>gmt_modified</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gmt_create</p>
         */
        public Builder orderField(String orderField) {
            this.putBodyParameter("OrderField", orderField);
            this.orderField = orderField;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The name of the schema.</p>
         * 
         * <strong>example:</strong>
         * <p>schema</p>
         */
        public Builder schemaName(String schemaName) {
            this.putBodyParameter("SchemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        /**
         * <p>The sensitivity status of the field.</p>
         * <ul>
         * <li>1: indicates sensitive.</li>
         * <li>-1: indicates non-sensitive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sensStatus(String sensStatus) {
            this.putBodyParameter("SensStatus", sensStatus);
            this.sensStatus = sensStatus;
            return this;
        }

        /**
         * <p>The sensitive field ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10241024</p>
         */
        public Builder sensitiveId(String sensitiveId) {
            this.putBodyParameter("SensitiveId", sensitiveId);
            this.sensitiveId = sensitiveId;
            return this;
        }

        /**
         * <p>The name of the sensitive field.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder sensitiveName(String sensitiveName) {
            this.putBodyParameter("SensitiveName", sensitiveName);
            this.sensitiveName = sensitiveName;
            return this;
        }

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>table</p>
         */
        public Builder table(String table) {
            this.putBodyParameter("Table", table);
            this.table = table;
            return this;
        }

        /**
         * <p>The tenant ID. To obtain the tenant ID, perform the following steps: Log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. Find your workspace and go to the DataStudio page. On the DataStudio page, click the logon username in the upper-right corner and click User Info in the Menu section.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10241024</p>
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
