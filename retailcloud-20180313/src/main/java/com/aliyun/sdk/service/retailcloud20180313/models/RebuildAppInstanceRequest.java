// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebuildAppInstanceRequest} extends {@link RequestModel}
 *
 * <p>RebuildAppInstanceRequest</p>
 */
public class RebuildAppInstanceRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("AppInstanceId")
    @Validation(required = true)
    private String appInstanceId;

    @Query
    @NameInMap("EnvId")
    @Validation(required = true)
    private Long envId;

    private RebuildAppInstanceRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appInstanceId = builder.appInstanceId;
        this.envId = builder.envId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebuildAppInstanceRequest create() {
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
     * @return appInstanceId
     */
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    /**
     * @return envId
     */
    public Long getEnvId() {
        return this.envId;
    }

    public static final class Builder extends Request.Builder<RebuildAppInstanceRequest, Builder> {
        private Long appId; 
        private String appInstanceId; 
        private Long envId; 

        private Builder() {
            super();
        } 

        private Builder(RebuildAppInstanceRequest request) {
            super(request);
            this.appId = request.appId;
            this.appInstanceId = request.appInstanceId;
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
         * AppInstanceId.
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putQueryParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
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
        public RebuildAppInstanceRequest build() {
            return new RebuildAppInstanceRequest(this);
        } 

    } 

}
