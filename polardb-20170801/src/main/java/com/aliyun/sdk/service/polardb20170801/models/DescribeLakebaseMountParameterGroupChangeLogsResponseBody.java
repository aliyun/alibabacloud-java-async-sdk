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
 * {@link DescribeLakebaseMountParameterGroupChangeLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLakebaseMountParameterGroupChangeLogsResponseBody</p>
 */
public class DescribeLakebaseMountParameterGroupChangeLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChangeLogs")
    private java.util.List<ChangeLogs> changeLogs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLakebaseMountParameterGroupChangeLogsResponseBody(Builder builder) {
        this.changeLogs = builder.changeLogs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLakebaseMountParameterGroupChangeLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeLogs
     */
    public java.util.List<ChangeLogs> getChangeLogs() {
        return this.changeLogs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ChangeLogs> changeLogs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLakebaseMountParameterGroupChangeLogsResponseBody model) {
            this.changeLogs = model.changeLogs;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The change records, sorted in descending order by CreateTime. An empty array is returned if no data is found.</p>
         */
        public Builder changeLogs(java.util.List<ChangeLogs> changeLogs) {
            this.changeLogs = changeLogs;
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

        public DescribeLakebaseMountParameterGroupChangeLogsResponseBody build() {
            return new DescribeLakebaseMountParameterGroupChangeLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLakebaseMountParameterGroupChangeLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLakebaseMountParameterGroupChangeLogsResponseBody</p>
     */
    public static class ChangeLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeType")
        private String changeType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("IsApply")
        private String isApply;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("NewValue")
        private String newValue;

        @com.aliyun.core.annotation.NameInMap("OldValue")
        private String oldValue;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        private ChangeLogs(Builder builder) {
            this.changeType = builder.changeType;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.isApply = builder.isApply;
            this.modifyTime = builder.modifyTime;
            this.newValue = builder.newValue;
            this.oldValue = builder.oldValue;
            this.parameterName = builder.parameterName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeLogs create() {
            return builder().build();
        }

        /**
         * @return changeType
         */
        public String getChangeType() {
            return this.changeType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
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
         * @return newValue
         */
        public String getNewValue() {
            return this.newValue;
        }

        /**
         * @return oldValue
         */
        public String getOldValue() {
            return this.oldValue;
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        public static final class Builder {
            private String changeType; 
            private String createTime; 
            private String creator; 
            private String isApply; 
            private String modifyTime; 
            private String newValue; 
            private String oldValue; 
            private String parameterName; 

            private Builder() {
            } 

            private Builder(ChangeLogs model) {
                this.changeType = model.changeType;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.isApply = model.isApply;
                this.modifyTime = model.modifyTime;
                this.newValue = model.newValue;
                this.oldValue = model.oldValue;
                this.parameterName = model.parameterName;
            } 

            /**
             * <p>The change type. Valid values: create, modify, and delete.</p>
             * 
             * <strong>example:</strong>
             * <p>modify</p>
             */
            public Builder changeType(String changeType) {
                this.changeType = changeType;
                return this;
            }

            /**
             * <p>The creation time (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-07T12:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the user who performed the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>Indicates whether the change has been applied. Valid values: 0 (no) and 1 (yes).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isApply(String isApply) {
                this.isApply = isApply;
                return this;
            }

            /**
             * <p>The modification time (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-08T12:00:00Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The new value after the change. This parameter is empty for delete operations.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder newValue(String newValue) {
                this.newValue = newValue;
                return this;
            }

            /**
             * <p>The old value before the change. This parameter is empty for create operations.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder oldValue(String oldValue) {
                this.oldValue = oldValue;
                return this;
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

            public ChangeLogs build() {
                return new ChangeLogs(this);
            } 

        } 

    }
}
