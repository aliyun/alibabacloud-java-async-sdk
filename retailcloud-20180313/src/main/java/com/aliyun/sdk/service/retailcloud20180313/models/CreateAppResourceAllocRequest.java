// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppResourceAllocRequest} extends {@link RequestModel}
 *
 * <p>CreateAppResourceAllocRequest</p>
 */
public class CreateAppResourceAllocRequest extends Request {
    @Query
    @NameInMap("AppEnvId")
    @Validation(required = true)
    private Long appEnvId;

    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    private CreateAppResourceAllocRequest(Builder builder) {
        super(builder);
        this.appEnvId = builder.appEnvId;
        this.appId = builder.appId;
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppResourceAllocRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appEnvId
     */
    public Long getAppEnvId() {
        return this.appEnvId;
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<CreateAppResourceAllocRequest, Builder> {
        private Long appEnvId; 
        private Long appId; 
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppResourceAllocRequest request) {
            super(request);
            this.appEnvId = request.appEnvId;
            this.appId = request.appId;
            this.clusterId = request.clusterId;
        } 

        /**
         * AppEnvId.
         */
        public Builder appEnvId(Long appEnvId) {
            this.putQueryParameter("AppEnvId", appEnvId);
            this.appEnvId = appEnvId;
            return this;
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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public CreateAppResourceAllocRequest build() {
            return new CreateAppResourceAllocRequest(this);
        } 

    } 

}
