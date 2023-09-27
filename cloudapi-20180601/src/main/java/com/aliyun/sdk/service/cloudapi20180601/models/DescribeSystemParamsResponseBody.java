// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSystemParamsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSystemParamsResponseBody</p>
 */
public class DescribeSystemParamsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SystemParams")
    private SystemParams systemParams;

    private DescribeSystemParamsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.systemParams = builder.systemParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSystemParamsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return systemParams
     */
    public SystemParams getSystemParams() {
        return this.systemParams;
    }

    public static final class Builder {
        private String requestId; 
        private SystemParams systemParams; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SystemParams.
         */
        public Builder systemParams(SystemParams systemParams) {
            this.systemParams = systemParams;
            return this;
        }

        public DescribeSystemParamsResponseBody build() {
            return new DescribeSystemParamsResponseBody(this);
        } 

    } 

    public static class SystemParam extends TeaModel {
        @NameInMap("DemoValue")
        private String demoValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("ParamName")
        private String paramName;

        @NameInMap("ParamType")
        private String paramType;

        private SystemParam(Builder builder) {
            this.demoValue = builder.demoValue;
            this.description = builder.description;
            this.paramName = builder.paramName;
            this.paramType = builder.paramType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemParam create() {
            return builder().build();
        }

        /**
         * @return demoValue
         */
        public String getDemoValue() {
            return this.demoValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return paramName
         */
        public String getParamName() {
            return this.paramName;
        }

        /**
         * @return paramType
         */
        public String getParamType() {
            return this.paramType;
        }

        public static final class Builder {
            private String demoValue; 
            private String description; 
            private String paramName; 
            private String paramType; 

            /**
             * DemoValue.
             */
            public Builder demoValue(String demoValue) {
                this.demoValue = demoValue;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ParamName.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * ParamType.
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            public SystemParam build() {
                return new SystemParam(this);
            } 

        } 

    }
    public static class SystemParams extends TeaModel {
        @NameInMap("SystemParam")
        private java.util.List < SystemParam> systemParam;

        private SystemParams(Builder builder) {
            this.systemParam = builder.systemParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemParams create() {
            return builder().build();
        }

        /**
         * @return systemParam
         */
        public java.util.List < SystemParam> getSystemParam() {
            return this.systemParam;
        }

        public static final class Builder {
            private java.util.List < SystemParam> systemParam; 

            /**
             * SystemParam.
             */
            public Builder systemParam(java.util.List < SystemParam> systemParam) {
                this.systemParam = systemParam;
                return this;
            }

            public SystemParams build() {
                return new SystemParams(this);
            } 

        } 

    }
}
