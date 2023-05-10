// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteStackRequest} extends {@link RequestModel}
 *
 * <p>DeleteStackRequest</p>
 */
public class DeleteStackRequest extends Request {
    @Query
    @NameInMap("DeleteOptions")
    private java.util.List < String > deleteOptions;

    @Query
    @NameInMap("RamRoleName")
    private String ramRoleName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RetainAllResources")
    private Boolean retainAllResources;

    @Query
    @NameInMap("RetainResources")
    private java.util.List < String > retainResources;

    @Query
    @NameInMap("StackId")
    @Validation(required = true)
    private String stackId;

    private DeleteStackRequest(Builder builder) {
        super(builder);
        this.deleteOptions = builder.deleteOptions;
        this.ramRoleName = builder.ramRoleName;
        this.regionId = builder.regionId;
        this.retainAllResources = builder.retainAllResources;
        this.retainResources = builder.retainResources;
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteStackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleteOptions
     */
    public java.util.List < String > getDeleteOptions() {
        return this.deleteOptions;
    }

    /**
     * @return ramRoleName
     */
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return retainAllResources
     */
    public Boolean getRetainAllResources() {
        return this.retainAllResources;
    }

    /**
     * @return retainResources
     */
    public java.util.List < String > getRetainResources() {
        return this.retainResources;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    public static final class Builder extends Request.Builder<DeleteStackRequest, Builder> {
        private java.util.List < String > deleteOptions; 
        private String ramRoleName; 
        private String regionId; 
        private Boolean retainAllResources; 
        private java.util.List < String > retainResources; 
        private String stackId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteStackRequest request) {
            super(request);
            this.deleteOptions = request.deleteOptions;
            this.ramRoleName = request.ramRoleName;
            this.regionId = request.regionId;
            this.retainAllResources = request.retainAllResources;
            this.retainResources = request.retainResources;
            this.stackId = request.stackId;
        } 

        /**
         * DeleteOptions.
         */
        public Builder deleteOptions(java.util.List < String > deleteOptions) {
            this.putQueryParameter("DeleteOptions", deleteOptions);
            this.deleteOptions = deleteOptions;
            return this;
        }

        /**
         * The name of resource N that you want to retain.
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * The name of resource N that you want to retain.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the RAM role. Resource Orchestration Service (ROS) assumes the RAM role to create the stack and uses credentials of the role to call the APIs of Alibaba Cloud services.
         * <p>
         * 
         * ROS assumes the RAM role to perform operations on the stack. If you have permissions to perform operations on the stack but do not have permissions to use the RAM role, ROS still assumes the RAM role. You must make sure that the least privileges are granted to the role.
         * 
         * If you leave this parameter empty when you call the DeleteStack operation, ROS cannot assume the existing RAM role that is associated with the stack. If you want ROS to assume a RAM role, you must specify this parameter. If no role is available for ROS to assume, ROS uses a temporary credential that is generated from the credentials of your account.
         * 
         * The name of the RAM role can be up to 64 bytes in length.
         */
        public Builder retainAllResources(Boolean retainAllResources) {
            this.putQueryParameter("RetainAllResources", retainAllResources);
            this.retainAllResources = retainAllResources;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder retainResources(java.util.List < String > retainResources) {
            this.putQueryParameter("RetainResources", retainResources);
            this.retainResources = retainResources;
            return this;
        }

        /**
         * The region ID of the stack. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        @Override
        public DeleteStackRequest build() {
            return new DeleteStackRequest(this);
        } 

    } 

}
