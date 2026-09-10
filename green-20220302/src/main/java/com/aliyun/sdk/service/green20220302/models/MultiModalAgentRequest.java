// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

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
 * {@link MultiModalAgentRequest} extends {@link RequestModel}
 *
 * <p>MultiModalAgentRequest</p>
 */
public class MultiModalAgentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppID")
    private String appID;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private String serviceParameters;

    private MultiModalAgentRequest(Builder builder) {
        super(builder);
        this.appID = builder.appID;
        this.serviceParameters = builder.serviceParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MultiModalAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appID
     */
    public String getAppID() {
        return this.appID;
    }

    /**
     * @return serviceParameters
     */
    public String getServiceParameters() {
        return this.serviceParameters;
    }

    public static final class Builder extends Request.Builder<MultiModalAgentRequest, Builder> {
        private String appID; 
        private String serviceParameters; 

        private Builder() {
            super();
        } 

        private Builder(MultiModalAgentRequest request) {
            super(request);
            this.appID = request.appID;
            this.serviceParameters = request.serviceParameters;
        } 

        /**
         * <p>The unique identifier of the whiteboard application. To obtain the whiteboard application ID, see <a href="https://help.aliyun.com/document_detail/204234.html">CreateApp</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>txt_check_agent_01</p>
         */
        public Builder appID(String appID) {
            this.putBodyParameter("AppID", appID);
            this.appID = appID;
            return this;
        }

        /**
         * <p>The parameter set required by the moderation service. taskId specifies the taskId of the detection task to query. Only one taskId can be specified per request.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;content&quot;:&quot;Test text&quot;,&quot;dataId&quot;:&quot;img1234567&quot;}</p>
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putBodyParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        @Override
        public MultiModalAgentRequest build() {
            return new MultiModalAgentRequest(this);
        } 

    } 

}
