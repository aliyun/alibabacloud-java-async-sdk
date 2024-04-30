// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeModifyParameterLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModifyParameterLogResponseBody</p>
 */
public class DescribeModifyParameterLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeModifyParameterLogResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModifyParameterLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private String engine; 
        private String engineVersion; 
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The database engine of the instance.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * The database engine version of the instance.
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * An array that consists of parameter modification log entries.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeModifyParameterLogResponseBody build() {
            return new DescribeModifyParameterLogResponseBody(this);
        } 

    } 

    public static class ParameterChangeLog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("NewParameterValue")
        private String newParameterValue;

        @com.aliyun.core.annotation.NameInMap("OldParameterValue")
        private String oldParameterValue;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ParameterChangeLog(Builder builder) {
            this.modifyTime = builder.modifyTime;
            this.newParameterValue = builder.newParameterValue;
            this.oldParameterValue = builder.oldParameterValue;
            this.parameterName = builder.parameterName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterChangeLog create() {
            return builder().build();
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return newParameterValue
         */
        public String getNewParameterValue() {
            return this.newParameterValue;
        }

        /**
         * @return oldParameterValue
         */
        public String getOldParameterValue() {
            return this.oldParameterValue;
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String modifyTime; 
            private String newParameterValue; 
            private String oldParameterValue; 
            private String parameterName; 
            private String status; 

            /**
             * The time when the parameter was modified. This value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The new value of the parameter.
             */
            public Builder newParameterValue(String newParameterValue) {
                this.newParameterValue = newParameterValue;
                return this;
            }

            /**
             * The original value of the parameter.
             */
            public Builder oldParameterValue(String oldParameterValue) {
                this.oldParameterValue = oldParameterValue;
                return this;
            }

            /**
             * The name of the parameter.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * The status of the new value specified for the parameter. Valid values:
             * <p>
             * 
             * *   **Applied:** The new value has taken effect.
             * *   **Syncing:** The new value is being applied and has not taken effect.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ParameterChangeLog build() {
                return new ParameterChangeLog(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterChangeLog")
        private java.util.List < ParameterChangeLog> parameterChangeLog;

        private Items(Builder builder) {
            this.parameterChangeLog = builder.parameterChangeLog;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return parameterChangeLog
         */
        public java.util.List < ParameterChangeLog> getParameterChangeLog() {
            return this.parameterChangeLog;
        }

        public static final class Builder {
            private java.util.List < ParameterChangeLog> parameterChangeLog; 

            /**
             * ParameterChangeLog.
             */
            public Builder parameterChangeLog(java.util.List < ParameterChangeLog> parameterChangeLog) {
                this.parameterChangeLog = parameterChangeLog;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
