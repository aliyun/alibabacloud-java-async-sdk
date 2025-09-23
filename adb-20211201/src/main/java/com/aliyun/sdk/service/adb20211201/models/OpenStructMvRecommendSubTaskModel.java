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
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * MinRewriteQueryCount.
         */
        public Builder minRewriteQueryCount(Integer minRewriteQueryCount) {
            this.minRewriteQueryCount = minRewriteQueryCount;
            return this;
        }

        /**
         * MinRewriteQueryPattern.
         */
        public Builder minRewriteQueryPattern(Integer minRewriteQueryPattern) {
            this.minRewriteQueryPattern = minRewriteQueryPattern;
            return this;
        }

        /**
         * ScanQueriesCount.
         */
        public Builder scanQueriesCount(Long scanQueriesCount) {
            this.scanQueriesCount = scanQueriesCount;
            return this;
        }

        /**
         * SlowQueryThreshold.
         */
        public Builder slowQueryThreshold(Integer slowQueryThreshold) {
            this.slowQueryThreshold = slowQueryThreshold;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SubQueriesCount.
         */
        public Builder subQueriesCount(Long subQueriesCount) {
            this.subQueriesCount = subQueriesCount;
            return this;
        }

        /**
         * SubtaskId.
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
