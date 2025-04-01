// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeParameterGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParameterGroupsResponseBody</p>
 */
public class DescribeParameterGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ParameterGroups")
    private java.util.List<ParameterGroups> parameterGroups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeParameterGroupsResponseBody(Builder builder) {
        this.parameterGroups = builder.parameterGroups;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParameterGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parameterGroups
     */
    public java.util.List<ParameterGroups> getParameterGroups() {
        return this.parameterGroups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ParameterGroups> parameterGroups; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeParameterGroupsResponseBody model) {
            this.parameterGroups = model.parameterGroups;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of parameter templates.</p>
         */
        public Builder parameterGroups(java.util.List<ParameterGroups> parameterGroups) {
            this.parameterGroups = parameterGroups;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>686BB8A6-BBA5-47E5-8A75-D2ADE433****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeParameterGroupsResponseBody build() {
            return new DescribeParameterGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeParameterGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParameterGroupsResponseBody</p>
     */
    public static class ParameterGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private Long category;

        @com.aliyun.core.annotation.NameInMap("Created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("Modified")
        private String modified;

        @com.aliyun.core.annotation.NameInMap("ParamGroupId")
        private String paramGroupId;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupDesc")
        private String parameterGroupDesc;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupName")
        private String parameterGroupName;

        private ParameterGroups(Builder builder) {
            this.category = builder.category;
            this.created = builder.created;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.modified = builder.modified;
            this.paramGroupId = builder.paramGroupId;
            this.parameterGroupDesc = builder.parameterGroupDesc;
            this.parameterGroupName = builder.parameterGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterGroups create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public Long getCategory() {
            return this.category;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return modified
         */
        public String getModified() {
            return this.modified;
        }

        /**
         * @return paramGroupId
         */
        public String getParamGroupId() {
            return this.paramGroupId;
        }

        /**
         * @return parameterGroupDesc
         */
        public String getParameterGroupDesc() {
            return this.parameterGroupDesc;
        }

        /**
         * @return parameterGroupName
         */
        public String getParameterGroupName() {
            return this.parameterGroupName;
        }

        public static final class Builder {
            private Long category; 
            private String created; 
            private String engine; 
            private String engineVersion; 
            private String modified; 
            private String paramGroupId; 
            private String parameterGroupDesc; 
            private String parameterGroupName; 

            private Builder() {
            } 

            private Builder(ParameterGroups model) {
                this.category = model.category;
                this.created = model.created;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.modified = model.modified;
                this.paramGroupId = model.paramGroupId;
                this.parameterGroupDesc = model.parameterGroupDesc;
                this.parameterGroupName = model.parameterGroupName;
            } 

            /**
             * <p>The service category. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Redis Open-Source Edition</li>
             * <li><strong>1</strong>: Tair (Enterprise Edition)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder category(Long category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The time when the parameter template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-18 16:32:45</p>
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The engine type. Valid values:</p>
             * <ul>
             * <li><strong>redis</strong>: Redis Open-Source Edition or Tair (In-Memory)</li>
             * <li><strong>tair_pena</strong>: Tair (On NVM)</li>
             * <li><strong>tair_pdb</strong>: Tair (On Disk)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>redis</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The compatible engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The time when the parameter template was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-18 16:32:45</p>
             */
            public Builder modified(String modified) {
                this.modified = modified;
                return this;
            }

            /**
             * <p>The parameter template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>test01</p>
             */
            public Builder paramGroupId(String paramGroupId) {
                this.paramGroupId = paramGroupId;
                return this;
            }

            /**
             * <p>The description of the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder parameterGroupDesc(String parameterGroupDesc) {
                this.parameterGroupDesc = parameterGroupDesc;
                return this;
            }

            /**
             * <p>The name of the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>testGroupName</p>
             */
            public Builder parameterGroupName(String parameterGroupName) {
                this.parameterGroupName = parameterGroupName;
                return this;
            }

            public ParameterGroups build() {
                return new ParameterGroups(this);
            } 

        } 

    }
}
