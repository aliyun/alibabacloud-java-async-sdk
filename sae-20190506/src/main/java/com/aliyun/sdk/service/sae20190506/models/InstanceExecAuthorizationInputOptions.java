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
 * {@link InstanceExecAuthorizationInputOptions} extends {@link TeaModel}
 *
 * <p>InstanceExecAuthorizationInputOptions</p>
 */
public class InstanceExecAuthorizationInputOptions extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("command")
    private java.util.List<String> command;

    @com.aliyun.core.annotation.NameInMap("stderr")
    private Boolean stderr;

    @com.aliyun.core.annotation.NameInMap("stdin")
    private Boolean stdin;

    @com.aliyun.core.annotation.NameInMap("stdout")
    private Boolean stdout;

    @com.aliyun.core.annotation.NameInMap("tty")
    private Boolean tty;

    private InstanceExecAuthorizationInputOptions(Builder builder) {
        this.command = builder.command;
        this.stderr = builder.stderr;
        this.stdin = builder.stdin;
        this.stdout = builder.stdout;
        this.tty = builder.tty;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstanceExecAuthorizationInputOptions create() {
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

    /**
     * @return stderr
     */
    public Boolean getStderr() {
        return this.stderr;
    }

    /**
     * @return stdin
     */
    public Boolean getStdin() {
        return this.stdin;
    }

    /**
     * @return stdout
     */
    public Boolean getStdout() {
        return this.stdout;
    }

    /**
     * @return tty
     */
    public Boolean getTty() {
        return this.tty;
    }

    public static final class Builder {
        private java.util.List<String> command; 
        private Boolean stderr; 
        private Boolean stdin; 
        private Boolean stdout; 
        private Boolean tty; 

        private Builder() {
        } 

        private Builder(InstanceExecAuthorizationInputOptions model) {
            this.command = model.command;
            this.stderr = model.stderr;
            this.stdin = model.stdin;
            this.stdout = model.stdout;
            this.tty = model.tty;
        } 

        /**
         * command.
         */
        public Builder command(java.util.List<String> command) {
            this.command = command;
            return this;
        }

        /**
         * stderr.
         */
        public Builder stderr(Boolean stderr) {
            this.stderr = stderr;
            return this;
        }

        /**
         * stdin.
         */
        public Builder stdin(Boolean stdin) {
            this.stdin = stdin;
            return this;
        }

        /**
         * stdout.
         */
        public Builder stdout(Boolean stdout) {
            this.stdout = stdout;
            return this;
        }

        /**
         * tty.
         */
        public Builder tty(Boolean tty) {
            this.tty = tty;
            return this;
        }

        public InstanceExecAuthorizationInputOptions build() {
            return new InstanceExecAuthorizationInputOptions(this);
        } 

    } 

}
