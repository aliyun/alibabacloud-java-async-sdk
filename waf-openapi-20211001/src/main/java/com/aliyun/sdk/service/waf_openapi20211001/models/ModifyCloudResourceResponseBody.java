// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * CloudResource.
         */
        public Builder cloudResource(String cloudResource) {
            this.cloudResource = cloudResource;
            return this;
        }

        /**
         * RequestId.
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
