// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetScenePreviewInfoRequest} extends {@link RequestModel}
 *
 * <p>GetScenePreviewInfoRequest</p>
 */
public class GetScenePreviewInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelToken;

    private GetScenePreviewInfoRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.enabled = builder.enabled;
        this.modelToken = builder.modelToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScenePreviewInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return modelToken
     */
    public String getModelToken() {
        return this.modelToken;
    }

    public static final class Builder extends Request.Builder<GetScenePreviewInfoRequest, Builder> {
        private String domain; 
        private Boolean enabled; 
        private String modelToken; 

        private Builder() {
            super();
        } 

        private Builder(GetScenePreviewInfoRequest request) {
            super(request);
            this.domain = request.domain;
            this.enabled = request.enabled;
            this.modelToken = request.modelToken;
        } 

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>A.e.RQJRPYGIJJQP****</p>
         */
        public Builder modelToken(String modelToken) {
            this.putQueryParameter("ModelToken", modelToken);
            this.modelToken = modelToken;
            return this;
        }

        @Override
        public GetScenePreviewInfoRequest build() {
            return new GetScenePreviewInfoRequest(this);
        } 

    } 

}
