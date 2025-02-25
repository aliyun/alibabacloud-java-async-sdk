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
 * {@link GroupConfiguration} extends {@link TeaModel}
 *
 * <p>GroupConfiguration</p>
 */
public class GroupConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("fields")
    private java.util.List<String> fields;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private GroupConfiguration(Builder builder) {
        this.fields = builder.fields;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GroupConfiguration create() {
        return builder().build();
    }

    /**
     * @return fields
     */
    public java.util.List<String> getFields() {
        return this.fields;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List<String> fields; 
        private String type; 

        /**
         * fields.
         */
        public Builder fields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GroupConfiguration build() {
            return new GroupConfiguration(this);
        } 

    } 

}
