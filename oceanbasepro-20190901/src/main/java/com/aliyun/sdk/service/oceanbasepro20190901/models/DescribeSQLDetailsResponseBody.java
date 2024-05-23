// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLDetailsResponseBody</p>
 */
public class DescribeSQLDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SQLDetails")
    private java.util.List < SQLDetails> SQLDetails;

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
    public java.util.List < SQLDetails> getSQLDetails() {
        return this.SQLDetails;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SQLDetails> SQLDetails; 

        /**
         * The operation that you want to perform.   
         * <p>
         * Set the value to **DescribeSQLDetails**.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ```
         * <p>
         * http(s)://[Endpoint]/?Action=DescribeSQLDetails
         * &TenantId=t2mr3oae0****
         * &SQLId=8D6E84****0B8FB1823D199E2CA1****
         * &Common request parameters
         * ```
         */
        public Builder SQLDetails(java.util.List < SQLDetails> SQLDetails) {
            this.SQLDetails = SQLDetails;
            return this;
        }

        public DescribeSQLDetailsResponseBody build() {
            return new DescribeSQLDetailsResponseBody(this);
        } 

    } 

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
             * {"name":"DescribeSQLDetails","product":"OceanBasePro","version":"2019-09-01","path":"/","deprecated":0,"method":"POST|GET","protocol":"HTTP|HTTPS","hidden":0,"timeout":10000,"parameter_type":"Single","params":"[{\"name\":\"Action\",\"position\":\"Query\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"description\":\"\",\"example\":\"DescribeSQLDetails\"},{\"name\":\"TenantId\",\"position\":\"Body\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"t2mr3oae0****\"},{\"name\":\"SQLId\",\"position\":\"Body\",\"required\":true,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"SQLID\",\"description\":\"SQLID。\",\"example\":\"8D6E84****0B8FB1823D199E2CA1****\"}]","response_headers":"[]","response":"{\"type\":\"Object\",\"children\":[{\"name\":\"RequestId\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E\"},{\"name\":\"SQLDetails\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"Array\",\"subType\":\"Object\",\"description\":\"  \",\"children\":[{\"name\":\"SQLText\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"SELECT  ****   FROM ****   WHERE **** = ? AND **** = ?   ORDER BY **** ASC\"},{\"name\":\"DbName\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"testdb\"},{\"name\":\"UserName\",\"required\":false,\"checkBlank\":false,\"visibility\":\"Public\",\"deprecated\":false,\"type\":\"String\",\"title\":\"\",\"description\":\"\",\"example\":\"tester\"}],\"title\":\"\"}],\"title\":\"\",\"description\":\"\"}","errors":"{}"}
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
