// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link ChangeCdnDomainToDcdnResponseBody} extends {@link TeaModel}
 *
 * <p>ChangeCdnDomainToDcdnResponseBody</p>
 */
public class ChangeCdnDomainToDcdnResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.Map<String, ?> content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ChangeCdnDomainToDcdnResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeCdnDomainToDcdnResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map<String, ?> content; 
        private String requestId; 

        /**
         * <p>The content of the migration instructions.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *         &quot;The_domain_name_quota_for_the_target_account_has_reached_the_upper_limit&quot;: true,
         *         &quot;Domain_name_requires_node2_architecture_to_be_enabled&quot;: true,
         *         &quot;Internal_customer_domain_name_migration_prohibited&quot;: true,
         *         &quot;Prohibit_the_migration_of_important_customer_domain_names&quot;: true,
         *         &quot;Protected_domain_names_are_prohibited_from_migration&quot;: true,
         *         &quot;Domain_names_accessed_through_TopDomain_are_prohibited_from_migration&quot;: true,
         *         &quot;Prohibit_migration_of_customer_domain_names_for_integrated_access&quot;: true
         *     }</p>
         */
        public Builder content(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E6172599-7DA7-5471-9D22-359A4E0C9B94</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ChangeCdnDomainToDcdnResponseBody build() {
            return new ChangeCdnDomainToDcdnResponseBody(this);
        } 

    } 

}
