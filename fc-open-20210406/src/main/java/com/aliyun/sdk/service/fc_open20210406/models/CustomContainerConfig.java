// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CustomContainerConfig} extends {@link TeaModel}
 *
 * <p>CustomContainerConfig</p>
 */
public class CustomContainerConfig extends TeaModel {
    @NameInMap("accelerationType")
    private String accelerationType;

    @NameInMap("args")
    private String args;

    @NameInMap("command")
    private String command;

    @NameInMap("image")
    private String image;

    @NameInMap("instanceID")
    private String instanceID;

    @NameInMap("webServerMode")
    private Boolean webServerMode;

    private CustomContainerConfig(Builder builder) {
        this.accelerationType = builder.accelerationType;
        this.args = builder.args;
        this.command = builder.command;
        this.image = builder.image;
        this.instanceID = builder.instanceID;
        this.webServerMode = builder.webServerMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomContainerConfig create() {
        return builder().build();
    }

    /**
     * @return accelerationType
     */
    public String getAccelerationType() {
        return this.accelerationType;
    }

    /**
     * @return args
     */
    public String getArgs() {
        return this.args;
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return instanceID
     */
    public String getInstanceID() {
        return this.instanceID;
    }

    /**
     * @return webServerMode
     */
    public Boolean getWebServerMode() {
        return this.webServerMode;
    }

    public static final class Builder {
        private String accelerationType; 
        private String args; 
        private String command; 
        private String image; 
        private String instanceID; 
        private Boolean webServerMode; 

        /**
         * accelerationType.
         */
        public Builder accelerationType(String accelerationType) {
            this.accelerationType = accelerationType;
            return this;
        }

        /**
         * args.
         */
        public Builder args(String args) {
            this.args = args;
            return this;
        }

        /**
         * command.
         */
        public Builder command(String command) {
            this.command = command;
            return this;
        }

        /**
         * image.
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * instanceID.
         */
        public Builder instanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }

        /**
         * webServerMode.
         */
        public Builder webServerMode(Boolean webServerMode) {
            this.webServerMode = webServerMode;
            return this;
        }

        public CustomContainerConfig build() {
            return new CustomContainerConfig(this);
        } 

    } 

}
