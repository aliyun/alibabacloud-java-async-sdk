// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link EnableServiceRequest} extends {@link RequestModel}
 *
 * <p>EnableServiceRequest</p>
 */
public class EnableServiceRequest extends Request {

    private EnableServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableServiceRequest create() {
        return builder().build();
    }

    public static final class Builder extends Request.Builder {

        public EnableServiceRequest build() {
            return new EnableServiceRequest(this);
        } 

    } 

}
