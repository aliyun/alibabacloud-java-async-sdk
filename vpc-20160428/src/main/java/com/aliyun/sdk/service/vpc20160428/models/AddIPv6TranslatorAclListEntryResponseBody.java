// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link AddIPv6TranslatorAclListEntryResponseBody} extends {@link TeaModel}
 *
 * <p>AddIPv6TranslatorAclListEntryResponseBody</p>
 */
public class AddIPv6TranslatorAclListEntryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclEntryId")
    private String aclEntryId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the ACL entry.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv6transaclentry-bp105jrs****</p>
         */
        public Builder aclEntryId(String aclEntryId) {
            this.aclEntryId = aclEntryId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8B2F5262-6B57-43F2-defr345</p>
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
