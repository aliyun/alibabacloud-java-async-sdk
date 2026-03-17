// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeSagWan4GResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSagWan4GResponseBody</p>
 */
public class DescribeSagWan4GResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.NameInMap("Mac")
    private String mac;

    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Strength")
    private String strength;

    @com.aliyun.core.annotation.NameInMap("TrafficState")
    private String trafficState;

    private DescribeSagWan4GResponseBody(Builder builder) {
        this.ip = builder.ip;
        this.mac = builder.mac;
        this.priority = builder.priority;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.strength = builder.strength;
        this.trafficState = builder.trafficState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSagWan4GResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return mac
     */
    public String getMac() {
        return this.mac;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return strength
     */
    public String getStrength() {
        return this.strength;
    }

    /**
     * @return trafficState
     */
    public String getTrafficState() {
        return this.trafficState;
    }

    public static final class Builder {
        private String ip; 
        private String mac; 
        private Integer priority; 
        private String requestId; 
        private String status; 
        private String strength; 
        private String trafficState; 

        private Builder() {
        } 

        private Builder(DescribeSagWan4GResponseBody model) {
            this.ip = model.ip;
            this.mac = model.mac;
            this.priority = model.priority;
            this.requestId = model.requestId;
            this.status = model.status;
            this.strength = model.strength;
            this.trafficState = model.trafficState;
        } 

        /**
         * <p>The IP address of the 4G SIM card.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
        public Builder ip(String ip) {
            this.ip = ip;
            return this;
        }

        /**
         * <p>The MAC address of the 4G SIM card.</p>
         * 
         * <strong>example:</strong>
         * <p>c4:00:ad:a2:f5:****</p>
         */
        public Builder mac(String mac) {
            this.mac = mac;
            return this;
        }

        /**
         * <p>The priority of the 4G SIM card. The default value is <strong>99</strong>, which indicates the lowest priority and cannot be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CE6642D4-21EB-4168-9BF9-F217953F9892</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the 4G SIM card. Valid value:</p>
         * <ul>
         * <li><strong>Normal</strong>: The 4G SIM card is available.</li>
         * <li><strong>Abnormal</strong>: The 4G SIM card encountered an error.</li>
         * <li><strong>Unavailable</strong>: No 4G SIM card is inserted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The signal strength of the 4G network. Valid values:</p>
         * <ul>
         * <li><strong>High</strong>: strong signals.</li>
         * <li><strong>Middle</strong>: medium-strength signals.</li>
         * <li><strong>Low</strong>: weak signals.</li>
         * <li><strong>Unavailable</strong>: no signal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>High</p>
         */
        public Builder strength(String strength) {
            this.strength = strength;
            return this;
        }

        /**
         * <p>The network status of the 4G SIM card. Valid values:</p>
         * <ul>
         * <li><strong>active</strong>: The 4G SIM card is used to establish the active connection. Network traffic is transmitted over the 4G SIM card first.</li>
         * <li><strong>standby</strong>: The 4G SIM card is used to establish a standby connection. Network traffic is not transmitted over the 4G SIM card unless the active connection fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder trafficState(String trafficState) {
            this.trafficState = trafficState;
            return this;
        }

        public DescribeSagWan4GResponseBody build() {
            return new DescribeSagWan4GResponseBody(this);
        } 

    } 

}
