// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestPayDemandRequest} extends {@link RequestModel}
 *
 * <p>RequestPayDemandRequest</p>
 */
public class RequestPayDemandRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Message")
    private String message;

    @Query
    @NameInMap("Price")
    @Validation(required = true)
    private Float price;

    @Query
    @NameInMap("ProduceType")
    private Integer produceType;

    private RequestPayDemandRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.domainName = builder.domainName;
        this.message = builder.message;
        this.price = builder.price;
        this.produceType = builder.produceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestPayDemandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return price
     */
    public Float getPrice() {
        return this.price;
    }

    /**
     * @return produceType
     */
    public Integer getProduceType() {
        return this.produceType;
    }

    public static final class Builder extends Request.Builder<RequestPayDemandRequest, Builder> {
        private String bizId; 
        private String domainName; 
        private String message; 
        private Float price; 
        private Integer produceType; 

        private Builder() {
            super();
        } 

        private Builder(RequestPayDemandRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.domainName = request.domainName;
            this.message = request.message;
            this.price = request.price;
            this.produceType = request.produceType;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * Price.
         */
        public Builder price(Float price) {
            this.putQueryParameter("Price", price);
            this.price = price;
            return this;
        }

        /**
         * ProduceType.
         */
        public Builder produceType(Integer produceType) {
            this.putQueryParameter("ProduceType", produceType);
            this.produceType = produceType;
            return this;
        }

        @Override
        public RequestPayDemandRequest build() {
            return new RequestPayDemandRequest(this);
        } 

    } 

}
