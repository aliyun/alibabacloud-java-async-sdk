// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link UpdateRabbitmqPublisherAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateRabbitmqPublisherAttributeRequest</p>
 */
public class UpdateRabbitmqPublisherAttributeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("publisherId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String publisherId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("exchangeName")
    private String exchangeName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("exchangeType")
    private String exchangeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private UpdateRabbitmqPublisherAttributeRequest(Builder builder) {
        super(builder);
        this.publisherId = builder.publisherId;
        this.description = builder.description;
        this.exchangeName = builder.exchangeName;
        this.exchangeType = builder.exchangeType;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRabbitmqPublisherAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return publisherId
     */
    public String getPublisherId() {
        return this.publisherId;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateRabbitmqPublisherAttributeRequest, Builder> {
        private String publisherId; 
        private String description; 
        private String exchangeName; 
        private String exchangeType; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRabbitmqPublisherAttributeRequest request) {
            super(request);
            this.publisherId = request.publisherId;
            this.description = request.description;
            this.exchangeName = request.exchangeName;
            this.exchangeType = request.exchangeType;
            this.name = request.name;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mqp-3b6cb9fa4751afff780436bcefbf1</p>
         */
        public Builder publisherId(String publisherId) {
            this.putPathParameter("publisherId", publisherId);
            this.publisherId = publisherId;
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
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateRabbitmqPublisherAttributeRequest build() {
            return new UpdateRabbitmqPublisherAttributeRequest(this);
        } 

    } 

}
