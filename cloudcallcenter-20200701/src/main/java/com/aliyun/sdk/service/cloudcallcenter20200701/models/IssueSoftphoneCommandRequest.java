// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IssueSoftphoneCommandRequest} extends {@link RequestModel}
 *
 * <p>IssueSoftphoneCommandRequest</p>
 */
public class IssueSoftphoneCommandRequest extends Request {
    @Query
    @NameInMap("Data")
    @Validation(required = true)
    private String data;

    private IssueSoftphoneCommandRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IssueSoftphoneCommandRequest create() {
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

    public static final class Builder extends Request.Builder<IssueSoftphoneCommandRequest, Builder> {
        private String data; 

        private Builder() {
            super();
        } 

        private Builder(IssueSoftphoneCommandRequest request) {
            super(request);
            this.data = request.data;
        } 

        /**
         * Data.
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        @Override
        public IssueSoftphoneCommandRequest build() {
            return new IssueSoftphoneCommandRequest(this);
        } 

    } 

}
