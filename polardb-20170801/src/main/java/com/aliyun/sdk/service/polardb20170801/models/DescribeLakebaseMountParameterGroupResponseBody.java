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
 * {@link DescribeLakebaseMountParameterGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLakebaseMountParameterGroupResponseBody</p>
 */
public class DescribeLakebaseMountParameterGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("IsApply")
    private Integer isApply;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private String modifyTime;

    @com.aliyun.core.annotation.NameInMap("ParameterDetail")
    private java.util.List<ParameterDetail> parameterDetail;

    @com.aliyun.core.annotation.NameInMap("ParameterGroupDesc")
    private String parameterGroupDesc;

    @com.aliyun.core.annotation.NameInMap("ParameterGroupId")
    private String parameterGroupId;

    @com.aliyun.core.annotation.NameInMap("ParameterGroupName")
    private String parameterGroupName;

    @com.aliyun.core.annotation.NameInMap("ParameterGroupType")
    private Integer parameterGroupType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLakebaseMountParameterGroupResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.isApply = builder.isApply;
        this.modifyTime = builder.modifyTime;
        this.parameterDetail = builder.parameterDetail;
        this.parameterGroupDesc = builder.parameterGroupDesc;
        this.parameterGroupId = builder.parameterGroupId;
        this.parameterGroupName = builder.parameterGroupName;
        this.parameterGroupType = builder.parameterGroupType;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLakebaseMountParameterGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Integer getIsApply() {
        return this.isApply;
    }

    /**
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return parameterDetail
     */
    public java.util.List<ParameterDetail> getParameterDetail() {
        return this.parameterDetail;
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
    public Integer getParameterGroupType() {
        return this.parameterGroupType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String createTime; 
        private Integer isApply; 
        private String modifyTime; 
        private java.util.List<ParameterDetail> parameterDetail; 
        private String parameterGroupDesc; 
        private String parameterGroupId; 
        private String parameterGroupName; 
        private Integer parameterGroupType; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLakebaseMountParameterGroupResponseBody model) {
            this.createTime = model.createTime;
            this.isApply = model.isApply;
            this.modifyTime = model.modifyTime;
            this.parameterDetail = model.parameterDetail;
            this.parameterGroupDesc = model.parameterGroupDesc;
            this.parameterGroupId = model.parameterGroupId;
            this.parameterGroupName = model.parameterGroupName;
            this.parameterGroupType = model.parameterGroupType;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The creation time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-01T00:00:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Indicates whether the parameter template is applied. Valid values: 0: No. 1: Yes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isApply(Integer isApply) {
            this.isApply = isApply;
            return this;
        }

        /**
         * <p>The modification time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-10T12:00:00Z</p>
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The parameter details of the template. An empty array is returned if no data is available.</p>
         */
        public Builder parameterDetail(java.util.List<ParameterDetail> parameterDetail) {
            this.parameterDetail = parameterDetail;
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
         * <p>The parameter template ID.</p>
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
         * <p>The parameter templatetype. Valid values: 0: System. 1: User.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder parameterGroupType(Integer parameterGroupType) {
            this.parameterGroupType = parameterGroupType;
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

        public DescribeLakebaseMountParameterGroupResponseBody build() {
            return new DescribeLakebaseMountParameterGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLakebaseMountParameterGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLakebaseMountParameterGroupResponseBody</p>
     */
    public static class ParameterDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        private ParameterDetail(Builder builder) {
            this.parameterName = builder.parameterName;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterDetail create() {
            return builder().build();
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        public static final class Builder {
            private String parameterName; 
            private String parameterValue; 

            private Builder() {
            } 

            private Builder(ParameterDetail model) {
                this.parameterName = model.parameterName;
                this.parameterValue = model.parameterValue;
            } 

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>auto_increment_offset</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The parameter value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public ParameterDetail build() {
                return new ParameterDetail(this);
            } 

        } 

    }
}
