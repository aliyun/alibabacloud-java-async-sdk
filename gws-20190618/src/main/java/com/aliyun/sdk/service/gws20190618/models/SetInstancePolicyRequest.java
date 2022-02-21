// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetInstancePolicyRequest} extends {@link RequestModel}
 *
 * <p>SetInstancePolicyRequest</p>
 */
public class SetInstancePolicyRequest extends Request {
    @Query
    @NameInMap("AsyncMode")
    private Boolean asyncMode;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OptimizeFor3d")
    private String optimizeFor3d;

    @Query
    @NameInMap("VisualLossless")
    private String visualLossless;

    private SetInstancePolicyRequest(Builder builder) {
        super(builder);
        this.asyncMode = builder.asyncMode;
        this.instanceId = builder.instanceId;
        this.optimizeFor3d = builder.optimizeFor3d;
        this.visualLossless = builder.visualLossless;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetInstancePolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asyncMode
     */
    public Boolean getAsyncMode() {
        return this.asyncMode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return optimizeFor3d
     */
    public String getOptimizeFor3d() {
        return this.optimizeFor3d;
    }

    /**
     * @return visualLossless
     */
    public String getVisualLossless() {
        return this.visualLossless;
    }

    public static final class Builder extends Request.Builder<SetInstancePolicyRequest, Builder> {
        private Boolean asyncMode; 
        private String instanceId; 
        private String optimizeFor3d; 
        private String visualLossless; 

        private Builder() {
            super();
        } 

        private Builder(SetInstancePolicyRequest response) {
            super(response);
            this.asyncMode = response.asyncMode;
            this.instanceId = response.instanceId;
            this.optimizeFor3d = response.optimizeFor3d;
            this.visualLossless = response.visualLossless;
        } 

        /**
         * AsyncMode.
         */
        public Builder asyncMode(Boolean asyncMode) {
            this.putQueryParameter("AsyncMode", asyncMode);
            this.asyncMode = asyncMode;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OptimizeFor3d.
         */
        public Builder optimizeFor3d(String optimizeFor3d) {
            this.putQueryParameter("OptimizeFor3d", optimizeFor3d);
            this.optimizeFor3d = optimizeFor3d;
            return this;
        }

        /**
         * VisualLossless.
         */
        public Builder visualLossless(String visualLossless) {
            this.putQueryParameter("VisualLossless", visualLossless);
            this.visualLossless = visualLossless;
            return this;
        }

        @Override
        public SetInstancePolicyRequest build() {
            return new SetInstancePolicyRequest(this);
        } 

    } 

}
