// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CollectorTargetInstance} extends {@link TeaModel}
 *
 * <p>CollectorTargetInstance</p>
 */
public class CollectorTargetInstance extends TeaModel {
    @NameInMap("configType")
    @Validation(required = true)
    private String configType;

    @NameInMap("enableMonitoring")
    @Validation(required = true)
    private Boolean enableMonitoring;

    @NameInMap("hosts")
    private java.util.List < String > hosts;

    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @NameInMap("instanceType")
    @Validation(required = true)
    private String instanceType;

    @NameInMap("password")
    @Validation(required = true)
    private String password;

    @NameInMap("protocol")
    @Validation(required = true)
    private String protocol;

    @NameInMap("userName")
    @Validation(required = true)
    private String userName;

    private CollectorTargetInstance(Builder builder) {
        this.configType = builder.configType;
        this.enableMonitoring = builder.enableMonitoring;
        this.hosts = builder.hosts;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.password = builder.password;
        this.protocol = builder.protocol;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CollectorTargetInstance create() {
        return builder().build();
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return enableMonitoring
     */
    public Boolean getEnableMonitoring() {
        return this.enableMonitoring;
    }

    /**
     * @return hosts
     */
    public java.util.List < String > getHosts() {
        return this.hosts;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder {
        private String configType; 
        private Boolean enableMonitoring; 
        private java.util.List < String > hosts; 
        private String instanceId; 
        private String instanceType; 
        private String password; 
        private String protocol; 
        private String userName; 

        /**
         * 当前配置类型。固定值：collectorTargetInstance
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * 采集器是否启用Monitoring
         */
        public Builder enableMonitoring(Boolean enableMonitoring) {
            this.enableMonitoring = enableMonitoring;
            return this;
        }

        /**
         * output实例地址
         */
        public Builder hosts(java.util.List < String > hosts) {
            this.hosts = hosts;
            return this;
        }

        /**
         * output实例Id
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 实例类型
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * output实例密码
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * 传输协议
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * output实例用户名
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public CollectorTargetInstance build() {
            return new CollectorTargetInstance(this);
        } 

    } 

}
