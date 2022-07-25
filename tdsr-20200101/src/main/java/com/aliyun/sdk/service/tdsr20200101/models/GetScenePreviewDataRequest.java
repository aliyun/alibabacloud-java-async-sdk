// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScenePreviewDataRequest} extends {@link RequestModel}
 *
 * <p>GetScenePreviewDataRequest</p>
 */
public class GetScenePreviewDataRequest extends Request {
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
    @NameInMap("ShowTag")
    private Boolean showTag;

    private GetScenePreviewDataRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.enabled = builder.enabled;
        this.previewToken = builder.previewToken;
        this.showTag = builder.showTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScenePreviewDataRequest create() {
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
     * @return showTag
     */
    public Boolean getShowTag() {
        return this.showTag;
    }

    public static final class Builder extends Request.Builder<GetScenePreviewDataRequest, Builder> {
        private String domain; 
        private Boolean enabled; 
        private String previewToken; 
        private Boolean showTag; 

        private Builder() {
            super();
        } 

        private Builder(GetScenePreviewDataRequest request) {
            super(request);
            this.domain = request.domain;
            this.enabled = request.enabled;
            this.previewToken = request.previewToken;
            this.showTag = request.showTag;
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
         * 是否开启自用资源访问（默认false）
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
         * 是否返回热点数据（默认false）
         */
        public Builder showTag(Boolean showTag) {
            this.putQueryParameter("ShowTag", showTag);
            this.showTag = showTag;
            return this;
        }

        @Override
        public GetScenePreviewDataRequest build() {
            return new GetScenePreviewDataRequest(this);
        } 

    } 

}
