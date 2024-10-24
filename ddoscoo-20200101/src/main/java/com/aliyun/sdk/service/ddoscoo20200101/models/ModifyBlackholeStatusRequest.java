// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyBlackholeStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyBlackholeStatusRequest</p>
 */
public class ModifyBlackholeStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BlackholeStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String blackholeStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private ModifyBlackholeStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.blackholeStatus = builder.blackholeStatus;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBlackholeStatusRequest create() {
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
     * @return blackholeStatus
     */
    public String getBlackholeStatus() {
        return this.blackholeStatus;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ModifyBlackholeStatusRequest, Builder> {
        private String regionId; 
        private String blackholeStatus; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBlackholeStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.blackholeStatus = request.blackholeStatus;
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
         * <p>The action that you want to perform on the instance. Set the value to <strong>undo</strong>, which indicates that you want to deactivate blackhole filtering.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>undo</p>
         */
        public Builder blackholeStatus(String blackholeStatus) {
            this.putQueryParameter("BlackholeStatus", blackholeStatus);
            this.blackholeStatus = blackholeStatus;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-mp91j1ao****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ModifyBlackholeStatusRequest build() {
            return new ModifyBlackholeStatusRequest(this);
        } 

    } 

}
