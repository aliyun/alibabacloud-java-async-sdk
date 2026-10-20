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
 * {@link SetHttpDDoSAttackProtectionRequest} extends {@link RequestModel}
 *
 * <p>SetHttpDDoSAttackProtectionRequest</p>
 */
public class SetHttpDDoSAttackProtectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String globalMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long siteId;

    private SetHttpDDoSAttackProtectionRequest(Builder builder) {
        super(builder);
        this.globalMode = builder.globalMode;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetHttpDDoSAttackProtectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return globalMode
     */
    public String getGlobalMode() {
        return this.globalMode;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<SetHttpDDoSAttackProtectionRequest, Builder> {
        private String globalMode; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(SetHttpDDoSAttackProtectionRequest request) {
            super(request);
            this.globalMode = request.globalMode;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The mode of the HTTP DDoS Attack prevention mitigation policies. Valid values:</p>
         * <ul>
         * <li><strong>very weak</strong>: Extremely loose.</li>
         * <li><strong>weak</strong>: Loose.</li>
         * <li><strong>default</strong>: Normal.</li>
         * <li><strong>hard</strong>: Strict.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder globalMode(String globalMode) {
            this.putQueryParameter("GlobalMode", globalMode);
            this.globalMode = globalMode;
            return this;
        }

        /**
         * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public SetHttpDDoSAttackProtectionRequest build() {
            return new SetHttpDDoSAttackProtectionRequest(this);
        } 

    } 

}
