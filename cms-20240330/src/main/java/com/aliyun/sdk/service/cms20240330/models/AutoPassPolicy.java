// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link AutoPassPolicy} extends {@link TeaModel}
 *
 * <p>AutoPassPolicy</p>
 */
public class AutoPassPolicy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("commandPrefix")
    private java.util.List<String> commandPrefix;

    @com.aliyun.core.annotation.NameInMap("fullCommand")
    private String fullCommand;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private AutoPassPolicy(Builder builder) {
        this.commandPrefix = builder.commandPrefix;
        this.fullCommand = builder.fullCommand;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AutoPassPolicy create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commandPrefix
     */
    public java.util.List<String> getCommandPrefix() {
        return this.commandPrefix;
    }

    /**
     * @return fullCommand
     */
    public String getFullCommand() {
        return this.fullCommand;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private java.util.List<String> commandPrefix; 
        private String fullCommand; 
        private String version; 

        private Builder() {
        } 

        private Builder(AutoPassPolicy model) {
            this.commandPrefix = model.commandPrefix;
            this.fullCommand = model.fullCommand;
            this.version = model.version;
        } 

        /**
         * <p>The selected command prefix. The array must contain exactly one prefix. You must specify either this parameter or fullCommand.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;starops sls&quot;]</p>
         */
        public Builder commandPrefix(java.util.List<String> commandPrefix) {
            this.commandPrefix = commandPrefix;
            return this;
        }

        /**
         * <p>The full command for exact matching. The command must not be empty. You must specify either this parameter or commandPrefix.</p>
         * 
         * <strong>example:</strong>
         * <p>starops tool list</p>
         */
        public Builder fullCommand(String fullCommand) {
            this.fullCommand = fullCommand;
            return this;
        }

        /**
         * <p>The version required for a valid rule. The current version is v1.0.0.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0.0</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public AutoPassPolicy build() {
            return new AutoPassPolicy(this);
        } 

    } 

}
