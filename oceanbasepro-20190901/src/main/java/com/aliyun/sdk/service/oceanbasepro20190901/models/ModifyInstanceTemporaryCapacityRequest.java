// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceTemporaryCapacityRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceTemporaryCapacityRequest</p>
 */
public class ModifyInstanceTemporaryCapacityRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DiskSize")
    private String diskSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Spec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spec;

    private ModifyInstanceTemporaryCapacityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.acceptLanguage = builder.acceptLanguage;
        this.diskSize = builder.diskSize;
        this.instanceId = builder.instanceId;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceTemporaryCapacityRequest create() {
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
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return diskSize
     */
    public String getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceTemporaryCapacityRequest, Builder> {
        private String regionId; 
        private String acceptLanguage; 
        private String diskSize; 
        private String instanceId; 
        private String spec; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceTemporaryCapacityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.acceptLanguage = request.acceptLanguage;
            this.diskSize = request.diskSize;
            this.instanceId = request.instanceId;
            this.spec = request.spec;
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
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putBodyParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The disk size. Unit: GB.
         */
        public Builder diskSize(String diskSize) {
            this.putBodyParameter("DiskSize", diskSize);
            this.diskSize = diskSize;
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

        /**
         * Specification.
         */
        public Builder spec(String spec) {
            this.putBodyParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        @Override
        public ModifyInstanceTemporaryCapacityRequest build() {
            return new ModifyInstanceTemporaryCapacityRequest(this);
        } 

    } 

}
