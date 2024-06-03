// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScanTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateScanTaskRequest</p>
 */
public class CreateScanTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataLimitId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dataLimitId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureType")
    private Integer featureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntervalDay")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer intervalDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssScanPath")
    private String ossScanPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunHour")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer runHour;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunMinute")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer runMinute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanRange")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer scanRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanRangeContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scanRangeContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskUserName")
    private String taskUserName;

    private CreateScanTaskRequest(Builder builder) {
        super(builder);
        this.dataLimitId = builder.dataLimitId;
        this.featureType = builder.featureType;
        this.intervalDay = builder.intervalDay;
        this.lang = builder.lang;
        this.ossScanPath = builder.ossScanPath;
        this.resourceType = builder.resourceType;
        this.runHour = builder.runHour;
        this.runMinute = builder.runMinute;
        this.scanRange = builder.scanRange;
        this.scanRangeContent = builder.scanRangeContent;
        this.sourceIp = builder.sourceIp;
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
     * @return featureType
     */
    public Integer getFeatureType() {
        return this.featureType;
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
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
        private Integer featureType; 
        private Integer intervalDay; 
        private String lang; 
        private String ossScanPath; 
        private Long resourceType; 
        private Integer runHour; 
        private Integer runMinute; 
        private Integer scanRange; 
        private String scanRangeContent; 
        private String sourceIp; 
        private String taskName; 
        private String taskUserName; 

        private Builder() {
            super();
        } 

        private Builder(CreateScanTaskRequest request) {
            super(request);
            this.dataLimitId = request.dataLimitId;
            this.featureType = request.featureType;
            this.intervalDay = request.intervalDay;
            this.lang = request.lang;
            this.ossScanPath = request.ossScanPath;
            this.resourceType = request.resourceType;
            this.runHour = request.runHour;
            this.runMinute = request.runMinute;
            this.scanRange = request.scanRange;
            this.scanRangeContent = request.scanRangeContent;
            this.sourceIp = request.sourceIp;
            this.taskName = request.taskName;
            this.taskUserName = request.taskUserName;
        } 

        /**
         * The unique ID of the data asset, such as an instance, a database, and a bucket. You can call the [DescribeDataLimits](~~DescribeDataLimits~~) operation to query the unique ID.
         */
        public Builder dataLimitId(Long dataLimitId) {
            this.putQueryParameter("DataLimitId", dataLimitId);
            this.dataLimitId = dataLimitId;
            return this;
        }

        /**
         * This parameter is deprecated.
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * The interval between two consecutive custom scan tasks. Unit: days. Valid values: 1 to 2147483648.
         */
        public Builder intervalDay(Integer intervalDay) {
            this.putQueryParameter("IntervalDay", intervalDay);
            this.intervalDay = intervalDay;
            return this;
        }

        /**
         * The language of the content within the request and response.
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The data to be scanned in the Object Storage Service (OSS) bucket. Prefix match, suffix match, and regular expression match are supported.
         */
        public Builder ossScanPath(String ossScanPath) {
            this.putQueryParameter("OssScanPath", ossScanPath);
            this.ossScanPath = ossScanPath;
            return this;
        }

        /**
         * The type of the service to which the data assets to be scanned belong. Valid values include **1**, **2**, **3**, **4**, and **5**. The value 1 indicates MaxCompute. The value 2 indicates OSS. The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.
         */
        public Builder resourceType(Long resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The time when the scan task is executed next time. Unit: hours.
         */
        public Builder runHour(Integer runHour) {
            this.putQueryParameter("RunHour", runHour);
            this.runHour = runHour;
            return this;
        }

        /**
         * The time when the scan task is executed next time. Unit: minutes.
         */
        public Builder runMinute(Integer runMinute) {
            this.putQueryParameter("RunMinute", runMinute);
            this.runMinute = runMinute;
            return this;
        }

        /**
         * The matching rule that specifies the scan scope of the custom scan task. This parameter takes effect only if you set the **ScanRangeContent** parameter. Valid values:
         * <p>
         * 
         * *   **0**: exact match
         * *   **1**: prefix match
         * *   **2**: suffix match
         * *   **3**: regular expression match
         */
        public Builder scanRange(Integer scanRange) {
            this.putQueryParameter("ScanRange", scanRange);
            this.scanRange = scanRange;
            return this;
        }

        /**
         * The data to be scanned in a structured data asset. Prefix match, suffix match, and regular expression match are supported.
         */
        public Builder scanRangeContent(String scanRangeContent) {
            this.putQueryParameter("ScanRangeContent", scanRangeContent);
            this.scanRangeContent = scanRangeContent;
            return this;
        }

        /**
         * This parameter is deprecated.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The name of the scan task.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * The account that is used to create the scan task.
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
