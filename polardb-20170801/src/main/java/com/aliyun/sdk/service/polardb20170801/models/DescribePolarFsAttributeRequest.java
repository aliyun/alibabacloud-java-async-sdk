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
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of all clusters under your account, including cluster IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1q76364ird*****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The Polarlakebase instance ID.</p>
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
         * <p>Specifies whether to query Fuse mount information. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
