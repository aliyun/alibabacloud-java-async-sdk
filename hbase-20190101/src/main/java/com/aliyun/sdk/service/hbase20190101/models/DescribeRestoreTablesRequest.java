// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestoreTablesRequest} extends {@link RequestModel}
 *
 * <p>DescribeRestoreTablesRequest</p>
 */
public class DescribeRestoreTablesRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("RestoreRecordId")
    @Validation(required = true)
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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * RestoreRecordId.
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
