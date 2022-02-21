// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddIPv6TranslatorAclListEntryResponseBody} extends {@link TeaModel}
 *
 * <p>AddIPv6TranslatorAclListEntryResponseBody</p>
 */
public class AddIPv6TranslatorAclListEntryResponseBody extends TeaModel {
    @NameInMap("AclEntryId")
    private String aclEntryId;

    @NameInMap("RequestId")
    private String requestId;

    private AddIPv6TranslatorAclListEntryResponseBody(Builder builder) {
        this.aclEntryId = builder.aclEntryId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddIPv6TranslatorAclListEntryResponseBody create() {
        return builder().build();
    }

    /**
     * @return aclEntryId
     */
    public String getAclEntryId() {
        return this.aclEntryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String aclEntryId; 
        private String requestId; 

        /**
         * AclEntryId.
         */
        public Builder aclEntryId(String aclEntryId) {
            this.aclEntryId = aclEntryId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddIPv6TranslatorAclListEntryResponseBody build() {
            return new AddIPv6TranslatorAclListEntryResponseBody(this);
        } 

    } 

}
