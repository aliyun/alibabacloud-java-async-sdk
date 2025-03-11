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
 * {@link CheckExpandStatusResponseBody} extends {@link TeaModel}
 *
 * <p>CheckExpandStatusResponseBody</p>
 */
public class CheckExpandStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CheckExpandStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckExpandStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The result of the verification.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7CDBA7D5-8D62-4D24-9C65-510D62******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CheckExpandStatusResponseBody build() {
            return new CheckExpandStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckExpandStatusResponseBody} extends {@link TeaModel}
     *
     * <p>CheckExpandStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsActive")
        private Boolean isActive;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        private Data(Builder builder) {
            this.isActive = builder.isActive;
            this.msg = builder.msg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return isActive
         */
        public Boolean getIsActive() {
            return this.isActive;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        public static final class Builder {
            private Boolean isActive; 
            private String msg; 

            /**
             * <p>Indicates whether scale-out operations can be performed on the database.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isActive(Boolean isActive) {
                this.isActive = isActive;
                return this;
            }

            /**
             * <p>The additional information.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
