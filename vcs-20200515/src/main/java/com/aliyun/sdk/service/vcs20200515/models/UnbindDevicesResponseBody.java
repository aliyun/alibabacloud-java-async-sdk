// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>UnbindDevicesResponseBody</p>
 */
public class UnbindDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private UnbindDevicesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindDevicesResponseBody create() {
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

        public UnbindDevicesResponseBody build() {
            return new UnbindDevicesResponseBody(this);
        } 

    } 

    public static class SubDeviceList extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Message")
        private String message;

        @NameInMap("SubDeviceId")
        private String subDeviceId;

        private SubDeviceList(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.subDeviceId = builder.subDeviceId;
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

        public static final class Builder {
            private String code; 
            private String message; 
            private String subDeviceId; 

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
