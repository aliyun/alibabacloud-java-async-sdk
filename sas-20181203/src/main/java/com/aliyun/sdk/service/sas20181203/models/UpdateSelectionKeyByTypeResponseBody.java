// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSelectionKeyByTypeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSelectionKeyByTypeResponseBody</p>
 */
public class UpdateSelectionKeyByTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateSelectionKeyByTypeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSelectionKeyByTypeResponseBody create() {
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

        public UpdateSelectionKeyByTypeResponseBody build() {
            return new UpdateSelectionKeyByTypeResponseBody(this);
        } 

    } 

}
