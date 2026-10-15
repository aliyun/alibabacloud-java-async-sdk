// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link PublicTemplateStep} extends {@link TeaModel}
 *
 * <p>PublicTemplateStep</p>
 */
public class PublicTemplateStep extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("args")
    private java.util.List<String> args;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private PublicTemplateStep(Builder builder) {
        this.args = builder.args;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicTemplateStep create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return args
     */
    public java.util.List<String> getArgs() {
        return this.args;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List<String> args; 
        private String type; 

        private Builder() {
        } 

        private Builder(PublicTemplateStep model) {
            this.args = model.args;
            this.type = model.type;
        } 

        /**
         * <p>The user build step parameter list.</p>
         */
        public Builder args(java.util.List<String> args) {
            this.args = args;
            return this;
        }

        /**
         * <p>The build instruction type, such as RUN.</p>
         * 
         * <strong>example:</strong>
         * <p>RUN</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public PublicTemplateStep build() {
            return new PublicTemplateStep(this);
        } 

    } 

}
