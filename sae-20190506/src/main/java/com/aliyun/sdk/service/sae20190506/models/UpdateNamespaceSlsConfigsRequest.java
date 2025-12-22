// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link UpdateNamespaceSlsConfigsRequest} extends {@link RequestModel}
 *
 * <p>UpdateNamespaceSlsConfigsRequest</p>
 */
public class UpdateNamespaceSlsConfigsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NameSpaceShortId")
    private String nameSpaceShortId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsConfigs")
    private String slsConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsLogEnvTags")
    private String slsLogEnvTags;

    private UpdateNamespaceSlsConfigsRequest(Builder builder) {
        super(builder);
        this.nameSpaceShortId = builder.nameSpaceShortId;
        this.namespaceId = builder.namespaceId;
        this.slsConfigs = builder.slsConfigs;
        this.slsLogEnvTags = builder.slsLogEnvTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNamespaceSlsConfigsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nameSpaceShortId
     */
    public String getNameSpaceShortId() {
        return this.nameSpaceShortId;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return slsConfigs
     */
    public String getSlsConfigs() {
        return this.slsConfigs;
    }

    /**
     * @return slsLogEnvTags
     */
    public String getSlsLogEnvTags() {
        return this.slsLogEnvTags;
    }

    public static final class Builder extends Request.Builder<UpdateNamespaceSlsConfigsRequest, Builder> {
        private String nameSpaceShortId; 
        private String namespaceId; 
        private String slsConfigs; 
        private String slsLogEnvTags; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNamespaceSlsConfigsRequest request) {
            super(request);
            this.nameSpaceShortId = request.nameSpaceShortId;
            this.namespaceId = request.namespaceId;
            this.slsConfigs = request.slsConfigs;
            this.slsLogEnvTags = request.slsLogEnvTags;
        } 

        /**
         * <p>The short ID of the namespace. No need to specify a region ID. We recommend configuring this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder nameSpaceShortId(String nameSpaceShortId) {
            this.putQueryParameter("NameSpaceShortId", nameSpaceShortId);
            this.nameSpaceShortId = nameSpaceShortId;
            return this;
        }

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The logging configurations of Simple Log Service.</p>
         * <ul>
         * <li><code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>: Simple Log Service resources automatically created by Serverless App Engine (SAE) are used.</li>
         * <li>To use custom Simple Log Service resources, set this parameter to <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</li>
         * </ul>
         * <p>Take note of the following subparameters:</p>
         * <ul>
         * <li><strong>projectName</strong>: the name of the Simple Log Service project.</li>
         * <li><strong>logDir</strong>: the path in which logs are stored.</li>
         * <li><strong>logType</strong>: the log type. <strong>stdout</strong> indicates the standard output (stdout) logs of the container. You can specify only one stdout value for this parameter. If not specified, file logs are collected.</li>
         * <li><strong>logstoreName</strong>: the name of the Logstore in Simple Log Service.</li>
         * <li><strong>logtailName</strong>: the name of the Logtail in Simple Log Service. If not specified, a new Logtail is created.</li>
         * </ul>
         * <p>If logging configuration changes are not needed during job template deployment, specify <strong>SlsConfigs</strong> only in the first request. Omit this parameter in later requests. To stop using Simple Log Service, leave <strong>SlsConfigs</strong> empty.</p>
         * <blockquote>
         * <p>Projects automatically created by SAE for job templates are deleted when their corresponding job templates are deleted. Therefore, you should not select an existing SAE-created project for log collection.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</p>
         */
        public Builder slsConfigs(String slsConfigs) {
            this.putQueryParameter("SlsConfigs", slsConfigs);
            this.slsConfigs = slsConfigs;
            return this;
        }

        /**
         * SlsLogEnvTags.
         */
        public Builder slsLogEnvTags(String slsLogEnvTags) {
            this.putQueryParameter("SlsLogEnvTags", slsLogEnvTags);
            this.slsLogEnvTags = slsLogEnvTags;
            return this;
        }

        @Override
        public UpdateNamespaceSlsConfigsRequest build() {
            return new UpdateNamespaceSlsConfigsRequest(this);
        } 

    } 

}
