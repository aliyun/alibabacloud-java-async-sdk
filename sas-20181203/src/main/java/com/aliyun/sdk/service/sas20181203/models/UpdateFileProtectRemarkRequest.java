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
 * {@link UpdateFileProtectRemarkRequest} extends {@link RequestModel}
 *
 * <p>UpdateFileProtectRemarkRequest</p>
 */
public class UpdateFileProtectRemarkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertLevels")
    private java.util.List<Integer> alertLevels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

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
    @com.aliyun.core.annotation.NameInMap("Operation")
    private String operation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private java.util.List<String> remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectAllAcrossPages")
    private Boolean selectAllAcrossPages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private UpdateFileProtectRemarkRequest(Builder builder) {
        super(builder);
        this.alertLevels = builder.alertLevels;
        this.endTime = builder.endTime;
        this.id = builder.id;
        this.idList = builder.idList;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.internetIp = builder.internetIp;
        this.intranetIp = builder.intranetIp;
        this.operation = builder.operation;
        this.remark = builder.remark;
        this.ruleName = builder.ruleName;
        this.selectAllAcrossPages = builder.selectAllAcrossPages;
        this.startTime = builder.startTime;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFileProtectRemarkRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
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
     * @return operation
     */
    public String getOperation() {
        return this.operation;
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
     * @return selectAllAcrossPages
     */
    public Boolean getSelectAllAcrossPages() {
        return this.selectAllAcrossPages;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<UpdateFileProtectRemarkRequest, Builder> {
        private java.util.List<Integer> alertLevels; 
        private Long endTime; 
        private Long id; 
        private java.util.List<Long> idList; 
        private String instanceId; 
        private String instanceName; 
        private String internetIp; 
        private String intranetIp; 
        private String operation; 
        private java.util.List<String> remark; 
        private String ruleName; 
        private Boolean selectAllAcrossPages; 
        private Long startTime; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFileProtectRemarkRequest request) {
            super(request);
            this.alertLevels = request.alertLevels;
            this.endTime = request.endTime;
            this.id = request.id;
            this.idList = request.idList;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.internetIp = request.internetIp;
            this.intranetIp = request.intranetIp;
            this.operation = request.operation;
            this.remark = request.remark;
            this.ruleName = request.ruleName;
            this.selectAllAcrossPages = request.selectAllAcrossPages;
            this.startTime = request.startTime;
            this.uuid = request.uuid;
        } 

        /**
         * <p>Alert notification level list.</p>
         */
        public Builder alertLevels(java.util.List<Integer> alertLevels) {
            this.putQueryParameter("AlertLevels", alertLevels);
            this.alertLevels = alertLevels;
            return this;
        }

        /**
         * <p>End time timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1649040221</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>1764</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Event ID list.</p>
         */
        public Builder idList(java.util.List<Long> idList) {
            this.putQueryParameter("IdList", idList);
            this.idList = idList;
            return this;
        }

        /**
         * <p>Asset instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1g6wxdwps7s9dz****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Asset instance name.</p>
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
         * <p>Public IP.</p>
         * 
         * <strong>example:</strong>
         * <p>101.132.XX.XX</p>
         */
        public Builder internetIp(String internetIp) {
            this.putQueryParameter("InternetIp", internetIp);
            this.internetIp = internetIp;
            return this;
        }

        /**
         * <p>Private IP.</p>
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
         * <p>File operation type. Values:</p>
         * <ul>
         * <li><strong>DELETE</strong>: File deletion operation.</li>
         * <li><strong>WRITE</strong>: File write operation.</li>
         * <li><strong>READ</strong>: File read operation.</li>
         * <li><strong>RENAME</strong>: File rename operation.</li>
         * <li><strong>CHOWN</strong>: Set file owner and associated group operation.</li>
         * </ul>
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
         * <p>The remarks.</p>
         */
        public Builder remark(java.util.List<String> remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>Rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-rule-1</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>Cross-page select all indicator. Values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes</li>
         * <li><strong>false</strong>: No</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder selectAllAcrossPages(Boolean selectAllAcrossPages) {
            this.putQueryParameter("SelectAllAcrossPages", selectAllAcrossPages);
            this.selectAllAcrossPages = selectAllAcrossPages;
            return this;
        }

        /**
         * <p>Start time timestamp.</p>
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
         * <p>Server UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>5d55af3c-35f3-4d4d-8ccc-8c5443b0****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public UpdateFileProtectRemarkRequest build() {
            return new UpdateFileProtectRemarkRequest(this);
        } 

    } 

}
