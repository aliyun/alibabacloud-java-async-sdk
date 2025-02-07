// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link SetCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>SetCertificateResponseBody</p>
 */
public class SetCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetCertificateResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCertificateResponseBody create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String id; 
        private String requestId; 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A666D44F-19D6-490E-97CF-1A64AB962C57</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetCertificateResponseBody build() {
            return new SetCertificateResponseBody(this);
        } 

    } 

}
