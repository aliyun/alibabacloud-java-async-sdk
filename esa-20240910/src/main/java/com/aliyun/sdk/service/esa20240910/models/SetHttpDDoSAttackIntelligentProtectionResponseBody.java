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
 * {@link SetHttpDDoSAttackIntelligentProtectionResponseBody} extends {@link TeaModel}
 *
 * <p>SetHttpDDoSAttackIntelligentProtectionResponseBody</p>
 */
public class SetHttpDDoSAttackIntelligentProtectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AiMode")
    private String aiMode;

    @com.aliyun.core.annotation.NameInMap("AiTemplate")
    private String aiTemplate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private SetHttpDDoSAttackIntelligentProtectionResponseBody(Builder builder) {
        this.aiMode = builder.aiMode;
        this.aiTemplate = builder.aiTemplate;
        this.requestId = builder.requestId;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetHttpDDoSAttackIntelligentProtectionResponseBody create() {
        return builder().build();
    }

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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder {
        private String aiMode; 
        private String aiTemplate; 
        private String requestId; 
        private Long siteId; 

        private Builder() {
        } 

        private Builder(SetHttpDDoSAttackIntelligentProtectionResponseBody model) {
            this.aiMode = model.aiMode;
            this.aiTemplate = model.aiTemplate;
            this.requestId = model.requestId;
            this.siteId = model.siteId;
        } 

        /**
         * <p>The mode of smart HTTP DDoS protection. Valid values:</p>
         * <ul>
         * <li><strong>observe</strong>: alert.</li>
         * <li><strong>defense</strong>: block.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>defense</p>
         */
        public Builder aiMode(String aiMode) {
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
         * 
         * <strong>example:</strong>
         * <p>level60</p>
         */
        public Builder aiTemplate(String aiTemplate) {
            this.aiTemplate = aiTemplate;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The website ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        public SetHttpDDoSAttackIntelligentProtectionResponseBody build() {
            return new SetHttpDDoSAttackIntelligentProtectionResponseBody(this);
        } 

    } 

}
