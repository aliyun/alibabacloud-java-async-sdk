// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeDBInstanceReplicationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceReplicationResponseBody</p>
 */
public class DescribeDBInstanceReplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExternalReplication")
    private String externalReplication;

    @com.aliyun.core.annotation.NameInMap("GtidExecuted")
    private String gtidExecuted;

    @com.aliyun.core.annotation.NameInMap("ReplicationDelay")
    private String replicationDelay;

    @com.aliyun.core.annotation.NameInMap("ReplicationErrorMessage")
    private String replicationErrorMessage;

    @com.aliyun.core.annotation.NameInMap("ReplicationIp")
    private String replicationIp;

    @com.aliyun.core.annotation.NameInMap("ReplicationPort")
    private String replicationPort;

    @com.aliyun.core.annotation.NameInMap("ReplicationSource")
    private String replicationSource;

    @com.aliyun.core.annotation.NameInMap("ReplicationState")
    private String replicationState;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceReplicationResponseBody(Builder builder) {
        this.externalReplication = builder.externalReplication;
        this.gtidExecuted = builder.gtidExecuted;
        this.replicationDelay = builder.replicationDelay;
        this.replicationErrorMessage = builder.replicationErrorMessage;
        this.replicationIp = builder.replicationIp;
        this.replicationPort = builder.replicationPort;
        this.replicationSource = builder.replicationSource;
        this.replicationState = builder.replicationState;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceReplicationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return externalReplication
     */
    public String getExternalReplication() {
        return this.externalReplication;
    }

    /**
     * @return gtidExecuted
     */
    public String getGtidExecuted() {
        return this.gtidExecuted;
    }

    /**
     * @return replicationDelay
     */
    public String getReplicationDelay() {
        return this.replicationDelay;
    }

    /**
     * @return replicationErrorMessage
     */
    public String getReplicationErrorMessage() {
        return this.replicationErrorMessage;
    }

    /**
     * @return replicationIp
     */
    public String getReplicationIp() {
        return this.replicationIp;
    }

    /**
     * @return replicationPort
     */
    public String getReplicationPort() {
        return this.replicationPort;
    }

    /**
     * @return replicationSource
     */
    public String getReplicationSource() {
        return this.replicationSource;
    }

    /**
     * @return replicationState
     */
    public String getReplicationState() {
        return this.replicationState;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String externalReplication; 
        private String gtidExecuted; 
        private String replicationDelay; 
        private String replicationErrorMessage; 
        private String replicationIp; 
        private String replicationPort; 
        private String replicationSource; 
        private String replicationState; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBInstanceReplicationResponseBody model) {
            this.externalReplication = model.externalReplication;
            this.gtidExecuted = model.gtidExecuted;
            this.replicationDelay = model.replicationDelay;
            this.replicationErrorMessage = model.replicationErrorMessage;
            this.replicationIp = model.replicationIp;
            this.replicationPort = model.replicationPort;
            this.replicationSource = model.replicationSource;
            this.replicationState = model.replicationState;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the native replication mods is enabled. Valid values:</p>
         * <ul>
         * <li><strong>ON</strong></li>
         * <li><strong>OFF</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder externalReplication(String externalReplication) {
            this.externalReplication = externalReplication;
            return this;
        }

        /**
         * GtidExecuted.
         */
        public Builder gtidExecuted(String gtidExecuted) {
            this.gtidExecuted = gtidExecuted;
            return this;
        }

        /**
         * <p>The replication latency. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder replicationDelay(String replicationDelay) {
            this.replicationDelay = replicationDelay;
            return this;
        }

        /**
         * <p>The replication error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Got fatal error 1236 from master when reading data from binary log...</p>
         */
        public Builder replicationErrorMessage(String replicationErrorMessage) {
            this.replicationErrorMessage = replicationErrorMessage;
            return this;
        }

        /**
         * ReplicationIp.
         */
        public Builder replicationIp(String replicationIp) {
            this.replicationIp = replicationIp;
            return this;
        }

        /**
         * ReplicationPort.
         */
        public Builder replicationPort(String replicationPort) {
            this.replicationPort = replicationPort;
            return this;
        }

        /**
         * <p>The source of the native replication.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.x.x</p>
         */
        public Builder replicationSource(String replicationSource) {
            this.replicationSource = replicationSource;
            return this;
        }

        /**
         * <p>The current replication status. Valid values:</p>
         * <ul>
         * <li><strong>Running</strong></li>
         * <li><strong>Connecting</strong></li>
         * <li><strong>Stopped</strong></li>
         * <li><strong>Error</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running
         * Connecting
         * Stopped
         * Error</p>
         */
        public Builder replicationState(String replicationState) {
            this.replicationState = replicationState;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>847BA085-B377-4BFA-8267-F82345ECE1D2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceReplicationResponseBody build() {
            return new DescribeDBInstanceReplicationResponseBody(this);
        } 

    } 

}
