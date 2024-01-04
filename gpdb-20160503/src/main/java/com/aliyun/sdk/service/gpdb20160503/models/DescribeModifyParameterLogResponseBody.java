// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeModifyParameterLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModifyParameterLogResponseBody</p>
 */
public class DescribeModifyParameterLogResponseBody extends TeaModel {
    @NameInMap("Changelogs")
    private java.util.List < Changelogs> changelogs;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeModifyParameterLogResponseBody(Builder builder) {
        this.changelogs = builder.changelogs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModifyParameterLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return changelogs
     */
    public java.util.List < Changelogs> getChangelogs() {
        return this.changelogs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Changelogs> changelogs; 
        private String requestId; 

        /**
         * The queried parameter modification logs.
         */
        public Builder changelogs(java.util.List < Changelogs> changelogs) {
            this.changelogs = changelogs;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeModifyParameterLogResponseBody build() {
            return new DescribeModifyParameterLogResponseBody(this);
        } 

    } 

    public static class Changelogs extends TeaModel {
        @NameInMap("EffectTime")
        private String effectTime;

        @NameInMap("ParameterName")
        private String parameterName;

        @NameInMap("ParameterValid")
        private String parameterValid;

        @NameInMap("ParameterValueAfter")
        private String parameterValueAfter;

        @NameInMap("ParameterValueBefore")
        private String parameterValueBefore;

        private Changelogs(Builder builder) {
            this.effectTime = builder.effectTime;
            this.parameterName = builder.parameterName;
            this.parameterValid = builder.parameterValid;
            this.parameterValueAfter = builder.parameterValueAfter;
            this.parameterValueBefore = builder.parameterValueBefore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Changelogs create() {
            return builder().build();
        }

        /**
         * @return effectTime
         */
        public String getEffectTime() {
            return this.effectTime;
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        /**
         * @return parameterValid
         */
        public String getParameterValid() {
            return this.parameterValid;
        }

        /**
         * @return parameterValueAfter
         */
        public String getParameterValueAfter() {
            return this.parameterValueAfter;
        }

        /**
         * @return parameterValueBefore
         */
        public String getParameterValueBefore() {
            return this.parameterValueBefore;
        }

        public static final class Builder {
            private String effectTime; 
            private String parameterName; 
            private String parameterValid; 
            private String parameterValueAfter; 
            private String parameterValueBefore; 

            /**
             * The effective time.
             */
            public Builder effectTime(String effectTime) {
                this.effectTime = effectTime;
                return this;
            }

            /**
             * The name of the parameter.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * Indicates whether the modification takes effect.
             */
            public Builder parameterValid(String parameterValid) {
                this.parameterValid = parameterValid;
                return this;
            }

            /**
             * The original value of the parameter.
             */
            public Builder parameterValueAfter(String parameterValueAfter) {
                this.parameterValueAfter = parameterValueAfter;
                return this;
            }

            /**
             * The new value of the parameter.
             */
            public Builder parameterValueBefore(String parameterValueBefore) {
                this.parameterValueBefore = parameterValueBefore;
                return this;
            }

            public Changelogs build() {
                return new Changelogs(this);
            } 

        } 

    }
}
