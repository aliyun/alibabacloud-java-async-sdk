// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEnsServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateEnsServiceRequest</p>
 */
public class CreateEnsServiceRequest extends Request {
    @Query
    @NameInMap("EnsServiceId")
    @Validation(required = true)
    private String ensServiceId;

    @Query
    @NameInMap("OrderType")
    @Validation(required = true)
    private String orderType;

    private CreateEnsServiceRequest(Builder builder) {
        super(builder);
        this.ensServiceId = builder.ensServiceId;
        this.orderType = builder.orderType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnsServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ensServiceId
     */
    public String getEnsServiceId() {
        return this.ensServiceId;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    public static final class Builder extends Request.Builder<CreateEnsServiceRequest, Builder> {
        private String ensServiceId; 
        private String orderType; 

        private Builder() {
            super();
        } 

        private Builder(CreateEnsServiceRequest request) {
            super(request);
            this.ensServiceId = request.ensServiceId;
            this.orderType = request.orderType;
        } 

        /**
         * The ID of the resource that you want to obtain. You can specify only one ID in a request.
         */
        public Builder ensServiceId(String ensServiceId) {
            this.putQueryParameter("EnsServiceId", ensServiceId);
            this.ensServiceId = ensServiceId;
            return this;
        }

        /**
         * The operation to perform after you preview the created edge service. Valid values:
         * <p>
         * 
         * *   **Buy**: create
         * *   **Upgrade**: change
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        @Override
        public CreateEnsServiceRequest build() {
            return new CreateEnsServiceRequest(this);
        } 

    } 

}
