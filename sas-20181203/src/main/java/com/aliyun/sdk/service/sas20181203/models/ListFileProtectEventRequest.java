// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListFileProtectEventRequest} extends {@link RequestModel}
 *
 * <p>ListFileProtectEventRequest</p>
 */
public class ListFileProtectEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertLevels")
    private java.util.List < Integer > alertLevels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

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
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maxLength = 100, minLength = 1)
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private ListFileProtectEventRequest(Builder builder) {
        super(builder);
        this.alertLevels = builder.alertLevels;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.internetIp = builder.internetIp;
        this.intranetIp = builder.intranetIp;
        this.operation = builder.operation;
        this.pageSize = builder.pageSize;
        this.ruleName = builder.ruleName;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFileProtectEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertLevels
     */
    public java.util.List < Integer > getAlertLevels() {
        return this.alertLevels;
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
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
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

    public static final class Builder extends Request.Builder<ListFileProtectEventRequest, Builder> {
        private java.util.List < Integer > alertLevels; 
        private Integer currentPage; 
        private Long endTime; 
        private String instanceId; 
        private String instanceName; 
        private String internetIp; 
        private String intranetIp; 
        private String operation; 
        private String pageSize; 
        private String ruleName; 
        private Long startTime; 
        private String status; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ListFileProtectEventRequest request) {
            super(request);
            this.alertLevels = request.alertLevels;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.internetIp = request.internetIp;
            this.intranetIp = request.intranetIp;
            this.operation = request.operation;
            this.pageSize = request.pageSize;
            this.ruleName = request.ruleName;
            this.startTime = request.startTime;
            this.status = request.status;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The severities of alerts.</p>
         */
        public Builder alertLevels(java.util.List < Integer > alertLevels) {
            this.putQueryParameter("AlertLevels", alertLevels);
            this.alertLevels = alertLevels;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>The end timestamp of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>1683195595204</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The instance ID of the asset.</p>
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
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>ca_cpm_****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The public IP address of the server.</p>
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
         * <p>The private IP address of the server.</p>
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
         * <p>Type of operation on a file. eg:</p>
         * <ul>
         * <li><strong>DELETE</strong>: delete the file.</li>
         * <li><strong>WRITE</strong>: write the file.</li>
         * <li><strong>READ</strong>: read the file.</li>
         * <li><strong>RENAME</strong>: rename the file.</li>
         * <li><strong>CHOWN</strong>: set the file owner and file association group operations.</li>
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
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the rule.</p>
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
         * <p>The start timestamp of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>1683080489594</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the event. Valid values:</p>
         * <ul>
         * <li>0: unhandled</li>
         * <li>1: handled</li>
         * <li>2: added to the whitelist</li>
         * <li>3: ignored</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The UUID of the server.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUID of the server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>inet-ecs-4e876cb0-09f7-43b8-82ef-4bc7a937***</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ListFileProtectEventRequest build() {
            return new ListFileProtectEventRequest(this);
        } 

    } 

}
