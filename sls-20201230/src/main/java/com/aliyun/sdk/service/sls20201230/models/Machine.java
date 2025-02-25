// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link Machine} extends {@link TeaModel}
 *
 * <p>Machine</p>
 */
public class Machine extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("host-id")
    private String hostId;

    @com.aliyun.core.annotation.NameInMap("ip")
    private String ip;

    @com.aliyun.core.annotation.NameInMap("lastHeartbeatTime")
    private Long lastHeartbeatTime;

    @com.aliyun.core.annotation.NameInMap("machine-uniqueid")
    private String machineUniqueid;

    @com.aliyun.core.annotation.NameInMap("userdefined-id")
    private String userdefinedId;

    private Machine(Builder builder) {
        this.hostId = builder.hostId;
        this.ip = builder.ip;
        this.lastHeartbeatTime = builder.lastHeartbeatTime;
        this.machineUniqueid = builder.machineUniqueid;
        this.userdefinedId = builder.userdefinedId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Machine create() {
        return builder().build();
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return lastHeartbeatTime
     */
    public Long getLastHeartbeatTime() {
        return this.lastHeartbeatTime;
    }

    /**
     * @return machineUniqueid
     */
    public String getMachineUniqueid() {
        return this.machineUniqueid;
    }

    /**
     * @return userdefinedId
     */
    public String getUserdefinedId() {
        return this.userdefinedId;
    }

    public static final class Builder {
        private String hostId; 
        private String ip; 
        private Long lastHeartbeatTime; 
        private String machineUniqueid; 
        private String userdefinedId; 

        /**
         * host-id.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * ip.
         */
        public Builder ip(String ip) {
            this.ip = ip;
            return this;
        }

        /**
         * lastHeartbeatTime.
         */
        public Builder lastHeartbeatTime(Long lastHeartbeatTime) {
            this.lastHeartbeatTime = lastHeartbeatTime;
            return this;
        }

        /**
         * machine-uniqueid.
         */
        public Builder machineUniqueid(String machineUniqueid) {
            this.machineUniqueid = machineUniqueid;
            return this;
        }

        /**
         * userdefined-id.
         */
        public Builder userdefinedId(String userdefinedId) {
            this.userdefinedId = userdefinedId;
            return this;
        }

        public Machine build() {
            return new Machine(this);
        } 

    } 

}
