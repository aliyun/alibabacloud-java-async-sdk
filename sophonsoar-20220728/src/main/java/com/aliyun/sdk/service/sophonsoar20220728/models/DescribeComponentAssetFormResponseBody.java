// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComponentAssetFormResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeComponentAssetFormResponseBody</p>
 */
public class DescribeComponentAssetFormResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ComponentAssetForm")
    private String componentAssetForm;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeComponentAssetFormResponseBody(Builder builder) {
        this.componentAssetForm = builder.componentAssetForm;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComponentAssetFormResponseBody create() {
        return builder().build();
    }

    /**
     * @return componentAssetForm
     */
    public String getComponentAssetForm() {
        return this.componentAssetForm;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String componentAssetForm; 
        private String requestId; 

        /**
         * The metadata of the asset in the component. The value is a JSON array and contains the following fields:
         * <p>
         * 
         * *   **name**: the parameter name.
         * *   **defaultValue**: the default parameter value.
         * *   **description**: the parameter description.
         * *   **required**: indicates whether the parameter is required. Valid values: **true** and **false**.
         */
        public Builder componentAssetForm(String componentAssetForm) {
            this.componentAssetForm = componentAssetForm;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeComponentAssetFormResponseBody build() {
            return new DescribeComponentAssetFormResponseBody(this);
        } 

    } 

}
