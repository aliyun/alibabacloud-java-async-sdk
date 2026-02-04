// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link UpdateNormalizationSchemaRequest} extends {@link RequestModel}
 *
 * <p>UpdateNormalizationSchemaRequest</p>
 */
public class UpdateNormalizationSchemaRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationFields")
    private java.util.List<NormalizationFields> normalizationFields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationSchemaDescription")
    private String normalizationSchemaDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationSchemaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String normalizationSchemaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationSchemaName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String normalizationSchemaName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationSchemaType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String normalizationSchemaType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private UpdateNormalizationSchemaRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.normalizationFields = builder.normalizationFields;
        this.normalizationSchemaDescription = builder.normalizationSchemaDescription;
        this.normalizationSchemaId = builder.normalizationSchemaId;
        this.normalizationSchemaName = builder.normalizationSchemaName;
        this.normalizationSchemaType = builder.normalizationSchemaType;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNormalizationSchemaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return normalizationFields
     */
    public java.util.List<NormalizationFields> getNormalizationFields() {
        return this.normalizationFields;
    }

    /**
     * @return normalizationSchemaDescription
     */
    public String getNormalizationSchemaDescription() {
        return this.normalizationSchemaDescription;
    }

    /**
     * @return normalizationSchemaId
     */
    public String getNormalizationSchemaId() {
        return this.normalizationSchemaId;
    }

    /**
     * @return normalizationSchemaName
     */
    public String getNormalizationSchemaName() {
        return this.normalizationSchemaName;
    }

    /**
     * @return normalizationSchemaType
     */
    public String getNormalizationSchemaType() {
        return this.normalizationSchemaType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static final class Builder extends Request.Builder<UpdateNormalizationSchemaRequest, Builder> {
        private String lang; 
        private java.util.List<NormalizationFields> normalizationFields; 
        private String normalizationSchemaDescription; 
        private String normalizationSchemaId; 
        private String normalizationSchemaName; 
        private String normalizationSchemaType; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNormalizationSchemaRequest request) {
            super(request);
            this.lang = request.lang;
            this.normalizationFields = request.normalizationFields;
            this.normalizationSchemaDescription = request.normalizationSchemaDescription;
            this.normalizationSchemaId = request.normalizationSchemaId;
            this.normalizationSchemaName = request.normalizationSchemaName;
            this.normalizationSchemaType = request.normalizationSchemaType;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * NormalizationFields.
         */
        public Builder normalizationFields(java.util.List<NormalizationFields> normalizationFields) {
            this.putBodyParameter("NormalizationFields", normalizationFields);
            this.normalizationFields = normalizationFields;
            return this;
        }

        /**
         * NormalizationSchemaDescription.
         */
        public Builder normalizationSchemaDescription(String normalizationSchemaDescription) {
            this.putBodyParameter("NormalizationSchemaDescription", normalizationSchemaDescription);
            this.normalizationSchemaDescription = normalizationSchemaDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WAF_ALERT_ACTIVITY</p>
         */
        public Builder normalizationSchemaId(String normalizationSchemaId) {
            this.putBodyParameter("NormalizationSchemaId", normalizationSchemaId);
            this.normalizationSchemaId = normalizationSchemaId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ProcessQuery</p>
         */
        public Builder normalizationSchemaName(String normalizationSchemaName) {
            this.putBodyParameter("NormalizationSchemaName", normalizationSchemaName);
            this.normalizationSchemaName = normalizationSchemaName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>log</p>
         */
        public Builder normalizationSchemaType(String normalizationSchemaType) {
            this.putBodyParameter("NormalizationSchemaType", normalizationSchemaType);
            this.normalizationSchemaType = normalizationSchemaType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public UpdateNormalizationSchemaRequest build() {
            return new UpdateNormalizationSchemaRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateNormalizationSchemaRequest} extends {@link TeaModel}
     *
     * <p>UpdateNormalizationSchemaRequest</p>
     */
    public static class NormalizationFieldJsonKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NormalizationFieldDescription")
        private String normalizationFieldDescription;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldExample")
        private String normalizationFieldExample;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldFrom")
        private String normalizationFieldFrom;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String normalizationFieldName;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldRequired")
        private Boolean normalizationFieldRequired;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldTokenize")
        private Boolean normalizationFieldTokenize;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String normalizationFieldType;

        private NormalizationFieldJsonKeys(Builder builder) {
            this.normalizationFieldDescription = builder.normalizationFieldDescription;
            this.normalizationFieldExample = builder.normalizationFieldExample;
            this.normalizationFieldFrom = builder.normalizationFieldFrom;
            this.normalizationFieldName = builder.normalizationFieldName;
            this.normalizationFieldRequired = builder.normalizationFieldRequired;
            this.normalizationFieldTokenize = builder.normalizationFieldTokenize;
            this.normalizationFieldType = builder.normalizationFieldType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationFieldJsonKeys create() {
            return builder().build();
        }

        /**
         * @return normalizationFieldDescription
         */
        public String getNormalizationFieldDescription() {
            return this.normalizationFieldDescription;
        }

        /**
         * @return normalizationFieldExample
         */
        public String getNormalizationFieldExample() {
            return this.normalizationFieldExample;
        }

        /**
         * @return normalizationFieldFrom
         */
        public String getNormalizationFieldFrom() {
            return this.normalizationFieldFrom;
        }

        /**
         * @return normalizationFieldName
         */
        public String getNormalizationFieldName() {
            return this.normalizationFieldName;
        }

        /**
         * @return normalizationFieldRequired
         */
        public Boolean getNormalizationFieldRequired() {
            return this.normalizationFieldRequired;
        }

        /**
         * @return normalizationFieldTokenize
         */
        public Boolean getNormalizationFieldTokenize() {
            return this.normalizationFieldTokenize;
        }

        /**
         * @return normalizationFieldType
         */
        public String getNormalizationFieldType() {
            return this.normalizationFieldType;
        }

        public static final class Builder {
            private String normalizationFieldDescription; 
            private String normalizationFieldExample; 
            private String normalizationFieldFrom; 
            private String normalizationFieldName; 
            private Boolean normalizationFieldRequired; 
            private Boolean normalizationFieldTokenize; 
            private String normalizationFieldType; 

            private Builder() {
            } 

            private Builder(NormalizationFieldJsonKeys model) {
                this.normalizationFieldDescription = model.normalizationFieldDescription;
                this.normalizationFieldExample = model.normalizationFieldExample;
                this.normalizationFieldFrom = model.normalizationFieldFrom;
                this.normalizationFieldName = model.normalizationFieldName;
                this.normalizationFieldRequired = model.normalizationFieldRequired;
                this.normalizationFieldTokenize = model.normalizationFieldTokenize;
                this.normalizationFieldType = model.normalizationFieldType;
            } 

            /**
             * NormalizationFieldDescription.
             */
            public Builder normalizationFieldDescription(String normalizationFieldDescription) {
                this.normalizationFieldDescription = normalizationFieldDescription;
                return this;
            }

            /**
             * NormalizationFieldExample.
             */
            public Builder normalizationFieldExample(String normalizationFieldExample) {
                this.normalizationFieldExample = normalizationFieldExample;
                return this;
            }

            /**
             * NormalizationFieldFrom.
             */
            public Builder normalizationFieldFrom(String normalizationFieldFrom) {
                this.normalizationFieldFrom = normalizationFieldFrom;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>alert_name</p>
             */
            public Builder normalizationFieldName(String normalizationFieldName) {
                this.normalizationFieldName = normalizationFieldName;
                return this;
            }

            /**
             * NormalizationFieldRequired.
             */
            public Builder normalizationFieldRequired(Boolean normalizationFieldRequired) {
                this.normalizationFieldRequired = normalizationFieldRequired;
                return this;
            }

            /**
             * NormalizationFieldTokenize.
             */
            public Builder normalizationFieldTokenize(Boolean normalizationFieldTokenize) {
                this.normalizationFieldTokenize = normalizationFieldTokenize;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder normalizationFieldType(String normalizationFieldType) {
                this.normalizationFieldType = normalizationFieldType;
                return this;
            }

            public NormalizationFieldJsonKeys build() {
                return new NormalizationFieldJsonKeys(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateNormalizationSchemaRequest} extends {@link TeaModel}
     *
     * <p>UpdateNormalizationSchemaRequest</p>
     */
    public static class NormalizationFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NormalizationFieldDescription")
        private String normalizationFieldDescription;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldExample")
        private String normalizationFieldExample;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldFrom")
        private String normalizationFieldFrom;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldJsonIndexAll")
        private Boolean normalizationFieldJsonIndexAll;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldJsonKeys")
        private java.util.List<NormalizationFieldJsonKeys> normalizationFieldJsonKeys;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String normalizationFieldName;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldRequired")
        private Boolean normalizationFieldRequired;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldTokenize")
        private Boolean normalizationFieldTokenize;

        @com.aliyun.core.annotation.NameInMap("NormalizationFieldType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String normalizationFieldType;

        private NormalizationFields(Builder builder) {
            this.normalizationFieldDescription = builder.normalizationFieldDescription;
            this.normalizationFieldExample = builder.normalizationFieldExample;
            this.normalizationFieldFrom = builder.normalizationFieldFrom;
            this.normalizationFieldJsonIndexAll = builder.normalizationFieldJsonIndexAll;
            this.normalizationFieldJsonKeys = builder.normalizationFieldJsonKeys;
            this.normalizationFieldName = builder.normalizationFieldName;
            this.normalizationFieldRequired = builder.normalizationFieldRequired;
            this.normalizationFieldTokenize = builder.normalizationFieldTokenize;
            this.normalizationFieldType = builder.normalizationFieldType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationFields create() {
            return builder().build();
        }

        /**
         * @return normalizationFieldDescription
         */
        public String getNormalizationFieldDescription() {
            return this.normalizationFieldDescription;
        }

        /**
         * @return normalizationFieldExample
         */
        public String getNormalizationFieldExample() {
            return this.normalizationFieldExample;
        }

        /**
         * @return normalizationFieldFrom
         */
        public String getNormalizationFieldFrom() {
            return this.normalizationFieldFrom;
        }

        /**
         * @return normalizationFieldJsonIndexAll
         */
        public Boolean getNormalizationFieldJsonIndexAll() {
            return this.normalizationFieldJsonIndexAll;
        }

        /**
         * @return normalizationFieldJsonKeys
         */
        public java.util.List<NormalizationFieldJsonKeys> getNormalizationFieldJsonKeys() {
            return this.normalizationFieldJsonKeys;
        }

        /**
         * @return normalizationFieldName
         */
        public String getNormalizationFieldName() {
            return this.normalizationFieldName;
        }

        /**
         * @return normalizationFieldRequired
         */
        public Boolean getNormalizationFieldRequired() {
            return this.normalizationFieldRequired;
        }

        /**
         * @return normalizationFieldTokenize
         */
        public Boolean getNormalizationFieldTokenize() {
            return this.normalizationFieldTokenize;
        }

        /**
         * @return normalizationFieldType
         */
        public String getNormalizationFieldType() {
            return this.normalizationFieldType;
        }

        public static final class Builder {
            private String normalizationFieldDescription; 
            private String normalizationFieldExample; 
            private String normalizationFieldFrom; 
            private Boolean normalizationFieldJsonIndexAll; 
            private java.util.List<NormalizationFieldJsonKeys> normalizationFieldJsonKeys; 
            private String normalizationFieldName; 
            private Boolean normalizationFieldRequired; 
            private Boolean normalizationFieldTokenize; 
            private String normalizationFieldType; 

            private Builder() {
            } 

            private Builder(NormalizationFields model) {
                this.normalizationFieldDescription = model.normalizationFieldDescription;
                this.normalizationFieldExample = model.normalizationFieldExample;
                this.normalizationFieldFrom = model.normalizationFieldFrom;
                this.normalizationFieldJsonIndexAll = model.normalizationFieldJsonIndexAll;
                this.normalizationFieldJsonKeys = model.normalizationFieldJsonKeys;
                this.normalizationFieldName = model.normalizationFieldName;
                this.normalizationFieldRequired = model.normalizationFieldRequired;
                this.normalizationFieldTokenize = model.normalizationFieldTokenize;
                this.normalizationFieldType = model.normalizationFieldType;
            } 

            /**
             * NormalizationFieldDescription.
             */
            public Builder normalizationFieldDescription(String normalizationFieldDescription) {
                this.normalizationFieldDescription = normalizationFieldDescription;
                return this;
            }

            /**
             * NormalizationFieldExample.
             */
            public Builder normalizationFieldExample(String normalizationFieldExample) {
                this.normalizationFieldExample = normalizationFieldExample;
                return this;
            }

            /**
             * NormalizationFieldFrom.
             */
            public Builder normalizationFieldFrom(String normalizationFieldFrom) {
                this.normalizationFieldFrom = normalizationFieldFrom;
                return this;
            }

            /**
             * NormalizationFieldJsonIndexAll.
             */
            public Builder normalizationFieldJsonIndexAll(Boolean normalizationFieldJsonIndexAll) {
                this.normalizationFieldJsonIndexAll = normalizationFieldJsonIndexAll;
                return this;
            }

            /**
             * NormalizationFieldJsonKeys.
             */
            public Builder normalizationFieldJsonKeys(java.util.List<NormalizationFieldJsonKeys> normalizationFieldJsonKeys) {
                this.normalizationFieldJsonKeys = normalizationFieldJsonKeys;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_user</p>
             */
            public Builder normalizationFieldName(String normalizationFieldName) {
                this.normalizationFieldName = normalizationFieldName;
                return this;
            }

            /**
             * NormalizationFieldRequired.
             */
            public Builder normalizationFieldRequired(Boolean normalizationFieldRequired) {
                this.normalizationFieldRequired = normalizationFieldRequired;
                return this;
            }

            /**
             * NormalizationFieldTokenize.
             */
            public Builder normalizationFieldTokenize(Boolean normalizationFieldTokenize) {
                this.normalizationFieldTokenize = normalizationFieldTokenize;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>varchar</p>
             */
            public Builder normalizationFieldType(String normalizationFieldType) {
                this.normalizationFieldType = normalizationFieldType;
                return this;
            }

            public NormalizationFields build() {
                return new NormalizationFields(this);
            } 

        } 

    }
}
