// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRobotParamsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRobotParamsResponseBody</p>
 */
public class ListRobotParamsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListRobotParamsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRobotParamsResponseBody create() {
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
    public java.util.List < Data> getData() {
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
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListRobotParamsResponseBody build() {
            return new ListRobotParamsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("IsEmpty")
        private Integer isEmpty;

        @NameInMap("ParamCode")
        private String paramCode;

        @NameInMap("ParamName")
        private String paramName;

        private Data(Builder builder) {
            this.isEmpty = builder.isEmpty;
            this.paramCode = builder.paramCode;
            this.paramName = builder.paramName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return isEmpty
         */
        public Integer getIsEmpty() {
            return this.isEmpty;
        }

        /**
         * @return paramCode
         */
        public String getParamCode() {
            return this.paramCode;
        }

        /**
         * @return paramName
         */
        public String getParamName() {
            return this.paramName;
        }

        public static final class Builder {
            private Integer isEmpty; 
            private String paramCode; 
            private String paramName; 

            /**
             * IsEmpty.
             */
            public Builder isEmpty(Integer isEmpty) {
                this.isEmpty = isEmpty;
                return this;
            }

            /**
             * ParamCode.
             */
            public Builder paramCode(String paramCode) {
                this.paramCode = paramCode;
                return this;
            }

            /**
             * ParamName.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
