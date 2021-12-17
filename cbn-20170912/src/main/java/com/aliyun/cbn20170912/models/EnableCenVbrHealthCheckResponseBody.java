// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link EnableCenVbrHealthCheckResponseBody} extends {@link TeaModel}
 *
 * <p>EnableCenVbrHealthCheckResponseBody</p>
 */
public class EnableCenVbrHealthCheckResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private EnableCenVbrHealthCheckResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableCenVbrHealthCheckResponseBody create() {
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

        public EnableCenVbrHealthCheckResponseBody build() {
            return new EnableCenVbrHealthCheckResponseBody(this);
        } 

    } 

}
