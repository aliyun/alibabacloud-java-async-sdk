// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAgentlessTaskRequest} extends {@link RequestModel}
 *
 * <p>ListAgentlessTaskRequest</p>
 */
public class ListAgentlessTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetIp")
    private String internetIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntranetIp")
    private String intranetIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MachineName")
    private String machineName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RootTask")
    private Boolean rootTask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RootTaskId")
    private String rootTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetName")
    private String targetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private Integer targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private ListAgentlessTaskRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.internetIp = builder.internetIp;
        this.intranetIp = builder.intranetIp;
        this.lang = builder.lang;
        this.machineName = builder.machineName;
        this.pageSize = builder.pageSize;
        this.rootTask = builder.rootTask;
        this.rootTaskId = builder.rootTaskId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.targetName = builder.targetName;
        this.targetType = builder.targetType;
        this.taskId = builder.taskId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentlessTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return internetIp
     */
    public String getInternetIp() {
        return this.internetIp;
    }

    /**
     * @return intranetIp
     */
    public String getIntranetIp() {
        return this.intranetIp;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return machineName
     */
    public String getMachineName() {
        return this.machineName;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return rootTask
     */
    public Boolean getRootTask() {
        return this.rootTask;
    }

    /**
     * @return rootTaskId
     */
    public String getRootTaskId() {
        return this.rootTaskId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return targetName
     */
    public String getTargetName() {
        return this.targetName;
    }

    /**
     * @return targetType
     */
    public Integer getTargetType() {
        return this.targetType;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ListAgentlessTaskRequest, Builder> {
        private Integer currentPage; 
        private Long endTime; 
        private String internetIp; 
        private String intranetIp; 
        private String lang; 
        private String machineName; 
        private Integer pageSize; 
        private Boolean rootTask; 
        private String rootTaskId; 
        private Long startTime; 
        private Integer status; 
        private String targetName; 
        private Integer targetType; 
        private String taskId; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentlessTaskRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.internetIp = request.internetIp;
            this.intranetIp = request.intranetIp;
            this.lang = request.lang;
            this.machineName = request.machineName;
            this.pageSize = request.pageSize;
            this.rootTask = request.rootTask;
            this.rootTaskId = request.rootTaskId;
            this.startTime = request.startTime;
            this.status = request.status;
            this.targetName = request.targetName;
            this.targetType = request.targetType;
            this.taskId = request.taskId;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The end timestamp of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1635575219000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The public IP address of the asset that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.XX.XX</p>
         */
        public Builder internetIp(String internetIp) {
            this.putQueryParameter("InternetIp", internetIp);
            this.internetIp = internetIp;
            return this;
        }

        /**
         * <p>The private IP address of the asset that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>172.26.XX.XX</p>
         */
        public Builder intranetIp(String intranetIp) {
            this.putQueryParameter("IntranetIp", intranetIp);
            this.intranetIp = intranetIp;
            return this;
        }

        /**
         * <p>The language type. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>oracle-win-001****</p>
         */
        public Builder machineName(String machineName) {
            this.putQueryParameter("MachineName", machineName);
            this.machineName = machineName;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Specifies whether to query main tasks. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: queries main tasks.</li>
         * <li><strong>false</strong>: queries subtasks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder rootTask(Boolean rootTask) {
            this.putQueryParameter("RootTask", rootTask);
            this.rootTask = rootTask;
            return this;
        }

        /**
         * <p>The ID of the main task.</p>
         * 
         * <strong>example:</strong>
         * <p>12c27343861610c5db3f7a2573b4****</p>
         */
        public Builder rootTaskId(String rootTaskId) {
            this.putQueryParameter("RootTaskId", rootTaskId);
            this.rootTaskId = rootTaskId;
            return this;
        }

        /**
         * <p>The start timestamp of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1651290987000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the detection task.</p>
         * <ul>
         * <li><strong>1</strong>: The detection task is in progress.</li>
         * <li><strong>2</strong>: The detection task is complete.</li>
         * <li><strong>3</strong>: The detection task fails.</li>
         * <li><strong>4</strong>: The detection task times out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The name of the asset that you want to detect.</p>
         * 
         * <strong>example:</strong>
         * <p>source-test-obj-0****</p>
         */
        public Builder targetName(String targetName) {
            this.putQueryParameter("TargetName", targetName);
            this.targetName = targetName;
            return this;
        }

        /**
         * <p>The type of the asset that you want to detect. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: snapshot</li>
         * <li><strong>2</strong>: image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder targetType(Integer targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The ID of the main task. If you want to query subtasks of a main task, you must specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>d7b2acf8d362742123e4a84e1bf8****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>e4af3620-6895-4e2f-a641-a9d8fb53****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ListAgentlessTaskRequest build() {
            return new ListAgentlessTaskRequest(this);
        } 

    } 

}
