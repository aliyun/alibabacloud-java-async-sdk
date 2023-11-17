// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComponentAssetFormResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeComponentAssetFormResponseBody</p>
 */
public class DescribeComponentAssetFormResponseBody extends TeaModel {
    @NameInMap("ComponentAssetForm")
    private String componentAssetForm;

    @NameInMap("RequestId")
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
         * ComponentAssetForm.
         */
        public Builder componentAssetForm(String componentAssetForm) {
            this.componentAssetForm = componentAssetForm;
            return this;
        }

        /**
         * RequestId.
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
