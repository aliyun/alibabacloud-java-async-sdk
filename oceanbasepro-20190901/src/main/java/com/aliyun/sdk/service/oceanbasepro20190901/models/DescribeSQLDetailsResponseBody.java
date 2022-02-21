// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLDetailsResponseBody</p>
 */
public class DescribeSQLDetailsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SQLDetails")
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
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SQL详情
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
        @NameInMap("DbName")
        private String dbName;

        @NameInMap("SQLText")
        private String SQLText;

        @NameInMap("UserName")
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
             * 数据库名
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * SQL文本
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * 用户名
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
