// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigOptionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeConfigOptionsRequest</p>
 */
public class DescribeConfigOptionsRequest extends Request {
    @Query
    @NameInMap("EnvId")
    private String envId;

    @Query
    @NameInMap("ProfileName")
    private String profileName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StackId")
    private String stackId;

    private DescribeConfigOptionsRequest(Builder builder) {
        super(builder);
        this.envId = builder.envId;
        this.profileName = builder.profileName;
        this.regionId = builder.regionId;
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigOptionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return envId
     */
    public String getEnvId() {
        return this.envId;
    }

    /**
     * @return profileName
     */
    public String getProfileName() {
        return this.profileName;
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

    public static final class Builder extends Request.Builder<DescribeConfigOptionsRequest, Builder> {
        private String envId; 
        private String profileName; 
        private String regionId; 
        private String stackId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConfigOptionsRequest response) {
            super(response);
            this.envId = response.envId;
            this.profileName = response.profileName;
            this.regionId = response.regionId;
            this.stackId = response.stackId;
        } 

        /**
         * EnvId.
         */
        public Builder envId(String envId) {
            this.putQueryParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * ProfileName.
         */
        public Builder profileName(String profileName) {
            this.putQueryParameter("ProfileName", profileName);
            this.profileName = profileName;
            return this;
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
         * StackId.
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        @Override
        public DescribeConfigOptionsRequest build() {
            return new DescribeConfigOptionsRequest(this);
        } 

    } 

}
