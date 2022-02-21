// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AiccsEchoRequest} extends {@link RequestModel}
 *
 * <p>AiccsEchoRequest</p>
 */
public class AiccsEchoRequest extends Request {
    @Query
    @NameInMap("Data")
    private String data;

    private AiccsEchoRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiccsEchoRequest create() {
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

    public static final class Builder extends Request.Builder<AiccsEchoRequest, Builder> {
        private String data; 

        private Builder() {
            super();
        } 

        private Builder(AiccsEchoRequest response) {
            super(response);
            this.data = response.data;
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
        public AiccsEchoRequest build() {
            return new AiccsEchoRequest(this);
        } 

    } 

}
