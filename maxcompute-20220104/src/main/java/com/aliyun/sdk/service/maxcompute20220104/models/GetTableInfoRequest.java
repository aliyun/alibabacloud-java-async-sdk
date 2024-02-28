// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableInfoRequest} extends {@link RequestModel}
 *
 * <p>GetTableInfoRequest</p>
 */
public class GetTableInfoRequest extends Request {
    @Path
    @NameInMap("projectName")
    @Validation(required = true)
    private String projectName;

    @Path
    @NameInMap("tableName")
    @Validation(required = true)
    private String tableName;

    @Query
    @NameInMap("schemaName")
    private String schemaName;

    @Query
    @NameInMap("type")
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
         * projectName.
         */
        public Builder projectName(String projectName) {
            this.putPathParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * tableName.
         */
        public Builder tableName(String tableName) {
            this.putPathParameter("tableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * schemaName.
         */
        public Builder schemaName(String schemaName) {
            this.putQueryParameter("schemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        /**
         * type.
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
