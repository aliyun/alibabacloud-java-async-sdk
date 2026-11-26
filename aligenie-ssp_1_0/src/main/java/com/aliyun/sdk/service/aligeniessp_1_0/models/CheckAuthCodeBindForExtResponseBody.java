// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link CheckAuthCodeBindForExtResponseBody} extends {@link TeaModel}
 *
 * <p>CheckAuthCodeBindForExtResponseBody</p>
 */
public class CheckAuthCodeBindForExtResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private CheckAuthCodeBindForExtResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAuthCodeBindForExtResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(CheckAuthCodeBindForExtResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The returned error code. The value 200 indicates that the invocation succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Return Result of invoking this API.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>0EC7*726E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Detailed information</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CheckAuthCodeBindForExtResponseBody build() {
            return new CheckAuthCodeBindForExtResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckAuthCodeBindForExtResponseBody} extends {@link TeaModel}
     *
     * <p>CheckAuthCodeBindForExtResponseBody</p>
     */
    public static class DeviceOpenInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdType")
        private String idType;

        private DeviceOpenInfo(Builder builder) {
            this.id = builder.id;
            this.idType = builder.idType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceOpenInfo create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        public static final class Builder {
            private String id; 
            private String idType; 

            private Builder() {
            } 

            private Builder(DeviceOpenInfo model) {
                this.id = model.id;
                this.idType = model.idType;
            } 

            /**
             * <p>External device ID</p>
             * 
             * <strong>example:</strong>
             * <p>A963*0158</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>DEVICE_ID</p>
             * 
             * <strong>example:</strong>
             * <p>DEVICE_ID</p>
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            public DeviceOpenInfo build() {
                return new DeviceOpenInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CheckAuthCodeBindForExtResponseBody} extends {@link TeaModel}
     *
     * <p>CheckAuthCodeBindForExtResponseBody</p>
     */
    public static class UserOpenInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdType")
        private String idType;

        private UserOpenInfo(Builder builder) {
            this.id = builder.id;
            this.idType = builder.idType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserOpenInfo create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        public static final class Builder {
            private String id; 
            private String idType; 

            private Builder() {
            } 

            private Builder(UserOpenInfo model) {
                this.id = model.id;
                this.idType = model.idType;
            } 

            /**
             * <p>External user ID</p>
             * 
             * <strong>example:</strong>
             * <p>0963*0158</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>USER_ID</p>
             * 
             * <strong>example:</strong>
             * <p>USER_ID</p>
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            public UserOpenInfo build() {
                return new UserOpenInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CheckAuthCodeBindForExtResponseBody} extends {@link TeaModel}
     *
     * <p>CheckAuthCodeBindForExtResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceOpenInfo")
        private DeviceOpenInfo deviceOpenInfo;

        @com.aliyun.core.annotation.NameInMap("UserOpenInfo")
        private UserOpenInfo userOpenInfo;

        private Result(Builder builder) {
            this.deviceOpenInfo = builder.deviceOpenInfo;
            this.userOpenInfo = builder.userOpenInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return deviceOpenInfo
         */
        public DeviceOpenInfo getDeviceOpenInfo() {
            return this.deviceOpenInfo;
        }

        /**
         * @return userOpenInfo
         */
        public UserOpenInfo getUserOpenInfo() {
            return this.userOpenInfo;
        }

        public static final class Builder {
            private DeviceOpenInfo deviceOpenInfo; 
            private UserOpenInfo userOpenInfo; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.deviceOpenInfo = model.deviceOpenInfo;
                this.userOpenInfo = model.userOpenInfo;
            } 

            /**
             * <p>Device open information</p>
             */
            public Builder deviceOpenInfo(DeviceOpenInfo deviceOpenInfo) {
                this.deviceOpenInfo = deviceOpenInfo;
                return this;
            }

            /**
             * <p>User open information</p>
             */
            public Builder userOpenInfo(UserOpenInfo userOpenInfo) {
                this.userOpenInfo = userOpenInfo;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
