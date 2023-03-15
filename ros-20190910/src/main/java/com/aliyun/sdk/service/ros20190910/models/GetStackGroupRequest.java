// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackGroupRequest} extends {@link RequestModel}
 *
 * <p>GetStackGroupRequest</p>
 */
public class GetStackGroupRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StackGroupId")
    private String stackGroupId;

    @Query
    @NameInMap("StackGroupName")
    private String stackGroupName;

    private GetStackGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.stackGroupId = builder.stackGroupId;
        this.stackGroupName = builder.stackGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackGroupRequest create() {
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
     * @return stackGroupId
     */
    public String getStackGroupId() {
        return this.stackGroupId;
    }

    /**
     * @return stackGroupName
     */
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public static final class Builder extends Request.Builder<GetStackGroupRequest, Builder> {
        private String regionId; 
        private String stackGroupId; 
        private String stackGroupName; 

        private Builder() {
            super();
        } 

        private Builder(GetStackGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.stackGroupId = request.stackGroupId;
            this.stackGroupName = request.stackGroupName;
        } 

        /**
         * The region ID of the stack group. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the stack group.
         * <p>
         * 
         * >  You must specify one of the StackGroupName and StackGroupId parameters.
         */
        public Builder stackGroupId(String stackGroupId) {
            this.putQueryParameter("StackGroupId", stackGroupId);
            this.stackGroupId = stackGroupId;
            return this;
        }

        /**
         * The name of the stack group. The name must be unique within a region.
         * <p>
         * 
         * The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). It must start with a digit or letter.
         * 
         * >  You must specify one of the StackGroupName and StackGroupId parameters.
         */
        public Builder stackGroupName(String stackGroupName) {
            this.putQueryParameter("StackGroupName", stackGroupName);
            this.stackGroupName = stackGroupName;
            return this;
        }

        @Override
        public GetStackGroupRequest build() {
            return new GetStackGroupRequest(this);
        } 

    } 

}
