// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link Machine} extends {@link TeaModel}
 *
 * <p>Machine</p>
 */
public class Machine extends TeaModel {
    @NameInMap("ip")
    private String ip;

    @NameInMap("lastHeartbeatTime")
    private Long lastHeartbeatTime;

    @NameInMap("machine-uniqueid")
    private String machineUniqueid;

    @NameInMap("userdefined-id")
    private String userdefinedId;

    private Machine(Builder builder) {
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
        private String ip; 
        private Long lastHeartbeatTime; 
        private String machineUniqueid; 
        private String userdefinedId; 

        /**
         * 机器 ip 地址。
         */
        public Builder ip(String ip) {
            this.ip = ip;
            return this;
        }

        /**
         * 最后一次心跳时间。Unix时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
         */
        public Builder lastHeartbeatTime(Long lastHeartbeatTime) {
            this.lastHeartbeatTime = lastHeartbeatTime;
            return this;
        }

        /**
         * 机器的唯一标识。
         */
        public Builder machineUniqueid(String machineUniqueid) {
            this.machineUniqueid = machineUniqueid;
            return this;
        }

        /**
         * 机器的用户自定义标识。
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
