// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link DescribeQueryExplainResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeQueryExplainResponseBody</p>
 */
public class DescribeQueryExplainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExplainResult")
    private String explainResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sql")
    private String sql;

    private DescribeQueryExplainResponseBody(Builder builder) {
        this.explainResult = builder.explainResult;
        this.requestId = builder.requestId;
        this.sql = builder.sql;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQueryExplainResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return explainResult
     */
    public String getExplainResult() {
        return this.explainResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    public static final class Builder {
        private String explainResult; 
        private String requestId; 
        private String sql; 

        private Builder() {
        } 

        private Builder(DescribeQueryExplainResponseBody model) {
            this.explainResult = model.explainResult;
            this.requestId = model.requestId;
            this.sql = model.sql;
        } 

        /**
         * <p>The EXPLAIN result.</p>
         * 
         * <strong>example:</strong>
         * <p>+-----------------------------------------------------------------------+
         * | Explain String|
         * +-----------------------------------------------------------------------+
         * | PLAN FRAGMENT 0                                                       |
         * |OUTPUT EXPRS:                                                        |
         * |    name[#1]                                                           |
         * |    age[#2]                                                            |
         * |  PARTITION: UNPARTITIONED                                |
         * |                                                                        |
         * |  VRESULT SINK                                                         |
         * |                                                                        |
         * |  1:VEXCHANGE                                                          |
         * |     offset: 0                                                        |
         * |                                                                        |
         * | PLAN FRAGMENT 1                                                       |
         * |                                                                        |
         * |  PARTITION: HASH_PARTITIONED: id[#0]                                  |
         * |                                                                        |
         * |  STREAM DATA SINK                                                     |
         * |    EXCHANGE ID: 01|
         * |    UNPARTITIONED                                |
         * |                                                                        |
         * |  0:VOlapScanNode                                                      |
         * |     TABLE: example_db.example_tbl(example_tbl)                        |
         * |     PREAGGREGATION: ON                                                |
         * |     PREDICATES: (age[#2] &gt; 18)                                        |
         * |     cardinality=1, avgRowSize=20.0, numNodes=1                        |
         * |     tablet list: 10023, 10025, 10027                |
         * +-----------------------------------------------------------------------+</p>
         */
        public Builder explainResult(String explainResult) {
            this.explainResult = explainResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F8900A96-67F7-5274-A41B-7722E1ECF8C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The SQL statement for which the execution plan is queried. Overly long SQL statements in audit logs may be truncated.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM example_db.example_tbl</p>
         */
        public Builder sql(String sql) {
            this.sql = sql;
            return this;
        }

        public DescribeQueryExplainResponseBody build() {
            return new DescribeQueryExplainResponseBody(this);
        } 

    } 

}
