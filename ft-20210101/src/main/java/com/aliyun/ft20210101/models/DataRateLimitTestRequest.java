// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    public static final class Builder extends Request.Builder<Builder> {

        public DataRateLimitTestRequest build() {
            return new DataRateLimitTestRequest(this);
        } 

    } 

}
