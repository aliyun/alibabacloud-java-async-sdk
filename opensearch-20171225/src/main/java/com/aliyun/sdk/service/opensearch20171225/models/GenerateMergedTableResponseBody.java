// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link GenerateMergedTableResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateMergedTableResponseBody</p>
 */
public class GenerateMergedTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private GenerateMergedTableResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateMergedTableResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GenerateMergedTableResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABCDEFGH</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GenerateMergedTableResponseBody build() {
            return new GenerateMergedTableResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GenerateMergedTableResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateMergedTableResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fromTable")
        private java.util.Map<String, ?> fromTable;

        @com.aliyun.core.annotation.NameInMap("mergeTable")
        private java.util.Map<String, ?> mergeTable;

        @com.aliyun.core.annotation.NameInMap("primaryKey")
        private String primaryKey;

        private Result(Builder builder) {
            this.fromTable = builder.fromTable;
            this.mergeTable = builder.mergeTable;
            this.primaryKey = builder.primaryKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return fromTable
         */
        public java.util.Map<String, ?> getFromTable() {
            return this.fromTable;
        }

        /**
         * @return mergeTable
         */
        public java.util.Map<String, ?> getMergeTable() {
            return this.mergeTable;
        }

        /**
         * @return primaryKey
         */
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public static final class Builder {
            private java.util.Map<String, ?> fromTable; 
            private java.util.Map<String, ?> mergeTable; 
            private String primaryKey; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.fromTable = model.fromTable;
                this.mergeTable = model.mergeTable;
                this.primaryKey = model.primaryKey;
            } 

            /**
             * <p>The tables on which the JOIN operation is performed.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder fromTable(java.util.Map<String, ?> fromTable) {
                this.fromTable = fromTable;
                return this;
            }

            /**
             * <p>The wide table that is generated after the JOIN operation is performed on multiple tables.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder mergeTable(java.util.Map<String, ?> mergeTable) {
                this.mergeTable = mergeTable;
                return this;
            }

            /**
             * <p>The primary key.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder primaryKey(String primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
