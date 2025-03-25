// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeDownloadRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDownloadRecordsRequest</p>
 */
public class DescribeDownloadRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownloadTaskType")
    private String downloadTaskType;

    private DescribeDownloadRecordsRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.downloadTaskType = builder.downloadTaskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDownloadRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return downloadTaskType
     */
    public String getDownloadTaskType() {
        return this.downloadTaskType;
    }

    public static final class Builder extends Request.Builder<DescribeDownloadRecordsRequest, Builder> {
        private String DBInstanceId; 
        private String downloadTaskType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDownloadRecordsRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.downloadTaskType = request.downloadTaskType;
        } 

        /**
         * <p>The instance ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * DownloadTaskType.
         */
        public Builder downloadTaskType(String downloadTaskType) {
            this.putQueryParameter("DownloadTaskType", downloadTaskType);
            this.downloadTaskType = downloadTaskType;
            return this;
        }

        @Override
        public DescribeDownloadRecordsRequest build() {
            return new DescribeDownloadRecordsRequest(this);
        } 

    } 

}
