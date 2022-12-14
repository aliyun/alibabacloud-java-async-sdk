// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDownloadSupportRequest} extends {@link RequestModel}
 *
 * <p>DescribeDownloadSupportRequest</p>
 */
public class DescribeDownloadSupportRequest extends Request {
    @Query
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    @Query
    @NameInMap("RegionCode")
    @Validation(required = true)
    private String regionCode;

    private DescribeDownloadSupportRequest(Builder builder) {
        super(builder);
        this.instanceName = builder.instanceName;
        this.regionCode = builder.regionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDownloadSupportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return regionCode
     */
    public String getRegionCode() {
        return this.regionCode;
    }

    public static final class Builder extends Request.Builder<DescribeDownloadSupportRequest, Builder> {
        private String instanceName; 
        private String regionCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDownloadSupportRequest request) {
            super(request);
            this.instanceName = request.instanceName;
            this.regionCode = request.regionCode;
        } 

        /**
         * The ID of the instance.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The ID of the region in which the instance resides. You can call the [DescribeDBInstanceAttribute](~~26231~~) operation to query the region ID of the instance.
         */
        public Builder regionCode(String regionCode) {
            this.putQueryParameter("RegionCode", regionCode);
            this.regionCode = regionCode;
            return this;
        }

        @Override
        public DescribeDownloadSupportRequest build() {
            return new DescribeDownloadSupportRequest(this);
        } 

    } 

}
