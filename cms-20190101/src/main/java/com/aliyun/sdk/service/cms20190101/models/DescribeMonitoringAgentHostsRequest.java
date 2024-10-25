// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMonitoringAgentHostsRequest} extends {@link RequestModel}
 *
 * <p>DescribeMonitoringAgentHostsRequest</p>
 */
public class DescribeMonitoringAgentHostsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunHost")
    private Boolean aliyunHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceRegionId")
    private String instanceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyWord")
    private String keyWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SerialNumbers")
    private String serialNumbers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SysomStatus")
    private String sysomStatus;

    private DescribeMonitoringAgentHostsRequest(Builder builder) {
        super(builder);
        this.aliyunHost = builder.aliyunHost;
        this.hostName = builder.hostName;
        this.instanceIds = builder.instanceIds;
        this.instanceRegionId = builder.instanceRegionId;
        this.keyWord = builder.keyWord;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.serialNumbers = builder.serialNumbers;
        this.status = builder.status;
        this.sysomStatus = builder.sysomStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitoringAgentHostsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunHost
     */
    public Boolean getAliyunHost() {
        return this.aliyunHost;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return instanceRegionId
     */
    public String getInstanceRegionId() {
        return this.instanceRegionId;
    }

    /**
     * @return keyWord
     */
    public String getKeyWord() {
        return this.keyWord;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return serialNumbers
     */
    public String getSerialNumbers() {
        return this.serialNumbers;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return sysomStatus
     */
    public String getSysomStatus() {
        return this.sysomStatus;
    }

    public static final class Builder extends Request.Builder<DescribeMonitoringAgentHostsRequest, Builder> {
        private Boolean aliyunHost; 
        private String hostName; 
        private String instanceIds; 
        private String instanceRegionId; 
        private String keyWord; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String serialNumbers; 
        private String status; 
        private String sysomStatus; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMonitoringAgentHostsRequest request) {
            super(request);
            this.aliyunHost = request.aliyunHost;
            this.hostName = request.hostName;
            this.instanceIds = request.instanceIds;
            this.instanceRegionId = request.instanceRegionId;
            this.keyWord = request.keyWord;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.serialNumbers = request.serialNumbers;
            this.status = request.status;
            this.sysomStatus = request.sysomStatus;
        } 

        /**
         * <p>Specifies whether to query Elastic Compute Service (ECS) instances that are provided by Alibaba Cloud or to query hosts that are not provided by Alibaba Cloud. Valid values:</p>
         * <ul>
         * <li>true (default value): queries all the ECS instances that are provided by Alibaba Cloud.</li>
         * <li>false: queries all the hosts that are not provided by Alibaba Cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder aliyunHost(Boolean aliyunHost) {
            this.putQueryParameter("AliyunHost", aliyunHost);
            this.aliyunHost = aliyunHost;
            return this;
        }

        /**
         * <p>The name of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>hostNam1</p>
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-a3d1q1pm2f9yr29e****</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder instanceRegionId(String instanceRegionId) {
            this.putQueryParameter("InstanceRegionId", instanceRegionId);
            this.instanceRegionId = instanceRegionId;
            return this;
        }

        /**
         * <p>The keyword that is used in fuzzy match.</p>
         * 
         * <strong>example:</strong>
         * <p>host1</p>
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values:</p>
         * <ul>
         * <li>10</li>
         * <li>20</li>
         * <li>50</li>
         * <li>100</li>
         * </ul>
         * <blockquote>
         * <p>Although Alibaba Cloud does not limit the maximum value of this parameter, we recommend that you do not set it to an excessively large value. If you set it to an excessively large value, a timeout error may occur.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The serial number of the host.</p>
         * <p>After the CloudMonitor agent is installed on a host, a globally unique serial number is generated. A host that is not provided by Alibaba Cloud has a serial number instead of an instance ID.</p>
         * <blockquote>
         * <p>This parameter can be used to accurately search for a monitored host.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a1ab31a3-1234-40f2-9e95-c8caa8f0****</p>
         */
        public Builder serialNumbers(String serialNumbers) {
            this.putQueryParameter("SerialNumbers", serialNumbers);
            this.serialNumbers = serialNumbers;
            return this;
        }

        /**
         * <p>The status of the hosts that you want to query. Valid values:</p>
         * <ul>
         * <li>Running: queries the hosts that are running.</li>
         * <li>Stopped: queries the hosts that are stopped, are not installed, or fail to be installed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The status of SysOM. Valid values:</p>
         * <ul>
         * <li>installing: SysOM is being installed.</li>
         * <li>running: SysOM is running.</li>
         * <li>stopped: SysOM is stopped.</li>
         * <li>uninstalling: SysOM is being uninstalled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        public Builder sysomStatus(String sysomStatus) {
            this.putQueryParameter("SysomStatus", sysomStatus);
            this.sysomStatus = sysomStatus;
            return this;
        }

        @Override
        public DescribeMonitoringAgentHostsRequest build() {
            return new DescribeMonitoringAgentHostsRequest(this);
        } 

    } 

}
