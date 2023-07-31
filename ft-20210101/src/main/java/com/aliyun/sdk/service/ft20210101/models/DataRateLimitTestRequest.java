// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataRateLimitTestRequest} extends {@link RequestModel}
 *
 * <p>DataRateLimitTestRequest</p>
 */
public class DataRateLimitTestRequest extends Request {
    @Query
    @NameInMap("Data")
    private String data;

    private DataRateLimitTestRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataRateLimitTestRequest create() {
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

    public static final class Builder extends Request.Builder<DataRateLimitTestRequest, Builder> {
        private String data; 

        private Builder() {
            super();
        } 

        private Builder(DataRateLimitTestRequest request) {
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
        public DataRateLimitTestRequest build() {
            return new DataRateLimitTestRequest(this);
        } 

    } 

}
