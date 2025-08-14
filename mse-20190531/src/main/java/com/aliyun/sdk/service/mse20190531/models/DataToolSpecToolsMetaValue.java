// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link DataToolSpecToolsMetaValue} extends {@link TeaModel}
 *
 * <p>DataToolSpecToolsMetaValue</p>
 */
public class DataToolSpecToolsMetaValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("Templates")
    private java.util.Map<String, ?> templates;

    private DataToolSpecToolsMetaValue(Builder builder) {
        this.enabled = builder.enabled;
        this.templates = builder.templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataToolSpecToolsMetaValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return templates
     */
    public java.util.Map<String, ?> getTemplates() {
        return this.templates;
    }

    public static final class Builder {
        private Boolean enabled; 
        private java.util.Map<String, ?> templates; 

        private Builder() {
        } 

        private Builder(DataToolSpecToolsMetaValue model) {
            this.enabled = model.enabled;
            this.templates = model.templates;
        } 

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Templates.
         */
        public Builder templates(java.util.Map<String, ?> templates) {
            this.templates = templates;
            return this;
        }

        public DataToolSpecToolsMetaValue build() {
            return new DataToolSpecToolsMetaValue(this);
        } 

    } 

}
