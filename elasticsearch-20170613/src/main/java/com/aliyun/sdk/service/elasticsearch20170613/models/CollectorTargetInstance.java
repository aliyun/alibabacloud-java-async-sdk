// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link CollectorTargetInstance} extends {@link TeaModel}
 *
 * <p>CollectorTargetInstance</p>
 */
public class CollectorTargetInstance extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("configType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configType;

    @com.aliyun.core.annotation.NameInMap("enableMonitoring")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableMonitoring;

    @com.aliyun.core.annotation.NameInMap("hosts")
    private java.util.List<String> hosts;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("instanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.NameInMap("protocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("userName")
    @com.aliyun.core.annotation.Validation(required = true)
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<String> getHosts() {
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
        private java.util.List<String> hosts; 
        private String instanceId; 
        private String instanceType; 
        private String password; 
        private String protocol; 
        private String userName; 

        private Builder() {
        } 

        private Builder(CollectorTargetInstance model) {
            this.configType = model.configType;
            this.enableMonitoring = model.enableMonitoring;
            this.hosts = model.hosts;
            this.instanceId = model.instanceId;
            this.instanceType = model.instanceType;
            this.password = model.password;
            this.protocol = model.protocol;
            this.userName = model.userName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>collectorTargetInstance</p>
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableMonitoring(Boolean enableMonitoring) {
            this.enableMonitoring = enableMonitoring;
            return this;
        }

        /**
         * hosts.
         */
        public Builder hosts(java.util.List<String> hosts) {
            this.hosts = hosts;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-ks8x****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
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

        public CollectorTargetInstance build() {
            return new CollectorTargetInstance(this);
        } 

    } 

}
