// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link UpdateGatewayAuthConsumerStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayAuthConsumerStatusRequest</p>
 */
public class UpdateGatewayAuthConsumerStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean consumerStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    private UpdateGatewayAuthConsumerStatusRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.consumerStatus = builder.consumerStatus;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayAuthConsumerStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return consumerStatus
     */
    public Boolean getConsumerStatus() {
        return this.consumerStatus;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayAuthConsumerStatusRequest, Builder> {
        private String acceptLanguage; 
        private Boolean consumerStatus; 
        private String gatewayUniqueId; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayAuthConsumerStatusRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.consumerStatus = request.consumerStatus;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.id = request.id;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The status of the consumer. Valid values:</p>
         * <ul>
         * <li>true: The consumer is enabled.</li>
         * <li>false: The consumer is disabled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder consumerStatus(Boolean consumerStatus) {
            this.putQueryParameter("ConsumerStatus", consumerStatus);
            this.consumerStatus = consumerStatus;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-685f661467b54f48b7b7a76605ce****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The consumer ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public UpdateGatewayAuthConsumerStatusRequest build() {
            return new UpdateGatewayAuthConsumerStatusRequest(this);
        } 

    } 

}
