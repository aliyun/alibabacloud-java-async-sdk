// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link UpdateFeatureViewRequest} extends {@link RequestModel}
 *
 * <p>UpdateFeatureViewRequest</p>
 */
public class UpdateFeatureViewRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FeatureViewId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureViewId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Fields")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Fields> fields;

    private UpdateFeatureViewRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.featureViewId = builder.featureViewId;
        this.fields = builder.fields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFeatureViewRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return featureViewId
     */
    public String getFeatureViewId() {
        return this.featureViewId;
    }

    /**
     * @return fields
     */
    public java.util.List<Fields> getFields() {
        return this.fields;
    }

    public static final class Builder extends Request.Builder<UpdateFeatureViewRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String featureViewId; 
        private java.util.List<Fields> fields; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFeatureViewRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.featureViewId = request.featureViewId;
            this.fields = request.fields;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fs-cn-********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder featureViewId(String featureViewId) {
            this.putPathParameter("FeatureViewId", featureViewId);
            this.featureViewId = featureViewId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.putBodyParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        @Override
        public UpdateFeatureViewRequest build() {
            return new UpdateFeatureViewRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateFeatureViewRequest} extends {@link TeaModel}
     *
     * <p>UpdateFeatureViewRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Modality")
        private String modality;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Input(Builder builder) {
            this.modality = builder.modality;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return modality
         */
        public String getModality() {
            return this.modality;
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
            private String modality; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.modality = model.modality;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * Modality.
             */
            public Builder modality(String modality) {
                this.modality = modality;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>f1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateFeatureViewRequest} extends {@link TeaModel}
     *
     * <p>UpdateFeatureViewRequest</p>
     */
    public static class Transform extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Input")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Input> input;

        @com.aliyun.core.annotation.NameInMap("LLMConfigId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer LLMConfigId;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Transform(Builder builder) {
            this.input = builder.input;
            this.LLMConfigId = builder.LLMConfigId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Transform create() {
            return builder().build();
        }

        /**
         * @return input
         */
        public java.util.List<Input> getInput() {
            return this.input;
        }

        /**
         * @return LLMConfigId
         */
        public Integer getLLMConfigId() {
            return this.LLMConfigId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<Input> input; 
            private Integer LLMConfigId; 
            private String type; 

            private Builder() {
            } 

            private Builder(Transform model) {
                this.input = model.input;
                this.LLMConfigId = model.LLMConfigId;
                this.type = model.type;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder input(java.util.List<Input> input) {
                this.input = input;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder LLMConfigId(Integer LLMConfigId) {
                this.LLMConfigId = LLMConfigId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>LLMEmbedding</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Transform build() {
                return new Transform(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateFeatureViewRequest} extends {@link TeaModel}
     *
     * <p>UpdateFeatureViewRequest</p>
     */
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> attributes;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Transform")
        private java.util.List<Transform> transform;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Fields(Builder builder) {
            this.attributes = builder.attributes;
            this.name = builder.name;
            this.transform = builder.transform;
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
        public java.util.List<String> getAttributes() {
            return this.attributes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return transform
         */
        public java.util.List<Transform> getTransform() {
            return this.transform;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> attributes; 
            private String name; 
            private java.util.List<Transform> transform; 
            private String type; 

            private Builder() {
            } 

            private Builder(Fields model) {
                this.attributes = model.attributes;
                this.name = model.name;
                this.transform = model.transform;
                this.type = model.type;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder attributes(java.util.List<String> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>user_id</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Transform.
             */
            public Builder transform(java.util.List<Transform> transform) {
                this.transform = transform;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>INT32</p>
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
