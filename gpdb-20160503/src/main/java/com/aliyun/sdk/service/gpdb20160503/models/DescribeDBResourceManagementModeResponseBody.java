// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
     * @return resourceManagementMode
     */
    public String getResourceManagementMode() {
        return this.resourceManagementMode;
    }

    public static final class Builder {
        private String requestId; 
        private String resourceManagementMode; 

        private Builder() {
        } 

        private Builder(DescribeDBResourceManagementModeResponseBody model) {
            this.requestId = model.requestId;
            this.resourceManagementMode = model.resourceManagementMode;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource management mode. Valid values:</p>
         * <ul>
         * <li>resourceGroup: resource group management.</li>
         * <li>resourceQueue: resource queue management.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>resourceGroup</p>
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
