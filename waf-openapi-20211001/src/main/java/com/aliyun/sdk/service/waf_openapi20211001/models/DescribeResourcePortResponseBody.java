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
 * {@link DescribeResourcePortResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourcePortResponseBody</p>
 */
public class DescribeResourcePortResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourcePorts")
    private java.util.List<String> resourcePorts;

    private DescribeResourcePortResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourcePorts = builder.resourcePorts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourcePortResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourcePorts
     */
    public java.util.List<String> getResourcePorts() {
        return this.resourcePorts;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> resourcePorts; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>66A98669-CC6E-4F3E-80A6-3014697B11AE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array of HTTP and HTTPS listener ports that are added to the WAF instance.</p>
         */
        public Builder resourcePorts(java.util.List<String> resourcePorts) {
            this.resourcePorts = resourcePorts;
            return this;
        }

        public DescribeResourcePortResponseBody build() {
            return new DescribeResourcePortResponseBody(this);
        } 

    } 

}
