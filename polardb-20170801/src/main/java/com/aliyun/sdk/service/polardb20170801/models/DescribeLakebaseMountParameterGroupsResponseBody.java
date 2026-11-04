// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeLakebaseMountParameterGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLakebaseMountParameterGroupsResponseBody</p>
 */
public class DescribeLakebaseMountParameterGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ParameterGroups")
    private java.util.List<ParameterGroups> parameterGroups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLakebaseMountParameterGroupsResponseBody(Builder builder) {
        this.parameterGroups = builder.parameterGroups;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLakebaseMountParameterGroupsResponseBody create() {
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

        private Builder(DescribeLakebaseMountParameterGroupsResponseBody model) {
            this.parameterGroups = model.parameterGroups;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The parameter templates.</p>
         */
        public Builder parameterGroups(java.util.List<ParameterGroups> parameterGroups) {
            this.parameterGroups = parameterGroups;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F45FFACC-xxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLakebaseMountParameterGroupsResponseBody build() {
            return new DescribeLakebaseMountParameterGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLakebaseMountParameterGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLakebaseMountParameterGroupsResponseBody</p>
     */
    public static class ParameterGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("IsApply")
        private String isApply;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("ParameterCounts")
        private Integer parameterCounts;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupDesc")
        private String parameterGroupDesc;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupId")
        private String parameterGroupId;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupName")
        private String parameterGroupName;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupType")
        private String parameterGroupType;

        private ParameterGroups(Builder builder) {
            this.createTime = builder.createTime;
            this.isApply = builder.isApply;
            this.modifyTime = builder.modifyTime;
            this.parameterCounts = builder.parameterCounts;
            this.parameterGroupDesc = builder.parameterGroupDesc;
            this.parameterGroupId = builder.parameterGroupId;
            this.parameterGroupName = builder.parameterGroupName;
            this.parameterGroupType = builder.parameterGroupType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterGroups create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return isApply
         */
        public String getIsApply() {
            return this.isApply;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return parameterCounts
         */
        public Integer getParameterCounts() {
            return this.parameterCounts;
        }

        /**
         * @return parameterGroupDesc
         */
        public String getParameterGroupDesc() {
            return this.parameterGroupDesc;
        }

        /**
         * @return parameterGroupId
         */
        public String getParameterGroupId() {
            return this.parameterGroupId;
        }

        /**
         * @return parameterGroupName
         */
        public String getParameterGroupName() {
            return this.parameterGroupName;
        }

        /**
         * @return parameterGroupType
         */
        public String getParameterGroupType() {
            return this.parameterGroupType;
        }

        public static final class Builder {
            private String createTime; 
            private String isApply; 
            private String modifyTime; 
            private Integer parameterCounts; 
            private String parameterGroupDesc; 
            private String parameterGroupId; 
            private String parameterGroupName; 
            private String parameterGroupType; 

            private Builder() {
            } 

            private Builder(ParameterGroups model) {
                this.createTime = model.createTime;
                this.isApply = model.isApply;
                this.modifyTime = model.modifyTime;
                this.parameterCounts = model.parameterCounts;
                this.parameterGroupDesc = model.parameterGroupDesc;
                this.parameterGroupId = model.parameterGroupId;
                this.parameterGroupName = model.parameterGroupName;
                this.parameterGroupType = model.parameterGroupType;
            } 

            /**
             * <p>The creation time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-07T12:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether the parameter template is applied. Valid values:</p>
             * <ul>
             * <li>0: No.</li>
             * <li>1: Yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isApply(String isApply) {
                this.isApply = isApply;
                return this;
            }

            /**
             * <p>The modification time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-10T12:00:00Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The number of parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder parameterCounts(Integer parameterCounts) {
                this.parameterCounts = parameterCounts;
                return this;
            }

            /**
             * <p>The description of the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>Default template</p>
             */
            public Builder parameterGroupDesc(String parameterGroupDesc) {
                this.parameterGroupDesc = parameterGroupDesc;
                return this;
            }

            /**
             * <p>The ID of the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>pcpg-lakebase-xxx</p>
             */
            public Builder parameterGroupId(String parameterGroupId) {
                this.parameterGroupId = parameterGroupId;
                return this;
            }

            /**
             * <p>The name of the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>default-template</p>
             */
            public Builder parameterGroupName(String parameterGroupName) {
                this.parameterGroupName = parameterGroupName;
                return this;
            }

            /**
             * <p>The templatetype. Valid values:</p>
             * <ul>
             * <li>0: System.</li>
             * <li>1: User.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parameterGroupType(String parameterGroupType) {
                this.parameterGroupType = parameterGroupType;
                return this;
            }

            public ParameterGroups build() {
                return new ParameterGroups(this);
            } 

        } 

    }
}
