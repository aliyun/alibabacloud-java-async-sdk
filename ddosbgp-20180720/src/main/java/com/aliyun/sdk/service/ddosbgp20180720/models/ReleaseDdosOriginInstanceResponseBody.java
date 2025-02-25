// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReleaseDdosOriginInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ReleaseDdosOriginInstanceResponseBody</p>
 */
public class ReleaseDdosOriginInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4B379C2-9319-4C6B-B579-FE36831B09F4</p>
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
