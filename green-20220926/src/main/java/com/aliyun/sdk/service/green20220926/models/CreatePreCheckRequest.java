// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link CreatePreCheckRequest} extends {@link RequestModel}
 *
 * <p>CreatePreCheckRequest</p>
 */
public class CreatePreCheckRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Buckets")
    private String buckets;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DistinctHistoryTasks")
    private Boolean distinctHistoryTasks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsInc")
    private Boolean isInc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MediaType")
    private Integer mediaType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrefixFilterType")
    private String prefixFilterType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrefixFilters")
    private String prefixFilters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanLimit")
    private Long scanLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanNoFileType")
    private Boolean scanNoFileType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScanService")
    private String scanService;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private CreatePreCheckRequest(Builder builder) {
        super(builder);
        this.buckets = builder.buckets;
        this.distinctHistoryTasks = builder.distinctHistoryTasks;
        this.endTime = builder.endTime;
        this.isInc = builder.isInc;
        this.mediaType = builder.mediaType;
        this.prefixFilterType = builder.prefixFilterType;
        this.prefixFilters = builder.prefixFilters;
        this.priority = builder.priority;
        this.regionId = builder.regionId;
        this.scanLimit = builder.scanLimit;
        this.scanNoFileType = builder.scanNoFileType;
        this.scanService = builder.scanService;
        this.startTime = builder.startTime;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePreCheckRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buckets
     */
    public String getBuckets() {
        return this.buckets;
    }

    /**
     * @return distinctHistoryTasks
     */
    public Boolean getDistinctHistoryTasks() {
        return this.distinctHistoryTasks;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return isInc
     */
    public Boolean getIsInc() {
        return this.isInc;
    }

    /**
     * @return mediaType
     */
    public Integer getMediaType() {
        return this.mediaType;
    }

    /**
     * @return prefixFilterType
     */
    public String getPrefixFilterType() {
        return this.prefixFilterType;
    }

    /**
     * @return prefixFilters
     */
    public String getPrefixFilters() {
        return this.prefixFilters;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scanLimit
     */
    public Long getScanLimit() {
        return this.scanLimit;
    }

    /**
     * @return scanNoFileType
     */
    public Boolean getScanNoFileType() {
        return this.scanNoFileType;
    }

    /**
     * @return scanService
     */
    public String getScanService() {
        return this.scanService;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<CreatePreCheckRequest, Builder> {
        private String buckets; 
        private Boolean distinctHistoryTasks; 
        private String endTime; 
        private Boolean isInc; 
        private Integer mediaType; 
        private String prefixFilterType; 
        private String prefixFilters; 
        private Integer priority; 
        private String regionId; 
        private Long scanLimit; 
        private Boolean scanNoFileType; 
        private String scanService; 
        private String startTime; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreatePreCheckRequest request) {
            super(request);
            this.buckets = request.buckets;
            this.distinctHistoryTasks = request.distinctHistoryTasks;
            this.endTime = request.endTime;
            this.isInc = request.isInc;
            this.mediaType = request.mediaType;
            this.prefixFilterType = request.prefixFilterType;
            this.prefixFilters = request.prefixFilters;
            this.priority = request.priority;
            this.regionId = request.regionId;
            this.scanLimit = request.scanLimit;
            this.scanNoFileType = request.scanNoFileType;
            this.scanService = request.scanService;
            this.startTime = request.startTime;
            this.taskName = request.taskName;
        } 

        /**
         * <p>Buckets.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Bucket&quot;:&quot;bucket01-test&quot;,&quot;Region&quot;:&quot;cn-beijing&quot;}]</p>
         */
        public Builder buckets(String buckets) {
            this.putBodyParameter("Buckets", buckets);
            this.buckets = buckets;
            return this;
        }

        /**
         * <p>Whether to deduplicate historical detected tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder distinctHistoryTasks(Boolean distinctHistoryTasks) {
            this.putBodyParameter("DistinctHistoryTasks", distinctHistoryTasks);
            this.distinctHistoryTasks = distinctHistoryTasks;
            return this;
        }

        /**
         * <p>Task end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-18 10:08:00</p>
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Whether it is a scheduled scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isInc(Boolean isInc) {
            this.putBodyParameter("IsInc", isInc);
            this.isInc = isInc;
            return this;
        }

        /**
         * <p>Media type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder mediaType(Integer mediaType) {
            this.putBodyParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * <p>Prefix filter type.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder prefixFilterType(String prefixFilterType) {
            this.putBodyParameter("PrefixFilterType", prefixFilterType);
            this.prefixFilterType = prefixFilterType;
            return this;
        }

        /**
         * <p>Prefixes.</p>
         * 
         * <strong>example:</strong>
         * <p>dir1,dir2</p>
         */
        public Builder prefixFilters(String prefixFilters) {
            this.putBodyParameter("PrefixFilters", prefixFilters);
            this.prefixFilters = prefixFilters;
            return this;
        }

        /**
         * <p>Priority.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Scan limit count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder scanLimit(Long scanLimit) {
            this.putBodyParameter("ScanLimit", scanLimit);
            this.scanLimit = scanLimit;
            return this;
        }

        /**
         * <p>Whether to scan images without file extensions.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder scanNoFileType(Boolean scanNoFileType) {
            this.putBodyParameter("ScanNoFileType", scanNoFileType);
            this.scanNoFileType = scanNoFileType;
            return this;
        }

        /**
         * <p>Scan service code.</p>
         * 
         * <strong>example:</strong>
         * <p>baselineCheck</p>
         */
        public Builder scanService(String scanService) {
            this.putBodyParameter("ScanService", scanService);
            this.scanService = scanService;
            return this;
        }

        /**
         * <p>Task start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-17 10:08:00</p>
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Task name.</p>
         * 
         * <strong>example:</strong>
         * <p>图片任务 20240709101602004</p>
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public CreatePreCheckRequest build() {
            return new CreatePreCheckRequest(this);
        } 

    } 

}
