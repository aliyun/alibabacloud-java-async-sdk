// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseDdosOriginInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ReleaseDdosOriginInstanceResponseBody</p>
 */
public class ReleaseDdosOriginInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ReleaseDdosOriginInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseDdosOriginInstanceResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReleaseDdosOriginInstanceResponseBody build() {
            return new ReleaseDdosOriginInstanceResponseBody(this);
        } 

    } 

}
