// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAccountAllPrivilegesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccountAllPrivilegesRequest</p>
 */
public class DescribeAccountAllPrivilegesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Marker")
    private String marker;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The database account name for the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>account1</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;The cluster ID for the Enterprise Edition, Basic Edition, or Data Lakehouse Edition.
         * &lt;props=&quot;intl&quot;&gt;The cluster ID for the Data Lakehouse Edition.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp14t95lun0w****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>If the response is truncated, use the <code>Marker</code> value from the response in this field to retrieve the next set of results.</p>
         * 
         * <strong>example:</strong>
         * <p>EXAMPLE</p>
         */
        public Builder marker(String marker) {
            this.putQueryParameter("Marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
