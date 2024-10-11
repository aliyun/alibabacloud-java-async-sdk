// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAccountAuthorityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountAuthorityResponseBody</p>
 */
public class DescribeAccountAuthorityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountName")
    private String accountName;

    @com.aliyun.core.annotation.NameInMap("AllowDatabases")
    private java.util.List < String > allowDatabases;

    @com.aliyun.core.annotation.NameInMap("AllowDictionaries")
    private java.util.List < String > allowDictionaries;

    @com.aliyun.core.annotation.NameInMap("DdlAuthority")
    private Boolean ddlAuthority;

    @com.aliyun.core.annotation.NameInMap("DmlAuthority")
    private String dmlAuthority;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalDatabases")
    private java.util.List < String > totalDatabases;

    @com.aliyun.core.annotation.NameInMap("TotalDictionaries")
    private java.util.List < String > totalDictionaries;

    private DescribeAccountAuthorityResponseBody(Builder builder) {
        this.accountName = builder.accountName;
        this.allowDatabases = builder.allowDatabases;
        this.allowDictionaries = builder.allowDictionaries;
        this.ddlAuthority = builder.ddlAuthority;
        this.dmlAuthority = builder.dmlAuthority;
        this.requestId = builder.requestId;
        this.totalDatabases = builder.totalDatabases;
        this.totalDictionaries = builder.totalDictionaries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountAuthorityResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return allowDatabases
     */
    public java.util.List < String > getAllowDatabases() {
        return this.allowDatabases;
    }

    /**
     * @return allowDictionaries
     */
    public java.util.List < String > getAllowDictionaries() {
        return this.allowDictionaries;
    }

    /**
     * @return ddlAuthority
     */
    public Boolean getDdlAuthority() {
        return this.ddlAuthority;
    }

    /**
     * @return dmlAuthority
     */
    public String getDmlAuthority() {
        return this.dmlAuthority;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalDatabases
     */
    public java.util.List < String > getTotalDatabases() {
        return this.totalDatabases;
    }

    /**
     * @return totalDictionaries
     */
    public java.util.List < String > getTotalDictionaries() {
        return this.totalDictionaries;
    }

    public static final class Builder {
        private String accountName; 
        private java.util.List < String > allowDatabases; 
        private java.util.List < String > allowDictionaries; 
        private Boolean ddlAuthority; 
        private String dmlAuthority; 
        private String requestId; 
        private java.util.List < String > totalDatabases; 
        private java.util.List < String > totalDictionaries; 

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>Databases to which permissions have been granted.</p>
         */
        public Builder allowDatabases(java.util.List < String > allowDatabases) {
            this.allowDatabases = allowDatabases;
            return this;
        }

        /**
         * <p>Dictionaries to which permissions have been granted.</p>
         */
        public Builder allowDictionaries(java.util.List < String > allowDictionaries) {
            this.allowDictionaries = allowDictionaries;
            return this;
        }

        /**
         * <p>Indicates whether the database account has DDL permissions. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: has DDL permissions.</li>
         * <li><strong>false</strong>: does not have DDL permissions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ddlAuthority(Boolean ddlAuthority) {
            this.ddlAuthority = ddlAuthority;
            return this;
        }

        /**
         * <p>Indicates whether the database account has DML permissions. Valid values:</p>
         * <ul>
         * <li><strong>all</strong></li>
         * <li><strong>readOnly,modify</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder dmlAuthority(String dmlAuthority) {
            this.dmlAuthority = dmlAuthority;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F5178C10-1407-4987-9133-DE4DC9119F75</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>All databases.</p>
         */
        public Builder totalDatabases(java.util.List < String > totalDatabases) {
            this.totalDatabases = totalDatabases;
            return this;
        }

        /**
         * <p>All dictionaries.</p>
         */
        public Builder totalDictionaries(java.util.List < String > totalDictionaries) {
            this.totalDictionaries = totalDictionaries;
            return this;
        }

        public DescribeAccountAuthorityResponseBody build() {
            return new DescribeAccountAuthorityResponseBody(this);
        } 

    } 

}
