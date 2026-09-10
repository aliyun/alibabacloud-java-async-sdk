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
 * {@link MultiModalAgentSSERequest} extends {@link RequestModel}
 *
 * <p>MultiModalAgentSSERequest</p>
 */
public class MultiModalAgentSSERequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppID")
    private String appID;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private String serviceParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Stream")
    private String stream;

    private MultiModalAgentSSERequest(Builder builder) {
        super(builder);
        this.appID = builder.appID;
        this.serviceParameters = builder.serviceParameters;
        this.stream = builder.stream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MultiModalAgentSSERequest create() {
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

    /**
     * @return stream
     */
    public String getStream() {
        return this.stream;
    }

    public static final class Builder extends Request.Builder<MultiModalAgentSSERequest, Builder> {
        private String appID; 
        private String serviceParameters; 
        private String stream; 

        private Builder() {
            super();
        } 

        private Builder(MultiModalAgentSSERequest request) {
            super(request);
            this.appID = request.appID;
            this.serviceParameters = request.serviceParameters;
            this.stream = request.stream;
        } 

        /**
         * <p>The unique identifier of the whiteboard application. To obtain the whiteboard application ID, refer to <a href="https://help.aliyun.com/document_detail/204234.html">CreateApp</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>txt_check_pro_agent_01</p>
         */
        public Builder appID(String appID) {
            this.putBodyParameter("AppID", appID);
            this.appID = appID;
            return this;
        }

        /**
         * <p>The parameter set required by the moderation service, in JSON string format. The text content input parameter is content (String), the custom data ID is DataId (String), and the cache type is CacheType (String, valid value: ephemeral).</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;content&quot;: &quot;Text content to be moderated&quot;,
         *     &quot;DataId&quot;: &quot;data123***&quot;,
         *     &quot;CacheType&quot;:&quot;ephemeral&quot;
         *     }</p>
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putBodyParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        /**
         * <p>Specifies whether to use streaming output.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder stream(String stream) {
            this.putBodyParameter("Stream", stream);
            this.stream = stream;
            return this;
        }

        @Override
        public MultiModalAgentSSERequest build() {
            return new MultiModalAgentSSERequest(this);
        } 

    } 

}
