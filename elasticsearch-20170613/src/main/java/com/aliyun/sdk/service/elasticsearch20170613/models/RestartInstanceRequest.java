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
 * {@link RestartInstanceRequest} extends {@link RequestModel}
 *
 * <p>RestartInstanceRequest</p>
 */
public class RestartInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("force")
    private Boolean force;

    private RestartInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
        this.force = builder.force;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartInstanceRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    public static final class Builder extends Request.Builder<RestartInstanceRequest, Builder> {
        private String instanceId; 
        private String body; 
        private String clientToken; 
        private Boolean force; 

        private Builder() {
            super();
        } 

        private Builder(RestartInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.body = request.body;
            this.clientToken = request.clientToken;
            this.force = request.force;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-nif1q8auz0003****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The restart parameter information.</p>
         * 
         * <strong>example:</strong>
         * <ol>
         * <li>restart nodes example:
         * {
         *   &quot;restartType&quot;: &quot;nodeIp&quot;,
         *   &quot;nodes&quot;: [
         *  &quot;es-cn-xx-data-j-0&quot;
         *   ],
         *   &quot;blueGreenDep&quot;: false
         * }</li>
         * <li>restart instance example:
         * {
         *   &quot;restartType&quot;: &quot;instance&quot;,
         *   &quot;blueGreenDep&quot;: false
         * }</li>
         * </ol>
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>A unique token used to ensure the idempotence of the request. The client generates this value. The value must be unique among different requests and cannot exceed 64 ASCII characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to ignore the cluster status and forcibly restart the cluster.</p>
         * <ul>
         * <li>true: ignores the cluster status</li>
         * <li>false (default): does not ignore the cluster status</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("force", force);
            this.force = force;
            return this;
        }

        @Override
        public RestartInstanceRequest build() {
            return new RestartInstanceRequest(this);
        } 

    } 

}
