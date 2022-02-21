// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>BindDevicesResponseBody</p>
 */
public class BindDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private BindDevicesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindDevicesResponseBody create() {
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
    public Data getData() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

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
        public Builder data(Data data) {
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

        public BindDevicesResponseBody build() {
            return new BindDevicesResponseBody(this);
        } 

    } 

    public static class SubDeviceList extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Message")
        private String message;

        @NameInMap("SubDeviceId")
        private String subDeviceId;

        @NameInMap("SubDeviceIp")
        private String subDeviceIp;

        @NameInMap("SubDeviceName")
        private String subDeviceName;

        @NameInMap("SubDeviceNum")
        private String subDeviceNum;

        @NameInMap("SubDevicePort")
        private String subDevicePort;

        private SubDeviceList(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.subDeviceId = builder.subDeviceId;
            this.subDeviceIp = builder.subDeviceIp;
            this.subDeviceName = builder.subDeviceName;
            this.subDeviceNum = builder.subDeviceNum;
            this.subDevicePort = builder.subDevicePort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDeviceList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return subDeviceId
         */
        public String getSubDeviceId() {
            return this.subDeviceId;
        }

        /**
         * @return subDeviceIp
         */
        public String getSubDeviceIp() {
            return this.subDeviceIp;
        }

        /**
         * @return subDeviceName
         */
        public String getSubDeviceName() {
            return this.subDeviceName;
        }

        /**
         * @return subDeviceNum
         */
        public String getSubDeviceNum() {
            return this.subDeviceNum;
        }

        /**
         * @return subDevicePort
         */
        public String getSubDevicePort() {
            return this.subDevicePort;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private String subDeviceId; 
            private String subDeviceIp; 
            private String subDeviceName; 
            private String subDeviceNum; 
            private String subDevicePort; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * SubDeviceId.
             */
            public Builder subDeviceId(String subDeviceId) {
                this.subDeviceId = subDeviceId;
                return this;
            }

            /**
             * SubDeviceIp.
             */
            public Builder subDeviceIp(String subDeviceIp) {
                this.subDeviceIp = subDeviceIp;
                return this;
            }

            /**
             * SubDeviceName.
             */
            public Builder subDeviceName(String subDeviceName) {
                this.subDeviceName = subDeviceName;
                return this;
            }

            /**
             * SubDeviceNum.
             */
            public Builder subDeviceNum(String subDeviceNum) {
                this.subDeviceNum = subDeviceNum;
                return this;
            }

            /**
             * SubDevicePort.
             */
            public Builder subDevicePort(String subDevicePort) {
                this.subDevicePort = subDevicePort;
                return this;
            }

            public SubDeviceList build() {
                return new SubDeviceList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("SubDeviceList")
        private java.util.List < SubDeviceList> subDeviceList;

        private Data(Builder builder) {
            this.subDeviceList = builder.subDeviceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return subDeviceList
         */
        public java.util.List < SubDeviceList> getSubDeviceList() {
            return this.subDeviceList;
        }

        public static final class Builder {
            private java.util.List < SubDeviceList> subDeviceList; 

            /**
             * SubDeviceList.
             */
            public Builder subDeviceList(java.util.List < SubDeviceList> subDeviceList) {
                this.subDeviceList = subDeviceList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
