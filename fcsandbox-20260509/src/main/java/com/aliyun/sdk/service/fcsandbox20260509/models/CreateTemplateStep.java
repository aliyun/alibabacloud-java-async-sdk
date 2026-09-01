// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link CreateTemplateStep} extends {@link TeaModel}
 *
 * <p>CreateTemplateStep</p>
 */
public class CreateTemplateStep extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("args")
    private java.util.List<String> args;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateTemplateStep(Builder builder) {
        this.args = builder.args;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateStep create() {
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

        private Builder(CreateTemplateStep model) {
            this.args = model.args;
            this.type = model.type;
        } 

        /**
         * args.
         */
        public Builder args(java.util.List<String> args) {
            this.args = args;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public CreateTemplateStep build() {
            return new CreateTemplateStep(this);
        } 

    } 

}
