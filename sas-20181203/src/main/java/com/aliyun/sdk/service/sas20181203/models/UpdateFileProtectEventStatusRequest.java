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
 * {@link UpdateFileProtectEventStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateFileProtectEventStatusRequest</p>
 */
public class UpdateFileProtectEventStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertLevels")
    private java.util.List<Integer> alertLevels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private java.util.List<Long> id;

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
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectAllAcrossPages")
    private Boolean selectAllAcrossPages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private UpdateFileProtectEventStatusRequest(Builder builder) {
        super(builder);
        this.alertLevels = builder.alertLevels;
        this.endTime = builder.endTime;
        this.id = builder.id;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.internetIp = builder.internetIp;
        this.intranetIp = builder.intranetIp;
        this.operation = builder.operation;
        this.ruleName = builder.ruleName;
        this.selectAllAcrossPages = builder.selectAllAcrossPages;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFileProtectEventStatusRequest create() {
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
    public java.util.List<Long> getId() {
        return this.id;
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
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<UpdateFileProtectEventStatusRequest, Builder> {
        private java.util.List<Integer> alertLevels; 
        private Long endTime; 
        private java.util.List<Long> id; 
        private String instanceId; 
        private String instanceName; 
        private String internetIp; 
        private String intranetIp; 
        private String operation; 
        private String ruleName; 
        private Boolean selectAllAcrossPages; 
        private Long startTime; 
        private Integer status; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFileProtectEventStatusRequest request) {
            super(request);
            this.alertLevels = request.alertLevels;
            this.endTime = request.endTime;
            this.id = request.id;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.internetIp = request.internetIp;
            this.intranetIp = request.intranetIp;
            this.operation = request.operation;
            this.ruleName = request.ruleName;
            this.selectAllAcrossPages = request.selectAllAcrossPages;
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
         * <p>The end timestamp of the query.</p>
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
         * <p>The list of event IDs.</p>
         */
        public Builder id(java.util.List<Long> id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The ID of the asset instance.</p>
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
         * <p>The type of operation performed on the file. Valid values:</p>
         * <ul>
         * <li><strong>DELETE</strong>: Deletes a file.</li>
         * <li><strong>WRITE</strong>: Writes to a file.</li>
         * <li><strong>READ</strong>: Reads a file.</li>
         * <li><strong>RENAME</strong>: Renames a file.</li>
         * <li><strong>CHOWN</strong>: Changes the file owner and associated file group.</li>
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
         * <p>Specifies whether to select all items across pages. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Selected.</li>
         * <li><strong>false</strong>: Not selected.</li>
         * </ul>
         */
        public Builder selectAllAcrossPages(Boolean selectAllAcrossPages) {
            this.putQueryParameter("SelectAllAcrossPages", selectAllAcrossPages);
            this.selectAllAcrossPages = selectAllAcrossPages;
            return this;
        }

        /**
         * <p>The start timestamp of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>1680919232000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The event handling status.</p>
         * <ul>
         * <li><strong>0</strong>: Unhandled</li>
         * <li><strong>1</strong>: Manually handled</li>
         * <li><strong>2</strong>: Added to whitelist</li>
         * <li><strong>3</strong>: Ignored</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>eb2c782e-64f2-4590-a86c-d90164df****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public UpdateFileProtectEventStatusRequest build() {
            return new UpdateFileProtectEventStatusRequest(this);
        } 

    } 

}
