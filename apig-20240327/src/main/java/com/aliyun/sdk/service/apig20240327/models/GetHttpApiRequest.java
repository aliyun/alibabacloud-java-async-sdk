// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetHttpApiRequest} extends {@link RequestModel}
 *
 * <p>GetHttpApiRequest</p>
 */
public class GetHttpApiRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String httpApiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("expandPolicyConfigs")
    private Boolean expandPolicyConfigs;

    private GetHttpApiRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.expandPolicyConfigs = builder.expandPolicyConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHttpApiRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    /**
     * @return expandPolicyConfigs
     */
    public Boolean getExpandPolicyConfigs() {
        return this.expandPolicyConfigs;
    }

    public static final class Builder extends Request.Builder<GetHttpApiRequest, Builder> {
        private String httpApiId; 
        private Boolean expandPolicyConfigs; 

        private Builder() {
            super();
        } 

        private Builder(GetHttpApiRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.expandPolicyConfigs = request.expandPolicyConfigs;
        } 

        /**
         * <p>Target HTTP API ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxx</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * expandPolicyConfigs.
         */
        public Builder expandPolicyConfigs(Boolean expandPolicyConfigs) {
            this.putQueryParameter("expandPolicyConfigs", expandPolicyConfigs);
            this.expandPolicyConfigs = expandPolicyConfigs;
            return this;
        }

        @Override
        public GetHttpApiRequest build() {
            return new GetHttpApiRequest(this);
        } 

    } 

}
