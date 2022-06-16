// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocatePodConfigRequest} extends {@link RequestModel}
 *
 * <p>AllocatePodConfigRequest</p>
 */
public class AllocatePodConfigRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("EnvId")
    @Validation(required = true, maximum = 999999999999999D)
    private Long envId;

    @Query
    @NameInMap("RequestId")
    private String requestId;

    private AllocatePodConfigRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.envId = builder.envId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocatePodConfigRequest create() {
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder extends Request.Builder<AllocatePodConfigRequest, Builder> {
        private Long appId; 
        private Long envId; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(AllocatePodConfigRequest request) {
            super(request);
            this.appId = request.appId;
            this.envId = request.envId;
            this.requestId = request.requestId;
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

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        @Override
        public AllocatePodConfigRequest build() {
            return new AllocatePodConfigRequest(this);
        } 

    } 

}
