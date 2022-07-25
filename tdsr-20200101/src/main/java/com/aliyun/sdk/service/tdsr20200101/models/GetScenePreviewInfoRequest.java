// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScenePreviewInfoRequest} extends {@link RequestModel}
 *
 * <p>GetScenePreviewInfoRequest</p>
 */
public class GetScenePreviewInfoRequest extends Request {
    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("Enabled")
    private Boolean enabled;

    @Query
    @NameInMap("ModelToken")
    @Validation(required = true)
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
         * 自定义oss域名（可为cdn域名）
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * 是否开启自用资源访问
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * 模型token
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
