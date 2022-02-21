// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountAuthorityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountAuthorityResponseBody</p>
 */
public class DescribeAccountAuthorityResponseBody extends TeaModel {
    @NameInMap("AccountName")
    private String accountName;

    @NameInMap("AllowDatabases")
    private java.util.List < String > allowDatabases;

    @NameInMap("AllowDictionaries")
    private java.util.List < String > allowDictionaries;

    @NameInMap("DdlAuthority")
    private Boolean ddlAuthority;

    @NameInMap("DmlAuthority")
    private String dmlAuthority;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalDatabases")
    private java.util.List < String > totalDatabases;

    @NameInMap("TotalDictionaries")
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
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * AllowDatabases.
         */
        public Builder allowDatabases(java.util.List < String > allowDatabases) {
            this.allowDatabases = allowDatabases;
            return this;
        }

        /**
         * AllowDictionaries.
         */
        public Builder allowDictionaries(java.util.List < String > allowDictionaries) {
            this.allowDictionaries = allowDictionaries;
            return this;
        }

        /**
         * DdlAuthority.
         */
        public Builder ddlAuthority(Boolean ddlAuthority) {
            this.ddlAuthority = ddlAuthority;
            return this;
        }

        /**
         * DmlAuthority.
         */
        public Builder dmlAuthority(String dmlAuthority) {
            this.dmlAuthority = dmlAuthority;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalDatabases.
         */
        public Builder totalDatabases(java.util.List < String > totalDatabases) {
            this.totalDatabases = totalDatabases;
            return this;
        }

        /**
         * TotalDictionaries.
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
