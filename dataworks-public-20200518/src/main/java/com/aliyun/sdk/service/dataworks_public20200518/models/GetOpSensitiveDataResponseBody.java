// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpSensitiveDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetOpSensitiveDataResponseBody</p>
 */
public class GetOpSensitiveDataResponseBody extends TeaModel {
    @NameInMap("OpSensitiveData")
    private String opSensitiveData;

    @NameInMap("RequestId")
    private String requestId;

    private GetOpSensitiveDataResponseBody(Builder builder) {
        this.opSensitiveData = builder.opSensitiveData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpSensitiveDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return opSensitiveData
     */
    public String getOpSensitiveData() {
        return this.opSensitiveData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String opSensitiveData; 
        private String requestId; 

        /**
         * OpSensitiveData.
         */
        public Builder opSensitiveData(String opSensitiveData) {
            this.opSensitiveData = opSensitiveData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOpSensitiveDataResponseBody build() {
            return new GetOpSensitiveDataResponseBody(this);
        } 

    } 

}
