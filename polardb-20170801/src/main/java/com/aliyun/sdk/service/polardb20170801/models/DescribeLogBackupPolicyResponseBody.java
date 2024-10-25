// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeLogBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogBackupPolicyResponseBody</p>
 */
public class DescribeLogBackupPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnableBackupLog")
    private Integer enableBackupLog;

    @com.aliyun.core.annotation.NameInMap("LogBackupAnotherRegionRegion")
    private String logBackupAnotherRegionRegion;

    @com.aliyun.core.annotation.NameInMap("LogBackupAnotherRegionRetentionPeriod")
    private String logBackupAnotherRegionRetentionPeriod;

    @com.aliyun.core.annotation.NameInMap("LogBackupRetentionPeriod")
    private Integer logBackupRetentionPeriod;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLogBackupPolicyResponseBody(Builder builder) {
        this.enableBackupLog = builder.enableBackupLog;
        this.logBackupAnotherRegionRegion = builder.logBackupAnotherRegionRegion;
        this.logBackupAnotherRegionRetentionPeriod = builder.logBackupAnotherRegionRetentionPeriod;
        this.logBackupRetentionPeriod = builder.logBackupRetentionPeriod;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogBackupPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return enableBackupLog
     */
    public Integer getEnableBackupLog() {
        return this.enableBackupLog;
    }

    /**
     * @return logBackupAnotherRegionRegion
     */
    public String getLogBackupAnotherRegionRegion() {
        return this.logBackupAnotherRegionRegion;
    }

    /**
     * @return logBackupAnotherRegionRetentionPeriod
     */
    public String getLogBackupAnotherRegionRetentionPeriod() {
        return this.logBackupAnotherRegionRetentionPeriod;
    }

    /**
     * @return logBackupRetentionPeriod
     */
    public Integer getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer enableBackupLog; 
        private String logBackupAnotherRegionRegion; 
        private String logBackupAnotherRegionRetentionPeriod; 
        private Integer logBackupRetentionPeriod; 
        private String requestId; 

        /**
         * <p>Indicates whether the log backup feature is enabled. Valid values:</p>
         * <ul>
         * <li>0: The log backup feature is disabled.</li>
         * <li>1: The log backup feature is enabled. By default, the log backup feature is enabled and cannot be disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enableBackupLog(Integer enableBackupLog) {
            this.enableBackupLog = enableBackupLog;
            return this;
        }

        /**
         * <p>The region in which you want to store cross-region log backups. For more information about regions that support the cross-region backup feature, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder logBackupAnotherRegionRegion(String logBackupAnotherRegionRegion) {
            this.logBackupAnotherRegionRegion = logBackupAnotherRegionRegion;
            return this;
        }

        /**
         * <p>The retention period of cross-region log backups. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The cross-region backup feature is disabled.</li>
         * <li><strong>30 to 7300</strong>: Cross-region log backups are retained for 30 to 7,300 days.</li>
         * <li><strong>-1</strong>: The log backups are permanently retained.</li>
         * </ul>
         * <blockquote>
         * <p> When you create a cluster, the default value of this parameter is <strong>0</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder logBackupAnotherRegionRetentionPeriod(String logBackupAnotherRegionRetentionPeriod) {
            this.logBackupAnotherRegionRetentionPeriod = logBackupAnotherRegionRetentionPeriod;
            return this;
        }

        /**
         * <p>The retention period of the log backups. Valid values:</p>
         * <ul>
         * <li>3 to 7300: The log backups are retained for 3 to 7,300 days.</li>
         * <li>-1: The log backups are permanently retained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder logBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>62EE0051-102B-488D-9C79-D607B8******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLogBackupPolicyResponseBody build() {
            return new DescribeLogBackupPolicyResponseBody(this);
        } 

    } 

}
