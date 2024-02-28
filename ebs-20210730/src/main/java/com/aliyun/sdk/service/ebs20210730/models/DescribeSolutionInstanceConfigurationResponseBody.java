// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSolutionInstanceConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSolutionInstanceConfigurationResponseBody</p>
 */
public class DescribeSolutionInstanceConfigurationResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < java.util.Map<String, ?>> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeSolutionInstanceConfigurationResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSolutionInstanceConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < java.util.Map<String, ?>> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < java.util.Map<String, ?>> data; 
        private String requestId; 

        /**
         * The returned data.
         */
        public Builder data(java.util.List < java.util.Map<String, ?>> data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSolutionInstanceConfigurationResponseBody build() {
            return new DescribeSolutionInstanceConfigurationResponseBody(this);
        } 

    } 

}
