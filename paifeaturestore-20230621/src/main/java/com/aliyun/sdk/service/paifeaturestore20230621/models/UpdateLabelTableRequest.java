// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLabelTableRequest} extends {@link RequestModel}
 *
 * <p>UpdateLabelTableRequest</p>
 */
public class UpdateLabelTableRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("LabelTableId")
    @Validation(required = true)
    private String labelTableId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DatasourceId")
    private String datasourceId;

    @Body
    @NameInMap("Fields")
    @Validation(required = true)
    private java.util.List < Fields> fields;

    @Body
    @NameInMap("Name")
    private String name;

    private UpdateLabelTableRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.labelTableId = builder.labelTableId;
        this.regionId = builder.regionId;
        this.datasourceId = builder.datasourceId;
        this.fields = builder.fields;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLabelTableRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return labelTableId
     */
    public String getLabelTableId() {
        return this.labelTableId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return datasourceId
     */
    public String getDatasourceId() {
        return this.datasourceId;
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

    public static final class Builder extends Request.Builder<UpdateLabelTableRequest, Builder> {
        private String instanceId; 
        private String labelTableId; 
        private String regionId; 
        private String datasourceId; 
        private java.util.List < Fields> fields; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLabelTableRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.labelTableId = request.labelTableId;
            this.regionId = request.regionId;
            this.datasourceId = request.datasourceId;
            this.fields = request.fields;
            this.name = request.name;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LabelTableId.
         */
        public Builder labelTableId(String labelTableId) {
            this.putPathParameter("LabelTableId", labelTableId);
            this.labelTableId = labelTableId;
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
         * DatasourceId.
         */
        public Builder datasourceId(String datasourceId) {
            this.putBodyParameter("DatasourceId", datasourceId);
            this.datasourceId = datasourceId;
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
        public UpdateLabelTableRequest build() {
            return new UpdateLabelTableRequest(this);
        } 

    } 

    public static class Fields extends TeaModel {
        @NameInMap("Attributes")
        @Validation(required = true)
        private java.util.List < String > attributes;

        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private Fields(Builder builder) {
            this.attributes = builder.attributes;
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
         * @return attributes
         */
        public java.util.List < String > getAttributes() {
            return this.attributes;
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
            private java.util.List < String > attributes; 
            private String name; 
            private String type; 

            /**
             * Attributes.
             */
            public Builder attributes(java.util.List < String > attributes) {
                this.attributes = attributes;
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
