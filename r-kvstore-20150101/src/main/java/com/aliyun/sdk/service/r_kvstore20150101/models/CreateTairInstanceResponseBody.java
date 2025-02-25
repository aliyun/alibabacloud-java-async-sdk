// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateTairInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTairInstanceResponseBody</p>
 */
public class CreateTairInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Long bandwidth;

    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("ConnectionDomain")
    private String connectionDomain;

    @com.aliyun.core.annotation.NameInMap("Connections")
    private Long connections;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("InstanceStatus")
    private String instanceStatus;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.NameInMap("QPS")
    private Long QPS;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateTairInstanceResponseBody(Builder builder) {
        this.bandwidth = builder.bandwidth;
        this.chargeType = builder.chargeType;
        this.config = builder.config;
        this.connectionDomain = builder.connectionDomain;
        this.connections = builder.connections;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.instanceStatus = builder.instanceStatus;
        this.orderId = builder.orderId;
        this.port = builder.port;
        this.QPS = builder.QPS;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTairInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandwidth
     */
    public Long getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return connectionDomain
     */
    public String getConnectionDomain() {
        return this.connectionDomain;
    }

    /**
     * @return connections
     */
    public Long getConnections() {
        return this.connections;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return QPS
     */
    public Long getQPS() {
        return this.QPS;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private Long bandwidth; 
        private String chargeType; 
        private String config; 
        private String connectionDomain; 
        private Long connections; 
        private String instanceId; 
        private String instanceName; 
        private String instanceStatus; 
        private Long orderId; 
        private Integer port; 
        private Long QPS; 
        private String regionId; 
        private String requestId; 
        private String taskId; 
        private String zoneId; 

        /**
         * <p>The maximum bandwidth of the instance. Unit: MB/s.</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        public Builder bandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription</li>
         * <li><strong>PostPaid</strong>: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The detailed configurations of the instance. The value is a JSON string. For more information about the parameter description, see <a href="https://help.aliyun.com/document_detail/43885.html">Modify the parameters of an ApsaraDB for Redis instance</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;EvictionPolicy&quot;:&quot;volatile-lru&quot;,&quot;hash-max-ziplist-entries&quot;:512,&quot;zset-max-ziplist-entries&quot;:128,&quot;list-max-ziplist-entries&quot;:512,&quot;list-max-ziplist-value&quot;:64,&quot;zset-max-ziplist-value&quot;:64,&quot;set-max-intset-entries&quot;:512,&quot;hash-max-ziplist-value&quot;:64}</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The internal endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp13ac3d047b****.tairpena.rds.aliyuncs.com</p>
         */
        public Builder connectionDomain(String connectionDomain) {
            this.connectionDomain = connectionDomain;
            return this;
        }

        /**
         * <p>The maximum number of connections supported by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder connections(Long connections) {
            this.connections = connections;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp13ac3d047b****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * <p>**</p>
         * <p>This parameter is returned only if the <strong>InstanceName</strong> parameter is specified in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>redistest</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The state of the instance. The return value is <strong>Creating</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2084452111111</p>
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The port number that is used to connect to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>6379</p>
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * <p>The maximum number of read and write operations that can be processed by the instance per second. The value is a theoretical value.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        public Builder QPS(Long QPS) {
            this.QPS = QPS;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>12123216-4B00-4378-BE4B-08005BFC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>10****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The zone ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public CreateTairInstanceResponseBody build() {
            return new CreateTairInstanceResponseBody(this);
        } 

    } 

}
