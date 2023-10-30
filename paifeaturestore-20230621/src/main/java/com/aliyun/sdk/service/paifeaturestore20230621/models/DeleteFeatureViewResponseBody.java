// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFeatureViewResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteFeatureViewResponseBody</p>
 */
public class DeleteFeatureViewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteFeatureViewResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFeatureViewResponseBody create() {
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

        public DeleteFeatureViewResponseBody build() {
            return new DeleteFeatureViewResponseBody(this);
        } 

    } 

}
