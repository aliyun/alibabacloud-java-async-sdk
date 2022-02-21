// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAutoSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateAutoSnapshotPolicyRequest</p>
 */
public class CreateAutoSnapshotPolicyRequest extends Request {
    @Query
    @NameInMap("AutoSnapshotPolicyName")
    private String autoSnapshotPolicyName;

    @Query
    @NameInMap("FileSystemType")
    @Validation(required = true)
    private String fileSystemType;

    @Query
    @NameInMap("RepeatWeekdays")
    @Validation(required = true)
    private String repeatWeekdays;

    @Query
    @NameInMap("RetentionDays")
    @Validation(maximum = 65536)
    private Integer retentionDays;

    @Query
    @NameInMap("TimePoints")
    @Validation(required = true)
    private String timePoints;

    private CreateAutoSnapshotPolicyRequest(Builder builder) {
        super(builder);
        this.autoSnapshotPolicyName = builder.autoSnapshotPolicyName;
        this.fileSystemType = builder.fileSystemType;
        this.repeatWeekdays = builder.repeatWeekdays;
        this.retentionDays = builder.retentionDays;
        this.timePoints = builder.timePoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAutoSnapshotPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoSnapshotPolicyName
     */
    public String getAutoSnapshotPolicyName() {
        return this.autoSnapshotPolicyName;
    }

    /**
     * @return fileSystemType
     */
    public String getFileSystemType() {
        return this.fileSystemType;
    }

    /**
     * @return repeatWeekdays
     */
    public String getRepeatWeekdays() {
        return this.repeatWeekdays;
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

    public static final class Builder extends Request.Builder<CreateAutoSnapshotPolicyRequest, Builder> {
        private String autoSnapshotPolicyName; 
        private String fileSystemType; 
        private String repeatWeekdays; 
        private Integer retentionDays; 
        private String timePoints; 

        private Builder() {
            super();
        } 

        private Builder(CreateAutoSnapshotPolicyRequest response) {
            super(response);
            this.autoSnapshotPolicyName = response.autoSnapshotPolicyName;
            this.fileSystemType = response.fileSystemType;
            this.repeatWeekdays = response.repeatWeekdays;
            this.retentionDays = response.retentionDays;
            this.timePoints = response.timePoints;
        } 

        /**
         * AutoSnapshotPolicyName.
         */
        public Builder autoSnapshotPolicyName(String autoSnapshotPolicyName) {
            this.putQueryParameter("AutoSnapshotPolicyName", autoSnapshotPolicyName);
            this.autoSnapshotPolicyName = autoSnapshotPolicyName;
            return this;
        }

        /**
         * FileSystemType.
         */
        public Builder fileSystemType(String fileSystemType) {
            this.putQueryParameter("FileSystemType", fileSystemType);
            this.fileSystemType = fileSystemType;
            return this;
        }

        /**
         * RepeatWeekdays.
         */
        public Builder repeatWeekdays(String repeatWeekdays) {
            this.putQueryParameter("RepeatWeekdays", repeatWeekdays);
            this.repeatWeekdays = repeatWeekdays;
            return this;
        }

        /**
         * RetentionDays.
         */
        public Builder retentionDays(Integer retentionDays) {
            this.putQueryParameter("RetentionDays", retentionDays);
            this.retentionDays = retentionDays;
            return this;
        }

        /**
         * TimePoints.
         */
        public Builder timePoints(String timePoints) {
            this.putQueryParameter("TimePoints", timePoints);
            this.timePoints = timePoints;
            return this;
        }

        @Override
        public CreateAutoSnapshotPolicyRequest build() {
            return new CreateAutoSnapshotPolicyRequest(this);
        } 

    } 

}
