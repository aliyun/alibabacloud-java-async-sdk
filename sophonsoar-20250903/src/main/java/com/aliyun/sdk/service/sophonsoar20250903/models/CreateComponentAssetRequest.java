// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20250903.models;

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
 * {@link CreateComponentAssetRequest} extends {@link RequestModel}
 *
 * <p>CreateComponentAssetRequest</p>
 */
public class CreateComponentAssetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ComponentAssetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String componentAssetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ComponentAssetValues")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ComponentAssetValues> componentAssetValues;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ComponentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String componentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private CreateComponentAssetRequest(Builder builder) {
        super(builder);
        this.componentAssetName = builder.componentAssetName;
        this.componentAssetValues = builder.componentAssetValues;
        this.componentName = builder.componentName;
        this.lang = builder.lang;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateComponentAssetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return componentAssetName
     */
    public String getComponentAssetName() {
        return this.componentAssetName;
    }

    /**
     * @return componentAssetValues
     */
    public java.util.List<ComponentAssetValues> getComponentAssetValues() {
        return this.componentAssetValues;
    }

    /**
     * @return componentName
     */
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static final class Builder extends Request.Builder<CreateComponentAssetRequest, Builder> {
        private String componentAssetName; 
        private java.util.List<ComponentAssetValues> componentAssetValues; 
        private String componentName; 
        private String lang; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(CreateComponentAssetRequest request) {
            super(request);
            this.componentAssetName = request.componentAssetName;
            this.componentAssetValues = request.componentAssetValues;
            this.componentName = request.componentName;
            this.lang = request.lang;
            this.roleFor = request.roleFor;
        } 

        /**
         * <p>The name of the asset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>shanghai-log-config</p>
         */
        public Builder componentAssetName(String componentAssetName) {
            this.putBodyParameter("ComponentAssetName", componentAssetName);
            this.componentAssetName = componentAssetName;
            return this;
        }

        /**
         * <p>Configuration information of the asset.</p>
         * <p>This parameter is required.</p>
         */
        public Builder componentAssetValues(java.util.List<ComponentAssetValues> componentAssetValues) {
            this.putBodyParameter("ComponentAssetValues", componentAssetValues);
            this.componentAssetValues = componentAssetValues;
            return this;
        }

        /**
         * <p>The name of the component.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SLS</p>
         */
        public Builder componentName(String componentName) {
            this.putBodyParameter("ComponentName", componentName);
            this.componentName = componentName;
            return this;
        }

        /**
         * <p>The language type for receiving messages. Values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Resource directory member account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13760*****718726</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public CreateComponentAssetRequest build() {
            return new CreateComponentAssetRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateComponentAssetRequest} extends {@link TeaModel}
     *
     * <p>CreateComponentAssetRequest</p>
     */
    public static class ComponentAssetValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("FieldValue")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fieldValue;

        private ComponentAssetValues(Builder builder) {
            this.fieldName = builder.fieldName;
            this.fieldValue = builder.fieldValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentAssetValues create() {
            return builder().build();
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return fieldValue
         */
        public String getFieldValue() {
            return this.fieldValue;
        }

        public static final class Builder {
            private String fieldName; 
            private String fieldValue; 

            private Builder() {
            } 

            private Builder(ComponentAssetValues model) {
                this.fieldName = model.fieldName;
                this.fieldValue = model.fieldValue;
            } 

            /**
             * <p>Field name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>endpoint</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * <p>Field value.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://logs.aliyuncs.com">http://logs.aliyuncs.com</a></p>
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
                return this;
            }

            public ComponentAssetValues build() {
                return new ComponentAssetValues(this);
            } 

        } 

    }
}
