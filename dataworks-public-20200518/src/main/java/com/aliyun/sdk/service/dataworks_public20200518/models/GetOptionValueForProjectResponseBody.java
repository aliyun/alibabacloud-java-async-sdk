// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetOptionValueForProjectResponseBody} extends {@link TeaModel}
 *
 * <p>GetOptionValueForProjectResponseBody</p>
 */
public class GetOptionValueForProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OptionValue")
    private String optionValue;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetOptionValueForProjectResponseBody(Builder builder) {
        this.optionValue = builder.optionValue;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOptionValueForProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return optionValue
     */
    public String getOptionValue() {
        return this.optionValue;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String optionValue; 
        private String requestId; 

        /**
         * <p>The data returned In the example, cuNumber is a custom key.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cuNumber&quot;:&quot;0&quot;}</p>
         */
        public Builder optionValue(String optionValue) {
            this.optionValue = optionValue;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E6F0DBDD-5AD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOptionValueForProjectResponseBody build() {
            return new GetOptionValueForProjectResponseBody(this);
        } 

    } 

}
