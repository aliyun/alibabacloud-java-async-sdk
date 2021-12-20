// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CancelUpdateStackRequest} extends {@link RequestModel}
 *
 * <p>CancelUpdateStackRequest</p>
 */
public class CancelUpdateStackRequest extends Request {
    @Query
    @NameInMap("CancelType")
    private String cancelType;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StackId")
    private String stackId;


    private CancelUpdateStackRequest(Builder builder) {
        super(builder);
        this.cancelType = builder.cancelType;
        this.regionId = builder.regionId;
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelUpdateStackRequest create() {
        return builder().build();
    }

    /**
     * @return cancelType
     */
    public String getCancelType() {
        return this.cancelType;
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

    public static final class Builder extends Request.Builder<Builder> {
        private String cancelType; 
        private String regionId; 
        private String stackId; 

        /**
         * <p>CancelType.</p>
         */
        public Builder cancelType(String cancelType) {
            this.putQueryParameter("CancelType", cancelType);
            this.cancelType = cancelType;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>StackId.</p>
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        public CancelUpdateStackRequest build() {
            return new CancelUpdateStackRequest(this);
        } 

    } 

}
