// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudResourceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCloudResourceResponseBody</p>
 */
public class CreateCloudResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudResourceId")
    private String cloudResourceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCloudResourceResponseBody(Builder builder) {
        this.cloudResourceId = builder.cloudResourceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return cloudResourceId
     */
    public String getCloudResourceId() {
        return this.cloudResourceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String cloudResourceId; 
        private String requestId; 

        /**
         * CloudResourceId.
         */
        public Builder cloudResourceId(String cloudResourceId) {
            this.cloudResourceId = cloudResourceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCloudResourceResponseBody build() {
            return new CreateCloudResourceResponseBody(this);
        } 

    } 

}
