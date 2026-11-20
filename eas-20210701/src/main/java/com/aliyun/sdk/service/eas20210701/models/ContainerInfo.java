// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ContainerInfo model) {
            this.currentReaon = model.currentReaon;
            this.currentStatus = model.currentStatus;
            this.currentTimestamp = model.currentTimestamp;
            this.image = model.image;
            this.lastReason = model.lastReason;
            this.lastStatus = model.lastStatus;
            this.lastTimestamp = model.lastTimestamp;
            this.name = model.name;
            this.port = model.port;
            this.ready = model.ready;
            this.restartCount = model.restartCount;
        } 

        /**
         * <p>The reason for the current status.</p>
         * 
         * <strong>example:</strong>
         * <p>PodInitializing</p>
         */
        public Builder currentReaon(String currentReaon) {
            this.currentReaon = currentReaon;
            return this;
        }

        /**
         * <p>The current status. Valid values:</p>
         * <ul>
         * <li>Waiting: waiting</li>
         * <li>Running: running</li>
         * <li>Terminated: terminated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Waiting</p>
         */
        public Builder currentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }

        /**
         * <p>The time when the current status occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-21T06:17:57Z</p>
         */
        public Builder currentTimestamp(String currentTimestamp) {
            this.currentTimestamp = currentTimestamp;
            return this;
        }

        /**
         * <p>The image.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-shanghai.aliyuncs.com/eas/echo_cn-shanghai:v0.0.1-20210129111320</p>
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * <p>The reason for the previous status.</p>
         * 
         * <strong>example:</strong>
         * <p>Error</p>
         */
        public Builder lastReason(String lastReason) {
            this.lastReason = lastReason;
            return this;
        }

        /**
         * <p>The previous status. Valid values:</p>
         * <ul>
         * <li>Waiting: waiting</li>
         * <li>Running: running</li>
         * <li>Terminated: terminated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Terminated</p>
         */
        public Builder lastStatus(String lastStatus) {
            this.lastStatus = lastStatus;
            return this;
        }

        /**
         * <p>The time when the previous status occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-21T05:17:57Z</p>
         */
        public Builder lastTimestamp(String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }

        /**
         * <p>The container name.</p>
         * 
         * <strong>example:</strong>
         * <p>worker0</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The port.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * <p>Indicates whether the health check is passed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ready(Boolean ready) {
            this.ready = ready;
            return this;
        }

        /**
         * <p>The number of restarts.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
