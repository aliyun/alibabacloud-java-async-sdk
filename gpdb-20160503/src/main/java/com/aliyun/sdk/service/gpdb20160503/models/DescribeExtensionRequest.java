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
 * {@link DescribeExtensionRequest} extends {@link RequestModel}
 *
 * <p>DescribeExtensionRequest</p>
 */
public class DescribeExtensionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtensionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String extensionName;

    private DescribeExtensionRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.databaseName = builder.databaseName;
        this.extensionName = builder.extensionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExtensionRequest create() {
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
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return extensionName
     */
    public String getExtensionName() {
        return this.extensionName;
    }

    public static final class Builder extends Request.Builder<DescribeExtensionRequest, Builder> {
        private String DBInstanceId; 
        private String databaseName; 
        private String extensionName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExtensionRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.databaseName = request.databaseName;
            this.extensionName = request.extensionName;
        } 

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zhparser</p>
         */
        public Builder extensionName(String extensionName) {
            this.putQueryParameter("ExtensionName", extensionName);
            this.extensionName = extensionName;
            return this;
        }

        @Override
        public DescribeExtensionRequest build() {
            return new DescribeExtensionRequest(this);
        } 

    } 

}
