// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link PluginAnalysisRequest} extends {@link RequestModel}
 *
 * <p>PluginAnalysisRequest</p>
 */
public class PluginAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private String dryRun;

    private PluginAnalysisRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.body = builder.body;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PluginAnalysisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<PluginAnalysisRequest, Builder> {
        private String instanceId; 
        private String body; 
        private String dryRun; 

        private Builder() {
            super();
        } 

        private Builder(PluginAnalysisRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.body = request.body;
            this.dryRun = request.dryRun;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-6ja1ro4jt000c****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The request body parameters.</p>
         * <pre><code class="language-[">  {
         *     &quot;name&quot;: &quot;plugin_name.zip&quot;,// plugin name
         *     &quot;ossObject&quot;: {
         *       &quot;bucketName&quot;: &quot;bucketName&quot;,// oss bucket name
         *       &quot;key&quot;: &quot;my_plugin_dir/plugin_name.zip&quot; // oss file name 
         *     }
         *   }
         * ]
         * `
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;name&quot;: &quot;plugin_name.zip&quot;,// plugin name
         *     &quot;ossObject&quot;: {
         *       &quot;bucketName&quot;: &quot;bucketName&quot;,// oss bucket name
         *       &quot;key&quot;: &quot;my_plugin_dir/plugin_name.zip&quot; // oss file name 
         *     }
         *   }</p>
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>Specifies whether to perform a pre-upload check. Valid values:</p>
         * <ul>
         * <li>true: Only performs the check.</li>
         * <li>false: Directly uploads the plug-in.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public PluginAnalysisRequest build() {
            return new PluginAnalysisRequest(this);
        } 

    } 

}
