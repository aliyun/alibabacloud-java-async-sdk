// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link ListRobotParamsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRobotParamsResponseBody</p>
 */
public class ListRobotParamsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListRobotParamsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
        public Builder data(java.util.List<Data> data) {
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
         * RequestId.
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

    /**
     * 
     * {@link ListRobotParamsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRobotParamsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsEmpty")
        private Integer isEmpty;

        @com.aliyun.core.annotation.NameInMap("ParamCode")
        private String paramCode;

        @com.aliyun.core.annotation.NameInMap("ParamName")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.isEmpty = model.isEmpty;
                this.paramCode = model.paramCode;
                this.paramName = model.paramName;
            } 

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
