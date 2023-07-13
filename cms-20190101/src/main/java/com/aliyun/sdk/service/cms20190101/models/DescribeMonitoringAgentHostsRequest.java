// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitoringAgentHostsRequest} extends {@link RequestModel}
 *
 * <p>DescribeMonitoringAgentHostsRequest</p>
 */
public class DescribeMonitoringAgentHostsRequest extends Request {
    @Query
    @NameInMap("AliyunHost")
    private Boolean aliyunHost;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("InstanceIds")
    private String instanceIds;

    @Query
    @NameInMap("InstanceRegionId")
    private String instanceRegionId;

    @Query
    @NameInMap("KeyWord")
    private String keyWord;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SerialNumbers")
    private String serialNumbers;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("SysomStatus")
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
         * Specifies whether to query Elastic Compute Service (ECS) instances that are provided by Alibaba Cloud or to query hosts that are not provided by Alibaba Cloud. Valid values:
         * <p>
         * 
         * *   true (default value): queries all the ECS instances that are provided by Alibaba Cloud.
         * *   false: queries all the hosts that are not provided by Alibaba Cloud.
         */
        public Builder aliyunHost(Boolean aliyunHost) {
            this.putQueryParameter("AliyunHost", aliyunHost);
            this.aliyunHost = aliyunHost;
            return this;
        }

        /**
         * The name of the host.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The region ID of the instance.
         */
        public Builder instanceRegionId(String instanceRegionId) {
            this.putQueryParameter("InstanceRegionId", instanceRegionId);
            this.instanceRegionId = instanceRegionId;
            return this;
        }

        /**
         * The keyword that is used in fuzzy match.
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values:
         * <p>
         * 
         * *   10
         * *   20
         * *   50
         * *   100
         * 
         * > Although Alibaba Cloud does not limit the maximum value of this parameter, we recommend that you do not set it to an excessively large value. If you set it to an excessively large value, a timeout error may occur.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The serial number of the host.
         * <p>
         * 
         * After the CloudMonitor agent is installed on a host, a globally unique serial number is generated. A host that is not provided by Alibaba Cloud has a serial number instead of an instance ID.
         * 
         * > This parameter can be used to accurately search for a monitored host.
         */
        public Builder serialNumbers(String serialNumbers) {
            this.putQueryParameter("SerialNumbers", serialNumbers);
            this.serialNumbers = serialNumbers;
            return this;
        }

        /**
         * The status of the hosts that you want to query. Valid values:
         * <p>
         * 
         * *   Running: queries the hosts that are running.
         * *   Stopped: queries the hosts that are stopped, are not installed, or fail to be installed.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The status of SysOM. Valid values:
         * <p>
         * 
         * *   installing: SysOM is being installed.
         * *   running: SysOM is running.
         * *   stopped: SysOM is stopped.
         * *   uninstalling: SysOM is being uninstalled.
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
