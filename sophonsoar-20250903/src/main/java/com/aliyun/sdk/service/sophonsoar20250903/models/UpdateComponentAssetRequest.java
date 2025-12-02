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
 * {@link UpdateComponentAssetRequest} extends {@link RequestModel}
 *
 * <p>UpdateComponentAssetRequest</p>
 */
public class UpdateComponentAssetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ComponentAssetName")
    private String componentAssetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ComponentAssetUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String componentAssetUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ComponentAssetValues")
    private java.util.List<ComponentAssetValues> componentAssetValues;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private UpdateComponentAssetRequest(Builder builder) {
        super(builder);
        this.componentAssetName = builder.componentAssetName;
        this.componentAssetUuid = builder.componentAssetUuid;
        this.componentAssetValues = builder.componentAssetValues;
        this.lang = builder.lang;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateComponentAssetRequest create() {
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
     * @return componentAssetUuid
     */
    public String getComponentAssetUuid() {
        return this.componentAssetUuid;
    }

    /**
     * @return componentAssetValues
     */
    public java.util.List<ComponentAssetValues> getComponentAssetValues() {
        return this.componentAssetValues;
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

    public static final class Builder extends Request.Builder<UpdateComponentAssetRequest, Builder> {
        private String componentAssetName; 
        private String componentAssetUuid; 
        private java.util.List<ComponentAssetValues> componentAssetValues; 
        private String lang; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(UpdateComponentAssetRequest request) {
            super(request);
            this.componentAssetName = request.componentAssetName;
            this.componentAssetUuid = request.componentAssetUuid;
            this.componentAssetValues = request.componentAssetValues;
            this.lang = request.lang;
            this.roleFor = request.roleFor;
        } 

        /**
         * <p>Asset name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_asset</p>
         */
        public Builder componentAssetName(String componentAssetName) {
            this.putBodyParameter("ComponentAssetName", componentAssetName);
            this.componentAssetName = componentAssetName;
            return this;
        }

        /**
         * <p>Asset UUID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1C5F11E9-<strong><strong>-51F0-</strong></strong>-43BB312A0557</p>
         */
        public Builder componentAssetUuid(String componentAssetUuid) {
            this.putBodyParameter("ComponentAssetUuid", componentAssetUuid);
            this.componentAssetUuid = componentAssetUuid;
            return this;
        }

        /**
         * <p>Configuration information of the asset.</p>
         */
        public Builder componentAssetValues(java.util.List<ComponentAssetValues> componentAssetValues) {
            this.putBodyParameter("ComponentAssetValues", componentAssetValues);
            this.componentAssetValues = componentAssetValues;
            return this;
        }

        /**
         * <p>The language type for the request and response. Values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (default): Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
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
        public UpdateComponentAssetRequest build() {
            return new UpdateComponentAssetRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateComponentAssetRequest} extends {@link TeaModel}
     *
     * <p>UpdateComponentAssetRequest</p>
     */
    public static class ComponentAssetValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("FieldValue")
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
             * 
             * <strong>example:</strong>
             * <p>lh_source</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * <p>Field value.</p>
             * 
             * <strong>example:</strong>
             * <p>device</p>
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
