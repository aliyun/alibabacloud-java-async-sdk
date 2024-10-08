// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHttpDDoSAttackIntelligentProtectionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHttpDDoSAttackIntelligentProtectionResponseBody</p>
 */
public class DescribeHttpDDoSAttackIntelligentProtectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AiMode")
    private String aiMode;

    @com.aliyun.core.annotation.NameInMap("AiTemplate")
    private String aiTemplate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private DescribeHttpDDoSAttackIntelligentProtectionResponseBody(Builder builder) {
        this.aiMode = builder.aiMode;
        this.aiTemplate = builder.aiTemplate;
        this.requestId = builder.requestId;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHttpDDoSAttackIntelligentProtectionResponseBody create() {
        return builder().build();
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

        /**
         * AiMode.
         */
        public Builder aiMode(String aiMode) {
            this.aiMode = aiMode;
            return this;
        }

        /**
         * AiTemplate.
         */
        public Builder aiTemplate(String aiTemplate) {
            this.aiTemplate = aiTemplate;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CB1A380B-09F0-41BB-3C82-72F8FD6DA2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        public DescribeHttpDDoSAttackIntelligentProtectionResponseBody build() {
            return new DescribeHttpDDoSAttackIntelligentProtectionResponseBody(this);
        } 

    } 

}
