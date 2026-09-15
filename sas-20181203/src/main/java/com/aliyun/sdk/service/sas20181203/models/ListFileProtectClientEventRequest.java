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
 * {@link ListFileProtectClientEventRequest} extends {@link RequestModel}
 *
 * <p>ListFileProtectClientEventRequest</p>
 */
public class ListFileProtectClientEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertLevels")
    private java.util.List<Integer> alertLevels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilePath")
    private String filePath;

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
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcPath")
    private String procPath;

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

    private ListFileProtectClientEventRequest(Builder builder) {
        super(builder);
        this.alertLevels = builder.alertLevels;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.filePath = builder.filePath;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.internetIp = builder.internetIp;
        this.intranetIp = builder.intranetIp;
        this.operation = builder.operation;
        this.pageSize = builder.pageSize;
        this.procPath = builder.procPath;
        this.ruleName = builder.ruleName;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFileProtectClientEventRequest create() {
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
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
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
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return procPath
     */
    public String getProcPath() {
        return this.procPath;
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

    public static final class Builder extends Request.Builder<ListFileProtectClientEventRequest, Builder> {
        private java.util.List<Integer> alertLevels; 
        private Integer currentPage; 
        private Long endTime; 
        private String filePath; 
        private String instanceId; 
        private String instanceName; 
        private String internetIp; 
        private String intranetIp; 
        private String operation; 
        private Integer pageSize; 
        private String procPath; 
        private String ruleName; 
        private Long startTime; 
        private String status; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ListFileProtectClientEventRequest request) {
            super(request);
            this.alertLevels = request.alertLevels;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.filePath = request.filePath;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.internetIp = request.internetIp;
            this.intranetIp = request.intranetIp;
            this.operation = request.operation;
            this.pageSize = request.pageSize;
            this.procPath = request.procPath;
            this.ruleName = request.ruleName;
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
         * <p>The number of the page to return in a paged query.</p>
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
         * <p>The end timestamp.</p>
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
         * <p>ca_cpm_****</p>
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
         * <p>The private IP address.</p>
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
         * <li><strong>DELETE</strong>: File deletion.</li>
         * <li><strong>WRITE</strong>: File write.</li>
         * <li><strong>READ</strong>: File read.</li>
         * <li><strong>RENAME</strong>: File rename.</li>
         * <li><strong>CHOWN</strong>: Setting the file owner and file group.</li>
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
         * <p>The maximum number of entries to return on each page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The process path.</p>
         * 
         * <strong>example:</strong>
         * <p>c:/windows/system32/i****</p>
         */
        public Builder procPath(String procPath) {
            this.putQueryParameter("ProcPath", procPath);
            this.procPath = procPath;
            return this;
        }

        /**
         * <p>The name of the configuration rule.</p>
         * 
         * <strong>example:</strong>
         * <p>text-001</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The start time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1650470399999</p>
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
         * <p>0</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The UUID of the server to query.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4fe8e1cd-3c37-4851-b9de-124da32c****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ListFileProtectClientEventRequest build() {
            return new ListFileProtectClientEventRequest(this);
        } 

    } 

}
