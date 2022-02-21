// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotspotSceneDataRequest} extends {@link RequestModel}
 *
 * <p>GetHotspotSceneDataRequest</p>
 */
public class GetHotspotSceneDataRequest extends Request {
    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("Enabled")
    private Boolean enabled;

    @Query
    @NameInMap("PreviewToken")
    @Validation(required = true)
    private String previewToken;

    @Query
    @NameInMap("Type")
    @Validation(required = true, maximum = 1)
    private Long type;

    private GetHotspotSceneDataRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.enabled = builder.enabled;
        this.previewToken = builder.previewToken;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotspotSceneDataRequest create() {
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
     * @return previewToken
     */
    public String getPreviewToken() {
        return this.previewToken;
    }

    /**
     * @return type
     */
    public Long getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetHotspotSceneDataRequest, Builder> {
        private String domain; 
        private Boolean enabled; 
        private String previewToken; 
        private Long type; 

        private Builder() {
            super();
        } 

        private Builder(GetHotspotSceneDataRequest response) {
            super(response);
            this.domain = response.domain;
            this.enabled = response.enabled;
            this.previewToken = response.previewToken;
            this.type = response.type;
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
         * 预览token
         */
        public Builder previewToken(String previewToken) {
            this.putQueryParameter("PreviewToken", previewToken);
            this.previewToken = previewToken;
            return this;
        }

        /**
         * 0 未发布， 1 已发布
         */
        public Builder type(Long type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetHotspotSceneDataRequest build() {
            return new GetHotspotSceneDataRequest(this);
        } 

    } 

}
