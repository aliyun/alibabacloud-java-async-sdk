// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeModifyParameterLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModifyParameterLogResponseBody</p>
 */
public class DescribeModifyParameterLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Changelogs")
    private java.util.List<Changelogs> changelogs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<Changelogs> getChangelogs() {
        return this.changelogs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Changelogs> changelogs; 
        private String requestId; 

        /**
         * <p>The queried parameter modification logs.</p>
         */
        public Builder changelogs(java.util.List<Changelogs> changelogs) {
            this.changelogs = changelogs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7565770E-7C45-462D-BA4A-8A5396F2CAD1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeModifyParameterLogResponseBody build() {
            return new DescribeModifyParameterLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeModifyParameterLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModifyParameterLogResponseBody</p>
     */
    public static class Changelogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EffectTime")
        private String effectTime;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterValid")
        private String parameterValid;

        @com.aliyun.core.annotation.NameInMap("ParameterValueAfter")
        private String parameterValueAfter;

        @com.aliyun.core.annotation.NameInMap("ParameterValueBefore")
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
             * <p>The effective time.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-05-05T11:22:22Z</p>
             */
            public Builder effectTime(String effectTime) {
                this.effectTime = effectTime;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>testkey</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>Indicates whether the modification takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder parameterValid(String parameterValid) {
                this.parameterValid = parameterValid;
                return this;
            }

            /**
             * <p>The original value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder parameterValueAfter(String parameterValueAfter) {
                this.parameterValueAfter = parameterValueAfter;
                return this;
            }

            /**
             * <p>The new value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
