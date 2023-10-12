// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResourceInformationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateResourceInformationResponseBody</p>
 */
public class UpdateResourceInformationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateResourceInformationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceInformationResponseBody create() {
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

        public UpdateResourceInformationResponseBody build() {
            return new UpdateResourceInformationResponseBody(this);
        } 

    } 

}
