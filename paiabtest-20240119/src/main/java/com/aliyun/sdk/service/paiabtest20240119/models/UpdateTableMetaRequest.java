// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTableMetaRequest} extends {@link RequestModel}
 *
 * <p>UpdateTableMetaRequest</p>
 */
public class UpdateTableMetaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TableMetaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableMetaId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

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

    private UpdateTableMetaRequest(Builder builder) {
        super(builder);
        this.tableMetaId = builder.tableMetaId;
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.fields = builder.fields;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTableMetaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tableMetaId
     */
    public String getTableMetaId() {
        return this.tableMetaId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<UpdateTableMetaRequest, Builder> {
        private String tableMetaId; 
        private String regionId; 
        private String description; 
        private java.util.List < Fields> fields; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTableMetaRequest request) {
            super(request);
            this.tableMetaId = request.tableMetaId;
            this.regionId = request.regionId;
            this.description = request.description;
            this.fields = request.fields;
            this.name = request.name;
        } 

        /**
         * TableMetaId.
         */
        public Builder tableMetaId(String tableMetaId) {
            this.putPathParameter("TableMetaId", tableMetaId);
            this.tableMetaId = tableMetaId;
            return this;
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

        @Override
        public UpdateTableMetaRequest build() {
            return new UpdateTableMetaRequest(this);
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
        @com.aliyun.core.annotation.Validation(required = true)
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
