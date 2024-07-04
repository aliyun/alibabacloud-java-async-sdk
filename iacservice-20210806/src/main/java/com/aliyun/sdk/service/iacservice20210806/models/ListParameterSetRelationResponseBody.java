// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListParameterSetRelationResponseBody} extends {@link TeaModel}
 *
 * <p>ListParameterSetRelationResponseBody</p>
 */
public class ListParameterSetRelationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("parameterSets")
    private java.util.List < ParameterSets> parameterSets;

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

    /**
     * @return parameterSets
     */
    public java.util.List < ParameterSets> getParameterSets() {
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
        private java.util.List < ParameterSets> parameterSets; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * parameterSets.
         */
        public Builder parameterSets(java.util.List < ParameterSets> parameterSets) {
            this.parameterSets = parameterSets;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListParameterSetRelationResponseBody build() {
            return new ListParameterSetRelationResponseBody(this);
        } 

    } 

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
        private java.util.Map < String, String > parameters;

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
        public java.util.Map < String, String > getParameters() {
            return this.parameters;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String name; 
            private String parameterSetId; 
            private java.util.Map < String, String > parameters; 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * parameterSetId.
             */
            public Builder parameterSetId(String parameterSetId) {
                this.parameterSetId = parameterSetId;
                return this;
            }

            /**
             * parameters.
             */
            public Builder parameters(java.util.Map < String, String > parameters) {
                this.parameters = parameters;
                return this;
            }

            public ParameterSets build() {
                return new ParameterSets(this);
            } 

        } 

    }
}
