// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link Key} extends {@link TeaModel}
 *
 * <p>Key</p>
 */
public class Key extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("prefix")
    private String prefix;

    @com.aliyun.core.annotation.NameInMap("suffix")
    private String suffix;

    private Key(Builder builder) {
        this.prefix = builder.prefix;
        this.suffix = builder.suffix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Key create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return suffix
     */
    public String getSuffix() {
        return this.suffix;
    }

    public static final class Builder {
        private String prefix; 
        private String suffix; 

        private Builder() {
        } 

        private Builder(Key model) {
            this.prefix = model.prefix;
            this.suffix = model.suffix;
        } 

        /**
         * <p>The prefix that is used to filter the event-related resources. Only events related to the resources whose names are prefixed with the specified value of Prefix are traced. For example, if you set Prefix to serverless_, only events related to the resources that are prefixed with serverless_ can trigger the function.</p>
         * 
         * <strong>example:</strong>
         * <p>serverless_</p>
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * <p>The suffix that is used to filter the event-related resources. Only events related to the resources whose names are suffixed with the specified value of Suffix are traced. For example, if you set Suffix to .zip, only events related to the resources that are suffixed with .zip can trigger the function.</p>
         * 
         * <strong>example:</strong>
         * <p>.zip</p>
         */
        public Builder suffix(String suffix) {
            this.suffix = suffix;
            return this;
        }

        public Key build() {
            return new Key(this);
        } 

    } 

}
