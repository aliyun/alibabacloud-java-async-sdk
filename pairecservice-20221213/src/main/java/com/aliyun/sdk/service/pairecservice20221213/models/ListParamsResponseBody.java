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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListParamsResponseBody model) {
            this.params = model.params;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>A list of parameters.</p>
         */
        public Builder params(java.util.List<Params> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A2D07551-38DA-531E-9B22-877D1D86A579</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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

            private Builder() {
            } 

            private Builder(Params model) {
                this.environment = model.environment;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.name = model.name;
                this.paramId = model.paramId;
                this.value = model.value;
            } 

            /**
             * <p>The environment to which the parameter belongs. Valid values:</p>
             * <ul>
             * <li><p>Daily: A test environment for daily use.</p>
             * </li>
             * <li><p>Prepub: A staging environment that mirrors the production environment.</p>
             * </li>
             * <li><p>Product: The production environment.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Daily</p>
             */
            public Builder environment(String environment) {
                this.environment = environment;
                return this;
            }

            /**
             * <p>The time when the parameter was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-15T23:24:33.132+08:00</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>home</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The parameter ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder paramId(String paramId) {
                this.paramId = paramId;
                return this;
            }

            /**
             * <p>The parameter value.</p>
             * 
             * <strong>example:</strong>
             * <p>house</p>
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
