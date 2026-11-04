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
 * {@link PublicUpdateTemplateStep} extends {@link TeaModel}
 *
 * <p>PublicUpdateTemplateStep</p>
 */
public class PublicUpdateTemplateStep extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("args")
    private java.util.List<String> args;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private PublicUpdateTemplateStep(Builder builder) {
        this.args = builder.args;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicUpdateTemplateStep create() {
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

        private Builder(PublicUpdateTemplateStep model) {
            this.args = model.args;
            this.type = model.type;
        } 

        /**
         * <p>The build instruction parameters. The meaning varies depending on type: for USER, it is [username, optional passwordless sudo flag], and the second item configures passwordless sudo when the string is true; for WORKDIR, it is [directory]; for ENV, it is [key, value, ...], and multiple pairs can be set at once; for RUN, it is [command, optional temporary user].</p>
         */
        public Builder args(java.util.List<String> args) {
            this.args = args;
            return this;
        }

        /**
         * <p>The build instruction type. Valid values: USER, WORKDIR, ENV, and RUN. The instructions are executed sequentially in the order of the array.</p>
         * 
         * <strong>example:</strong>
         * <p>RUN</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public PublicUpdateTemplateStep build() {
            return new PublicUpdateTemplateStep(this);
        } 

    } 

}
