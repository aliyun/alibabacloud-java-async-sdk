// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ListParameterSetRelationResponseBody} extends {@link TeaModel}
 *
 * <p>ListParameterSetRelationResponseBody</p>
 */
public class ListParameterSetRelationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("parameterSets")
    private java.util.List<ParameterSets> parameterSets;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListParameterSetRelationResponseBody(Builder builder) {
        this.parameterSets = builder.parameterSets;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListParameterSetRelationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parameterSets
     */
    public java.util.List<ParameterSets> getParameterSets() {
        return this.parameterSets;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ParameterSets> parameterSets; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListParameterSetRelationResponseBody model) {
            this.parameterSets = model.parameterSets;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of parameter sets.</p>
         */
        public Builder parameterSets(java.util.List<ParameterSets> parameterSets) {
            this.parameterSets = parameterSets;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2F24E990-E8D3-5C18-ABEA-C7A3F1831C57</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListParameterSetRelationResponseBody build() {
            return new ListParameterSetRelationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListParameterSetRelationResponseBody} extends {@link TeaModel}
     *
     * <p>ListParameterSetRelationResponseBody</p>
     */
    public static class ParameterSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("parameterSetId")
        private String parameterSetId;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.Map<String, String> parameters;

        private ParameterSets(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.name = builder.name;
            this.parameterSetId = builder.parameterSetId;
            this.parameters = builder.parameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterSets create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parameterSetId
         */
        public String getParameterSetId() {
            return this.parameterSetId;
        }

        /**
         * @return parameters
         */
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String name; 
            private String parameterSetId; 
            private java.util.Map<String, String> parameters; 

            private Builder() {
            } 

            private Builder(ParameterSets model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.name = model.name;
                this.parameterSetId = model.parameterSetId;
                this.parameters = model.parameters;
            } 

            /**
             * <p>The time when the parameter set was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-14T10:05:19Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>123111</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the parameter set.</p>
             * 
             * <strong>example:</strong>
             * <p>alb_enable_ipv6_4.2</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the parameter set.</p>
             * 
             * <strong>example:</strong>
             * <p>pts-kw1b11jlssrabb638ptums</p>
             */
            public Builder parameterSetId(String parameterSetId) {
                this.parameterSetId = parameterSetId;
                return this;
            }

            /**
             * <p>The content of the parameter set.</p>
             */
            public Builder parameters(java.util.Map<String, String> parameters) {
                this.parameters = parameters;
                return this;
            }

            public ParameterSets build() {
                return new ParameterSets(this);
            } 

        } 

    }
}
