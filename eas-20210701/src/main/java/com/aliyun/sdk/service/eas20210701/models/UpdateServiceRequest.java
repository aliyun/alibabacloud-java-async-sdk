// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link UpdateServiceRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceRequest</p>
 */
public class UpdateServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberToUpdate")
    private String memberToUpdate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateType")
    private String updateType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private UpdateServiceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.memberToUpdate = builder.memberToUpdate;
        this.updateType = builder.updateType;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return memberToUpdate
     */
    public String getMemberToUpdate() {
        return this.memberToUpdate;
    }

    /**
     * @return updateType
     */
    public String getUpdateType() {
        return this.updateType;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateServiceRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private String clientToken; 
        private Boolean dryRun; 
        private String memberToUpdate; 
        private String updateType; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.memberToUpdate = request.memberToUpdate;
            this.updateType = request.updateType;
            this.body = request.body;
        } 

        /**
         * <p>The region ID of the service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the service. For more information about how to view the service name, see <a href="https://help.aliyun.com/document_detail/412109.html">ListServices</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The client token used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5db780a0-9d3e-4f35-a84a-xxxxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to only precheck the request.</p>
         * <ul>
         * <li><p>true: sends a precheck request without performing the actual operation. If the precheck fails, the corresponding error is returned. If the precheck succeeds, the error code DryRunOperation is returned.</p>
         * </li>
         * <li><p>false: sends a normal request. This is the default value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The type of the child service to update. Note: This parameter takes effect only for aggregated services.</p>
         * 
         * <strong>example:</strong>
         * <p>LLMPrefill</p>
         */
        public Builder memberToUpdate(String memberToUpdate) {
            this.putQueryParameter("MemberToUpdate", memberToUpdate);
            this.memberToUpdate = memberToUpdate;
            return this;
        }

        /**
         * <p>The update type of the service. Both merge and replace modes are supported. If this parameter is not specified, the merge mode is used by default.</p>
         * <ul>
         * <li>merge: the merge mode. If the original service configuration JSON is
         * <code>{&quot;a&quot;:&quot;b&quot;}</code> and the updated configuration is <code>{&quot;c&quot;:&quot;d&quot;}</code>, the final configuration in merge mode is <code>{&quot;a&quot;:&quot;b&quot;,&quot;c&quot;:&quot;d&quot;}</code>.</li>
         * <li>replace: the replace mode. If the original service configuration JSON is
         * <code>{&quot;a&quot;:&quot;b&quot;}</code> and the updated configuration is <code>{&quot;c&quot;:&quot;d&quot;}</code>, the final configuration in replace mode is <code>{&quot;c&quot;:&quot;d&quot;}</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>merge</p>
         */
        public Builder updateType(String updateType) {
            this.putQueryParameter("UpdateType", updateType);
            this.updateType = updateType;
            return this;
        }

        /**
         * <p>The updated configuration. For more information about parameter settings, see <a href="https://help.aliyun.com/document_detail/412086.html">CreateService</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;name&quot;: &quot;foo&quot;,
         *       &quot;model_path&quot;: &quot;<a href="http://path/to/model.tar.gz">http://path/to/model.tar.gz</a>&quot;,
         *       &quot;processor&quot;: &quot;tensorflow_cpu&quot;,
         *       &quot;metadata&quot;: {
         *             &quot;instance&quot;: 2,
         *             &quot;memory&quot;: 7000,
         *             &quot;cpu&quot;: 4
         *       }
         * }</p>
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateServiceRequest build() {
            return new UpdateServiceRequest(this);
        } 

    } 

}
