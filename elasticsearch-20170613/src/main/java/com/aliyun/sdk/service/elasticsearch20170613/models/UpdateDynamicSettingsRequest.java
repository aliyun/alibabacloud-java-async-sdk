// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * mode.
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
