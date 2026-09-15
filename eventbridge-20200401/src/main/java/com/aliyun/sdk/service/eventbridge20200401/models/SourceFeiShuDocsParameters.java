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
         * <p>The App ID of the custom Lark application. Obtain this value after creating an application on the Lark Open Platform.</p>
         * 
         * <strong>example:</strong>
         * <p>cli_a946c046xxxx</p>
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>The App Secret of the custom Lark application. Obtain this value after creating an application on the Lark Open Platform.</p>
         * 
         * <strong>example:</strong>
         * <p>yO3hEYiSjkBVxxxx</p>
         */
        public Builder appSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }

        /**
         * <p>The name of the Lark knowledge space. An exact match is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Product Documentation Center</p>
         */
        public Builder knowledgeSpaceName(String knowledgeSpaceName) {
            this.knowledgeSpaceName = knowledgeSpaceName;
            return this;
        }

        /**
         * <p>The document loading mode. Valid values: block: splits the document by blocks, with each block as a separate event. single (default): treats the entire document as a single event, with metadata extension keys such as file name, modification time, and original link. Use this mode when importing into an EventHouse knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>single</p>
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
