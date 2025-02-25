// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateShardTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ValidateShardTaskResponseBody</p>
 */
public class ValidateShardTaskResponseBody extends TeaModel {
    @NameInMap("List")
    private java.util.List < List> list;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
    public java.util.List < List> getList() {
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
        private java.util.List < List> list; 
        private String requestId; 
        private Boolean success; 

        /**
         * Indicates the check results.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * Indicates the ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ValidateShardTaskResponseBody build() {
            return new ValidateShardTaskResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("Item")
        private String item;

        @NameInMap("Result")
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
             * Indicates the name of a check item.
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * Indicates the result of the check item. Valid values:
             * <p>
             * 
             * *   **0**: indicates the task is valid.
             * *   **1**: indicates the task is invalid.
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
