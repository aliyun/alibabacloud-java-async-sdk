// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBTablesRecoveryStateRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBTablesRecoveryStateRequest</p>
 */
public class DescribeDBTablesRecoveryStateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionCode")
    private String regionCode;

    private DescribeDBTablesRecoveryStateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.regionCode = builder.regionCode;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<DescribeDBTablesRecoveryStateRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String regionCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBTablesRecoveryStateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.regionCode = request.regionCode;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
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

        @Override
        public DescribeDBTablesRecoveryStateRequest build() {
            return new DescribeDBTablesRecoveryStateRequest(this);
        } 

    } 

}
