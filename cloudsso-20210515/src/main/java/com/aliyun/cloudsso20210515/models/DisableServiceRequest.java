// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DisableServiceRequest} extends {@link RequestModel}
 *
 * <p>DisableServiceRequest</p>
 */
public class DisableServiceRequest extends Request {

    private DisableServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableServiceRequest create() {
        return builder().build();
    }

    public static final class Builder extends Request.Builder {

        public DisableServiceRequest build() {
            return new DisableServiceRequest(this);
        } 

    } 

}
