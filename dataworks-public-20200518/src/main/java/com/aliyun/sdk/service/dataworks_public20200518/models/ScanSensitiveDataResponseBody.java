// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScanSensitiveDataResponseBody} extends {@link TeaModel}
 *
 * <p>ScanSensitiveDataResponseBody</p>
 */
public class ScanSensitiveDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Sensitives")
    private java.util.Map < String, ? > sensitives;

    private ScanSensitiveDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sensitives = builder.sensitives;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScanSensitiveDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sensitives
     */
    public java.util.Map < String, ? > getSensitives() {
        return this.sensitives;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map < String, ? > sensitives; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Sensitives.
         */
        public Builder sensitives(java.util.Map < String, ? > sensitives) {
            this.sensitives = sensitives;
            return this;
        }

        public ScanSensitiveDataResponseBody build() {
            return new ScanSensitiveDataResponseBody(this);
        } 

    } 

}
