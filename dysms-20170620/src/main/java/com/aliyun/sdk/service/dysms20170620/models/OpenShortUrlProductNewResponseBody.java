// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link OpenShortUrlProductNewResponseBody} extends {@link TeaModel}
 *
 * <p>OpenShortUrlProductNewResponseBody</p>
 */
public class OpenShortUrlProductNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rusult")
    private Boolean rusult;

    private OpenShortUrlProductNewResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.rusult = builder.rusult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenShortUrlProductNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rusult
     */
    public Boolean getRusult() {
        return this.rusult;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean rusult; 

        private Builder() {
        } 

        private Builder(OpenShortUrlProductNewResponseBody model) {
            this.requestId = model.requestId;
            this.rusult = model.rusult;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Rusult.
         */
        public Builder rusult(Boolean rusult) {
            this.rusult = rusult;
            return this;
        }

        public OpenShortUrlProductNewResponseBody build() {
            return new OpenShortUrlProductNewResponseBody(this);
        } 

    } 

}
