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

        @Override
        public MultiModalAgentRequest build() {
            return new MultiModalAgentRequest(this);
        } 

    } 

}
