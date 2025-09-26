// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link Gateway} extends {@link TeaModel}
 *
 * <p>Gateway</p>
 */
public class Gateway extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("internetUrl")
    private String internetUrl;

    @com.aliyun.core.annotation.NameInMap("intranetUrl")
    private String intranetUrl;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    private Gateway(Builder builder) {
        this.createdAt = builder.createdAt;
        this.gatewayId = builder.gatewayId;
        this.internetUrl = builder.internetUrl;
        this.intranetUrl = builder.intranetUrl;
        this.name = builder.name;
        this.status = builder.status;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Gateway create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return internetUrl
     */
    public String getInternetUrl() {
        return this.internetUrl;
    }

    /**
     * @return intranetUrl
     */
    public String getIntranetUrl() {
        return this.intranetUrl;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String createdAt; 
        private String gatewayId; 
        private String internetUrl; 
        private String intranetUrl; 
        private String name; 
        private String status; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(Gateway model) {
            this.createdAt = model.createdAt;
            this.gatewayId = model.gatewayId;
            this.internetUrl = model.internetUrl;
            this.intranetUrl = model.intranetUrl;
            this.name = model.name;
            this.status = model.status;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * internetUrl.
         */
        public Builder internetUrl(String internetUrl) {
            this.internetUrl = internetUrl;
            return this;
        }

        /**
         * intranetUrl.
         */
        public Builder intranetUrl(String intranetUrl) {
            this.intranetUrl = intranetUrl;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Gateway build() {
            return new Gateway(this);
        } 

    } 

}
