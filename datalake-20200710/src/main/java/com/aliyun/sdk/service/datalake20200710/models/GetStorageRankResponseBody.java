// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStorageRankResponseBody} extends {@link TeaModel}
 *
 * <p>GetStorageRankResponseBody</p>
 */
public class GetStorageRankResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    private GetStorageRankResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStorageRankResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetStorageRankResponseBody build() {
            return new GetStorageRankResponseBody(this);
        } 

    } 

}
