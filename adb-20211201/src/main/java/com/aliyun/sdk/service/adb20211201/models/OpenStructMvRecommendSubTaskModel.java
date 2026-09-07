// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link OpenStructMvRecommendSubTaskModel} extends {@link TeaModel}
 *
 * <p>OpenStructMvRecommendSubTaskModel</p>
 */
public class OpenStructMvRecommendSubTaskModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("MinRewriteQueryCount")
    private Integer minRewriteQueryCount;

    @com.aliyun.core.annotation.NameInMap("MinRewriteQueryPattern")
    private Integer minRewriteQueryPattern;

    @com.aliyun.core.annotation.NameInMap("ScanQueriesCount")
    private Long scanQueriesCount;

    @com.aliyun.core.annotation.NameInMap("SlowQueryThreshold")
    private Integer slowQueryThreshold;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SubQueriesCount")
    private Long subQueriesCount;

    @com.aliyun.core.annotation.NameInMap("SubtaskId")
    private Long subtaskId;

    private OpenStructMvRecommendSubTaskModel(Builder builder) {
        this.endTime = builder.endTime;
        this.minRewriteQueryCount = builder.minRewriteQueryCount;
        this.minRewriteQueryPattern = builder.minRewriteQueryPattern;
        this.scanQueriesCount = builder.scanQueriesCount;
        this.slowQueryThreshold = builder.slowQueryThreshold;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.subQueriesCount = builder.subQueriesCount;
        this.subtaskId = builder.subtaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenStructMvRecommendSubTaskModel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return minRewriteQueryCount
     */
    public Integer getMinRewriteQueryCount() {
        return this.minRewriteQueryCount;
    }

    /**
     * @return minRewriteQueryPattern
     */
    public Integer getMinRewriteQueryPattern() {
        return this.minRewriteQueryPattern;
    }

    /**
     * @return scanQueriesCount
     */
    public Long getScanQueriesCount() {
        return this.scanQueriesCount;
    }

    /**
     * @return slowQueryThreshold
     */
    public Integer getSlowQueryThreshold() {
        return this.slowQueryThreshold;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subQueriesCount
     */
    public Long getSubQueriesCount() {
        return this.subQueriesCount;
    }

    /**
     * @return subtaskId
     */
    public Long getSubtaskId() {
        return this.subtaskId;
    }

    public static final class Builder {
        private String endTime; 
        private Integer minRewriteQueryCount; 
        private Integer minRewriteQueryPattern; 
        private Long scanQueriesCount; 
        private Integer slowQueryThreshold; 
        private String startTime; 
        private String status; 
        private Long subQueriesCount; 
        private Long subtaskId; 

        private Builder() {
        } 

        private Builder(OpenStructMvRecommendSubTaskModel model) {
            this.endTime = model.endTime;
            this.minRewriteQueryCount = model.minRewriteQueryCount;
            this.minRewriteQueryPattern = model.minRewriteQueryPattern;
            this.scanQueriesCount = model.scanQueriesCount;
            this.slowQueryThreshold = model.slowQueryThreshold;
            this.startTime = model.startTime;
            this.status = model.status;
            this.subQueriesCount = model.subQueriesCount;
            this.subtaskId = model.subtaskId;
        } 

        /**
         * <p>The end time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-16 16:56</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The minimum number of slow queries that match the pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder minRewriteQueryCount(Integer minRewriteQueryCount) {
            this.minRewriteQueryCount = minRewriteQueryCount;
            return this;
        }

        /**
         * <p>The number of minimum acceleration patterns.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder minRewriteQueryPattern(Integer minRewriteQueryPattern) {
            this.minRewriteQueryPattern = minRewriteQueryPattern;
            return this;
        }

        /**
         * <p>The number of queries scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
        public Builder scanQueriesCount(Long scanQueriesCount) {
            this.scanQueriesCount = scanQueriesCount;
            return this;
        }

        /**
         * <p>The wait threshold for slow queries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder slowQueryThreshold(Integer slowQueryThreshold) {
            this.slowQueryThreshold = slowQueryThreshold;
            return this;
        }

        /**
         * <p>The start time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-16 16:55</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Current execution status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The number of newly generated MV recommendations.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        public Builder subQueriesCount(Long subQueriesCount) {
            this.subQueriesCount = subQueriesCount;
            return this;
        }

        /**
         * <p>The record ID of the task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder subtaskId(Long subtaskId) {
            this.subtaskId = subtaskId;
            return this;
        }

        public OpenStructMvRecommendSubTaskModel build() {
            return new OpenStructMvRecommendSubTaskModel(this);
        } 

    } 

}
