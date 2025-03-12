// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeSQLDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLDetailsResponseBody</p>
 */
public class DescribeSQLDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SQLDetails")
    private java.util.List<SQLDetails> SQLDetails;

    private DescribeSQLDetailsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SQLDetails = builder.SQLDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SQLDetails
     */
    public java.util.List<SQLDetails> getSQLDetails() {
        return this.SQLDetails;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SQLDetails> SQLDetails; 

        /**
         * <p>The operation that you want to perform.<br>Set the value to <strong>DescribeSQLDetails</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <pre><code>http(s)://[Endpoint]/?Action=DescribeSQLDetails
         * &amp;TenantId=t2mr3oae0****
         * &amp;SQLId=8D6E84****0B8FB1823D199E2CA1****
         * &amp;Common request parameters
         * </code></pre>
         */
        public Builder SQLDetails(java.util.List<SQLDetails> SQLDetails) {
            this.SQLDetails = SQLDetails;
            return this;
        }

        public DescribeSQLDetailsResponseBody build() {
            return new DescribeSQLDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSQLDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLDetailsResponseBody</p>
     */
    public static class SQLDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("SQLText")
        private String SQLText;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private SQLDetails(Builder builder) {
            this.dbName = builder.dbName;
            this.SQLText = builder.SQLText;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SQLDetails create() {
            return builder().build();
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return SQLText
         */
        public String getSQLText() {
            return this.SQLText;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String dbName; 
            private String SQLText; 
            private String userName; 

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>{&quot;name&quot;:&quot;DescribeSQLDetails&quot;,&quot;product&quot;:&quot;OceanBasePro&quot;,&quot;version&quot;:&quot;2019-09-01&quot;,&quot;path&quot;:&quot;/&quot;,&quot;deprecated&quot;:0,&quot;method&quot;:&quot;POST|GET&quot;,&quot;protocol&quot;:&quot;HTTP|HTTPS&quot;,&quot;hidden&quot;:0,&quot;timeout&quot;:10000,&quot;parameter_type&quot;:&quot;Single&quot;,&quot;params&quot;:&quot;[{&quot;name&quot;:&quot;Action&quot;,&quot;position&quot;:&quot;Query&quot;,&quot;required&quot;:true,&quot;checkBlank&quot;:false,&quot;visibility&quot;:&quot;Public&quot;,&quot;deprecated&quot;:false,&quot;type&quot;:&quot;String&quot;,&quot;description&quot;:&quot;&quot;,&quot;example&quot;:&quot;DescribeSQLDetails&quot;},{&quot;name&quot;:&quot;TenantId&quot;,&quot;position&quot;:&quot;Body&quot;,&quot;required&quot;:true,&quot;checkBlank&quot;:false,&quot;visibility&quot;:&quot;Public&quot;,&quot;deprecated&quot;:false,&quot;type&quot;:&quot;String&quot;,&quot;title&quot;:&quot;&quot;,&quot;description&quot;:&quot;&quot;,&quot;example&quot;:&quot;t2mr3oae0****&quot;},{&quot;name&quot;:&quot;SQLId&quot;,&quot;position&quot;:&quot;Body&quot;,&quot;required&quot;:true,&quot;checkBlank&quot;:false,&quot;visibility&quot;:&quot;Public&quot;,&quot;deprecated&quot;:false,&quot;type&quot;:&quot;String&quot;,&quot;title&quot;:&quot;SQLID&quot;,&quot;description&quot;:&quot;SQLID。&quot;,&quot;example&quot;:&quot;8D6E84<strong><strong>0B8FB1823D199E2CA1</strong></strong>&quot;}]&quot;,&quot;response_headers&quot;:&quot;[]&quot;,&quot;response&quot;:&quot;{&quot;type&quot;:&quot;Object&quot;,&quot;children&quot;:[{&quot;name&quot;:&quot;RequestId&quot;,&quot;required&quot;:false,&quot;checkBlank&quot;:false,&quot;visibility&quot;:&quot;Public&quot;,&quot;deprecated&quot;:false,&quot;type&quot;:&quot;String&quot;,&quot;title&quot;:&quot;&quot;,&quot;description&quot;:&quot;&quot;,&quot;example&quot;:&quot;473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E&quot;},{&quot;name&quot;:&quot;SQLDetails&quot;,&quot;required&quot;:false,&quot;checkBlank&quot;:false,&quot;visibility&quot;:&quot;Public&quot;,&quot;deprecated&quot;:false,&quot;type&quot;:&quot;Array&quot;,&quot;subType&quot;:&quot;Object&quot;,&quot;description&quot;:&quot;  &quot;,&quot;children&quot;:[{&quot;name&quot;:&quot;SQLText&quot;,&quot;required&quot;:false,&quot;checkBlank&quot;:false,&quot;visibility&quot;:&quot;Public&quot;,&quot;deprecated&quot;:false,&quot;type&quot;:&quot;String&quot;,&quot;title&quot;:&quot;&quot;,&quot;description&quot;:&quot;&quot;,&quot;example&quot;:&quot;SELECT  ****   FROM ****   WHERE **** = ? AND **** = ?   ORDER BY **** ASC&quot;},{&quot;name&quot;:&quot;DbName&quot;,&quot;required&quot;:false,&quot;checkBlank&quot;:false,&quot;visibility&quot;:&quot;Public&quot;,&quot;deprecated&quot;:false,&quot;type&quot;:&quot;String&quot;,&quot;title&quot;:&quot;&quot;,&quot;description&quot;:&quot;&quot;,&quot;example&quot;:&quot;testdb&quot;},{&quot;name&quot;:&quot;UserName&quot;,&quot;required&quot;:false,&quot;checkBlank&quot;:false,&quot;visibility&quot;:&quot;Public&quot;,&quot;deprecated&quot;:false,&quot;type&quot;:&quot;String&quot;,&quot;title&quot;:&quot;&quot;,&quot;description&quot;:&quot;&quot;,&quot;example&quot;:&quot;tester&quot;}],&quot;title&quot;:&quot;&quot;}],&quot;title&quot;:&quot;&quot;,&quot;description&quot;:&quot;&quot;}&quot;,&quot;errors&quot;:&quot;{}&quot;}</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT  ****   FROM ****   WHERE **** = ? AND **** = ?   ORDER BY **** ASC</p>
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public SQLDetails build() {
                return new SQLDetails(this);
            } 

        } 

    }
}
