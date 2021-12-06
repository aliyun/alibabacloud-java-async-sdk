// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>GetServiceStatusRequest</p>
 */
public class GetServiceStatusRequest extends Request {

    private GetServiceStatusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceStatusRequest create() {
        return builder().build();
    }

    public static final class Builder extends Request.Builder {

        public GetServiceStatusRequest build() {
            return new GetServiceStatusRequest(this);
        } 

    } 

}
