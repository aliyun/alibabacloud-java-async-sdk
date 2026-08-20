// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HttpApiPolicyReference} extends {@link TeaModel}
 *
 * <p>HttpApiPolicyReference</p>
 */
public class HttpApiPolicyReference extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("policyAttachmentId")
    private String policyAttachmentId;

    @com.aliyun.core.annotation.NameInMap("policyId")
    private String policyId;

    private HttpApiPolicyReference(Builder builder) {
        this.policyAttachmentId = builder.policyAttachmentId;
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiPolicyReference create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyAttachmentId
     */
    public String getPolicyAttachmentId() {
        return this.policyAttachmentId;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    public static final class Builder {
        private String policyAttachmentId; 
        private String policyId; 

        private Builder() {
        } 

        private Builder(HttpApiPolicyReference model) {
            this.policyAttachmentId = model.policyAttachmentId;
            this.policyId = model.policyId;
        } 

        /**
         * <p>策略挂载ID</p>
         */
        public Builder policyAttachmentId(String policyAttachmentId) {
            this.policyAttachmentId = policyAttachmentId;
            return this;
        }

        /**
         * <p>策略ID</p>
         */
        public Builder policyId(String policyId) {
            this.policyId = policyId;
            return this;
        }

        public HttpApiPolicyReference build() {
            return new HttpApiPolicyReference(this);
        } 

    } 

}
