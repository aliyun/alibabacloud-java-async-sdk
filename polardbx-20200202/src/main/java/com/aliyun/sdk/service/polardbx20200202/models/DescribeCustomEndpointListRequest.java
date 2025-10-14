// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeCustomEndpointListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomEndpointListRequest</p>
 */
public class DescribeCustomEndpointListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckDeleteCN")
    private Boolean checkDeleteCN;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomEndpointIds")
    private String customEndpointIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeCustomEndpointListRequest(Builder builder) {
        super(builder);
        this.checkDeleteCN = builder.checkDeleteCN;
        this.customEndpointIds = builder.customEndpointIds;
        this.DBInstanceName = builder.DBInstanceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomEndpointListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkDeleteCN
     */
    public Boolean getCheckDeleteCN() {
        return this.checkDeleteCN;
    }

    /**
     * @return customEndpointIds
     */
    public String getCustomEndpointIds() {
        return this.customEndpointIds;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeCustomEndpointListRequest, Builder> {
        private Boolean checkDeleteCN; 
        private String customEndpointIds; 
        private String DBInstanceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomEndpointListRequest request) {
            super(request);
            this.checkDeleteCN = request.checkDeleteCN;
            this.customEndpointIds = request.customEndpointIds;
            this.DBInstanceName = request.DBInstanceName;
            this.regionId = request.regionId;
        } 

        /**
         * CheckDeleteCN.
         */
        public Builder checkDeleteCN(Boolean checkDeleteCN) {
            this.putQueryParameter("CheckDeleteCN", checkDeleteCN);
            this.checkDeleteCN = checkDeleteCN;
            return this;
        }

        /**
         * CustomEndpointIds.
         */
        public Builder customEndpointIds(String customEndpointIds) {
            this.putQueryParameter("CustomEndpointIds", customEndpointIds);
            this.customEndpointIds = customEndpointIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-xxx</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
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
        public DescribeCustomEndpointListRequest build() {
            return new DescribeCustomEndpointListRequest(this);
        } 

    } 

}
