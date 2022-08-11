// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterAttachScriptsRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterAttachScriptsRequest</p>
 */
public class DescribeClusterAttachScriptsRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("arch")
    private String arch;

    @Body
    @NameInMap("format_disk")
    private Boolean formatDisk;

    @Body
    @NameInMap("keep_instance_name")
    private Boolean keepInstanceName;

    @Body
    @NameInMap("nodepool_id")
    private String nodepoolId;

    @Body
    @NameInMap("options")
    private String options;

    @Body
    @NameInMap("rds_instances")
    private java.util.List < String > rdsInstances;

    private DescribeClusterAttachScriptsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.arch = builder.arch;
        this.formatDisk = builder.formatDisk;
        this.keepInstanceName = builder.keepInstanceName;
        this.nodepoolId = builder.nodepoolId;
        this.options = builder.options;
        this.rdsInstances = builder.rdsInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterAttachScriptsRequest create() {
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
     * @return arch
     */
    public String getArch() {
        return this.arch;
    }

    /**
     * @return formatDisk
     */
    public Boolean getFormatDisk() {
        return this.formatDisk;
    }

    /**
     * @return keepInstanceName
     */
    public Boolean getKeepInstanceName() {
        return this.keepInstanceName;
    }

    /**
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return rdsInstances
     */
    public java.util.List < String > getRdsInstances() {
        return this.rdsInstances;
    }

    public static final class Builder extends Request.Builder<DescribeClusterAttachScriptsRequest, Builder> {
        private String clusterId; 
        private String arch; 
        private Boolean formatDisk; 
        private Boolean keepInstanceName; 
        private String nodepoolId; 
        private String options; 
        private java.util.List < String > rdsInstances; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterAttachScriptsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.arch = request.arch;
            this.formatDisk = request.formatDisk;
            this.keepInstanceName = request.keepInstanceName;
            this.nodepoolId = request.nodepoolId;
            this.options = request.options;
            this.rdsInstances = request.rdsInstances;
        } 

        /**
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 节点CPU架构,支持amd64、arm、arm64。边缘托管集群专有字段。
         */
        public Builder arch(String arch) {
            this.putBodyParameter("arch", arch);
            this.arch = arch;
            return this;
        }

        /**
         * 数据盘挂载
         */
        public Builder formatDisk(Boolean formatDisk) {
            this.putBodyParameter("format_disk", formatDisk);
            this.formatDisk = formatDisk;
            return this;
        }

        /**
         * 保留实例名称
         */
        public Builder keepInstanceName(Boolean keepInstanceName) {
            this.putBodyParameter("keep_instance_name", keepInstanceName);
            this.keepInstanceName = keepInstanceName;
            return this;
        }

        /**
         * 节点池ID。将节点加入指定节点池。
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putBodyParameter("nodepool_id", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * 边缘托管版集群节点的接入配置。
         */
        public Builder options(String options) {
            this.putBodyParameter("options", options);
            this.options = options;
            return this;
        }

        /**
         * RDS白名单
         */
        public Builder rdsInstances(java.util.List < String > rdsInstances) {
            this.putBodyParameter("rds_instances", rdsInstances);
            this.rdsInstances = rdsInstances;
            return this;
        }

        @Override
        public DescribeClusterAttachScriptsRequest build() {
            return new DescribeClusterAttachScriptsRequest(this);
        } 

    } 

}
