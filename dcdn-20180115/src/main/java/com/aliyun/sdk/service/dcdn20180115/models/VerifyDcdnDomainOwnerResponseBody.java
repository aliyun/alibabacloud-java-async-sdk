// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link VerifyDcdnDomainOwnerResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyDcdnDomainOwnerResponseBody</p>
 */
public class VerifyDcdnDomainOwnerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private VerifyDcdnDomainOwnerResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyDcdnDomainOwnerResponseBody create() {
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
         * 
         * <strong>example:</strong>
         * <p>verify_dffeb6610035dcb77b413a59c32cd9**</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>34AB41F1-04A5-496F-8C8D-634BDBE6A9FB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public VerifyDcdnDomainOwnerResponseBody build() {
            return new VerifyDcdnDomainOwnerResponseBody(this);
        } 

    } 

}
