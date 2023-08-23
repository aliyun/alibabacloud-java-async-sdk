// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyDomainOwnerResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyDomainOwnerResponseBody</p>
 */
public class VerifyDomainOwnerResponseBody extends TeaModel {
    @NameInMap("Content")
    private String content;

    @NameInMap("RequestId")
    private String requestId;

    private VerifyDomainOwnerResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyDomainOwnerResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String content; 
        private String requestId; 

        /**
         * The verification result.
         * <p>
         * 
         * > This parameter is returned only if the operation fails.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public VerifyDomainOwnerResponseBody build() {
            return new VerifyDomainOwnerResponseBody(this);
        } 

    } 

}
