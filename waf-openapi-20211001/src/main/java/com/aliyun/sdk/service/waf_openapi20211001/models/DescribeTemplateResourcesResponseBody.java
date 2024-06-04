// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTemplateResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTemplateResourcesResponseBody</p>
 */
public class DescribeTemplateResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List < String > resources;

    private DescribeTemplateResourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTemplateResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public java.util.List < String > getResources() {
        return this.resources;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > resources; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array of protected objects or protected object groups that are associated to the protection rule template.
         */
        public Builder resources(java.util.List < String > resources) {
            this.resources = resources;
            return this;
        }

        public DescribeTemplateResourcesResponseBody build() {
            return new DescribeTemplateResourcesResponseBody(this);
        } 

    } 

}
