// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBResourceManagementModeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBResourceManagementModeResponseBody</p>
 */
public class DescribeDBResourceManagementModeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceManagementMode")
    private String resourceManagementMode;

    private DescribeDBResourceManagementModeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceManagementMode = builder.resourceManagementMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBResourceManagementModeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceManagementMode
     */
    public String getResourceManagementMode() {
        return this.resourceManagementMode;
    }

    public static final class Builder {
        private String requestId; 
        private String resourceManagementMode; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The resource management mode. Valid values:
         * <p>
         * 
         * *   resourceGroup: resource group management.
         * *   resourceQueue: resource queue management.
         */
        public Builder resourceManagementMode(String resourceManagementMode) {
            this.resourceManagementMode = resourceManagementMode;
            return this;
        }

        public DescribeDBResourceManagementModeResponseBody build() {
            return new DescribeDBResourceManagementModeResponseBody(this);
        } 

    } 

}
