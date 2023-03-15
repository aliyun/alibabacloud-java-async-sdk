// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteStackGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteStackGroupRequest</p>
 */
public class DeleteStackGroupRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StackGroupName")
    @Validation(required = true)
    private String stackGroupName;

    private DeleteStackGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.stackGroupName = builder.stackGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteStackGroupRequest create() {
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
     * @return stackGroupName
     */
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public static final class Builder extends Request.Builder<DeleteStackGroupRequest, Builder> {
        private String regionId; 
        private String stackGroupName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteStackGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.stackGroupName = request.stackGroupName;
        } 

        /**
         * The ID of the region to which the stack group belongs. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the stack group. The name must be unique in a region.
         * <p>
         * 
         * The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (\_). The name must start with a digit or a letter.
         */
        public Builder stackGroupName(String stackGroupName) {
            this.putQueryParameter("StackGroupName", stackGroupName);
            this.stackGroupName = stackGroupName;
            return this;
        }

        @Override
        public DeleteStackGroupRequest build() {
            return new DeleteStackGroupRequest(this);
        } 

    } 

}
