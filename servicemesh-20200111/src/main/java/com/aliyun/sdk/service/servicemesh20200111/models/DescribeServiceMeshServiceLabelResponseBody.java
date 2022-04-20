// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshServiceLabelResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshServiceLabelResponseBody</p>
 */
public class DescribeServiceMeshServiceLabelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceLabels")
    private java.util.Map < String, ServiceLabelsValue > serviceLabels;

    private DescribeServiceMeshServiceLabelResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceLabels = builder.serviceLabels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshServiceLabelResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceLabels
     */
    public java.util.Map < String, ServiceLabelsValue > getServiceLabels() {
        return this.serviceLabels;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map < String, ServiceLabelsValue > serviceLabels; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceLabels.
         */
        public Builder serviceLabels(java.util.Map < String, ServiceLabelsValue > serviceLabels) {
            this.serviceLabels = serviceLabels;
            return this;
        }

        public DescribeServiceMeshServiceLabelResponseBody build() {
            return new DescribeServiceMeshServiceLabelResponseBody(this);
        } 

    } 

}
