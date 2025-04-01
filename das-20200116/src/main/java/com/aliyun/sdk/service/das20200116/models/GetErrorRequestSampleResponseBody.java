// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetErrorRequestSampleResponseBody} extends {@link TeaModel}
 *
 * <p>GetErrorRequestSampleResponseBody</p>
 */
public class GetErrorRequestSampleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetErrorRequestSampleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetErrorRequestSampleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetErrorRequestSampleResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>[         {             &quot;sqlId&quot;: &quot;2cd4432556c3dab9d825ba363637****&quot;,             &quot;database&quot;: &quot;dbgateway&quot;,             &quot;originHost&quot;: &quot;172.16.1****&quot;,             &quot;tables&quot;: [                 &quot;meter_****&quot;             ],             &quot;instanceId&quot;: &quot;rm-2ze8g2am97624****&quot;,             &quot;errorCode&quot;: &quot;1062&quot;,             &quot;user&quot;: &quot;dbgat****&quot;,             &quot;sql&quot;: &quot;insert into meter_****\n        ( \n        <strong><strong>\n     )\n        values (now(), now(), &quot;bbbc8624-5e19-455a-9714-8466f688</strong></strong>&quot;, &quot;2022-02-10 14:00:00&quot;, &quot;{&quot;endTime&quot;:&quot;2022-02-10 14:00:00&quot;,&quot;endTimestamp&quot;:1644472800,&quot;startTime&quot;:&quot;2022-02-10 13:00:00&quot;,&quot;startTimestamp&quot;:1644469200}&quot;, null, null)&quot;,             &quot;timestamp&quot;: 1644476100435         }]</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7172BECE-588A-5961-8126-C216E16B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetErrorRequestSampleResponseBody build() {
            return new GetErrorRequestSampleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetErrorRequestSampleResponseBody} extends {@link TeaModel}
     *
     * <p>GetErrorRequestSampleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("errorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("originHost")
        private String originHost;

        @com.aliyun.core.annotation.NameInMap("sql")
        private String sql;

        @com.aliyun.core.annotation.NameInMap("sqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("tables")
        private java.util.List<String> tables;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("user")
        private String user;

        private Data(Builder builder) {
            this.database = builder.database;
            this.errorCode = builder.errorCode;
            this.instanceId = builder.instanceId;
            this.originHost = builder.originHost;
            this.sql = builder.sql;
            this.sqlId = builder.sqlId;
            this.tables = builder.tables;
            this.timestamp = builder.timestamp;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return originHost
         */
        public String getOriginHost() {
            return this.originHost;
        }

        /**
         * @return sql
         */
        public String getSql() {
            return this.sql;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return tables
         */
        public java.util.List<String> getTables() {
            return this.tables;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String database; 
            private String errorCode; 
            private String instanceId; 
            private String originHost; 
            private String sql; 
            private String sqlId; 
            private java.util.List<String> tables; 
            private Long timestamp; 
            private String user; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.database = model.database;
                this.errorCode = model.errorCode;
                this.instanceId = model.instanceId;
                this.originHost = model.originHost;
                this.sql = model.sql;
                this.sqlId = model.sqlId;
                this.tables = model.tables;
                this.timestamp = model.timestamp;
                this.user = model.user;
            } 

            /**
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>dbgateway</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The error code that is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1062</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze8g2am97624****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The IP address of the client that executes the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.1****</p>
             */
            public Builder originHost(String originHost) {
                this.originHost = originHost;
                return this;
            }

            /**
             * <p>The SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>insert into meter_****</p>
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * <p>The SQL query ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2cd4432556c3dab9d825ba363637****</p>
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * <p>The table information.</p>
             */
            public Builder tables(java.util.List<String> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * <p>The time when the SQL query was executed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1644476100435</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The username of the account that is used to log on to the database.</p>
             * 
             * <strong>example:</strong>
             * <p>dbgat****</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
