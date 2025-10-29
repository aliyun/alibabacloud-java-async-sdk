// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarFsAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribePolarFsAttributeRequest</p>
 */
public class DescribePolarFsAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String polarFsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryFuseMountInfo")
    private Boolean queryFuseMountInfo;

    private DescribePolarFsAttributeRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.queryFuseMountInfo = builder.queryFuseMountInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarFsAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    /**
     * @return queryFuseMountInfo
     */
    public Boolean getQueryFuseMountInfo() {
        return this.queryFuseMountInfo;
    }

    public static final class Builder extends Request.Builder<DescribePolarFsAttributeRequest, Builder> {
        private String DBClusterId; 
        private String polarFsInstanceId; 
        private Boolean queryFuseMountInfo; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolarFsAttributeRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.polarFsInstanceId = request.polarFsInstanceId;
            this.queryFuseMountInfo = request.queryFuseMountInfo;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-2ze0i74ka607*****</p>
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.putQueryParameter("PolarFsInstanceId", polarFsInstanceId);
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        /**
         * QueryFuseMountInfo.
         */
        public Builder queryFuseMountInfo(Boolean queryFuseMountInfo) {
            this.putQueryParameter("QueryFuseMountInfo", queryFuseMountInfo);
            this.queryFuseMountInfo = queryFuseMountInfo;
            return this;
        }

        @Override
        public DescribePolarFsAttributeRequest build() {
            return new DescribePolarFsAttributeRequest(this);
        } 

    } 

}
