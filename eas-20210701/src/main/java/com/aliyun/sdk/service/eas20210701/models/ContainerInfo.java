// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ContainerInfo} extends {@link TeaModel}
 *
 * <p>ContainerInfo</p>
 */
public class ContainerInfo extends TeaModel {
    @NameInMap("CurrentReaon")
    private String currentReaon;

    @NameInMap("CurrentStatus")
    private String currentStatus;

    @NameInMap("CurrentTimestamp")
    private String currentTimestamp;

    @NameInMap("Image")
    private String image;

    @NameInMap("LastReason")
    private String lastReason;

    @NameInMap("LastStatus")
    private String lastStatus;

    @NameInMap("LastTimestamp")
    private String lastTimestamp;

    @NameInMap("Name")
    private String name;

    @NameInMap("Port")
    private Integer port;

    @NameInMap("Ready")
    private Boolean ready;

    @NameInMap("RestartCount")
    private Integer restartCount;

    private ContainerInfo(Builder builder) {
        this.currentReaon = builder.currentReaon;
        this.currentStatus = builder.currentStatus;
        this.currentTimestamp = builder.currentTimestamp;
        this.image = builder.image;
        this.lastReason = builder.lastReason;
        this.lastStatus = builder.lastStatus;
        this.lastTimestamp = builder.lastTimestamp;
        this.name = builder.name;
        this.port = builder.port;
        this.ready = builder.ready;
        this.restartCount = builder.restartCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContainerInfo create() {
        return builder().build();
    }

    /**
     * @return currentReaon
     */
    public String getCurrentReaon() {
        return this.currentReaon;
    }

    /**
     * @return currentStatus
     */
    public String getCurrentStatus() {
        return this.currentStatus;
    }

    /**
     * @return currentTimestamp
     */
    public String getCurrentTimestamp() {
        return this.currentTimestamp;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return lastReason
     */
    public String getLastReason() {
        return this.lastReason;
    }

    /**
     * @return lastStatus
     */
    public String getLastStatus() {
        return this.lastStatus;
    }

    /**
     * @return lastTimestamp
     */
    public String getLastTimestamp() {
        return this.lastTimestamp;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return ready
     */
    public Boolean getReady() {
        return this.ready;
    }

    /**
     * @return restartCount
     */
    public Integer getRestartCount() {
        return this.restartCount;
    }

    public static final class Builder {
        private String currentReaon; 
        private String currentStatus; 
        private String currentTimestamp; 
        private String image; 
        private String lastReason; 
        private String lastStatus; 
        private String lastTimestamp; 
        private String name; 
        private Integer port; 
        private Boolean ready; 
        private Integer restartCount; 

        /**
         * 当前状态-原因
         */
        public Builder currentReaon(String currentReaon) {
            this.currentReaon = currentReaon;
            return this;
        }

        /**
         * 当前状态-状态
         */
        public Builder currentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }

        /**
         * 当前状态-时间
         */
        public Builder currentTimestamp(String currentTimestamp) {
            this.currentTimestamp = currentTimestamp;
            return this;
        }

        /**
         * 镜像
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * 上次状态-原因
         */
        public Builder lastReason(String lastReason) {
            this.lastReason = lastReason;
            return this;
        }

        /**
         * 上次状态-状态
         */
        public Builder lastStatus(String lastStatus) {
            this.lastStatus = lastStatus;
            return this;
        }

        /**
         * 上次状态-时间
         */
        public Builder lastTimestamp(String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }

        /**
         * 容器名称
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 端口
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * 健康检查是否通过
         */
        public Builder ready(Boolean ready) {
            this.ready = ready;
            return this;
        }

        /**
         * 重启次数
         */
        public Builder restartCount(Integer restartCount) {
            this.restartCount = restartCount;
            return this;
        }

        public ContainerInfo build() {
            return new ContainerInfo(this);
        } 

    } 

}
