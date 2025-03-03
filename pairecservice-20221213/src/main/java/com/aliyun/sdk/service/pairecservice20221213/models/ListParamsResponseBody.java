// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListParamsResponseBody} extends {@link TeaModel}
 *
 * <p>ListParamsResponseBody</p>
 */
public class ListParamsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<Params> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListParamsResponseBody(Builder builder) {
        this.params = builder.params;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListParamsResponseBody create() {
        return builder().build();
    }

    /**
     * @return params
     */
    public java.util.List<Params> getParams() {
        return this.params;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Params> params; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Params.
         */
        public Builder params(java.util.List<Params> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A2D07551-38DA-531E-9B22-877D1D86A579</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListParamsResponseBody build() {
            return new ListParamsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListParamsResponseBody} extends {@link TeaModel}
     *
     * <p>ListParamsResponseBody</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Environment")
        private String environment;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParamId")
        private String paramId;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Params(Builder builder) {
            this.environment = builder.environment;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.name = builder.name;
            this.paramId = builder.paramId;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return environment
         */
        public String getEnvironment() {
            return this.environment;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return paramId
         */
        public String getParamId() {
            return this.paramId;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String environment; 
            private String gmtModifiedTime; 
            private String name; 
            private String paramId; 
            private String value; 

            /**
             * Environment.
             */
            public Builder environment(String environment) {
                this.environment = environment;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ParamId.
             */
            public Builder paramId(String paramId) {
                this.paramId = paramId;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
}
