// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSearchStrategyRequest} extends {@link RequestModel}
 *
 * <p>CreateSearchStrategyRequest</p>
 */
public class CreateSearchStrategyRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("appId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("body")
    private SearchStrategy body;

    private CreateSearchStrategyRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.appId = builder.appId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSearchStrategyRequest create() {
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
     * @return body
     */
    public SearchStrategy getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateSearchStrategyRequest, Builder> {
        private String appGroupIdentity; 
        private String appId; 
        private SearchStrategy body; 

        private Builder() {
            super();
        } 

        private Builder(CreateSearchStrategyRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.appId = request.appId;
            this.body = request.body;
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
         * body.
         */
        public Builder body(SearchStrategy body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateSearchStrategyRequest build() {
            return new CreateSearchStrategyRequest(this);
        } 

    } 

}
