// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnsubscribeBillToOSSRequest} extends {@link RequestModel}
 *
 * <p>UnsubscribeBillToOSSRequest</p>
 */
public class UnsubscribeBillToOSSRequest extends Request {
    @Query
    @NameInMap("MultAccountRelSubscribe")
    private String multAccountRelSubscribe;

    @Query
    @NameInMap("SubscribeType")
    @Validation(required = true)
    private String subscribeType;

    private UnsubscribeBillToOSSRequest(Builder builder) {
        super(builder);
        this.multAccountRelSubscribe = builder.multAccountRelSubscribe;
        this.subscribeType = builder.subscribeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnsubscribeBillToOSSRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return multAccountRelSubscribe
     */
    public String getMultAccountRelSubscribe() {
        return this.multAccountRelSubscribe;
    }

    /**
     * @return subscribeType
     */
    public String getSubscribeType() {
        return this.subscribeType;
    }

    public static final class Builder extends Request.Builder<UnsubscribeBillToOSSRequest, Builder> {
        private String multAccountRelSubscribe; 
        private String subscribeType; 

        private Builder() {
            super();
        } 

        private Builder(UnsubscribeBillToOSSRequest request) {
            super(request);
            this.multAccountRelSubscribe = request.multAccountRelSubscribe;
            this.subscribeType = request.subscribeType;
        } 

        /**
         * MultAccountRelSubscribe.
         */
        public Builder multAccountRelSubscribe(String multAccountRelSubscribe) {
            this.putQueryParameter("MultAccountRelSubscribe", multAccountRelSubscribe);
            this.multAccountRelSubscribe = multAccountRelSubscribe;
            return this;
        }

        /**
         * SubscribeType.
         */
        public Builder subscribeType(String subscribeType) {
            this.putQueryParameter("SubscribeType", subscribeType);
            this.subscribeType = subscribeType;
            return this;
        }

        @Override
        public UnsubscribeBillToOSSRequest build() {
            return new UnsubscribeBillToOSSRequest(this);
        } 

    } 

}
