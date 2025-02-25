// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20160816.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EdasRefundRequest} extends {@link RequestModel}
 *
 * <p>EdasRefundRequest</p>
 */
public class EdasRefundRequest extends Request {
    @Query
    @NameInMap("data")
    @Validation(required = true)
    private String data;

    private EdasRefundRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EdasRefundRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    public static final class Builder extends Request.Builder<EdasRefundRequest, Builder> {
        private String data; 

        private Builder() {
            super();
        } 

        private Builder(EdasRefundRequest request) {
            super(request);
            this.data = request.data;
        } 

        /**
         * data.
         */
        public Builder data(String data) {
            this.putQueryParameter("data", data);
            this.data = data;
            return this;
        }

        @Override
        public EdasRefundRequest build() {
            return new EdasRefundRequest(this);
        } 

    } 

}
