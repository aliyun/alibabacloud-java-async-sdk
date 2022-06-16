// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppEnvironmentDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppEnvironmentDetailRequest</p>
 */
public class DescribeAppEnvironmentDetailRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("EnvId")
    @Validation(required = true)
    private Long envId;

    private DescribeAppEnvironmentDetailRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.envId = builder.envId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppEnvironmentDetailRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAppEnvironmentDetailRequest, Builder> {
        private Long appId; 
        private Long envId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppEnvironmentDetailRequest request) {
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
        public DescribeAppEnvironmentDetailRequest build() {
            return new DescribeAppEnvironmentDetailRequest(this);
        } 

    } 

}
