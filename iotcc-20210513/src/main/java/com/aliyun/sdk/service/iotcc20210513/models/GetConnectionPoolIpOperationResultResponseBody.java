// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConnectionPoolIpOperationResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetConnectionPoolIpOperationResultResponseBody</p>
 */
public class GetConnectionPoolIpOperationResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultFilePaths")
    private java.util.List < String > resultFilePaths;

    private GetConnectionPoolIpOperationResultResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultFilePaths = builder.resultFilePaths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConnectionPoolIpOperationResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultFilePaths
     */
    public java.util.List < String > getResultFilePaths() {
        return this.resultFilePaths;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > resultFilePaths; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * OssPath
         */
        public Builder resultFilePaths(java.util.List < String > resultFilePaths) {
            this.resultFilePaths = resultFilePaths;
            return this;
        }

        public GetConnectionPoolIpOperationResultResponseBody build() {
            return new GetConnectionPoolIpOperationResultResponseBody(this);
        } 

    } 

}
