// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyDcdnDomainOwnerResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyDcdnDomainOwnerResponseBody</p>
 */
public class VerifyDcdnDomainOwnerResponseBody extends TeaModel {
    @NameInMap("Content")
    private String content;

    @NameInMap("RequestId")
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
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * RequestId.
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
