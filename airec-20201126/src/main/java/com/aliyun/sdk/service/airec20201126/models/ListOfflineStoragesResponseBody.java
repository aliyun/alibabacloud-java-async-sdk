// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListOfflineStoragesResponseBody} extends {@link TeaModel}
 *
 * <p>ListOfflineStoragesResponseBody</p>
 */
public class ListOfflineStoragesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private byte[] requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private ListOfflineStoragesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOfflineStoragesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public byte[] getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private byte[] requestId; 
        private java.util.List < Result> result; 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6839AE7C-A984-48C1-AC17-331BAC6D97BC</p>
         */
        public Builder requestId(byte[] requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListOfflineStoragesResponseBody build() {
            return new ListOfflineStoragesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOfflineStoragesResponseBody} extends {@link TeaModel}
     *
     * <p>ListOfflineStoragesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("meta")
        private java.util.Map < String, ? > meta;

        @com.aliyun.core.annotation.NameInMap("tableName")
        private byte[] tableName;

        private Result(Builder builder) {
            this.meta = builder.meta;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return meta
         */
        public java.util.Map < String, ? > getMeta() {
            return this.meta;
        }

        /**
         * @return tableName
         */
        public byte[] getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private java.util.Map < String, ? > meta; 
            private byte[] tableName; 

            /**
             * meta.
             */
            public Builder meta(java.util.Map < String, ? > meta) {
                this.meta = meta;
                return this;
            }

            /**
             * tableName.
             */
            public Builder tableName(byte[] tableName) {
                this.tableName = tableName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
