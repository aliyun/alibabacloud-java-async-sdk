// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CollectorKibanaInstance} extends {@link TeaModel}
 *
 * <p>CollectorKibanaInstance</p>
 */
public class CollectorKibanaInstance extends TeaModel {
    @NameInMap("configType")
    @Validation(required = true)
    private String configType;

    @NameInMap("host")
    @Validation(required = true)
    private String host;

    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @NameInMap("kibanaHost")
    @Validation(required = true)
    private String kibanaHost;

    @NameInMap("password")
    @Validation(required = true)
    private String password;

    @NameInMap("protocol")
    @Validation(required = true)
    private String protocol;

    @NameInMap("userName")
    @Validation(required = true)
    private String userName;

    private CollectorKibanaInstance(Builder builder) {
        this.configType = builder.configType;
        this.host = builder.host;
        this.instanceId = builder.instanceId;
        this.kibanaHost = builder.kibanaHost;
        this.password = builder.password;
        this.protocol = builder.protocol;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CollectorKibanaInstance create() {
        return builder().build();
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return kibanaHost
     */
    public String getKibanaHost() {
        return this.kibanaHost;
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
        private String host; 
        private String instanceId; 
        private String kibanaHost; 
        private String password; 
        private String protocol; 
        private String userName; 

        /**
         * 采集器Output配置类型，固定值：collectorElasticsearchForKibana
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * kibana对应的es实例地址
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * 采集器Output实例Id
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * kibana地址
         */
        public Builder kibanaHost(String kibanaHost) {
            this.kibanaHost = kibanaHost;
            return this;
        }

        /**
         * kibana密码
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
         * kibana用户名
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public CollectorKibanaInstance build() {
            return new CollectorKibanaInstance(this);
        } 

    } 

}
