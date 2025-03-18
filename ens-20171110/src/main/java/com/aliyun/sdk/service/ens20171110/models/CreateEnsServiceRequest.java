// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateEnsServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateEnsServiceRequest</p>
 */
public class CreateEnsServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ensServiceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the resource that you want to obtain. You can specify only one ID in a request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ens-20190806****</p>
         */
        public Builder ensServiceId(String ensServiceId) {
            this.putQueryParameter("EnsServiceId", ensServiceId);
            this.ensServiceId = ensServiceId;
            return this;
        }

        /**
         * <p>The operation to perform after you preview the created edge service. Valid values:</p>
         * <ul>
         * <li><strong>Buy</strong>: create</li>
         * <li><strong>Upgrade</strong>: change</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Buy</p>
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
