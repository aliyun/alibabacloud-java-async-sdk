// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link CssInstanceComponent} extends {@link TeaModel}
 *
 * <p>CssInstanceComponent</p>
 */
public class CssInstanceComponent extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("componentCode")
    private String componentCode;

    @com.aliyun.core.annotation.NameInMap("componentName")
    private String componentName;

    @com.aliyun.core.annotation.NameInMap("globalKey")
    private String globalKey;

    @com.aliyun.core.annotation.NameInMap("instanceProperty")
    private java.util.List<CssInstanceProperty> instanceProperty;

    @com.aliyun.core.annotation.NameInMap("moduleAttrStatus")
    private Long moduleAttrStatus;

    @com.aliyun.core.annotation.NameInMap("tag")
    private String tag;

    private CssInstanceComponent(Builder builder) {
        this.componentCode = builder.componentCode;
        this.componentName = builder.componentName;
        this.globalKey = builder.globalKey;
        this.instanceProperty = builder.instanceProperty;
        this.moduleAttrStatus = builder.moduleAttrStatus;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CssInstanceComponent create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return componentCode
     */
    public String getComponentCode() {
        return this.componentCode;
    }

    /**
     * @return componentName
     */
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * @return globalKey
     */
    public String getGlobalKey() {
        return this.globalKey;
    }

    /**
     * @return instanceProperty
     */
    public java.util.List<CssInstanceProperty> getInstanceProperty() {
        return this.instanceProperty;
    }

    /**
     * @return moduleAttrStatus
     */
    public Long getModuleAttrStatus() {
        return this.moduleAttrStatus;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder {
        private String componentCode; 
        private String componentName; 
        private String globalKey; 
        private java.util.List<CssInstanceProperty> instanceProperty; 
        private Long moduleAttrStatus; 
        private String tag; 

        private Builder() {
        } 

        private Builder(CssInstanceComponent model) {
            this.componentCode = model.componentCode;
            this.componentName = model.componentName;
            this.globalKey = model.globalKey;
            this.instanceProperty = model.instanceProperty;
            this.moduleAttrStatus = model.moduleAttrStatus;
            this.tag = model.tag;
        } 

        /**
         * componentCode.
         */
        public Builder componentCode(String componentCode) {
            this.componentCode = componentCode;
            return this;
        }

        /**
         * componentName.
         */
        public Builder componentName(String componentName) {
            this.componentName = componentName;
            return this;
        }

        /**
         * globalKey.
         */
        public Builder globalKey(String globalKey) {
            this.globalKey = globalKey;
            return this;
        }

        /**
         * instanceProperty.
         */
        public Builder instanceProperty(java.util.List<CssInstanceProperty> instanceProperty) {
            this.instanceProperty = instanceProperty;
            return this;
        }

        /**
         * moduleAttrStatus.
         */
        public Builder moduleAttrStatus(Long moduleAttrStatus) {
            this.moduleAttrStatus = moduleAttrStatus;
            return this;
        }

        /**
         * tag.
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        public CssInstanceComponent build() {
            return new CssInstanceComponent(this);
        } 

    } 

}
