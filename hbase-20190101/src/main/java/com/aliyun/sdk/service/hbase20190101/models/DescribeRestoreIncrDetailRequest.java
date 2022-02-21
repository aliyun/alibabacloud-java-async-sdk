// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestoreIncrDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeRestoreIncrDetailRequest</p>
 */
public class DescribeRestoreIncrDetailRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("RestoreRecordId")
    @Validation(required = true)
    private String restoreRecordId;

    private DescribeRestoreIncrDetailRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.restoreRecordId = builder.restoreRecordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestoreIncrDetailRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeRestoreIncrDetailRequest, Builder> {
        private String clusterId; 
        private String restoreRecordId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRestoreIncrDetailRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.restoreRecordId = response.restoreRecordId;
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
        public DescribeRestoreIncrDetailRequest build() {
            return new DescribeRestoreIncrDetailRequest(this);
        } 

    } 

}
