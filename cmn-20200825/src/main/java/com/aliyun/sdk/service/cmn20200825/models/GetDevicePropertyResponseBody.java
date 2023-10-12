// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDevicePropertyResponseBody} extends {@link TeaModel}
 *
 * <p>GetDevicePropertyResponseBody</p>
 */
public class GetDevicePropertyResponseBody extends TeaModel {
    @NameInMap("DeviceProperty")
    private DeviceProperty deviceProperty;

    @NameInMap("RequestId")
    private String requestId;

    private GetDevicePropertyResponseBody(Builder builder) {
        this.deviceProperty = builder.deviceProperty;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDevicePropertyResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceProperty
     */
    public DeviceProperty getDeviceProperty() {
        return this.deviceProperty;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DeviceProperty deviceProperty; 
        private String requestId; 

        /**
         * DeviceProperty.
         */
        public Builder deviceProperty(DeviceProperty deviceProperty) {
            this.deviceProperty = deviceProperty;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDevicePropertyResponseBody build() {
            return new GetDevicePropertyResponseBody(this);
        } 

    } 

    public static class DeviceProperty extends TeaModel {
        @NameInMap("BuiltIn")
        private Boolean builtIn;

        @NameInMap("DeviceFormId")
        private String deviceFormId;

        @NameInMap("DeviceFormName")
        private String deviceFormName;

        @NameInMap("DevicePropertyId")
        private String devicePropertyId;

        @NameInMap("PropertyContent")
        private String propertyContent;

        @NameInMap("PropertyFormat")
        private String propertyFormat;

        @NameInMap("PropertyKey")
        private String propertyKey;

        @NameInMap("PropertyName")
        private String propertyName;

        private DeviceProperty(Builder builder) {
            this.builtIn = builder.builtIn;
            this.deviceFormId = builder.deviceFormId;
            this.deviceFormName = builder.deviceFormName;
            this.devicePropertyId = builder.devicePropertyId;
            this.propertyContent = builder.propertyContent;
            this.propertyFormat = builder.propertyFormat;
            this.propertyKey = builder.propertyKey;
            this.propertyName = builder.propertyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceProperty create() {
            return builder().build();
        }

        /**
         * @return builtIn
         */
        public Boolean getBuiltIn() {
            return this.builtIn;
        }

        /**
         * @return deviceFormId
         */
        public String getDeviceFormId() {
            return this.deviceFormId;
        }

        /**
         * @return deviceFormName
         */
        public String getDeviceFormName() {
            return this.deviceFormName;
        }

        /**
         * @return devicePropertyId
         */
        public String getDevicePropertyId() {
            return this.devicePropertyId;
        }

        /**
         * @return propertyContent
         */
        public String getPropertyContent() {
            return this.propertyContent;
        }

        /**
         * @return propertyFormat
         */
        public String getPropertyFormat() {
            return this.propertyFormat;
        }

        /**
         * @return propertyKey
         */
        public String getPropertyKey() {
            return this.propertyKey;
        }

        /**
         * @return propertyName
         */
        public String getPropertyName() {
            return this.propertyName;
        }

        public static final class Builder {
            private Boolean builtIn; 
            private String deviceFormId; 
            private String deviceFormName; 
            private String devicePropertyId; 
            private String propertyContent; 
            private String propertyFormat; 
            private String propertyKey; 
            private String propertyName; 

            /**
             * BuiltIn.
             */
            public Builder builtIn(Boolean builtIn) {
                this.builtIn = builtIn;
                return this;
            }

            /**
             * DeviceFormId.
             */
            public Builder deviceFormId(String deviceFormId) {
                this.deviceFormId = deviceFormId;
                return this;
            }

            /**
             * DeviceFormName.
             */
            public Builder deviceFormName(String deviceFormName) {
                this.deviceFormName = deviceFormName;
                return this;
            }

            /**
             * DevicePropertyId.
             */
            public Builder devicePropertyId(String devicePropertyId) {
                this.devicePropertyId = devicePropertyId;
                return this;
            }

            /**
             * PropertyContent.
             */
            public Builder propertyContent(String propertyContent) {
                this.propertyContent = propertyContent;
                return this;
            }

            /**
             * PropertyFormat.
             */
            public Builder propertyFormat(String propertyFormat) {
                this.propertyFormat = propertyFormat;
                return this;
            }

            /**
             * PropertyKey.
             */
            public Builder propertyKey(String propertyKey) {
                this.propertyKey = propertyKey;
                return this;
            }

            /**
             * PropertyName.
             */
            public Builder propertyName(String propertyName) {
                this.propertyName = propertyName;
                return this;
            }

            public DeviceProperty build() {
                return new DeviceProperty(this);
            } 

        } 

    }
}
