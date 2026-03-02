// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link MobiPluginConfig} extends {@link TeaModel}
 *
 * <p>MobiPluginConfig</p>
 */
public class MobiPluginConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("mappings")
    private java.util.List<AppConfigMapping> mappings;

    private MobiPluginConfig(Builder builder) {
        this.content = builder.content;
        this.mappings = builder.mappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MobiPluginConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return mappings
     */
    public java.util.List<AppConfigMapping> getMappings() {
        return this.mappings;
    }

    public static final class Builder {
        private String content; 
        private java.util.List<AppConfigMapping> mappings; 

        private Builder() {
        } 

        private Builder(MobiPluginConfig model) {
            this.content = model.content;
            this.mappings = model.mappings;
        } 

        /**
         * content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * mappings.
         */
        public Builder mappings(java.util.List<AppConfigMapping> mappings) {
            this.mappings = mappings;
            return this;
        }

        public MobiPluginConfig build() {
            return new MobiPluginConfig(this);
        } 

    } 

}
