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
 * {@link DescribeActiveOperationMaintainConfResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeActiveOperationMaintainConfResponseBody</p>
 */
public class DescribeActiveOperationMaintainConfResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Config")
    private Config config;

    @com.aliyun.core.annotation.NameInMap("HasConfig")
    private Long hasConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeActiveOperationMaintainConfResponseBody(Builder builder) {
        this.config = builder.config;
        this.hasConfig = builder.hasConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeActiveOperationMaintainConfResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return hasConfig
     */
    public Long getHasConfig() {
        return this.hasConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Config config; 
        private Long hasConfig; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeActiveOperationMaintainConfResponseBody model) {
            this.config = model.config;
            this.hasConfig = model.hasConfig;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The configuration information.</p>
         */
        public Builder config(Config config) {
            this.config = config;
            return this;
        }

        /**
         * <p>Indicates whether a configuration has been set. Valid values:1: Yes0: NoThe value of this parameter is 0 for the first query.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder hasConfig(Long hasConfig) {
            this.hasConfig = hasConfig;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>14109129-EF13-5C83-AD86-7581D9552603</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeActiveOperationMaintainConfResponseBody build() {
            return new DescribeActiveOperationMaintainConfResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeActiveOperationMaintainConfResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeActiveOperationMaintainConfResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("CycleTime")
        private String cycleTime;

        @com.aliyun.core.annotation.NameInMap("CycleType")
        private Integer cycleType;

        @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
        private String maintainEndTime;

        @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
        private String maintainStartTime;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        private Config(Builder builder) {
            this.createdTime = builder.createdTime;
            this.cycleTime = builder.cycleTime;
            this.cycleType = builder.cycleType;
            this.maintainEndTime = builder.maintainEndTime;
            this.maintainStartTime = builder.maintainStartTime;
            this.modifiedTime = builder.modifiedTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return cycleTime
         */
        public String getCycleTime() {
            return this.cycleTime;
        }

        /**
         * @return cycleType
         */
        public Integer getCycleType() {
            return this.cycleType;
        }

        /**
         * @return maintainEndTime
         */
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        /**
         * @return maintainStartTime
         */
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createdTime; 
            private String cycleTime; 
            private Integer cycleType; 
            private String maintainEndTime; 
            private String maintainStartTime; 
            private String modifiedTime; 
            private Long status; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.createdTime = model.createdTime;
                this.cycleTime = model.cycleTime;
                this.cycleType = model.cycleType;
                this.maintainEndTime = model.maintainEndTime;
                this.maintainStartTime = model.maintainStartTime;
                this.modifiedTime = model.modifiedTime;
                this.status = model.status;
            } 

            /**
             * <p>The time when the configuration was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-07-04T19:28:46</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The day of the cycle.</p>
             * <ul>
             * <li><p>If CycleType is set to Month, this parameter returns a number from 1 to 28 that indicates the day of the month. Multiple days are separated by commas (,).</p>
             * </li>
             * <li><p>If CycleType is set to Week, this parameter returns a number from 1 to 7 that indicates the day of the week. Multiple days are separated by commas (,).</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cycleTime(String cycleTime) {
                this.cycleTime = cycleTime;
                return this;
            }

            /**
             * <p>The cycle type. Valid values:</p>
             * <ul>
             * <li><p>Month: monthly</p>
             * </li>
             * <li><p>Week: weekly</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Week</p>
             */
            public Builder cycleType(Integer cycleType) {
                this.cycleType = cycleType;
                return this;
            }

            /**
             * <p>The end time of the maintenance window.</p>
             * 
             * <strong>example:</strong>
             * <p>09:00Z</p>
             */
            public Builder maintainEndTime(String maintainEndTime) {
                this.maintainEndTime = maintainEndTime;
                return this;
            }

            /**
             * <p>The start time of the maintenance window.</p>
             * 
             * <strong>example:</strong>
             * <p>8:00Z</p>
             */
            public Builder maintainStartTime(String maintainStartTime) {
                this.maintainStartTime = maintainStartTime;
                return this;
            }

            /**
             * <p>The time when the configuration was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-02T02:10:08Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>Indicates whether the configuration is enabled. Valid values:1: Enabled2: Disabled</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
