// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveSearchStrategyRequest} extends {@link RequestModel}
 *
 * <p>RemoveSearchStrategyRequest</p>
 */
public class RemoveSearchStrategyRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("appId")
    @Validation(required = true)
    private String appId;

    @Path
    @NameInMap("strategyName")
    @Validation(required = true)
    private String strategyName;

    private RemoveSearchStrategyRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.appId = builder.appId;
        this.strategyName = builder.strategyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveSearchStrategyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return strategyName
     */
    public String getStrategyName() {
        return this.strategyName;
    }

    public static final class Builder extends Request.Builder<RemoveSearchStrategyRequest, Builder> {
        private String appGroupIdentity; 
        private String appId; 
        private String strategyName; 

        private Builder() {
            super();
        } 

        private Builder(RemoveSearchStrategyRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.appId = request.appId;
            this.strategyName = request.strategyName;
        } 

        /**
         * The name of the application.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * The version number.
         */
        public Builder appId(String appId) {
            this.putPathParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The name of the policy.
         */
        public Builder strategyName(String strategyName) {
            this.putPathParameter("strategyName", strategyName);
            this.strategyName = strategyName;
            return this;
        }

        @Override
        public RemoveSearchStrategyRequest build() {
            return new RemoveSearchStrategyRequest(this);
        } 

    } 

}
