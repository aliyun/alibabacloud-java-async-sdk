// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetTableInfoRequest} extends {@link RequestModel}
 *
 * <p>GetTableInfoRequest</p>
 */
public class GetTableInfoRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("tableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("schemaName")
    private String schemaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private GetTableInfoRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.tableName = builder.tableName;
        this.schemaName = builder.schemaName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetTableInfoRequest, Builder> {
        private String projectName; 
        private String tableName; 
        private String schemaName; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetTableInfoRequest request) {
            super(request);
            this.projectName = request.projectName;
            this.tableName = request.tableName;
            this.schemaName = request.schemaName;
            this.type = request.type;
        } 

        /**
         * <p>The name of the project to which the table or view belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>projectA</p>
         */
        public Builder projectName(String projectName) {
            this.putPathParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The name of the table or view that you want to view.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sale_detail</p>
         */
        public Builder tableName(String tableName) {
            this.putPathParameter("tableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The name of the schema to which the table or view belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder schemaName(String schemaName) {
            this.putQueryParameter("schemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        /**
         * <p>The type of the table or view that you want to view. Valid values:</p>
         * <ul>
         * <li><strong>internal</strong>: internal table</li>
         * <li><strong>external</strong>: external table</li>
         * <li><strong>view</strong>: view</li>
         * <li><strong>materializedView</strong>: <a href="https://www.alibabacloud.com/help/maxcompute/user-guide/materialized-view-operations">materialize view</a></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>internal</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetTableInfoRequest build() {
            return new GetTableInfoRequest(this);
        } 

    } 

}
