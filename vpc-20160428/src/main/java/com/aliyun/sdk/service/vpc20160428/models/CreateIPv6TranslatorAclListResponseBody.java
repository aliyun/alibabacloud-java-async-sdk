// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIPv6TranslatorAclListResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIPv6TranslatorAclListResponseBody</p>
 */
public class CreateIPv6TranslatorAclListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclId")
    private String aclId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateIPv6TranslatorAclListResponseBody(Builder builder) {
        this.aclId = builder.aclId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIPv6TranslatorAclListResponseBody create() {
        return builder().build();
    }

    /**
     * @return aclId
     */
    public String getAclId() {
        return this.aclId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String aclId; 
        private String requestId; 

        /**
         * The ACL ID.
         */
        public Builder aclId(String aclId) {
            this.aclId = aclId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIPv6TranslatorAclListResponseBody build() {
            return new CreateIPv6TranslatorAclListResponseBody(this);
        } 

    } 

}
