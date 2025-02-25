// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CollectorKibanaInstance} extends {@link TeaModel}
 *
 * <p>CollectorKibanaInstance</p>
 */
public class CollectorKibanaInstance extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("configType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configType;

    @com.aliyun.core.annotation.NameInMap("host")
    @com.aliyun.core.annotation.Validation(required = true)
    private String host;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("kibanaHost")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kibanaHost;

    @com.aliyun.core.annotation.NameInMap("password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.NameInMap("protocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("userName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>collectorElasticsearchForKibana</p>
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-*****-kibana.internal.elasticsearch.aliyuncs.com:5601</p>
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-45dfy****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://es-cn-****.kibana.elasticsearch.aliyuncs.com:5601">https://es-cn-****.kibana.elasticsearch.aliyuncs.com:5601</a></p>
         */
        public Builder kibanaHost(String kibanaHost) {
            this.kibanaHost = kibanaHost;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
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
