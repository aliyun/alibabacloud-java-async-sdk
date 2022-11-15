// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommonTargetResultListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommonTargetResultListResponseBody</p>
 */
public class DescribeCommonTargetResultListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TargetConfig")
    private TargetConfig targetConfig;

    private DescribeCommonTargetResultListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.targetConfig = builder.targetConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommonTargetResultListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return targetConfig
     */
    public TargetConfig getTargetConfig() {
        return this.targetConfig;
    }

    public static final class Builder {
        private String requestId; 
        private TargetConfig targetConfig; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TargetConfig.
         */
        public Builder targetConfig(TargetConfig targetConfig) {
            this.targetConfig = targetConfig;
            return this;
        }

        public DescribeCommonTargetResultListResponseBody build() {
            return new DescribeCommonTargetResultListResponseBody(this);
        } 

    } 

    public static class TargetConfig extends TeaModel {
        @NameInMap("Flag")
        private String flag;

        @NameInMap("TargetDefault")
        private String targetDefault;

        @NameInMap("TargetList")
        private java.util.List < String > targetList;

        @NameInMap("TargetType")
        private String targetType;

        @NameInMap("TotalCount")
        private String totalCount;

        @NameInMap("Type")
        private String type;

        private TargetConfig(Builder builder) {
            this.flag = builder.flag;
            this.targetDefault = builder.targetDefault;
            this.targetList = builder.targetList;
            this.targetType = builder.targetType;
            this.totalCount = builder.totalCount;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetConfig create() {
            return builder().build();
        }

        /**
         * @return flag
         */
        public String getFlag() {
            return this.flag;
        }

        /**
         * @return targetDefault
         */
        public String getTargetDefault() {
            return this.targetDefault;
        }

        /**
         * @return targetList
         */
        public java.util.List < String > getTargetList() {
            return this.targetList;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String flag; 
            private String targetDefault; 
            private java.util.List < String > targetList; 
            private String targetType; 
            private String totalCount; 
            private String type; 

            /**
             * Flag.
             */
            public Builder flag(String flag) {
                this.flag = flag;
                return this;
            }

            /**
             * TargetDefault.
             */
            public Builder targetDefault(String targetDefault) {
                this.targetDefault = targetDefault;
                return this;
            }

            /**
             * TargetList.
             */
            public Builder targetList(java.util.List < String > targetList) {
                this.targetList = targetList;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TargetConfig build() {
                return new TargetConfig(this);
            } 

        } 

    }
}
