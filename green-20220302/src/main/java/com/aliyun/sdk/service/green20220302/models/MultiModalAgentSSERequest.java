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
         * AppID.
         */
        public Builder appID(String appID) {
            this.putBodyParameter("AppID", appID);
            this.appID = appID;
            return this;
        }

        /**
         * ServiceParameters.
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putBodyParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        /**
         * Stream.
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
