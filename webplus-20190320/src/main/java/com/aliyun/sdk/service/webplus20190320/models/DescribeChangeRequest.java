// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChangeRequest} extends {@link RequestModel}
 *
 * <p>DescribeChangeRequest</p>
 */
public class DescribeChangeRequest extends Request {
    @Query
    @NameInMap("ChangeId")
    private String changeId;

    @Query
    @NameInMap("EnvId")
    private String envId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DescribeChangeRequest(Builder builder) {
        super(builder);
        this.changeId = builder.changeId;
        this.envId = builder.envId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChangeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeId
     */
    public String getChangeId() {
        return this.changeId;
    }

    /**
     * @return envId
     */
    public String getEnvId() {
        return this.envId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeChangeRequest, Builder> {
        private String changeId; 
        private String envId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeChangeRequest response) {
            super(response);
            this.changeId = response.changeId;
            this.envId = response.envId;
            this.regionId = response.regionId;
        } 

        /**
         * ChangeId.
         */
        public Builder changeId(String changeId) {
            this.putQueryParameter("ChangeId", changeId);
            this.changeId = changeId;
            return this;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeChangeRequest build() {
            return new DescribeChangeRequest(this);
        } 

    } 

}
