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
 * {@link GetParameterSetResponseBody} extends {@link TeaModel}
 *
 * <p>GetParameterSetResponseBody</p>
 */
public class GetParameterSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("parameterSet")
    private ParameterSet parameterSet;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetParameterSetResponseBody(Builder builder) {
        this.parameterSet = builder.parameterSet;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetParameterSetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parameterSet
     */
    public ParameterSet getParameterSet() {
        return this.parameterSet;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ParameterSet parameterSet; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetParameterSetResponseBody model) {
            this.parameterSet = model.parameterSet;
            this.requestId = model.requestId;
        } 

        /**
         * parameterSet.
         */
        public Builder parameterSet(ParameterSet parameterSet) {
            this.parameterSet = parameterSet;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetParameterSetResponseBody build() {
            return new GetParameterSetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetParameterSetResponseBody} extends {@link TeaModel}
     *
     * <p>GetParameterSetResponseBody</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private Object value;

        private Parameters(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String type; 
            private Object value; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.name = model.name;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetParameterSetResponseBody} extends {@link TeaModel}
     *
     * <p>GetParameterSetResponseBody</p>
     */
    public static class RelationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("resourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        private RelationList(Builder builder) {
            this.createTime = builder.createTime;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelationList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String createTime; 
            private String resourceId; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(RelationList model) {
                this.createTime = model.createTime;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
            } 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * resourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public RelationList build() {
                return new RelationList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetParameterSetResponseBody} extends {@link TeaModel}
     *
     * <p>GetParameterSetResponseBody</p>
     */
    public static class ParameterSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("parameterSetId")
        private String parameterSetId;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.List<Parameters> parameters;

        @com.aliyun.core.annotation.NameInMap("relationList")
        private java.util.List<RelationList> relationList;

        private ParameterSet(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.name = builder.name;
            this.parameterSetId = builder.parameterSetId;
            this.parameters = builder.parameters;
            this.relationList = builder.relationList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterSet create() {
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
        public java.util.List<Parameters> getParameters() {
            return this.parameters;
        }

        /**
         * @return relationList
         */
        public java.util.List<RelationList> getRelationList() {
            return this.relationList;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String name; 
            private String parameterSetId; 
            private java.util.List<Parameters> parameters; 
            private java.util.List<RelationList> relationList; 

            private Builder() {
            } 

            private Builder(ParameterSet model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.name = model.name;
                this.parameterSetId = model.parameterSetId;
                this.parameters = model.parameters;
                this.relationList = model.relationList;
            } 

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
            public Builder parameters(java.util.List<Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * relationList.
             */
            public Builder relationList(java.util.List<RelationList> relationList) {
                this.relationList = relationList;
                return this;
            }

            public ParameterSet build() {
                return new ParameterSet(this);
            } 

        } 

    }
}
