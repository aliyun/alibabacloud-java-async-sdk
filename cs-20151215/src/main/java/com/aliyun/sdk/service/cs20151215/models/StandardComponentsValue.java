// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StandardComponentsValue} extends {@link TeaModel}
 *
 * <p>StandardComponentsValue</p>
 */
public class StandardComponentsValue extends TeaModel {
    @NameInMap("name")
    private String name;

    @NameInMap("version")
    private String version;

    @NameInMap("description")
    private String description;

    @NameInMap("required")
    private String required;

    @NameInMap("disabled")
    private Boolean disabled;

    private StandardComponentsValue(Builder builder) {
        this.name = builder.name;
        this.version = builder.version;
        this.description = builder.description;
        this.required = builder.required;
        this.disabled = builder.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StandardComponentsValue create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return required
     */
    public String getRequired() {
        return this.required;
    }

    /**
     * @return disabled
     */
    public Boolean getDisabled() {
        return this.disabled;
    }

    public static final class Builder {
        private String name; 
        private String version; 
        private String description; 
        private String required; 
        private Boolean disabled; 

        /**
         * 组件名称。
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 组件版本。
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * 组件功能说明。
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * 是否为集群必需组件。取值：
         * <p>
         * 
         * - `true`：必需组件，集群创建时必须要安装的组件。
         * 
         * - `false`：非必需组件，集群创建完成后，可通过`组件管理`进行安装。
         * 
         */
        public Builder required(String required) {
            this.required = required;
            return this;
        }

        /**
         * 是否禁止默认安装，集群创建时除了安装集群所需的组件外，还会额外安装一些与日志或者路由相关的组件（例如：Ingress），如果您不想默认安装，可通过设置该字段禁止默认安装。取值：
         * <p>
         * 
         * - `true`：禁止默认安装。
         * - `false`：默认安装。
         */
        public Builder disabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        public StandardComponentsValue build() {
            return new StandardComponentsValue(this);
        } 

    } 

}
