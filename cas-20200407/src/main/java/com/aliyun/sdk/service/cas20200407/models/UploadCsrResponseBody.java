// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UploadCsrResponseBody} extends {@link TeaModel}
 *
 * <p>UploadCsrResponseBody</p>
 */
public class UploadCsrResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CsrId")
    private Long csrId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the CSR.</p>
         * 
         * <strong>example:</strong>
         * <p>2271</p>
         */
        public Builder csrId(Long csrId) {
            this.csrId = csrId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
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
