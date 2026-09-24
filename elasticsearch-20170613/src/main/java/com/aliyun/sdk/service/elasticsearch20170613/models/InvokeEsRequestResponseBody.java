// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link InvokeEsRequestResponseBody} extends {@link TeaModel}
 *
 * <p>InvokeEsRequestResponseBody</p>
 */
public class InvokeEsRequestResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Object result;

    private InvokeEsRequestResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeEsRequestResponseBody create() {
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
     * @return result
     */
    public Object getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Object result; 

        private Builder() {
        } 

        private Builder(InvokeEsRequestResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>8E5A2C41-D96B-4308-AF72-5C0B14E6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The response content returned as-is from ES. The structure is determined by the ES API being called.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;esResult&quot;:{&quot;took&quot;:5,&quot;timed_out&quot;:false,&quot;hits&quot;:{&quot;total&quot;:{&quot;value&quot;:1,&quot;relation&quot;:&quot;eq&quot;},&quot;max_score&quot;:1.0,&quot;hits&quot;:[{&quot;_index&quot;:&quot;my-index&quot;,&quot;_id&quot;:&quot;1&quot;,&quot;_score&quot;:1.0,&quot;_source&quot;:{&quot;title&quot;:&quot;Wireless Bluetooth Headphones&quot;}}]}}}</p>
         */
        public Builder result(Object result) {
            this.result = result;
            return this;
        }

        public InvokeEsRequestResponseBody build() {
            return new InvokeEsRequestResponseBody(this);
        } 

    } 

}
