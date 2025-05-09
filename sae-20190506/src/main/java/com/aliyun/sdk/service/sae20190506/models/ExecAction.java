// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ExecAction} extends {@link TeaModel}
 *
 * <p>ExecAction</p>
 */
public class ExecAction extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("command")
    private java.util.List<String> command;

    private ExecAction(Builder builder) {
        this.command = builder.command;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecAction create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return command
     */
    public java.util.List<String> getCommand() {
        return this.command;
    }

    public static final class Builder {
        private java.util.List<String> command; 

        private Builder() {
        } 

        private Builder(ExecAction model) {
            this.command = model.command;
        } 

        /**
         * command.
         */
        public Builder command(java.util.List<String> command) {
            this.command = command;
            return this;
        }

        public ExecAction build() {
            return new ExecAction(this);
        } 

    } 

}
