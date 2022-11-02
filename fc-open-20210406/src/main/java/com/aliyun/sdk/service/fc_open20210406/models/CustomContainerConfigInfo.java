// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CustomContainerConfigInfo} extends {@link TeaModel}
 *
 * <p>CustomContainerConfigInfo</p>
 */
public class CustomContainerConfigInfo extends TeaModel {
    @NameInMap("accelerationInfo")
    private AccelerationInfo accelerationInfo;

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

    private CustomContainerConfigInfo(Builder builder) {
        this.accelerationInfo = builder.accelerationInfo;
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

    public static CustomContainerConfigInfo create() {
        return builder().build();
    }

    /**
     * @return accelerationInfo
     */
    public AccelerationInfo getAccelerationInfo() {
        return this.accelerationInfo;
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
        private AccelerationInfo accelerationInfo; 
        private String accelerationType; 
        private String args; 
        private String command; 
        private String image; 
        private String instanceID; 
        private Boolean webServerMode; 

        /**
         * accelerationInfo.
         */
        public Builder accelerationInfo(AccelerationInfo accelerationInfo) {
            this.accelerationInfo = accelerationInfo;
            return this;
        }

        /**
         * 镜像加速类型，取值Default为开启加速，None为关闭加速，默认开启
         */
        public Builder accelerationType(String accelerationType) {
            this.accelerationType = accelerationType;
            return this;
        }

        /**
         * 容器启动参数
         */
        public Builder args(String args) {
            this.args = args;
            return this;
        }

        /**
         * 容器启动命令，等同于 Docker ENTRYPOINT
         */
        public Builder command(String command) {
            this.command = command;
            return this;
        }

        /**
         * 容器镜像地址，实例值： registry-vpc.cn-hangzhou.aliyuncs.com/fc-demo/helloworld:v1beta1
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * ACR企业版镜像仓库ID，使用ACR企业版镜像时须传入
         */
        public Builder instanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }

        /**
         * 镜像运行是否为Web Server模式，取值true需要在容器镜像中实现Web Server来监听端口并处理请求，取值false需要容器运行后主动退出进程，并且ExitCode需要为0。默认true
         */
        public Builder webServerMode(Boolean webServerMode) {
            this.webServerMode = webServerMode;
            return this;
        }

        public CustomContainerConfigInfo build() {
            return new CustomContainerConfigInfo(this);
        } 

    } 

}
