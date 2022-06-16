// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppEnvDeployBaselineRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppEnvDeployBaselineRequest</p>
 */
public class DescribeAppEnvDeployBaselineRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("EnvId")
    @Validation(required = true)
    private Long envId;

    private DescribeAppEnvDeployBaselineRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.envId = builder.envId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppEnvDeployBaselineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return envId
     */
    public Long getEnvId() {
        return this.envId;
    }

    public static final class Builder extends Request.Builder<DescribeAppEnvDeployBaselineRequest, Builder> {
        private Long appId; 
        private Long envId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppEnvDeployBaselineRequest request) {
            super(request);
            this.appId = request.appId;
            this.envId = request.envId;
        } 

        /**
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * EnvId.
         */
        public Builder envId(Long envId) {
            this.putQueryParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        @Override
        public DescribeAppEnvDeployBaselineRequest build() {
            return new DescribeAppEnvDeployBaselineRequest(this);
        } 

    } 

}
