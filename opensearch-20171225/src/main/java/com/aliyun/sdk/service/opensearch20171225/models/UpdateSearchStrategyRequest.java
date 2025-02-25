// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSearchStrategyRequest} extends {@link RequestModel}
 *
 * <p>UpdateSearchStrategyRequest</p>
 */
public class UpdateSearchStrategyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("strategyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private SearchStrategy body;

    private UpdateSearchStrategyRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.appId = builder.appId;
        this.strategyName = builder.strategyName;
        this.body = builder.body;
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

    /**
     * @return body
     */
    public SearchStrategy getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateSearchStrategyRequest, Builder> {
        private String appGroupIdentity; 
        private String appId; 
        private String strategyName; 
        private SearchStrategy body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSearchStrategyRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.appId = request.appId;
            this.strategyName = request.strategyName;
            this.body = request.body;
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

        /**
         * The request body.
         */
        public Builder body(SearchStrategy body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateSearchStrategyRequest build() {
            return new UpdateSearchStrategyRequest(this);
        } 

    } 

}
