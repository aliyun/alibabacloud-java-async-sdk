// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GetResourceTypePropertiesResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceTypePropertiesResponseBody</p>
 */
public class GetResourceTypePropertiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Configuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configuration;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetResourceTypePropertiesResponseBody(Builder builder) {
        this.configuration = builder.configuration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceTypePropertiesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configuration
     */
    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String configuration; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetResourceTypePropertiesResponseBody model) {
            this.configuration = model.configuration;
            this.requestId = model.requestId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *       &quot;description&quot;: &quot;The ID of the resource group to which the instance belongs.\n&quot;,
         *       &quot;title&quot;: &quot;ResourceGroupId&quot;,
         *       &quot;type&quot;: &quot;String&quot;,
         *       &quot;key&quot;: &quot;ResourceGroupId&quot;,
         *       &quot;example&quot;: &quot;rg-bp67acfmxazb4p****&quot;
         *     },
         *     {
         *       &quot;description&quot;: &quot;The billing method of the instance. Valid values:\n\n*   PrePaid: subscription\n*   PostPaid: pay-as-you-go\n&quot;,
         *       &quot;title&quot;: &quot;InstanceChargeType&quot;,
         *       &quot;type&quot;: &quot;String&quot;,
         *       &quot;key&quot;: &quot;InstanceChargeType&quot;,
         *       &quot;example&quot;: &quot;PostPaid&quot;
         *     }]</p>
         */
        public Builder configuration(String configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0C2868BF-47EE-5441-B34B-17F080B10DC7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetResourceTypePropertiesResponseBody build() {
            return new GetResourceTypePropertiesResponseBody(this);
        } 

    } 

}
