// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDeletionProtectionRequest} extends {@link RequestModel}
 *
 * <p>SetDeletionProtectionRequest</p>
 */
public class SetDeletionProtectionRequest extends Request {
    @Query
    @NameInMap("DeletionProtection")
    @Validation(required = true)
    private String deletionProtection;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StackId")
    @Validation(required = true)
    private String stackId;

    private SetDeletionProtectionRequest(Builder builder) {
        super(builder);
        this.deletionProtection = builder.deletionProtection;
        this.regionId = builder.regionId;
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDeletionProtectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deletionProtection
     */
    public String getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    public static final class Builder extends Request.Builder<SetDeletionProtectionRequest, Builder> {
        private String deletionProtection; 
        private String regionId; 
        private String stackId; 

        private Builder() {
            super();
        } 

        private Builder(SetDeletionProtectionRequest request) {
            super(request);
            this.deletionProtection = request.deletionProtection;
            this.regionId = request.regionId;
            this.stackId = request.stackId;
        } 

        /**
         * Indicates whether stack deletion protection is enabled. Valid values:
         * <p>
         * 
         * *   Enabled: enables the stack deletion protection.
         * *   Disabled (default): Resource stack deletion protection is Disabled. You can use the console or API(DeleteStack) to release the stack resources.
         * 
         * >  The deletion of nested stacks is the same as the root stack.
         */
        public Builder deletionProtection(String deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * The region ID of the stack. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the stack.
         * <p>
         * 
         * The delete protection attribute of a nested stack is determined by the root stack and remains unchanged from the root stack.
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        @Override
        public SetDeletionProtectionRequest build() {
            return new SetDeletionProtectionRequest(this);
        } 

    } 

}
