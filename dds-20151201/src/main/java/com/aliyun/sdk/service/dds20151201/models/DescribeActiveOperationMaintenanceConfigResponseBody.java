// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeActiveOperationMaintenanceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeActiveOperationMaintenanceConfigResponseBody</p>
 */
public class DescribeActiveOperationMaintenanceConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Config")
    private Config config;

    @com.aliyun.core.annotation.NameInMap("HasConfig")
    private Integer hasConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeActiveOperationMaintenanceConfigResponseBody(Builder builder) {
        this.config = builder.config;
        this.hasConfig = builder.hasConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeActiveOperationMaintenanceConfigResponseBody create() {
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
    public Integer getHasConfig() {
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
        private Integer hasConfig; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeActiveOperationMaintenanceConfigResponseBody model) {
            this.config = model.config;
            this.hasConfig = model.hasConfig;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The description of the configuration.</p>
         */
        public Builder config(Config config) {
            this.config = config;
            return this;
        }

        /**
         * <p>Indicates whether the O&amp;M task is configured. Valid values:</p>
         * <ul>
         * <li>1: The O&amp;M task is configured.</li>
         * <li>0: The O&amp;M task is not configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder hasConfig(Integer hasConfig) {
            this.hasConfig = hasConfig;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>72651AF9-7897-41A7-8B67-6C15C7F26A0A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeActiveOperationMaintenanceConfigResponseBody build() {
            return new DescribeActiveOperationMaintenanceConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeActiveOperationMaintenanceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeActiveOperationMaintenanceConfigResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("CycleTime")
        private String cycleTime;

        @com.aliyun.core.annotation.NameInMap("CycleType")
        private String cycleType;

        @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
        private String maintainEndTime;

        @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
        private String maintainStartTime;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

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
        public String getCycleType() {
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
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createdTime; 
            private String cycleTime; 
            private String cycleType; 
            private String maintainEndTime; 
            private String maintainStartTime; 
            private String modifiedTime; 
            private Integer status; 

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
             * <p>The time when the O&amp;M task was created. The timefollows the <em>yyyy-mm-dd</em>t<em>hh:mm:ss</em>z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-20T00:05:54+08:00</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The start time of the O&amp;M period. The time follows the <em>hh:mm</em> z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder cycleTime(String cycleTime) {
                this.cycleTime = cycleTime;
                return this;
            }

            /**
             * <p>The cyclical type of the O&amp;M task.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder cycleType(String cycleType) {
                this.cycleType = cycleType;
                return this;
            }

            /**
             * <p>The end time of the maintenance window. The time follows the <em>hh:mm</em>z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>04:00:00Z</p>
             */
            public Builder maintainEndTime(String maintainEndTime) {
                this.maintainEndTime = maintainEndTime;
                return this;
            }

            /**
             * <p>The start time of the maintenance window. The time follows the <em>hh:mm</em>z format.</p>
             * 
             * <strong>example:</strong>
             * <p>18:00:00Z</p>
             */
            public Builder maintainStartTime(String maintainStartTime) {
                this.maintainStartTime = maintainStartTime;
                return this;
            }

            /**
             * <p>The time when the O&amp;M task was modified. The time follows the <em>yyyy-mm-dd</em>t<em>hh:mm:ss</em>z format. The time is displayed in Coordinated Universal Time (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-26T05:50:34.000+00:00</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The state of the O&amp;M task. Valid values: <strong>0</strong>: The O&amp;M task is in the starting state. <strong>1</strong>: The O&amp;M task is in the running state. <strong>2</strong>: The O&amp;M task is in the stopped state.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
