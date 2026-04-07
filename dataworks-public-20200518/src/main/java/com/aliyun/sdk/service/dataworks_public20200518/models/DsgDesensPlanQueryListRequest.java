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
 * {@link DsgDesensPlanQueryListRequest} extends {@link RequestModel}
 *
 * <p>DsgDesensPlanQueryListRequest</p>
 */
public class DsgDesensPlanQueryListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("columns")
    private java.util.List<Columns> columns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("emptyNotDesesn")
    private String emptyNotDesesn;

    private DsgDesensPlanQueryListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.owner = builder.owner;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.ruleName = builder.ruleName;
        this.sceneId = builder.sceneId;
        this.status = builder.status;
        this.columns = builder.columns;
        this.dataType = builder.dataType;
        this.emptyNotDesesn = builder.emptyNotDesesn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgDesensPlanQueryListRequest create() {
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
     * @return owner
     */
    public String getOwner() {
        return this.owner;
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

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return sceneId
     */
    public Long getSceneId() {
        return this.sceneId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return columns
     */
    public java.util.List<Columns> getColumns() {
        return this.columns;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return emptyNotDesesn
     */
    public String getEmptyNotDesesn() {
        return this.emptyNotDesesn;
    }

    public static final class Builder extends Request.Builder<DsgDesensPlanQueryListRequest, Builder> {
        private String regionId; 
        private String owner; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String ruleName; 
        private Long sceneId; 
        private Integer status; 
        private java.util.List<Columns> columns; 
        private String dataType; 
        private String emptyNotDesesn; 

        private Builder() {
            super();
        } 

        private Builder(DsgDesensPlanQueryListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.owner = request.owner;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.ruleName = request.ruleName;
            this.sceneId = request.sceneId;
            this.status = request.status;
            this.columns = request.columns;
            this.dataType = request.dataType;
            this.emptyNotDesesn = request.emptyNotDesesn;
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
         * <p>The owner of the data masking rule.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        public Builder owner(String owner) {
            this.putQueryParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the sensitive field.</p>
         * 
         * <strong>example:</strong>
         * <p>phone</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The ID of the level-2 data masking scenario. You can call the <a href="https://help.aliyun.com/document_detail/2786322.html">DsgSceneQuerySceneListByName</a> operation to query the list of IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder sceneId(Long sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>The status of the data masking rule. Valid values:</p>
         * <ul>
         * <li>0: expired</li>
         * <li>1: effective</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * columns.
         */
        public Builder columns(java.util.List<Columns> columns) {
            String columnsShrink = shrink(columns, "columns", "json");
            this.putQueryParameter("columns", columnsShrink);
            this.columns = columns;
            return this;
        }

        /**
         * dataType.
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("dataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * emptyNotDesesn.
         */
        public Builder emptyNotDesesn(String emptyNotDesesn) {
            this.putQueryParameter("emptyNotDesesn", emptyNotDesesn);
            this.emptyNotDesesn = emptyNotDesesn;
            return this;
        }

        @Override
        public DsgDesensPlanQueryListRequest build() {
            return new DsgDesensPlanQueryListRequest(this);
        } 

    } 

    /**
     * 
     * {@link DsgDesensPlanQueryListRequest} extends {@link TeaModel}
     *
     * <p>DsgDesensPlanQueryListRequest</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("column")
        private String column;

        @com.aliyun.core.annotation.NameInMap("dbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("table")
        private String table;

        private Columns(Builder builder) {
            this.column = builder.column;
            this.dbType = builder.dbType;
            this.project = builder.project;
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return column
         */
        public String getColumn() {
            return this.column;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        public static final class Builder {
            private String column; 
            private String dbType; 
            private String project; 
            private String table; 

            private Builder() {
            } 

            private Builder(Columns model) {
                this.column = model.column;
                this.dbType = model.dbType;
                this.project = model.project;
                this.table = model.table;
            } 

            /**
             * column.
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * dbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * table.
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
}
