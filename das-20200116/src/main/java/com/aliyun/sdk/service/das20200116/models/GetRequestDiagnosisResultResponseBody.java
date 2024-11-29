// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetRequestDiagnosisResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetRequestDiagnosisResultResponseBody</p>
 */
public class GetRequestDiagnosisResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetRequestDiagnosisResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRequestDiagnosisResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.</p>
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
         * <p>800FBAF5-A539-5B97-A09E-C63AB2F7****</p>
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetRequestDiagnosisResultResponseBody build() {
            return new GetRequestDiagnosisResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRequestDiagnosisResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetRequestDiagnosisResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("dbSchema")
        private String dbSchema;

        @com.aliyun.core.annotation.NameInMap("engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("messageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("param")
        private String param;

        @com.aliyun.core.annotation.NameInMap("result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("sqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("state")
        private Integer state;

        @com.aliyun.core.annotation.NameInMap("uuid")
        private String uuid;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.dbSchema = builder.dbSchema;
            this.engine = builder.engine;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.messageId = builder.messageId;
            this.param = builder.param;
            this.result = builder.result;
            this.sqlId = builder.sqlId;
            this.state = builder.state;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return dbSchema
         */
        public String getDbSchema() {
            return this.dbSchema;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return param
         */
        public String getParam() {
            return this.param;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return state
         */
        public Integer getState() {
            return this.state;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String accountId; 
            private String dbSchema; 
            private String engine; 
            private String gmtCreate; 
            private String gmtModified; 
            private String messageId; 
            private String param; 
            private String result; 
            private String sqlId; 
            private Integer state; 
            private String uuid; 

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2093****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>das</p>
             */
            public Builder dbSchema(String dbSchema) {
                this.dbSchema = dbSchema;
                return this;
            }

            /**
             * <p>The database engine. Valid values:</p>
             * <ul>
             * <li><strong>MySQL</strong></li>
             * <li><strong>PostgreSQL</strong></li>
             * <li><strong>SQLServer</strong></li>
             * <li><strong>PolarDBMySQL</strong></li>
             * <li><strong>PolarDBOracle</strong></li>
             * <li><strong>MongoDB</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The time when the SQL diagnostics task was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1633071840000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the SQL diagnostics task was modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1633071850000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The unique ID of the diagnostics task.</p>
             * 
             * <strong>example:</strong>
             * <p>61820b594664275c4429****</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>The additional information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;&quot;:&quot;&quot;}</p>
             */
            public Builder param(String param) {
                this.param = param;
                return this;
            }

            /**
             * <p>The result of the SQL diagnostics task. The result includes the following information:</p>
             * <ul>
             * <li><p><strong>endTime</strong>: the end time of the SQL diagnostics task.</p>
             * </li>
             * <li><p><strong>errorCode</strong>: the error code.</p>
             * <ul>
             * <li><strong>0001</strong>: The SQL diagnostics task is complete.</li>
             * <li><strong>0003</strong>: The SQL diagnostics task failed.</li>
             * </ul>
             * </li>
             * <li><p><strong>errorMessage</strong>: the error message.</p>
             * </li>
             * <li><p><strong>estimateCost</strong>: the estimated cost.</p>
             * <ul>
             * <li><strong>cpu</strong>: the estimated CPU utilization of the index.</li>
             * <li><strong>io</strong>: the estimated I/O usage of the index.</li>
             * <li><strong>rows</strong>: the estimated values of the rows returned for the index.</li>
             * </ul>
             * </li>
             * <li><p><strong>improvement</strong>: the performance improvement ratio.</p>
             * </li>
             * <li><p><strong>indexAdvices</strong>: the index recommendations, which include the following information:</p>
             * <ul>
             * <li><strong>columns</strong>: the index columns.</li>
             * <li><strong>ddlAddIndex</strong>: the DDL statement for the index.</li>
             * <li><strong>indexName</strong>: the name of the index.</li>
             * <li><strong>schemaName</strong>: the name of the database.</li>
             * <li><strong>tableName</strong>: the name of the table.</li>
             * <li><strong>unique</strong>: indicates whether the index is unique.</li>
             * </ul>
             * </li>
             * <li><p><strong>ip</strong>: the IP address of the instance.</p>
             * </li>
             * <li><p><strong>messageId</strong>: the ID of the diagnostics task.</p>
             * </li>
             * <li><p><strong>port</strong>: the port used to connect to the instance.</p>
             * </li>
             * <li><p><strong>sqlTag</strong>: the SQL tag.</p>
             * </li>
             * <li><p><strong>startTime</strong>: the start time of the SQL diagnostics task.</p>
             * </li>
             * <li><p><strong>success</strong>: indicates whether the request was successful.</p>
             * </li>
             * <li><p><strong>support</strong>: indicates whether the SQL statement can be diagnosed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * </li>
             * <li><p><strong>tuningAdvices</strong> : the SQL rewrite suggestions.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;endTime&quot;:1636354256000, &quot;errorCode&quot;:&quot;0001&quot;, &quot;errorMessage&quot;:&quot;TFX succeeded&quot;, &quot;estimateCost&quot;:{ &quot;cpu&quot;:1.7878745150389268, &quot;io&quot;:9.948402604746128, &quot;rows&quot;:8.889372575194633 }, &quot;improvement&quot;:12933.97, &quot;indexAdvices&quot;:[ { &quot;columns&quot;:[ &quot;work_no&quot; ], &quot;ddlAddIndex&quot;:&quot;ALTER TABLE <code>test</code>.<code>work_order</code> ADD INDEX <code>idx_workno</code> (<code>work_no</code>)&quot;, &quot;indexName&quot;:&quot;idx_workno&quot;, &quot;schemaName&quot;:&quot;test&quot;, &quot;tableName&quot;:&quot;work_order&quot;, &quot;unique&quot;:false } ], &quot;ip&quot;:&quot;<strong><strong>.mysql.rds.aliyuncs.com&quot;, &quot;messageId&quot;:&quot;6188c8cb2f1365b16aee</strong></strong>&quot;, &quot;port&quot;:3306, &quot;sqlTag&quot;:&quot;{&quot;PRED_EQUAL&quot;:&quot;Y&quot;,&quot;CNT_QB&quot;:&quot;1&quot;,&quot;CNT_TB&quot;:&quot;1&quot;}&quot;, &quot;startTime&quot;:1636354252000, &quot;success&quot;:true, &quot;support&quot;:true, &quot;tuningAdvices&quot;:[ ] }</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The SQL template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0c95dae3afef77be06572612df9b****</p>
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * <p>The state of the diagnostics task. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The diagnostics task is in progress.</li>
             * <li><strong>1</strong>: A diagnostics error occurred.</li>
             * <li><strong>2</strong>: The diagnostics task is complete.</li>
             * <li><strong>3</strong>: An SQL error occurred.</li>
             * <li><strong>4</strong>: An engine error occurred.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The unique ID of the diagnostics instance.</p>
             * 
             * <strong>example:</strong>
             * <p>hdm_51fe9bc19ec413f4d530431af87a****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
