// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link UpdateFileProtectClientEventRequest} extends {@link RequestModel}
 *
 * <p>UpdateFileProtectClientEventRequest</p>
 */
public class UpdateFileProtectClientEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertLevels")
    private java.util.List<Integer> alertLevels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeIdList")
    private java.util.List<Long> excludeIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilePath")
    private String filePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdList")
    private java.util.List<Long> idList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetIp")
    private String internetIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntranetIp")
    private String intranetIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer newStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    private String operation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcPath")
    private String procPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private java.util.List<String> remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectAll")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean selectAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private UpdateFileProtectClientEventRequest(Builder builder) {
        super(builder);
        this.alertLevels = builder.alertLevels;
        this.endTime = builder.endTime;
        this.excludeIdList = builder.excludeIdList;
        this.filePath = builder.filePath;
        this.idList = builder.idList;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.internetIp = builder.internetIp;
        this.intranetIp = builder.intranetIp;
        this.newStatus = builder.newStatus;
        this.operation = builder.operation;
        this.procPath = builder.procPath;
        this.remark = builder.remark;
        this.ruleName = builder.ruleName;
        this.selectAll = builder.selectAll;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFileProtectClientEventRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertLevels
     */
    public java.util.List<Integer> getAlertLevels() {
        return this.alertLevels;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return excludeIdList
     */
    public java.util.List<Long> getExcludeIdList() {
        return this.excludeIdList;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return idList
     */
    public java.util.List<Long> getIdList() {
        return this.idList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
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
     * @return newStatus
     */
    public Integer getNewStatus() {
        return this.newStatus;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return procPath
     */
    public String getProcPath() {
        return this.procPath;
    }

    /**
     * @return remark
     */
    public java.util.List<String> getRemark() {
        return this.remark;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return selectAll
     */
    public Boolean getSelectAll() {
        return this.selectAll;
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
    public String getStatus() {
        return this.status;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<UpdateFileProtectClientEventRequest, Builder> {
        private java.util.List<Integer> alertLevels; 
        private Long endTime; 
        private java.util.List<Long> excludeIdList; 
        private String filePath; 
        private java.util.List<Long> idList; 
        private String instanceId; 
        private String instanceName; 
        private String internetIp; 
        private String intranetIp; 
        private Integer newStatus; 
        private String operation; 
        private String procPath; 
        private java.util.List<String> remark; 
        private String ruleName; 
        private Boolean selectAll; 
        private Long startTime; 
        private String status; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFileProtectClientEventRequest request) {
            super(request);
            this.alertLevels = request.alertLevels;
            this.endTime = request.endTime;
            this.excludeIdList = request.excludeIdList;
            this.filePath = request.filePath;
            this.idList = request.idList;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.internetIp = request.internetIp;
            this.intranetIp = request.intranetIp;
            this.newStatus = request.newStatus;
            this.operation = request.operation;
            this.procPath = request.procPath;
            this.remark = request.remark;
            this.ruleName = request.ruleName;
            this.selectAll = request.selectAll;
            this.startTime = request.startTime;
            this.status = request.status;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The list of alert notification levels.</p>
         */
        public Builder alertLevels(java.util.List<Integer> alertLevels) {
            this.putQueryParameter("AlertLevels", alertLevels);
            this.alertLevels = alertLevels;
            return this;
        }

        /**
         * <p>The timestamp of the end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1650470399999</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The list of excluded event IDs.</p>
         */
        public Builder excludeIdList(java.util.List<Long> excludeIdList) {
            this.putQueryParameter("ExcludeIdList", excludeIdList);
            this.excludeIdList = excludeIdList;
            return this;
        }

        /**
         * <p>The file path.</p>
         * 
         * <strong>example:</strong>
         * <p>/etc/pam****</p>
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * <p>The list of event IDs.</p>
         */
        public Builder idList(java.util.List<Long> idList) {
            this.putQueryParameter("IdList", idList);
            this.idList = idList;
            return this;
        }

        /**
         * <p>The ID of the asset instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1fu4aqltf1huhc****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the asset instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>120.27.XX.XX</p>
         */
        public Builder internetIp(String internetIp) {
            this.putQueryParameter("InternetIp", internetIp);
            this.internetIp = internetIp;
            return this;
        }

        /**
         * <p>The internal IP address.</p>
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
         * <p>The new status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Unhandled.</li>
         * <li><strong>1</strong>: Handled.</li>
         * <li><strong>2</strong>: Whitelisted.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder newStatus(Integer newStatus) {
            this.putQueryParameter("NewStatus", newStatus);
            this.newStatus = newStatus;
            return this;
        }

        /**
         * <p>The type of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>READ</p>
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * <p>The process path.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/1111/****</p>
         */
        public Builder procPath(String procPath) {
            this.putQueryParameter("ProcPath", procPath);
            this.procPath = procPath;
            return this;
        }

        /**
         * <p>The remarks.</p>
         */
        public Builder remark(java.util.List<String> remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>tetsRule</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>Specifies whether to select all.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder selectAll(Boolean selectAll) {
            this.putQueryParameter("SelectAll", selectAll);
            this.selectAll = selectAll;
            return this;
        }

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1649260800000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The event status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Unhandled.</li>
         * <li><strong>1</strong>: Handled.</li>
         * <li><strong>2</strong>: Whitelisted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The UUID of the protected server.</p>
         * 
         * <strong>example:</strong>
         * <p>ae1527a9-2308-46ab-b10a-48ae7ff7****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public UpdateFileProtectClientEventRequest build() {
            return new UpdateFileProtectClientEventRequest(this);
        } 

    } 

}
