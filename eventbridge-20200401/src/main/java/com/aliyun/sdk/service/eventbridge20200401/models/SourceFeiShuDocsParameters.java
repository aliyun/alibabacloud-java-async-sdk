// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link SourceFeiShuDocsParameters} extends {@link TeaModel}
 *
 * <p>SourceFeiShuDocsParameters</p>
 */
public class SourceFeiShuDocsParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AppSecret")
    private String appSecret;

    @com.aliyun.core.annotation.NameInMap("KnowledgeSpaceName")
    private String knowledgeSpaceName;

    @com.aliyun.core.annotation.NameInMap("LoadMode")
    private String loadMode;

    private SourceFeiShuDocsParameters(Builder builder) {
        this.appId = builder.appId;
        this.appSecret = builder.appSecret;
        this.knowledgeSpaceName = builder.knowledgeSpaceName;
        this.loadMode = builder.loadMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SourceFeiShuDocsParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appSecret
     */
    public String getAppSecret() {
        return this.appSecret;
    }

    /**
     * @return knowledgeSpaceName
     */
    public String getKnowledgeSpaceName() {
        return this.knowledgeSpaceName;
    }

    /**
     * @return loadMode
     */
    public String getLoadMode() {
        return this.loadMode;
    }

    public static final class Builder {
        private String appId; 
        private String appSecret; 
        private String knowledgeSpaceName; 
        private String loadMode; 

        private Builder() {
        } 

        private Builder(SourceFeiShuDocsParameters model) {
            this.appId = model.appId;
            this.appSecret = model.appSecret;
            this.knowledgeSpaceName = model.knowledgeSpaceName;
            this.loadMode = model.loadMode;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * AppSecret.
         */
        public Builder appSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }

        /**
         * KnowledgeSpaceName.
         */
        public Builder knowledgeSpaceName(String knowledgeSpaceName) {
            this.knowledgeSpaceName = knowledgeSpaceName;
            return this;
        }

        /**
         * LoadMode.
         */
        public Builder loadMode(String loadMode) {
            this.loadMode = loadMode;
            return this;
        }

        public SourceFeiShuDocsParameters build() {
            return new SourceFeiShuDocsParameters(this);
        } 

    } 

}
