// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadCsrResponseBody} extends {@link TeaModel}
 *
 * <p>UploadCsrResponseBody</p>
 */
public class UploadCsrResponseBody extends TeaModel {
    @NameInMap("CsrId")
    private Long csrId;

    @NameInMap("RequestId")
    private String requestId;

    private UploadCsrResponseBody(Builder builder) {
        this.csrId = builder.csrId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadCsrResponseBody create() {
        return builder().build();
    }

    /**
     * @return csrId
     */
    public Long getCsrId() {
        return this.csrId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long csrId; 
        private String requestId; 

        /**
         * CSR ID。
         */
        public Builder csrId(Long csrId) {
            this.csrId = csrId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UploadCsrResponseBody build() {
            return new UploadCsrResponseBody(this);
        } 

    } 

}
