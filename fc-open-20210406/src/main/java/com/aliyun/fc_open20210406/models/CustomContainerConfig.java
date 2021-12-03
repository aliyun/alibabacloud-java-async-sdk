// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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


    private CustomContainerConfig(Builder builder) {
        this.accelerationType = builder.accelerationType;
        this.args = builder.args;
        this.command = builder.command;
        this.image = builder.image;
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

    public static final class Builder {
        private String accelerationType; 
        private String args; 
        private String command; 
        private String image; 

        /**
         * <p>镜像加速类型，取值Default为开启加速，None为关闭加速，默认关闭</p>
         */
        public Builder accelerationType(String accelerationType) {
            this.accelerationType = accelerationType;
            return this;
        }

        /**
         * <p>容器启动参数</p>
         */
        public Builder args(String args) {
            this.args = args;
            return this;
        }

        /**
         * <p>容器启动命令，等同于 Docker ENTRYPOINT</p>
         */
        public Builder command(String command) {
            this.command = command;
            return this;
        }

        /**
         * <p>容器镜像地址，实例值： registry-vpc.cn-hangzhou.aliyuncs.com/fc-demo/helloworld:v1beta1</p>
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public CustomContainerConfig build() {
            return new CustomContainerConfig(this);
        } 

    } 

}
