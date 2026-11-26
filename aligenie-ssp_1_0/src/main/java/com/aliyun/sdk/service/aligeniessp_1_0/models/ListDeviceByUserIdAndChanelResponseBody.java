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
 * {@link ListDeviceByUserIdAndChanelResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeviceByUserIdAndChanelResponseBody</p>
 */
public class ListDeviceByUserIdAndChanelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private ListDeviceByUserIdAndChanelResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceByUserIdAndChanelResponseBody create() {
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListDeviceByUserIdAndChanelResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The returned error code. The value 200 indicates that the call succeeded.</p>
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
         * <p>RE***D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of information</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListDeviceByUserIdAndChanelResponseBody build() {
            return new ListDeviceByUserIdAndChanelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDeviceByUserIdAndChanelResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeviceByUserIdAndChanelResponseBody</p>
     */
    public static class DeviceUnionIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceUnionId")
        private String deviceUnionId;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        private DeviceUnionIds(Builder builder) {
            this.deviceUnionId = builder.deviceUnionId;
            this.organizationId = builder.organizationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceUnionIds create() {
            return builder().build();
        }

        /**
         * @return deviceUnionId
         */
        public String getDeviceUnionId() {
            return this.deviceUnionId;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        public static final class Builder {
            private String deviceUnionId; 
            private String organizationId; 

            private Builder() {
            } 

            private Builder(DeviceUnionIds model) {
                this.deviceUnionId = model.deviceUnionId;
                this.organizationId = model.organizationId;
            } 

            /**
             * <p>The UnionId of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>1553*B0C3</p>
             */
            public Builder deviceUnionId(String deviceUnionId) {
                this.deviceUnionId = deviceUnionId;
                return this;
            }

            /**
             * <p>Organization ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1***2</p>
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            public DeviceUnionIds build() {
                return new DeviceUnionIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDeviceByUserIdAndChanelResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeviceByUserIdAndChanelResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceOpenId")
        private String deviceOpenId;

        @com.aliyun.core.annotation.NameInMap("DeviceUnionIds")
        private java.util.List<DeviceUnionIds> deviceUnionIds;

        private Result(Builder builder) {
            this.deviceOpenId = builder.deviceOpenId;
            this.deviceUnionIds = builder.deviceUnionIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return deviceOpenId
         */
        public String getDeviceOpenId() {
            return this.deviceOpenId;
        }

        /**
         * @return deviceUnionIds
         */
        public java.util.List<DeviceUnionIds> getDeviceUnionIds() {
            return this.deviceUnionIds;
        }

        public static final class Builder {
            private String deviceOpenId; 
            private java.util.List<DeviceUnionIds> deviceUnionIds; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.deviceOpenId = model.deviceOpenId;
                this.deviceUnionIds = model.deviceUnionIds;
            } 

            /**
             * <p>The openId corresponding to the Device Information.</p>
             * 
             * <strong>example:</strong>
             * <p>A963*0158</p>
             */
            public Builder deviceOpenId(String deviceOpenId) {
                this.deviceOpenId = deviceOpenId;
                return this;
            }

            /**
             * <p>List of information</p>
             */
            public Builder deviceUnionIds(java.util.List<DeviceUnionIds> deviceUnionIds) {
                this.deviceUnionIds = deviceUnionIds;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
