// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountAllPrivilegesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccountAllPrivilegesRequest</p>
 */
public class DescribeAccountAllPrivilegesRequest extends Request {
    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("Marker")
    private String marker;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeAccountAllPrivilegesRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.DBClusterId = builder.DBClusterId;
        this.marker = builder.marker;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountAllPrivilegesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeAccountAllPrivilegesRequest, Builder> {
        private String accountName; 
        private String DBClusterId; 
        private String marker; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAccountAllPrivilegesRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.DBClusterId = request.DBClusterId;
            this.marker = request.marker;
            this.regionId = request.regionId;
        } 

        /**
         * The name of the database account.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Specifies the start position marker from which to return results. If you receive a response indicating that the results are truncated, set this parameter to the value of the `Marker` parameter in the response that you received.
         */
        public Builder marker(String marker) {
            this.putQueryParameter("Marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * The region ID of the cluster.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeAccountAllPrivilegesRequest build() {
            return new DescribeAccountAllPrivilegesRequest(this);
        } 

    } 

}
