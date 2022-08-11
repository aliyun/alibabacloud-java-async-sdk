// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSensitiveDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetSensitiveDataResponseBody</p>
 */
public class GetSensitiveDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SensitiveData")
    private java.util.Map < String, ? > sensitiveData;

    private GetSensitiveDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sensitiveData = builder.sensitiveData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSensitiveDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sensitiveData
     */
    public java.util.Map < String, ? > getSensitiveData() {
        return this.sensitiveData;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map < String, ? > sensitiveData; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SensitiveData.
         */
        public Builder sensitiveData(java.util.Map < String, ? > sensitiveData) {
            this.sensitiveData = sensitiveData;
            return this;
        }

        public GetSensitiveDataResponseBody build() {
            return new GetSensitiveDataResponseBody(this);
        } 

    } 

}
