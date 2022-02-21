// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableDeletionProtectionRequest} extends {@link RequestModel}
 *
 * <p>DisableDeletionProtectionRequest</p>
 */
public class DisableDeletionProtectionRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    private DisableDeletionProtectionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableDeletionProtectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder extends Request.Builder<DisableDeletionProtectionRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String resourceId; 

        private Builder() {
            super();
        } 

        private Builder(DisableDeletionProtectionRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.resourceId = response.resourceId;
        } 

        /**
         * 幂等标识
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         *  是否只预检此次请求
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * 实例id
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        @Override
        public DisableDeletionProtectionRequest build() {
            return new DisableDeletionProtectionRequest(this);
        } 

    } 

}
