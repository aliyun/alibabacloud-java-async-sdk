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
         * <p>Status code. A value of 200 indicates that the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Parameter information.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FF67D4D5-4E90-1DF5-BB8F-060BBFAD72DB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API invocation succeeded. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Succeeded.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>Indicates whether the parameter is required. Valid values:</p>
             * <ul>
             * <li><p>0: Not required.</p>
             * </li>
             * <li><p>1: Required.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isEmpty(Integer isEmpty) {
                this.isEmpty = isEmpty;
                return this;
            }

            /**
             * <p>Parameter ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder paramCode(String paramCode) {
                this.paramCode = paramCode;
                return this;
            }

            /**
             * <p>Parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>名称</p>
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
