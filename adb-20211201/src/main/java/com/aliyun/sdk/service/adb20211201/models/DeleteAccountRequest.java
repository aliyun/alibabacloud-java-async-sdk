// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DeleteAccountRequest} extends {@link RequestModel}
 *
 * <p>DeleteAccountRequest</p>
 */
public class DeleteAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    private DeleteAccountRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.DBClusterId = builder.DBClusterId;
        this.engine = builder.engine;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    public static final class Builder extends Request.Builder<DeleteAccountRequest, Builder> {
        private String accountName; 
        private String DBClusterId; 
        private String engine; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAccountRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.DBClusterId = request.DBClusterId;
            this.engine = request.engine;
        } 

        /**
         * <p>The name of the database account.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/612430.html">DescribeAccounts</a> operation to query the information about database accounts for a cluster, including the account name.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_accout</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp11q28kvl688****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The database engine of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>AnalyticDB</strong> (default): the AnalyticDB for MySQL engine.</li>
         * <li><strong>Clickhouse</strong>: the wide table engine.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Clickhouse</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        @Override
        public DeleteAccountRequest build() {
            return new DeleteAccountRequest(this);
        } 

    } 

}
