// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageSceneLabelListConfResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageSceneLabelListConfResponseBody</p>
 */
public class GetImageSceneLabelListConfResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < ? > data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetImageSceneLabelListConfResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageSceneLabelListConfResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < ? > getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ? > data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < ? > data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetImageSceneLabelListConfResponseBody build() {
            return new GetImageSceneLabelListConfResponseBody(this);
        } 

    } 

}
