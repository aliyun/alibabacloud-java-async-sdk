// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStorageAnalysisResponseBody} extends {@link TeaModel}
 *
 * <p>GetStorageAnalysisResponseBody</p>
 */
public class GetStorageAnalysisResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    private GetStorageAnalysisResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStorageAnalysisResponseBody create() {
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

        public GetStorageAnalysisResponseBody build() {
            return new GetStorageAnalysisResponseBody(this);
        } 

    } 

}
