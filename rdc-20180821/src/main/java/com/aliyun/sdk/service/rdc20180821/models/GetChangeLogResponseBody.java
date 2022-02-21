// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChangeLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetChangeLogResponseBody</p>
 */
public class GetChangeLogResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetChangeLogResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChangeLogResponseBody create() {
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
    public java.util.List < Data> getData() {
        return this.data;
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
        private java.util.List < Data> data; 
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
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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

        public GetChangeLogResponseBody build() {
            return new GetChangeLogResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("NewValue")
        private String newValue;

        @NameInMap("OldValue")
        private String oldValue;

        @NameInMap("Other")
        private String other;

        @NameInMap("PropertyKey")
        private String propertyKey;

        @NameInMap("PropertyType")
        private String propertyType;

        @NameInMap("TargetId")
        private Integer targetId;

        @NameInMap("TargetType")
        private String targetType;

        private Data(Builder builder) {
            this.newValue = builder.newValue;
            this.oldValue = builder.oldValue;
            this.other = builder.other;
            this.propertyKey = builder.propertyKey;
            this.propertyType = builder.propertyType;
            this.targetId = builder.targetId;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return newValue
         */
        public String getNewValue() {
            return this.newValue;
        }

        /**
         * @return oldValue
         */
        public String getOldValue() {
            return this.oldValue;
        }

        /**
         * @return other
         */
        public String getOther() {
            return this.other;
        }

        /**
         * @return propertyKey
         */
        public String getPropertyKey() {
            return this.propertyKey;
        }

        /**
         * @return propertyType
         */
        public String getPropertyType() {
            return this.propertyType;
        }

        /**
         * @return targetId
         */
        public Integer getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String newValue; 
            private String oldValue; 
            private String other; 
            private String propertyKey; 
            private String propertyType; 
            private Integer targetId; 
            private String targetType; 

            /**
             * NewValue.
             */
            public Builder newValue(String newValue) {
                this.newValue = newValue;
                return this;
            }

            /**
             * OldValue.
             */
            public Builder oldValue(String oldValue) {
                this.oldValue = oldValue;
                return this;
            }

            /**
             * Other.
             */
            public Builder other(String other) {
                this.other = other;
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
             * PropertyType.
             */
            public Builder propertyType(String propertyType) {
                this.propertyType = propertyType;
                return this;
            }

            /**
             * TargetId.
             */
            public Builder targetId(Integer targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
