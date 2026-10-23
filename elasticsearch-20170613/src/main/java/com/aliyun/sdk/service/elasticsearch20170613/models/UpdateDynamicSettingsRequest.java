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
 * {@link UpdateDynamicSettingsRequest} extends {@link RequestModel}
 *
 * <p>UpdateDynamicSettingsRequest</p>
 */
public class UpdateDynamicSettingsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("mode")
    private String mode;

    private UpdateDynamicSettingsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.body = builder.body;
        this.mode = builder.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDynamicSettingsRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    public static final class Builder extends Request.Builder<UpdateDynamicSettingsRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private String regionId; 
        private String body; 
        private String mode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDynamicSettingsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
            this.body = request.body;
            this.mode = request.mode;
        } 

        /**
         * <p>The Elasticsearch instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1qu7ei000p****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure idempotence.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The region ID of the Elasticsearch instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The dynamic configurations of the cluster to be updated. Specify a JSON object where the keys are configuration item names and the values are configuration values.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;indices.recovery.max_bytes_per_sec&quot;:&quot;100mb&quot;}</p>
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>The effective mode for dynamic configurations. Valid values:</p>
         * <ul>
         * <li>persistent: persistent configurations.</li>
         * <li>transient: temporary configurations, which become invalid after the cluster is restarted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>persistent</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("mode", mode);
            this.mode = mode;
            return this;
        }

        @Override
        public UpdateDynamicSettingsRequest build() {
            return new UpdateDynamicSettingsRequest(this);
        } 

    } 

}
