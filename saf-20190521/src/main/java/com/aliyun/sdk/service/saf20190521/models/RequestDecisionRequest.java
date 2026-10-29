// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.saf20190521.models;

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
 * {@link RequestDecisionRequest} extends {@link RequestModel}
 *
 * <p>RequestDecisionRequest</p>
 */
public class RequestDecisionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventCode")
    private String eventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private String serviceParameters;

    private RequestDecisionRequest(Builder builder) {
        super(builder);
        this.eventCode = builder.eventCode;
        this.serviceParameters = builder.serviceParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestDecisionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * @return serviceParameters
     */
    public String getServiceParameters() {
        return this.serviceParameters;
    }

    public static final class Builder extends Request.Builder<RequestDecisionRequest, Builder> {
        private String eventCode; 
        private String serviceParameters; 

        private Builder() {
            super();
        } 

        private Builder(RequestDecisionRequest request) {
            super(request);
            this.eventCode = request.eventCode;
            this.serviceParameters = request.serviceParameters;
        } 

        /**
         * <p>The event code.</p>
         * 
         * <strong>example:</strong>
         * <p>de_*</p>
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("EventCode", eventCode);
            this.eventCode = eventCode;
            return this;
        }

        /**
         * <p>The service input parameters. The value is a complete JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;accountId&quot;: &quot;1233***&quot;}</p>
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putQueryParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        @Override
        public RequestDecisionRequest build() {
            return new RequestDecisionRequest(this);
        } 

    } 

}
