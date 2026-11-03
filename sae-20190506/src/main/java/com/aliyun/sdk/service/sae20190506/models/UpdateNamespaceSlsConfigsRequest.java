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
         * <p>The short ID of the namespace. The region is not required. This parameter is recommended.</p>
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
         * <p>The ID of the namespace.</p>
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
         * <p>The configuration for collecting logs to Simple Log Service (SLS).</p>
         * <ul>
         * <li>To use SLS resources automatically created by Serverless App Engine (SAE): <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</li>
         * <li>To use custom SLS resources: <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</li>
         * </ul>
         * <p>The parameter settings are as follows:</p>
         * <ul>
         * <li><strong>projectName</strong>: the name of the SLS project.  </li>
         * <li><strong>logDir</strong>: the log path.</li>
         * <li><strong>logType</strong>: the log type. <strong>stdout</strong> indicates container standard output logs. Only one stdout log can be set. If it is not set, file logs are collected.</li>
         * <li><strong>logstoreName</strong>: the name of the SLS Logstore.</li>
         * <li><strong>logtailName</strong>: the name of the SLS Logtail. If this parameter is not specified, a new Logtail is created.</li>
         * </ul>
         * <p>If the SLS collection configuration remains unchanged during multiple deployments, you do not need to set this parameter (that is, the <strong>SlsConfigs</strong> field is not required in the request). If you no longer need the SLS collection feature, you must set the value of this field to an empty string (that is, set the <strong>SlsConfigs</strong> field to &quot;&quot;) in the request.</p>
         * <blockquote>
         * <p>A project automatically created with a job template is deleted when the job template is deleted. Therefore, when you select an existing project, you cannot select a project automatically created by SAE.</p>
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
         * <p>sls log tags</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
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
