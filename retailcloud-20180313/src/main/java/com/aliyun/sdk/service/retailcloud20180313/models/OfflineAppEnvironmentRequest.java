// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OfflineAppEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>OfflineAppEnvironmentRequest</p>
 */
public class OfflineAppEnvironmentRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("DeletePvc")
    private Boolean deletePvc;

    @Query
    @NameInMap("EnvId")
    @Validation(required = true)
    private Long envId;

    private OfflineAppEnvironmentRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.deletePvc = builder.deletePvc;
        this.envId = builder.envId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OfflineAppEnvironmentRequest create() {
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
     * @return deletePvc
     */
    public Boolean getDeletePvc() {
        return this.deletePvc;
    }

    /**
     * @return envId
     */
    public Long getEnvId() {
        return this.envId;
    }

    public static final class Builder extends Request.Builder<OfflineAppEnvironmentRequest, Builder> {
        private Long appId; 
        private Boolean deletePvc; 
        private Long envId; 

        private Builder() {
            super();
        } 

        private Builder(OfflineAppEnvironmentRequest request) {
            super(request);
            this.appId = request.appId;
            this.deletePvc = request.deletePvc;
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
         * 是否删除PVC，未传递默认不删除
         */
        public Builder deletePvc(Boolean deletePvc) {
            this.putQueryParameter("DeletePvc", deletePvc);
            this.deletePvc = deletePvc;
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
        public OfflineAppEnvironmentRequest build() {
            return new OfflineAppEnvironmentRequest(this);
        } 

    } 

}
