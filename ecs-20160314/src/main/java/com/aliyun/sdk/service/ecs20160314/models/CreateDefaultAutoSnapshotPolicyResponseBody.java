// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDefaultAutoSnapshotPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDefaultAutoSnapshotPolicyResponseBody</p>
 */
public class CreateDefaultAutoSnapshotPolicyResponseBody extends TeaModel {
    @NameInMap("AutoSnapshotPolicyId")
    private String autoSnapshotPolicyId;

    @NameInMap("AutoSnapshotPolicyName")
    private String autoSnapshotPolicyName;

    @NameInMap("RepeatWeekdays")
    private String repeatWeekdays;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RetentionDays")
    private Integer retentionDays;

    @NameInMap("TimePoints")
    private String timePoints;

    private CreateDefaultAutoSnapshotPolicyResponseBody(Builder builder) {
        this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
        this.autoSnapshotPolicyName = builder.autoSnapshotPolicyName;
        this.repeatWeekdays = builder.repeatWeekdays;
        this.requestId = builder.requestId;
        this.retentionDays = builder.retentionDays;
        this.timePoints = builder.timePoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDefaultAutoSnapshotPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoSnapshotPolicyId
     */
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    /**
     * @return autoSnapshotPolicyName
     */
    public String getAutoSnapshotPolicyName() {
        return this.autoSnapshotPolicyName;
    }

    /**
     * @return repeatWeekdays
     */
    public String getRepeatWeekdays() {
        return this.repeatWeekdays;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    /**
     * @return timePoints
     */
    public String getTimePoints() {
        return this.timePoints;
    }

    public static final class Builder {
        private String autoSnapshotPolicyId; 
        private String autoSnapshotPolicyName; 
        private String repeatWeekdays; 
        private String requestId; 
        private Integer retentionDays; 
        private String timePoints; 

        /**
         * AutoSnapshotPolicyId.
         */
        public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }

        /**
         * AutoSnapshotPolicyName.
         */
        public Builder autoSnapshotPolicyName(String autoSnapshotPolicyName) {
            this.autoSnapshotPolicyName = autoSnapshotPolicyName;
            return this;
        }

        /**
         * RepeatWeekdays.
         */
        public Builder repeatWeekdays(String repeatWeekdays) {
            this.repeatWeekdays = repeatWeekdays;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RetentionDays.
         */
        public Builder retentionDays(Integer retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }

        /**
         * TimePoints.
         */
        public Builder timePoints(String timePoints) {
            this.timePoints = timePoints;
            return this;
        }

        public CreateDefaultAutoSnapshotPolicyResponseBody build() {
            return new CreateDefaultAutoSnapshotPolicyResponseBody(this);
        } 

    } 

}
