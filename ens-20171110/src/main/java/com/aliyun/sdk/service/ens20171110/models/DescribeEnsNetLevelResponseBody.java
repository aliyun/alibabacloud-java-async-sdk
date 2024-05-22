// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsNetLevelResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsNetLevelResponseBody</p>
 */
public class DescribeEnsNetLevelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("EnsNetLevels")
    private EnsNetLevels ensNetLevels;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEnsNetLevelResponseBody(Builder builder) {
        this.code = builder.code;
        this.ensNetLevels = builder.ensNetLevels;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsNetLevelResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return ensNetLevels
     */
    public EnsNetLevels getEnsNetLevels() {
        return this.ensNetLevels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private EnsNetLevels ensNetLevels; 
        private String requestId; 

        /**
         * The returned service code. A value of 0 indicates that the operation was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The network levels.
         */
        public Builder ensNetLevels(EnsNetLevels ensNetLevels) {
            this.ensNetLevels = ensNetLevels;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEnsNetLevelResponseBody build() {
            return new DescribeEnsNetLevelResponseBody(this);
        } 

    } 

    public static class EnsNetLevel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsNetLevelCode")
        private String ensNetLevelCode;

        private EnsNetLevel(Builder builder) {
            this.ensNetLevelCode = builder.ensNetLevelCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnsNetLevel create() {
            return builder().build();
        }

        /**
         * @return ensNetLevelCode
         */
        public String getEnsNetLevelCode() {
            return this.ensNetLevelCode;
        }

        public static final class Builder {
            private String ensNetLevelCode; 

            /**
             * The network level. Valid values:
             * <p>
             * 
             * *   Big: greater area.
             * *   Middle: province.
             * *   Small: city.
             */
            public Builder ensNetLevelCode(String ensNetLevelCode) {
                this.ensNetLevelCode = ensNetLevelCode;
                return this;
            }

            public EnsNetLevel build() {
                return new EnsNetLevel(this);
            } 

        } 

    }
    public static class EnsNetLevels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsNetLevel")
        private java.util.List < EnsNetLevel> ensNetLevel;

        private EnsNetLevels(Builder builder) {
            this.ensNetLevel = builder.ensNetLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnsNetLevels create() {
            return builder().build();
        }

        /**
         * @return ensNetLevel
         */
        public java.util.List < EnsNetLevel> getEnsNetLevel() {
            return this.ensNetLevel;
        }

        public static final class Builder {
            private java.util.List < EnsNetLevel> ensNetLevel; 

            /**
             * EnsNetLevel.
             */
            public Builder ensNetLevel(java.util.List < EnsNetLevel> ensNetLevel) {
                this.ensNetLevel = ensNetLevel;
                return this;
            }

            public EnsNetLevels build() {
                return new EnsNetLevels(this);
            } 

        } 

    }
}
