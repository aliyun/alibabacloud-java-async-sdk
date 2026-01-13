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
 * {@link DeleteDBInstanceIPArrayRequest} extends {@link RequestModel}
 *
 * <p>DeleteDBInstanceIPArrayRequest</p>
 */
public class DeleteDBInstanceIPArrayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IPArrayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String IPArrayName;

    private DeleteDBInstanceIPArrayRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.IPArrayName = builder.IPArrayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDBInstanceIPArrayRequest create() {
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
     * @return IPArrayName
     */
    public String getIPArrayName() {
        return this.IPArrayName;
    }

    public static final class Builder extends Request.Builder<DeleteDBInstanceIPArrayRequest, Builder> {
        private String DBInstanceId; 
        private String IPArrayName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDBInstanceIPArrayRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.IPArrayName = request.IPArrayName;
        } 

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The name of the IP whitelist group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testarray</p>
         */
        public Builder IPArrayName(String IPArrayName) {
            this.putQueryParameter("IPArrayName", IPArrayName);
            this.IPArrayName = IPArrayName;
            return this;
        }

        @Override
        public DeleteDBInstanceIPArrayRequest build() {
            return new DeleteDBInstanceIPArrayRequest(this);
        } 

    } 

}
