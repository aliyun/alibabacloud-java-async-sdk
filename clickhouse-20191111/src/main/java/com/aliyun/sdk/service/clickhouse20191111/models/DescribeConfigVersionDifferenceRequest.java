// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeConfigVersionDifferenceRequest} extends {@link RequestModel}
 *
 * <p>DescribeConfigVersionDifferenceRequest</p>
 */
public class DescribeConfigVersionDifferenceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String changeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    private DescribeConfigVersionDifferenceRequest(Builder builder) {
        super(builder);
        this.changeId = builder.changeId;
        this.DBClusterId = builder.DBClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigVersionDifferenceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeId
     */
    public String getChangeId() {
        return this.changeId;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public static final class Builder extends Request.Builder<DescribeConfigVersionDifferenceRequest, Builder> {
        private String changeId; 
        private String DBClusterId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConfigVersionDifferenceRequest request) {
            super(request);
            this.changeId = request.changeId;
            this.DBClusterId = request.DBClusterId;
        } 

        /**
         * <p>The ID of the change record. You can call the <a href="https://help.aliyun.com/document_detail/452209.html">DescribeConfigHistory</a> operation to query the ID of the change record.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder changeId(String changeId) {
            this.putQueryParameter("ChangeId", changeId);
            this.changeId = changeId;
            return this;
        }

        /**
         * <p>The cluster ID. You can call the <a href="https://help.aliyun.com/document_detail/170879.html">DescribeDBClusters</a> operation to query information about all the clusters that are deployed in a specific region. The information includes the cluster IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp1tm8zf130ew****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        @Override
        public DescribeConfigVersionDifferenceRequest build() {
            return new DescribeConfigVersionDifferenceRequest(this);
        } 

    } 

}
