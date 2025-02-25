// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateCacheTagRequest} extends {@link RequestModel}
 *
 * <p>UpdateCacheTagRequest</p>
 */
public class UpdateCacheTagRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaseInsensitive")
    private String caseInsensitive;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagName")
    private String tagName;

    private UpdateCacheTagRequest(Builder builder) {
        super(builder);
        this.caseInsensitive = builder.caseInsensitive;
        this.siteId = builder.siteId;
        this.siteVersion = builder.siteVersion;
        this.tagName = builder.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCacheTagRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caseInsensitive
     */
    public String getCaseInsensitive() {
        return this.caseInsensitive;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return siteVersion
     */
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    public static final class Builder extends Request.Builder<UpdateCacheTagRequest, Builder> {
        private String caseInsensitive; 
        private Long siteId; 
        private Integer siteVersion; 
        private String tagName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCacheTagRequest request) {
            super(request);
            this.caseInsensitive = request.caseInsensitive;
            this.siteId = request.siteId;
            this.siteVersion = request.siteVersion;
            this.tagName = request.tagName;
        } 

        /**
         * <p>Whether to ignore case. Value range:</p>
         * <ul>
         * <li>on: Enabled, ignores case.</li>
         * <li>off: Disabled, does not ignore case.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder caseInsensitive(String caseInsensitive) {
            this.putQueryParameter("CaseInsensitive", caseInsensitive);
            this.caseInsensitive = caseInsensitive;
            return this;
        }

        /**
         * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5407498413****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the effective version of the site configuration, defaulting to version 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder siteVersion(Integer siteVersion) {
            this.putQueryParameter("SiteVersion", siteVersion);
            this.siteVersion = siteVersion;
            return this;
        }

        /**
         * <p>Custom CacheTag name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        @Override
        public UpdateCacheTagRequest build() {
            return new UpdateCacheTagRequest(this);
        } 

    } 

}
