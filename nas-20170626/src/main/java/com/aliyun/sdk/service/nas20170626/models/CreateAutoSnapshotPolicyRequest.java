// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link CreateAutoSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateAutoSnapshotPolicyRequest</p>
 */
public class CreateAutoSnapshotPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyName")
    private String autoSnapshotPolicyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepeatWeekdays")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repeatWeekdays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetentionDays")
    @com.aliyun.core.annotation.Validation(maximum = 65536)
    private Integer retentionDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimePoints")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(CreateAutoSnapshotPolicyRequest request) {
            super(request);
            this.autoSnapshotPolicyName = request.autoSnapshotPolicyName;
            this.fileSystemType = request.fileSystemType;
            this.repeatWeekdays = request.repeatWeekdays;
            this.retentionDays = request.retentionDays;
            this.timePoints = request.timePoints;
        } 

        /**
         * <p>The name of the automatic snapshot policy.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The name must be 2 to 128 characters in length.</li>
         * <li>The name must start with a letter or a Chinese character.</li>
         * <li>The name can contain digits, colons (:), underscores (_), or hyphens (-). It cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>Default value: empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        public Builder autoSnapshotPolicyName(String autoSnapshotPolicyName) {
            this.putQueryParameter("AutoSnapshotPolicyName", autoSnapshotPolicyName);
            this.autoSnapshotPolicyName = autoSnapshotPolicyName;
            return this;
        }

        /**
         * <p>The type of the file system.</p>
         * <p>Valid values: extreme (Extreme NAS file system).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>extreme</p>
         */
        public Builder fileSystemType(String fileSystemType) {
            this.putQueryParameter("FileSystemType", fileSystemType);
            this.fileSystemType = fileSystemType;
            return this;
        }

        /**
         * <p>The days of the week on which automatic snapshots are created.</p>
         * <p>Cycle: week.</p>
         * <p>Valid values: 1 to 7, which represent Monday to Sunday.</p>
         * <p>To create automatic snapshots on multiple days in a week, specify multiple values separated by commas (,). You can specify up to 7 values.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        public Builder repeatWeekdays(String repeatWeekdays) {
            this.putQueryParameter("RepeatWeekdays", repeatWeekdays);
            this.repeatWeekdays = repeatWeekdays;
            return this;
        }

        /**
         * <p>The retention period of automatic snapshots.</p>
         * <p>Unit: days.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>-1 (default): Automatic snapshots are permanently retained. When the snapshot quota is reached, the earliest automatic snapshots are automatically deleted.</li>
         * <li>1 to 65536: Automatic snapshots are retained for the specified number of days. Snapshots undergo automatic release after the retention period expires.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder retentionDays(Integer retentionDays) {
            this.putQueryParameter("RetentionDays", retentionDays);
            this.retentionDays = retentionDays;
            return this;
        }

        /**
         * <p>The time points at which automatic snapshots are created.</p>
         * <p>Unit: hours.</p>
         * <p>Valid values: 0 to 23, which represent the 24 time points from 00:00 to 23:00. For example, 1 indicates 01:00.</p>
         * <p>To create multiple automatic snapshots within a day, specify multiple time points separated by commas (,). You can specify up to 24 time points.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0,1,…,23</p>
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
