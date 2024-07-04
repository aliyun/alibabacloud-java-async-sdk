// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRabbitmqPublisherRequest} extends {@link RequestModel}
 *
 * <p>CreateRabbitmqPublisherRequest</p>
 */
public class CreateRabbitmqPublisherRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("exchangeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exchangeName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("exchangeType")
    private String exchangeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hostName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hostName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("port")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long port;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("virtualHost")
    @com.aliyun.core.annotation.Validation(required = true)
    private String virtualHost;

    private CreateRabbitmqPublisherRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.exchangeName = builder.exchangeName;
        this.exchangeType = builder.exchangeType;
        this.hostName = builder.hostName;
        this.name = builder.name;
        this.password = builder.password;
        this.port = builder.port;
        this.userName = builder.userName;
        this.virtualHost = builder.virtualHost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRabbitmqPublisherRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return exchangeName
     */
    public String getExchangeName() {
        return this.exchangeName;
    }

    /**
     * @return exchangeType
     */
    public String getExchangeType() {
        return this.exchangeType;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return port
     */
    public Long getPort() {
        return this.port;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return virtualHost
     */
    public String getVirtualHost() {
        return this.virtualHost;
    }

    public static final class Builder extends Request.Builder<CreateRabbitmqPublisherRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String exchangeName; 
        private String exchangeType; 
        private String hostName; 
        private String name; 
        private String password; 
        private Long port; 
        private String userName; 
        private String virtualHost; 

        private Builder() {
            super();
        } 

        private Builder(CreateRabbitmqPublisherRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.exchangeName = request.exchangeName;
            this.exchangeType = request.exchangeType;
            this.hostName = request.hostName;
            this.name = request.name;
            this.password = request.password;
            this.port = request.port;
            this.userName = request.userName;
            this.virtualHost = request.virtualHost;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * exchangeName.
         */
        public Builder exchangeName(String exchangeName) {
            this.putBodyParameter("exchangeName", exchangeName);
            this.exchangeName = exchangeName;
            return this;
        }

        /**
         * exchangeType.
         */
        public Builder exchangeType(String exchangeType) {
            this.putBodyParameter("exchangeType", exchangeType);
            this.exchangeType = exchangeType;
            return this;
        }

        /**
         * hostName.
         */
        public Builder hostName(String hostName) {
            this.putBodyParameter("hostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * password.
         */
        public Builder password(String password) {
            this.putBodyParameter("password", password);
            this.password = password;
            return this;
        }

        /**
         * port.
         */
        public Builder port(Long port) {
            this.putBodyParameter("port", port);
            this.port = port;
            return this;
        }

        /**
         * userName.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("userName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * virtualHost.
         */
        public Builder virtualHost(String virtualHost) {
            this.putBodyParameter("virtualHost", virtualHost);
            this.virtualHost = virtualHost;
            return this;
        }

        @Override
        public CreateRabbitmqPublisherRequest build() {
            return new CreateRabbitmqPublisherRequest(this);
        } 

    } 

}
