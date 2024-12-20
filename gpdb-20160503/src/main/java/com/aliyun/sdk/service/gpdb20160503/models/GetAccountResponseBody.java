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
 * {@link GetAccountResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountResponseBody</p>
 */
public class GetAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountDescription")
    private String accountDescription;

    @com.aliyun.core.annotation.NameInMap("AccountName")
    private String accountName;

    @com.aliyun.core.annotation.NameInMap("AccountStatus")
    private String accountStatus;

    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAccountResponseBody(Builder builder) {
        this.accountDescription = builder.accountDescription;
        this.accountName = builder.accountName;
        this.accountStatus = builder.accountStatus;
        this.accountType = builder.accountType;
        this.DBInstanceId = builder.DBInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountResponseBody create() {
        return builder().build();
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
     * @return accountStatus
     */
    public String getAccountStatus() {
        return this.accountStatus;
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accountDescription; 
        private String accountName; 
        private String accountStatus; 
        private String accountType; 
        private String DBInstanceId; 
        private String requestId; 

        /**
         * <p>The new description of the database account.</p>
         * <ul>
         * <li>The description must start with a letter.</li>
         * <li>The description cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The description can contain letters, underscores (_), hyphens (-), and digits.</li>
         * <li>The description must be 2 to 256 characters in length.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>The instance used by this account to log in is DBInstanceId. The name used to log in is AccountName.</p>
         */
        public Builder accountDescription(String accountDescription) {
            this.accountDescription = accountDescription;
            return this;
        }

        /**
         * <p>The name of the initial account.</p>
         * <ul>
         * <li>The name can contain lowercase letters, digits, and underscores (_).</li>
         * <li>The name must start with a lowercase letter and end with a lowercase letter or a digit.</li>
         * <li>The name cannot start with gp.</li>
         * <li>The name must be 2 to 16 characters in length.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testaccount</p>
         */
        public Builder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The status of the member that you want to query.</p>
         * <ul>
         * <li><strong>enabled</strong>: managed.</li>
         * <li><strong>disabled</strong>: not managed.</li>
         * <li><strong>disabling</strong>: being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder accountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }

        /**
         * <ul>
         * <li>Normal: standard account</li>
         * <li>Super: privileged account</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder accountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CA7E4276-E2D5-5F8D-AF06-9EAB3F6C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccountResponseBody build() {
            return new GetAccountResponseBody(this);
        } 

    } 

}
