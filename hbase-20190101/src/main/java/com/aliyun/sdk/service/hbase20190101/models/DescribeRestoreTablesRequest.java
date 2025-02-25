// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link DescribeRestoreTablesRequest} extends {@link RequestModel}
 *
 * <p>DescribeRestoreTablesRequest</p>
 */
public class DescribeRestoreTablesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreRecordId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String restoreRecordId;

    private DescribeRestoreTablesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.restoreRecordId = builder.restoreRecordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestoreTablesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return restoreRecordId
     */
    public String getRestoreRecordId() {
        return this.restoreRecordId;
    }

    public static final class Builder extends Request.Builder<DescribeRestoreTablesRequest, Builder> {
        private String clusterId; 
        private String restoreRecordId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRestoreTablesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.restoreRecordId = request.restoreRecordId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-m5eznlga4k5bcxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020110514xxxx</p>
         */
        public Builder restoreRecordId(String restoreRecordId) {
            this.putQueryParameter("RestoreRecordId", restoreRecordId);
            this.restoreRecordId = restoreRecordId;
            return this;
        }

        @Override
        public DescribeRestoreTablesRequest build() {
            return new DescribeRestoreTablesRequest(this);
        } 

    } 

}
