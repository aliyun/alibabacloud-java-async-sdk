// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

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
    private DataRateLimitTestRequest(Builder builder) {
        super(builder);
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

    public static final class Builder extends Request.Builder<DataRateLimitTestRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DataRateLimitTestRequest response) {
            super(response);
        } 

        @Override
        public DataRateLimitTestRequest build() {
            return new DataRateLimitTestRequest(this);
        } 

    } 

}
