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

    private CustomContainerConfigInfo(Builder builder) {
        this.accelerationInfo = builder.accelerationInfo;
        this.accelerationType = builder.accelerationType;
        this.args = builder.args;
        this.command = builder.command;
        this.image = builder.image;
        this.instanceID = builder.instanceID;
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

    public static final class Builder {
        private AccelerationInfo accelerationInfo; 
        private String accelerationType; 
        private String args; 
        private String command; 
        private String image; 
        private String instanceID; 

        /**
         * accelerationInfo.
         */
        public Builder accelerationInfo(AccelerationInfo accelerationInfo) {
            this.accelerationInfo = accelerationInfo;
            return this;
        }

        /**
         * ???????????????????????????Default??????????????????None??????????????????????????????
         */
        public Builder accelerationType(String accelerationType) {
            this.accelerationType = accelerationType;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder args(String args) {
            this.args = args;
            return this;
        }

        /**
         * ?????????????????????????????? Docker ENTRYPOINT
         */
        public Builder command(String command) {
            this.command = command;
            return this;
        }

        /**
         * ????????????????????????????????? registry-vpc.cn-hangzhou.aliyuncs.com/fc-demo/helloworld:v1beta1
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * ACR?????????????????????ID?????????ACR???????????????????????????
         */
        public Builder instanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }

        public CustomContainerConfigInfo build() {
            return new CustomContainerConfigInfo(this);
        } 

    } 

}
