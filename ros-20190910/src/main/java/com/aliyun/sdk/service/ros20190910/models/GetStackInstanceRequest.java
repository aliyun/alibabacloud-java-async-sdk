// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetStackInstanceRequest</p>
 */
public class GetStackInstanceRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StackGroupName")
    @Validation(required = true)
    private String stackGroupName;

    @Query
    @NameInMap("StackInstanceAccountId")
    @Validation(required = true)
    private String stackInstanceAccountId;

    @Query
    @NameInMap("StackInstanceRegionId")
    @Validation(required = true)
    private String stackInstanceRegionId;

    private GetStackInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.stackGroupName = builder.stackGroupName;
        this.stackInstanceAccountId = builder.stackInstanceAccountId;
        this.stackInstanceRegionId = builder.stackInstanceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackInstanceRequest create() {
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

    /**
     * @return stackInstanceAccountId
     */
    public String getStackInstanceAccountId() {
        return this.stackInstanceAccountId;
    }

    /**
     * @return stackInstanceRegionId
     */
    public String getStackInstanceRegionId() {
        return this.stackInstanceRegionId;
    }

    public static final class Builder extends Request.Builder<GetStackInstanceRequest, Builder> {
        private String regionId; 
        private String stackGroupName; 
        private String stackInstanceAccountId; 
        private String stackInstanceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(GetStackInstanceRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.stackGroupName = response.stackGroupName;
            this.stackInstanceAccountId = response.stackInstanceAccountId;
            this.stackInstanceRegionId = response.stackInstanceRegionId;
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
         * StackGroupName.
         */
        public Builder stackGroupName(String stackGroupName) {
            this.putQueryParameter("StackGroupName", stackGroupName);
            this.stackGroupName = stackGroupName;
            return this;
        }

        /**
         * StackInstanceAccountId.
         */
        public Builder stackInstanceAccountId(String stackInstanceAccountId) {
            this.putQueryParameter("StackInstanceAccountId", stackInstanceAccountId);
            this.stackInstanceAccountId = stackInstanceAccountId;
            return this;
        }

        /**
         * StackInstanceRegionId.
         */
        public Builder stackInstanceRegionId(String stackInstanceRegionId) {
            this.putQueryParameter("StackInstanceRegionId", stackInstanceRegionId);
            this.stackInstanceRegionId = stackInstanceRegionId;
            return this;
        }

        @Override
        public GetStackInstanceRequest build() {
            return new GetStackInstanceRequest(this);
        } 

    } 

}
