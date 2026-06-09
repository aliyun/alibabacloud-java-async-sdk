// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetOssUploadPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetOssUploadPolicyRequest</p>
 */
public class GetOssUploadPolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scenario")
    private String scenario;

    private GetOssUploadPolicyRequest(Builder builder) {
        super(builder);
        this.scenario = builder.scenario;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssUploadPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return scenario
     */
    public String getScenario() {
        return this.scenario;
    }

    public static final class Builder extends Request.Builder<GetOssUploadPolicyRequest, Builder> {
        private String scenario; 

        private Builder() {
            super();
        } 

        private Builder(GetOssUploadPolicyRequest request) {
            super(request);
            this.scenario = request.scenario;
        } 

        /**
         * Scenario.
         */
        public Builder scenario(String scenario) {
            this.putBodyParameter("Scenario", scenario);
            this.scenario = scenario;
            return this;
        }

        @Override
        public GetOssUploadPolicyRequest build() {
            return new GetOssUploadPolicyRequest(this);
        } 

    } 

}
