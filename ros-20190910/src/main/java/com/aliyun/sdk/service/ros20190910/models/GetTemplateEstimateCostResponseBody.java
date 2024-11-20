// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTemplateEstimateCostResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateEstimateCostResponseBody</p>
 */
public class GetTemplateEstimateCostResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.Map < String, ? > resources;

    private GetTemplateEstimateCostResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateEstimateCostResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public java.util.Map < String, ? > getResources() {
        return this.resources;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map < String, ? > resources; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6DEA36EF-C97D-5658-A4AC-4F5DB08D1A89</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource details.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;LogicalResourceIdPattern&quot;: &quot;wait1&quot;, &quot;ResourceType&quot;: &quot;time_sleep&quot;, &quot;ResourcePath&quot;: &quot;wait1&quot;}, {&quot;LogicalResourceIdPattern&quot;: &quot;wait2&quot;, &quot;ResourceType&quot;: &quot;time_sleep&quot;, &quot;ResourcePath&quot;: &quot;wait2&quot;}]</p>
         */
        public Builder resources(java.util.Map < String, ? > resources) {
            this.resources = resources;
            return this;
        }

        public GetTemplateEstimateCostResponseBody build() {
            return new GetTemplateEstimateCostResponseBody(this);
        } 

    } 

}
