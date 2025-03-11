// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link ValidateShardTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ValidateShardTaskResponseBody</p>
 */
public class ValidateShardTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ValidateShardTaskResponseBody(Builder builder) {
        this.list = builder.list;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateShardTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
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
        private java.util.List<List> list; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>Indicates the check results.</p>
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>Indicates the ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0B6B7BDC-575D-4A77-A4F8-24B7EFAS45FG</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ValidateShardTaskResponseBody build() {
            return new ValidateShardTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ValidateShardTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ValidateShardTaskResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private String item;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Integer result;

        private List(Builder builder) {
            this.item = builder.item;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public String getItem() {
            return this.item;
        }

        /**
         * @return result
         */
        public Integer getResult() {
            return this.result;
        }

        public static final class Builder {
            private String item; 
            private Integer result; 

            /**
             * <p>Indicates the name of a check item.</p>
             * 
             * <strong>example:</strong>
             * <p>same_schema</p>
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * <p>Indicates the result of the check item. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: indicates the task is valid.</li>
             * <li><strong>1</strong>: indicates the task is invalid.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder result(Integer result) {
                this.result = result;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
