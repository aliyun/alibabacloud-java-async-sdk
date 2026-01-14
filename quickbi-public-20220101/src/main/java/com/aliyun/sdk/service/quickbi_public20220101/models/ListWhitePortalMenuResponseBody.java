// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ListWhitePortalMenuResponseBody} extends {@link TeaModel}
 *
 * <p>ListWhitePortalMenuResponseBody</p>
 */
public class ListWhitePortalMenuResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListWhitePortalMenuResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWhitePortalMenuResponseBody create() {
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListWhitePortalMenuResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListWhitePortalMenuResponseBody build() {
            return new ListWhitePortalMenuResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWhitePortalMenuResponseBody} extends {@link TeaModel}
     *
     * <p>ListWhitePortalMenuResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthPointsValue")
        private Integer authPointsValue;

        @com.aliyun.core.annotation.NameInMap("ReceiverId")
        private String receiverId;

        @com.aliyun.core.annotation.NameInMap("ReceiverType")
        private Integer receiverType;

        private Result(Builder builder) {
            this.authPointsValue = builder.authPointsValue;
            this.receiverId = builder.receiverId;
            this.receiverType = builder.receiverType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return authPointsValue
         */
        public Integer getAuthPointsValue() {
            return this.authPointsValue;
        }

        /**
         * @return receiverId
         */
        public String getReceiverId() {
            return this.receiverId;
        }

        /**
         * @return receiverType
         */
        public Integer getReceiverType() {
            return this.receiverType;
        }

        public static final class Builder {
            private Integer authPointsValue; 
            private String receiverId; 
            private Integer receiverType; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.authPointsValue = model.authPointsValue;
                this.receiverId = model.receiverId;
                this.receiverType = model.receiverType;
            } 

            /**
             * AuthPointsValue.
             */
            public Builder authPointsValue(Integer authPointsValue) {
                this.authPointsValue = authPointsValue;
                return this;
            }

            /**
             * ReceiverId.
             */
            public Builder receiverId(String receiverId) {
                this.receiverId = receiverId;
                return this;
            }

            /**
             * ReceiverType.
             */
            public Builder receiverType(Integer receiverType) {
                this.receiverType = receiverType;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
