// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBTablesRecoveryStateRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBTablesRecoveryStateRequest</p>
 */
public class DescribeDBTablesRecoveryStateRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("RegionCode")
    private String regionCode;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DescribeDBTablesRecoveryStateRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionCode = builder.regionCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBTablesRecoveryStateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionCode
     */
    public String getRegionCode() {
        return this.regionCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeDBTablesRecoveryStateRequest, Builder> {
        private String instanceId; 
        private String regionCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBTablesRecoveryStateRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionCode = request.regionCode;
            this.regionId = request.regionId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionCode.
         */
        public Builder regionCode(String regionCode) {
            this.putQueryParameter("RegionCode", regionCode);
            this.regionCode = regionCode;
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
        public DescribeDBTablesRecoveryStateRequest build() {
            return new DescribeDBTablesRecoveryStateRequest(this);
        } 

    } 

}
