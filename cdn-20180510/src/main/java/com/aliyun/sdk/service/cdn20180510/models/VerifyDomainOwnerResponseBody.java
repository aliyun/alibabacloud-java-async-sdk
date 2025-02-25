// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link VerifyDomainOwnerResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyDomainOwnerResponseBody</p>
 */
public class VerifyDomainOwnerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The verification result.</p>
         * <blockquote>
         * <p>This parameter is returned only if the operation fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>verify_dffeb6610035dcb77b413a59c32c****</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>34AB41F1-04A5-496F-8C8D-634BDBE6A9FB</p>
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
