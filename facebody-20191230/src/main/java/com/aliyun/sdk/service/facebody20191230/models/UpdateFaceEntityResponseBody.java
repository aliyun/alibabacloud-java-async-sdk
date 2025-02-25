// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFaceEntityResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateFaceEntityResponseBody</p>
 */
public class UpdateFaceEntityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateFaceEntityResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFaceEntityResponseBody create() {
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

        public UpdateFaceEntityResponseBody build() {
            return new UpdateFaceEntityResponseBody(this);
        } 

    } 

}
