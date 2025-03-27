// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link ModifyCloudResourceResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCloudResourceResponseBody</p>
 */
public class ModifyCloudResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudResource")
    private String cloudResource;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyCloudResourceResponseBody(Builder builder) {
        this.cloudResource = builder.cloudResource;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCloudResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudResource
     */
    public String getCloudResource() {
        return this.cloudResource;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String cloudResource; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyCloudResourceResponseBody model) {
            this.cloudResource = model.cloudResource;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the resource that is added to WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-xxx-80-clb7</p>
         */
        public Builder cloudResource(String cloudResource) {
            this.cloudResource = cloudResource;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyCloudResourceResponseBody build() {
            return new ModifyCloudResourceResponseBody(this);
        } 

    } 

}
