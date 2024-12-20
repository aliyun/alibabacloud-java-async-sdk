// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link GetWebshellTokenRequest} extends {@link RequestModel}
 *
 * <p>GetWebshellTokenRequest</p>
 */
public class GetWebshellTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PodName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String podName;

    private GetWebshellTokenRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.podName = builder.podName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWebshellTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return podName
     */
    public String getPodName() {
        return this.podName;
    }

    public static final class Builder extends Request.Builder<GetWebshellTokenRequest, Builder> {
        private String appId; 
        private String podName; 

        private Builder() {
            super();
        } 

        private Builder(GetWebshellTokenRequest request) {
            super(request);
            this.appId = request.appId;
            this.podName = request.podName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>017f39b8-dfa4-4e16-a84b-1dcee4b1****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hello-podsdfsdfsdfsdf</p>
         */
        public Builder podName(String podName) {
            this.putQueryParameter("PodName", podName);
            this.podName = podName;
            return this;
        }

        @Override
        public GetWebshellTokenRequest build() {
            return new GetWebshellTokenRequest(this);
        } 

    } 

}
