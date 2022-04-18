// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScanTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateScanTaskRequest</p>
 */
public class CreateScanTaskRequest extends Request {
    @Query
    @NameInMap("DataLimitId")
    @Validation(required = true)
    private Long dataLimitId;

    @Query
    @NameInMap("IntervalDay")
    @Validation(required = true)
    private Integer intervalDay;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("OssScanPath")
    private String ossScanPath;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private Long resourceType;

    @Query
    @NameInMap("RunHour")
    @Validation(required = true)
    private Integer runHour;

    @Query
    @NameInMap("RunMinute")
    @Validation(required = true)
    private Integer runMinute;

    @Query
    @NameInMap("ScanRange")
    @Validation(required = true)
    private Integer scanRange;

    @Query
    @NameInMap("ScanRangeContent")
    @Validation(required = true)
    private String scanRangeContent;

    @Query
    @NameInMap("TaskName")
    @Validation(required = true)
    private String taskName;

    @Query
    @NameInMap("TaskUserName")
    private String taskUserName;

    private CreateScanTaskRequest(Builder builder) {
        super(builder);
        this.dataLimitId = builder.dataLimitId;
        this.intervalDay = builder.intervalDay;
        this.lang = builder.lang;
        this.ossScanPath = builder.ossScanPath;
        this.resourceType = builder.resourceType;
        this.runHour = builder.runHour;
        this.runMinute = builder.runMinute;
        this.scanRange = builder.scanRange;
        this.scanRangeContent = builder.scanRangeContent;
        this.taskName = builder.taskName;
        this.taskUserName = builder.taskUserName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScanTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataLimitId
     */
    public Long getDataLimitId() {
        return this.dataLimitId;
    }

    /**
     * @return intervalDay
     */
    public Integer getIntervalDay() {
        return this.intervalDay;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return ossScanPath
     */
    public String getOssScanPath() {
        return this.ossScanPath;
    }

    /**
     * @return resourceType
     */
    public Long getResourceType() {
        return this.resourceType;
    }

    /**
     * @return runHour
     */
    public Integer getRunHour() {
        return this.runHour;
    }

    /**
     * @return runMinute
     */
    public Integer getRunMinute() {
        return this.runMinute;
    }

    /**
     * @return scanRange
     */
    public Integer getScanRange() {
        return this.scanRange;
    }

    /**
     * @return scanRangeContent
     */
    public String getScanRangeContent() {
        return this.scanRangeContent;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskUserName
     */
    public String getTaskUserName() {
        return this.taskUserName;
    }

    public static final class Builder extends Request.Builder<CreateScanTaskRequest, Builder> {
        private Long dataLimitId; 
        private Integer intervalDay; 
        private String lang; 
        private String ossScanPath; 
        private Long resourceType; 
        private Integer runHour; 
        private Integer runMinute; 
        private Integer scanRange; 
        private String scanRangeContent; 
        private String taskName; 
        private String taskUserName; 

        private Builder() {
            super();
        } 

        private Builder(CreateScanTaskRequest request) {
            super(request);
            this.dataLimitId = request.dataLimitId;
            this.intervalDay = request.intervalDay;
            this.lang = request.lang;
            this.ossScanPath = request.ossScanPath;
            this.resourceType = request.resourceType;
            this.runHour = request.runHour;
            this.runMinute = request.runMinute;
            this.scanRange = request.scanRange;
            this.scanRangeContent = request.scanRangeContent;
            this.taskName = request.taskName;
            this.taskUserName = request.taskUserName;
        } 

        /**
         * DataLimitId.
         */
        public Builder dataLimitId(Long dataLimitId) {
            this.putQueryParameter("DataLimitId", dataLimitId);
            this.dataLimitId = dataLimitId;
            return this;
        }

        /**
         * IntervalDay.
         */
        public Builder intervalDay(Integer intervalDay) {
            this.putQueryParameter("IntervalDay", intervalDay);
            this.intervalDay = intervalDay;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * OssScanPath.
         */
        public Builder ossScanPath(String ossScanPath) {
            this.putQueryParameter("OssScanPath", ossScanPath);
            this.ossScanPath = ossScanPath;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(Long resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * RunHour.
         */
        public Builder runHour(Integer runHour) {
            this.putQueryParameter("RunHour", runHour);
            this.runHour = runHour;
            return this;
        }

        /**
         * RunMinute.
         */
        public Builder runMinute(Integer runMinute) {
            this.putQueryParameter("RunMinute", runMinute);
            this.runMinute = runMinute;
            return this;
        }

        /**
         * ScanRange.
         */
        public Builder scanRange(Integer scanRange) {
            this.putQueryParameter("ScanRange", scanRange);
            this.scanRange = scanRange;
            return this;
        }

        /**
         * ScanRangeContent.
         */
        public Builder scanRangeContent(String scanRangeContent) {
            this.putQueryParameter("ScanRangeContent", scanRangeContent);
            this.scanRangeContent = scanRangeContent;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * TaskUserName.
         */
        public Builder taskUserName(String taskUserName) {
            this.putQueryParameter("TaskUserName", taskUserName);
            this.taskUserName = taskUserName;
            return this;
        }

        @Override
        public CreateScanTaskRequest build() {
            return new CreateScanTaskRequest(this);
        } 

    } 

}
