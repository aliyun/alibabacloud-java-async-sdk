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
 * {@link MicroSandboxConfig} extends {@link TeaModel}
 *
 * <p>MicroSandboxConfig</p>
 */
public class MicroSandboxConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("osType")
    private String osType;

    @com.aliyun.core.annotation.NameInMap("readyCommand")
    private String readyCommand;

    @com.aliyun.core.annotation.NameInMap("startCommand")
    private String startCommand;

    private MicroSandboxConfig(Builder builder) {
        this.osType = builder.osType;
        this.readyCommand = builder.readyCommand;
        this.startCommand = builder.startCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MicroSandboxConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return readyCommand
     */
    public String getReadyCommand() {
        return this.readyCommand;
    }

    /**
     * @return startCommand
     */
    public String getStartCommand() {
        return this.startCommand;
    }

    public static final class Builder {
        private String osType; 
        private String readyCommand; 
        private String startCommand; 

        private Builder() {
        } 

        private Builder(MicroSandboxConfig model) {
            this.osType = model.osType;
            this.readyCommand = model.readyCommand;
            this.startCommand = model.startCommand;
        } 

        /**
         * osType.
         */
        public Builder osType(String osType) {
            this.osType = osType;
            return this;
        }

        /**
         * readyCommand.
         */
        public Builder readyCommand(String readyCommand) {
            this.readyCommand = readyCommand;
            return this;
        }

        /**
         * startCommand.
         */
        public Builder startCommand(String startCommand) {
            this.startCommand = startCommand;
            return this;
        }

        public MicroSandboxConfig build() {
            return new MicroSandboxConfig(this);
        } 

    } 

}
