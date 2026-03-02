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
 * {@link PdpHistoryConfig} extends {@link TeaModel}
 *
 * <p>PdpHistoryConfig</p>
 */
public class PdpHistoryConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("accountName")
    private String accountName;

    @com.aliyun.core.annotation.NameInMap("askId")
    private String askId;

    @com.aliyun.core.annotation.NameInMap("configId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long configId;

    @com.aliyun.core.annotation.NameInMap("context")
    private String context;

    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.NameInMap("env")
    private String env;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("pbcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pbcId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("serviceGroupId")
    private Long serviceGroupId;

    @com.aliyun.core.annotation.NameInMap("serviceId")
    private Long serviceId;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private PdpHistoryConfig(Builder builder) {
        this.accountId = builder.accountId;
        this.accountName = builder.accountName;
        this.askId = builder.askId;
        this.configId = builder.configId;
        this.context = builder.context;
        this.enterpriseId = builder.enterpriseId;
        this.env = builder.env;
        this.gmtCreate = builder.gmtCreate;
        this.id = builder.id;
        this.name = builder.name;
        this.pbcId = builder.pbcId;
        this.requestId = builder.requestId;
        this.serviceGroupId = builder.serviceGroupId;
        this.serviceId = builder.serviceId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpHistoryConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return askId
     */
    public String getAskId() {
        return this.askId;
    }

    /**
     * @return configId
     */
    public Long getConfigId() {
        return this.configId;
    }

    /**
     * @return context
     */
    public String getContext() {
        return this.context;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pbcId
     */
    public Long getPbcId() {
        return this.pbcId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceGroupId
     */
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    /**
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String accountId; 
        private String accountName; 
        private String askId; 
        private Long configId; 
        private String context; 
        private Long enterpriseId; 
        private String env; 
        private String gmtCreate; 
        private Long id; 
        private String name; 
        private Long pbcId; 
        private String requestId; 
        private Long serviceGroupId; 
        private Long serviceId; 
        private String type; 

        private Builder() {
        } 

        private Builder(PdpHistoryConfig model) {
            this.accountId = model.accountId;
            this.accountName = model.accountName;
            this.askId = model.askId;
            this.configId = model.configId;
            this.context = model.context;
            this.enterpriseId = model.enterpriseId;
            this.env = model.env;
            this.gmtCreate = model.gmtCreate;
            this.id = model.id;
            this.name = model.name;
            this.pbcId = model.pbcId;
            this.requestId = model.requestId;
            this.serviceGroupId = model.serviceGroupId;
            this.serviceId = model.serviceId;
            this.type = model.type;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>121321412341</p>
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * accountName.
         */
        public Builder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * askId.
         */
        public Builder askId(String askId) {
            this.askId = askId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder configId(Long configId) {
            this.configId = configId;
            return this;
        }

        /**
         * context.
         */
        public Builder context(String context) {
            this.context = context;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * env.
         */
        public Builder env(String env) {
            this.env = env;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>neuron-developer-spring-config</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pbcId(Long pbcId) {
            this.pbcId = pbcId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * serviceGroupId.
         */
        public Builder serviceGroupId(Long serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
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
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public PdpHistoryConfig build() {
            return new PdpHistoryConfig(this);
        } 

    } 

}
