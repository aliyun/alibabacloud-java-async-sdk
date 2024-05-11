// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTableMetaRequest} extends {@link RequestModel}
 *
 * <p>CreateTableMetaRequest</p>
 */
public class CreateTableMetaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasourceInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasourceInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Fields")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Fields> fields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateTableMetaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasourceInfo = builder.datasourceInfo;
        this.datasourceType = builder.datasourceType;
        this.description = builder.description;
        this.fields = builder.fields;
        this.name = builder.name;
        this.tableName = builder.tableName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTableMetaRequest create() {
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
     * @return datasourceInfo
     */
    public String getDatasourceInfo() {
        return this.datasourceInfo;
    }

    /**
     * @return datasourceType
     */
    public String getDatasourceType() {
        return this.datasourceType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fields
     */
    public java.util.List < Fields> getFields() {
        return this.fields;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateTableMetaRequest, Builder> {
        private String regionId; 
        private String datasourceInfo; 
        private String datasourceType; 
        private String description; 
        private java.util.List < Fields> fields; 
        private String name; 
        private String tableName; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTableMetaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.datasourceInfo = request.datasourceInfo;
            this.datasourceType = request.datasourceType;
            this.description = request.description;
            this.fields = request.fields;
            this.name = request.name;
            this.tableName = request.tableName;
            this.workspaceId = request.workspaceId;
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
         * DatasourceInfo.
         */
        public Builder datasourceInfo(String datasourceInfo) {
            this.putBodyParameter("DatasourceInfo", datasourceInfo);
            this.datasourceInfo = datasourceInfo;
            return this;
        }

        /**
         * DatasourceType.
         */
        public Builder datasourceType(String datasourceType) {
            this.putBodyParameter("DatasourceType", datasourceType);
            this.datasourceType = datasourceType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Fields.
         */
        public Builder fields(java.util.List < Fields> fields) {
            this.putBodyParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateTableMetaRequest build() {
            return new CreateTableMetaRequest(this);
        } 

    } 

    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Meaning")
        @com.aliyun.core.annotation.Validation(required = true)
        private String meaning;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Fields(Builder builder) {
            this.meaning = builder.meaning;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return meaning
         */
        public String getMeaning() {
            return this.meaning;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String meaning; 
            private String name; 
            private String type; 

            /**
             * Meaning.
             */
            public Builder meaning(String meaning) {
                this.meaning = meaning;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
}
