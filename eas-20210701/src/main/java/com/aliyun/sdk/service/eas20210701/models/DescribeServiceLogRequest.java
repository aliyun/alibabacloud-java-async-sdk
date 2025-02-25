// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DescribeServiceLogRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceLogRequest</p>
 */
public class DescribeServiceLogRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerName")
    private String containerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Long pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Previous")
    private Boolean previous;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeServiceLogRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.containerName = builder.containerName;
        this.endTime = builder.endTime;
        this.instanceName = builder.instanceName;
        this.ip = builder.ip;
        this.keyword = builder.keyword;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.previous = builder.previous;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return containerName
     */
    public String getContainerName() {
        return this.containerName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return previous
     */
    public Boolean getPrevious() {
        return this.previous;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeServiceLogRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private String containerName; 
        private String endTime; 
        private String instanceName; 
        private String ip; 
        private String keyword; 
        private Long pageNum; 
        private Long pageSize; 
        private Boolean previous; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceLogRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.containerName = request.containerName;
            this.endTime = request.endTime;
            this.instanceName = request.instanceName;
            this.ip = request.ip;
            this.keyword = request.keyword;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.previous = request.previous;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The ID of the region where the service is deployed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The service name. For more information about how to query the service name, see <a href="https://help.aliyun.com/document_detail/412109.html">ListServices</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>echo</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The name of the container that runs the service.</p>
         * 
         * <strong>example:</strong>
         * <p>worker0</p>
         */
        public Builder containerName(String containerName) {
            this.putQueryParameter("ContainerName", containerName);
            this.containerName = containerName;
            return this;
        }

        /**
         * <p>The end of the time range to query. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2006-01-02 15:04:05</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The name of the instance that runs the service. For more information about how to query the instance name, see <a href="https://help.aliyun.com/document_detail/412108.html">ListServiceInstances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>echo-da290ac8-7fckm</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The IP address of the instance whose logs you want to query. For more information about how to query the IP address of an instance, see <a href="https://help.aliyun.com/document_detail/412108.html">ListServiceInstances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.1</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The keyword that you use to query the logs of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Long pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 500.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Specifies whether to query the logs that are generated before the instance last restarts. This parameter is available only if the instance restarts.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>false</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder previous(Boolean previous) {
            this.putQueryParameter("Previous", previous);
            this.previous = previous;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The time must be in Coordinated Universal Time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2006-01-02 15:04:05</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeServiceLogRequest build() {
            return new DescribeServiceLogRequest(this);
        } 

    } 

}
