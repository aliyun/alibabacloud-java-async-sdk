// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSearchStrategyRequest} extends {@link RequestModel}
 *
 * <p>UpdateSearchStrategyRequest</p>
 */
public class UpdateSearchStrategyRequest extends Request {
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

    private UpdateSearchStrategyRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.appId = builder.appId;
        this.strategyName = builder.strategyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSearchStrategyRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateSearchStrategyRequest, Builder> {
        private String appGroupIdentity; 
        private String appId; 
        private String strategyName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSearchStrategyRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
            this.appId = response.appId;
            this.strategyName = response.strategyName;
        } 

        /**
         * appGroupIdentity.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * appId.
         */
        public Builder appId(String appId) {
            this.putPathParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * strategyName.
         */
        public Builder strategyName(String strategyName) {
            this.putPathParameter("strategyName", strategyName);
            this.strategyName = strategyName;
            return this;
        }

        @Override
        public UpdateSearchStrategyRequest build() {
            return new UpdateSearchStrategyRequest(this);
        } 

    } 

}
