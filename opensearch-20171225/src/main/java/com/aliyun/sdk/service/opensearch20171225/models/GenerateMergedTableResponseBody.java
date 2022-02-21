// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateMergedTableResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateMergedTableResponseBody</p>
 */
public class GenerateMergedTableResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
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

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GenerateMergedTableResponseBody build() {
            return new GenerateMergedTableResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("fromTable")
        private java.util.Map < String, ? > fromTable;

        @NameInMap("mergeTable")
        private java.util.Map < String, ? > mergeTable;

        @NameInMap("primaryKey")
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
        public java.util.Map < String, ? > getFromTable() {
            return this.fromTable;
        }

        /**
         * @return mergeTable
         */
        public java.util.Map < String, ? > getMergeTable() {
            return this.mergeTable;
        }

        /**
         * @return primaryKey
         */
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public static final class Builder {
            private java.util.Map < String, ? > fromTable; 
            private java.util.Map < String, ? > mergeTable; 
            private String primaryKey; 

            /**
             * fromTable.
             */
            public Builder fromTable(java.util.Map < String, ? > fromTable) {
                this.fromTable = fromTable;
                return this;
            }

            /**
             * mergeTable.
             */
            public Builder mergeTable(java.util.Map < String, ? > mergeTable) {
                this.mergeTable = mergeTable;
                return this;
            }

            /**
             * primaryKey.
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
