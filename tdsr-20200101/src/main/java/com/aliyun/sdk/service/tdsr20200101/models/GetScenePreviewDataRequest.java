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
 * {@link GetScenePreviewDataRequest} extends {@link RequestModel}
 *
 * <p>GetScenePreviewDataRequest</p>
 */
public class GetScenePreviewDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreviewToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String previewToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowTag")
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
         * <p>2735913e96da44ea8c86f8e777c8****</p>
         */
        public Builder previewToken(String previewToken) {
            this.putQueryParameter("PreviewToken", previewToken);
            this.previewToken = previewToken;
            return this;
        }

        /**
         * ShowTag.
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
