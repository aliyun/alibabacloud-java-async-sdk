// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyAccountDescriptionRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccountDescriptionRequest</p>
 */
public class ModifyAccountDescriptionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountDescription")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountDescription;

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

    private ModifyAccountDescriptionRequest(Builder builder) {
        super(builder);
        this.accountDescription = builder.accountDescription;
        this.accountName = builder.accountName;
        this.DBClusterId = builder.DBClusterId;
        this.engine = builder.engine;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAccountDescriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountDescription
     */
    public String getAccountDescription() {
        return this.accountDescription;
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

    public static final class Builder extends Request.Builder<ModifyAccountDescriptionRequest, Builder> {
        private String accountDescription; 
        private String accountName; 
        private String DBClusterId; 
        private String engine; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAccountDescriptionRequest request) {
            super(request);
            this.accountDescription = request.accountDescription;
            this.accountName = request.accountName;
            this.DBClusterId = request.DBClusterId;
            this.engine = request.engine;
        } 

        /**
         * <p>The description of the database account.</p>
         * <ul>
         * <li>The description cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The description must be 2 to 256 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AccDesc</p>
         */
        public Builder accountDescription(String accountDescription) {
            this.putQueryParameter("AccountDescription", accountDescription);
            this.accountDescription = accountDescription;
            return this;
        }

        /**
         * <p>The name of the database account.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/612430.html">DescribeAccounts</a> operation to query the information about database accounts of an AnalyticDB for MySQL cluster, including database account names.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testacc</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
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
        public ModifyAccountDescriptionRequest build() {
            return new ModifyAccountDescriptionRequest(this);
        } 

    } 

}
