// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSystemParametersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSystemParametersResponseBody</p>
 */
public class DescribeSystemParametersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SystemParams")
    private SystemParams systemParams;

    private DescribeSystemParametersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.systemParams = builder.systemParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSystemParametersResponseBody create() {
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
         * Examples
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The description of a parameter.
         */
        public Builder systemParams(SystemParams systemParams) {
            this.systemParams = systemParams;
            return this;
        }

        public DescribeSystemParametersResponseBody build() {
            return new DescribeSystemParametersResponseBody(this);
        } 

    } 

    public static class SystemParamItem extends TeaModel {
        @NameInMap("DemoValue")
        private String demoValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("ParamName")
        private String paramName;

        @NameInMap("ParamType")
        private String paramType;

        private SystemParamItem(Builder builder) {
            this.demoValue = builder.demoValue;
            this.description = builder.description;
            this.paramName = builder.paramName;
            this.paramType = builder.paramType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemParamItem create() {
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
             * Client IP Address
             */
            public Builder demoValue(String demoValue) {
                this.demoValue = demoValue;
                return this;
            }

            /**
             * The name of the parameter.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * *   This API is intended for API callers.
             * <p>
             * *   The response of this API contains the system parameters that are optional in API definitions.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * Queries the common parameters supported by the system.
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            public SystemParamItem build() {
                return new SystemParamItem(this);
            } 

        } 

    }
    public static class SystemParams extends TeaModel {
        @NameInMap("SystemParamItem")
        private java.util.List < SystemParamItem> systemParamItem;

        private SystemParams(Builder builder) {
            this.systemParamItem = builder.systemParamItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemParams create() {
            return builder().build();
        }

        /**
         * @return systemParamItem
         */
        public java.util.List < SystemParamItem> getSystemParamItem() {
            return this.systemParamItem;
        }

        public static final class Builder {
            private java.util.List < SystemParamItem> systemParamItem; 

            /**
             * SystemParamItem.
             */
            public Builder systemParamItem(java.util.List < SystemParamItem> systemParamItem) {
                this.systemParamItem = systemParamItem;
                return this;
            }

            public SystemParams build() {
                return new SystemParams(this);
            } 

        } 

    }
}
