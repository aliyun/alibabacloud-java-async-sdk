// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link ListAgentInstanceConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentInstanceConfigsResponseBody</p>
 */
public class ListAgentInstanceConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("configs")
    private java.util.List<Configs> configs;

    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListAgentInstanceConfigsResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.size = builder.size;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentInstanceConfigsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configs
     */
    public java.util.List<Configs> getConfigs() {
        return this.configs;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<Configs> configs; 
        private Long size; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListAgentInstanceConfigsResponseBody model) {
            this.configs = model.configs;
            this.size = model.size;
            this.total = model.total;
        } 

        /**
         * configs.
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListAgentInstanceConfigsResponseBody build() {
            return new ListAgentInstanceConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentInstanceConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentInstanceConfigsResponseBody</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attributes")
        private String attributes;

        @com.aliyun.core.annotation.NameInMap("configType")
        private String configType;

        private Configs(Builder builder) {
            this.attributes = builder.attributes;
            this.configType = builder.configType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public String getAttributes() {
            return this.attributes;
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        public static final class Builder {
            private String attributes; 
            private String configType; 

            private Builder() {
            } 

            private Builder(Configs model) {
                this.attributes = model.attributes;
                this.configType = model.configType;
            } 

            /**
             * attributes.
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * configType.
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
