// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceSSLRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceSSLRequest</p>
 */
public class ModifyInstanceSSLRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableSSL")
    @com.aliyun.core.annotation.Validation(required = true)
    private String enableSSL;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private ModifyInstanceSSLRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.enableSSL = builder.enableSSL;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceSSLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return enableSSL
     */
    public String getEnableSSL() {
        return this.enableSSL;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceSSLRequest, Builder> {
        private String regionId; 
        private String enableSSL; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceSSLRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.enableSSL = request.enableSSL;
            this.instanceId = request.instanceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The operation to modify the SSL status. Valid values:
         * <p>
         * 
         * - open: Enable SSL encryption.
         * 
         * - update: Update the CA certificate.
         * 
         * - close: Disable SSL encryption.
         */
        public Builder enableSSL(String enableSSL) {
            this.putBodyParameter("EnableSSL", enableSSL);
            this.enableSSL = enableSSL;
            return this;
        }

        /**
         * The ID of the OceanBase cluster.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ModifyInstanceSSLRequest build() {
            return new ModifyInstanceSSLRequest(this);
        } 

    } 

}
