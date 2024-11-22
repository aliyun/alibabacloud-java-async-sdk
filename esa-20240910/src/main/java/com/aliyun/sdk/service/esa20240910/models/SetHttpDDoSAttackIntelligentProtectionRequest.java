// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetHttpDDoSAttackIntelligentProtectionRequest} extends {@link RequestModel}
 *
 * <p>SetHttpDDoSAttackIntelligentProtectionRequest</p>
 */
public class SetHttpDDoSAttackIntelligentProtectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AiMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aiMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AiTemplate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aiTemplate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long siteId;

    private SetHttpDDoSAttackIntelligentProtectionRequest(Builder builder) {
        super(builder);
        this.aiMode = builder.aiMode;
        this.aiTemplate = builder.aiTemplate;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetHttpDDoSAttackIntelligentProtectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiMode
     */
    public String getAiMode() {
        return this.aiMode;
    }

    /**
     * @return aiTemplate
     */
    public String getAiTemplate() {
        return this.aiTemplate;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<SetHttpDDoSAttackIntelligentProtectionRequest, Builder> {
        private String aiMode; 
        private String aiTemplate; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(SetHttpDDoSAttackIntelligentProtectionRequest request) {
            super(request);
            this.aiMode = request.aiMode;
            this.aiTemplate = request.aiTemplate;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The mode of smart HTTP DDoS protection. Valid values:</p>
         * <ul>
         * <li><strong>observe</strong>: alert.</li>
         * <li><strong>defense</strong>: block.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>defense</p>
         */
        public Builder aiMode(String aiMode) {
            this.putQueryParameter("AiMode", aiMode);
            this.aiMode = aiMode;
            return this;
        }

        /**
         * <p>The level of smart HTTP DDoS protection. Valid values:</p>
         * <ul>
         * <li><strong>level0</strong>: very loose.</li>
         * <li><strong>level30</strong>: loose.</li>
         * <li><strong>level60</strong>: normal.</li>
         * <li><strong>level90</strong>: strict.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>level60</p>
         */
        public Builder aiTemplate(String aiTemplate) {
            this.putQueryParameter("AiTemplate", aiTemplate);
            this.aiTemplate = aiTemplate;
            return this;
        }

        /**
         * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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
        public SetHttpDDoSAttackIntelligentProtectionRequest build() {
            return new SetHttpDDoSAttackIntelligentProtectionRequest(this);
        } 

    } 

}
