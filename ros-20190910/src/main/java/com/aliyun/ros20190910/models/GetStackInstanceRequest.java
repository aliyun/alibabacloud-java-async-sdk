// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetStackInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetStackInstanceRequest</p>
 */
public class GetStackInstanceRequest extends Request {
    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StackGroupName")
    private String stackGroupName;

    @Query
    @NameInMap("StackInstanceAccountId")
    private String stackInstanceAccountId;

    @Query
    @NameInMap("StackInstanceRegionId")
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

    public static final class Builder extends Request.Builder<Builder> {
        private String regionId; 
        private String stackGroupName; 
        private String stackInstanceAccountId; 
        private String stackInstanceRegionId; 

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>StackGroupName.</p>
         */
        public Builder stackGroupName(String stackGroupName) {
            this.putQueryParameter("StackGroupName", stackGroupName);
            this.stackGroupName = stackGroupName;
            return this;
        }

        /**
         * <p>StackInstanceAccountId.</p>
         */
        public Builder stackInstanceAccountId(String stackInstanceAccountId) {
            this.putQueryParameter("StackInstanceAccountId", stackInstanceAccountId);
            this.stackInstanceAccountId = stackInstanceAccountId;
            return this;
        }

        /**
         * <p>StackInstanceRegionId.</p>
         */
        public Builder stackInstanceRegionId(String stackInstanceRegionId) {
            this.putQueryParameter("StackInstanceRegionId", stackInstanceRegionId);
            this.stackInstanceRegionId = stackInstanceRegionId;
            return this;
        }

        public GetStackInstanceRequest build() {
            return new GetStackInstanceRequest(this);
        } 

    } 

}
