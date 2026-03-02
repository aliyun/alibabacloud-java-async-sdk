// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link RuntimeToken} extends {@link TeaModel}
 *
 * <p>RuntimeToken</p>
 */
public class RuntimeToken extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("env")
    private String env;

    @com.aliyun.core.annotation.NameInMap("pbcId")
    private Long pbcId;

    @com.aliyun.core.annotation.NameInMap("pbcName")
    private String pbcName;

    @com.aliyun.core.annotation.NameInMap("serviceId")
    private Long serviceId;

    @com.aliyun.core.annotation.NameInMap("serviceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    private RuntimeToken(Builder builder) {
        this.env = builder.env;
        this.pbcId = builder.pbcId;
        this.pbcName = builder.pbcName;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RuntimeToken create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return pbcId
     */
    public Long getPbcId() {
        return this.pbcId;
    }

    /**
     * @return pbcName
     */
    public String getPbcName() {
        return this.pbcName;
    }

    /**
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder {
        private String env; 
        private Long pbcId; 
        private String pbcName; 
        private Long serviceId; 
        private String serviceName; 
        private String token; 

        private Builder() {
        } 

        private Builder(RuntimeToken model) {
            this.env = model.env;
            this.pbcId = model.pbcId;
            this.pbcName = model.pbcName;
            this.serviceId = model.serviceId;
            this.serviceName = model.serviceName;
            this.token = model.token;
        } 

        /**
         * env.
         */
        public Builder env(String env) {
            this.env = env;
            return this;
        }

        /**
         * pbcId.
         */
        public Builder pbcId(Long pbcId) {
            this.pbcId = pbcId;
            return this;
        }

        /**
         * pbcName.
         */
        public Builder pbcName(String pbcName) {
            this.pbcName = pbcName;
            return this;
        }

        /**
         * serviceId.
         */
        public Builder serviceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * serviceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * token.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public RuntimeToken build() {
            return new RuntimeToken(this);
        } 

    } 

}
