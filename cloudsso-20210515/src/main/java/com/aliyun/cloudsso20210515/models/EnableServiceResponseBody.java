// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link EnableServiceResponseBody} extends {@link TeaModel}
 *
 * <p>EnableServiceResponseBody</p>
 */
public class EnableServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private EnableServiceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableServiceResponseBody build() {
            return new EnableServiceResponseBody(this);
        } 

    } 

}
