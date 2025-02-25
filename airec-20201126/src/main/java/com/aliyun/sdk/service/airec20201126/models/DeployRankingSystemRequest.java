// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeployRankingSystemRequest} extends {@link RequestModel}
 *
 * <p>DeployRankingSystemRequest</p>
 */
public class DeployRankingSystemRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.Map < String, ? > body;

    private DeployRankingSystemRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployRankingSystemRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return body
     */
    public java.util.Map < String, ? > getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<DeployRankingSystemRequest, Builder> {
        private String instanceId; 
        private String name; 
        private java.util.Map < String, ? > body; 

        private Builder() {
            super();
        } 

        private Builder(DeployRankingSystemRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.body = request.body;
        } 

        /**
         * <p>The name of the ranking service.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The configuration that you want to modify.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The schema of the response parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;meta&quot;: {
         *     &quot;autoDeploy&quot;: true,
         *     &quot;autoDeployAuc&quot;: &quot;0.9&quot;,
         *     &quot;conf&quot;:&quot;&quot;,
         *     &quot;predictEngineType&quot;: &quot;EAS&quot;,
         *     &quot;predictEngine&quot;:{
         *         &quot;resourceId&quot;: &quot;eas-oljkkdrggxhx7eizjd&quot;
         *     }
         *   }</p>
         */
        public Builder body(java.util.Map < String, ? > body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public DeployRankingSystemRequest build() {
            return new DeployRankingSystemRequest(this);
        } 

    } 

}
