// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ContainerInfo} extends {@link TeaModel}
 *
 * <p>ContainerInfo</p>
 */
public class ContainerInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentReaon")
    private String currentReaon;

    @com.aliyun.core.annotation.NameInMap("CurrentStatus")
    private String currentStatus;

    @com.aliyun.core.annotation.NameInMap("CurrentTimestamp")
    private String currentTimestamp;

    @com.aliyun.core.annotation.NameInMap("Image")
    private String image;

    @com.aliyun.core.annotation.NameInMap("LastReason")
    private String lastReason;

    @com.aliyun.core.annotation.NameInMap("LastStatus")
    private String lastStatus;

    @com.aliyun.core.annotation.NameInMap("LastTimestamp")
    private String lastTimestamp;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.NameInMap("Ready")
    private Boolean ready;

    @com.aliyun.core.annotation.NameInMap("RestartCount")
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
         * CurrentReaon.
         */
        public Builder currentReaon(String currentReaon) {
            this.currentReaon = currentReaon;
            return this;
        }

        /**
         * CurrentStatus.
         */
        public Builder currentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }

        /**
         * CurrentTimestamp.
         */
        public Builder currentTimestamp(String currentTimestamp) {
            this.currentTimestamp = currentTimestamp;
            return this;
        }

        /**
         * Image.
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * LastReason.
         */
        public Builder lastReason(String lastReason) {
            this.lastReason = lastReason;
            return this;
        }

        /**
         * LastStatus.
         */
        public Builder lastStatus(String lastStatus) {
            this.lastStatus = lastStatus;
            return this;
        }

        /**
         * LastTimestamp.
         */
        public Builder lastTimestamp(String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * Ready.
         */
        public Builder ready(Boolean ready) {
            this.ready = ready;
            return this;
        }

        /**
         * RestartCount.
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
