// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeResourceTypeAutoEnableResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceTypeAutoEnableResponseBody</p>
 */
public class DescribeResourceTypeAutoEnableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceTypeAutoEnable")
    private java.util.Map<String, Boolean> resourceTypeAutoEnable;

    private DescribeResourceTypeAutoEnableResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceTypeAutoEnable = builder.resourceTypeAutoEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceTypeAutoEnableResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceTypeAutoEnable
     */
    public java.util.Map<String, Boolean> getResourceTypeAutoEnable() {
        return this.resourceTypeAutoEnable;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map<String, Boolean> resourceTypeAutoEnable; 

        private Builder() {
        } 

        private Builder(DescribeResourceTypeAutoEnableResponseBody model) {
            this.requestId = model.requestId;
            this.resourceTypeAutoEnable = model.resourceTypeAutoEnable;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7447795A-39AB-52CB-8F92-128DF******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether default traffic redirection is enabled.</p>
         */
        public Builder resourceTypeAutoEnable(java.util.Map<String, Boolean> resourceTypeAutoEnable) {
            this.resourceTypeAutoEnable = resourceTypeAutoEnable;
            return this;
        }

        public DescribeResourceTypeAutoEnableResponseBody build() {
            return new DescribeResourceTypeAutoEnableResponseBody(this);
        } 

    } 

}
