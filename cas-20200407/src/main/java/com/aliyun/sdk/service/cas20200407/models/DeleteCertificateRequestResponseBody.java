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
 * {@link DeleteCertificateRequestResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCertificateRequestResponseBody</p>
 */
public class DeleteCertificateRequestResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteCertificateRequestResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCertificateRequestResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>082FAB35-6AB9-4FD5-8750-D36673548E76</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteCertificateRequestResponseBody build() {
            return new DeleteCertificateRequestResponseBody(this);
        } 

    } 

}
