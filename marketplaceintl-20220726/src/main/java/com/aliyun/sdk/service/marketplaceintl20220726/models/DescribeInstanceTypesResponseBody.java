// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceTypesResponseBody</p>
 */
public class DescribeInstanceTypesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Msg")
    private String msg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeInstanceTypesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private Integer code; 
        private Data data; 
        private String errorCode; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
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

        public DescribeInstanceTypesResponseBody build() {
            return new DescribeInstanceTypesResponseBody(this);
        } 

    } 

    public static class CustomizeFamily extends TeaModel {
        @NameInMap("GlobalKey")
        private String globalKey;

        @NameInMap("Text")
        private String text;

        @NameInMap("Value")
        private String value;

        private CustomizeFamily(Builder builder) {
            this.globalKey = builder.globalKey;
            this.text = builder.text;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomizeFamily create() {
            return builder().build();
        }

        /**
         * @return globalKey
         */
        public String getGlobalKey() {
            return this.globalKey;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String globalKey; 
            private String text; 
            private String value; 

            /**
             * GlobalKey.
             */
            public Builder globalKey(String globalKey) {
                this.globalKey = globalKey;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public CustomizeFamily build() {
                return new CustomizeFamily(this);
            } 

        } 

    }
    public static class InstanceTypes extends TeaModel {
        @NameInMap("Text")
        private String text;

        @NameInMap("Value")
        private String value;

        private InstanceTypes(Builder builder) {
            this.text = builder.text;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypes create() {
            return builder().build();
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String text; 
            private String value; 

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public InstanceTypes build() {
                return new InstanceTypes(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CustomizeFamily")
        private java.util.List < CustomizeFamily> customizeFamily;

        @NameInMap("InstanceTypes")
        private java.util.List < InstanceTypes> instanceTypes;

        @NameInMap("TrackId")
        private String trackId;

        private Data(Builder builder) {
            this.customizeFamily = builder.customizeFamily;
            this.instanceTypes = builder.instanceTypes;
            this.trackId = builder.trackId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customizeFamily
         */
        public java.util.List < CustomizeFamily> getCustomizeFamily() {
            return this.customizeFamily;
        }

        /**
         * @return instanceTypes
         */
        public java.util.List < InstanceTypes> getInstanceTypes() {
            return this.instanceTypes;
        }

        /**
         * @return trackId
         */
        public String getTrackId() {
            return this.trackId;
        }

        public static final class Builder {
            private java.util.List < CustomizeFamily> customizeFamily; 
            private java.util.List < InstanceTypes> instanceTypes; 
            private String trackId; 

            /**
             * CustomizeFamily.
             */
            public Builder customizeFamily(java.util.List < CustomizeFamily> customizeFamily) {
                this.customizeFamily = customizeFamily;
                return this;
            }

            /**
             * InstanceTypes.
             */
            public Builder instanceTypes(java.util.List < InstanceTypes> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * TrackId.
             */
            public Builder trackId(String trackId) {
                this.trackId = trackId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
