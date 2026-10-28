// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link PodItem} extends {@link TeaModel}
 *
 * <p>PodItem</p>
 */
public class PodItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtFinishTime")
    private String gmtFinishTime;

    @com.aliyun.core.annotation.NameInMap("GmtStartTime")
    private String gmtStartTime;

    @com.aliyun.core.annotation.NameInMap("HistoryPods")
    private java.util.List<PodItem> historyPods;

    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.NameInMap("NodeName")
    private String nodeName;

    @com.aliyun.core.annotation.NameInMap("PodId")
    private String podId;

    @com.aliyun.core.annotation.NameInMap("PodIp")
    private String podIp;

    @com.aliyun.core.annotation.NameInMap("PodIps")
    private java.util.List<PodNetworkInterface> podIps;

    @com.aliyun.core.annotation.NameInMap("PodUid")
    private String podUid;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SubStatus")
    private String subStatus;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("supportedProfilingTypes")
    private String supportedProfilingTypes;

    private PodItem(Builder builder) {
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtFinishTime = builder.gmtFinishTime;
        this.gmtStartTime = builder.gmtStartTime;
        this.historyPods = builder.historyPods;
        this.ip = builder.ip;
        this.nodeName = builder.nodeName;
        this.podId = builder.podId;
        this.podIp = builder.podIp;
        this.podIps = builder.podIps;
        this.podUid = builder.podUid;
        this.status = builder.status;
        this.subStatus = builder.subStatus;
        this.type = builder.type;
        this.supportedProfilingTypes = builder.supportedProfilingTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PodItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtFinishTime
     */
    public String getGmtFinishTime() {
        return this.gmtFinishTime;
    }

    /**
     * @return gmtStartTime
     */
    public String getGmtStartTime() {
        return this.gmtStartTime;
    }

    /**
     * @return historyPods
     */
    public java.util.List<PodItem> getHistoryPods() {
        return this.historyPods;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return podId
     */
    public String getPodId() {
        return this.podId;
    }

    /**
     * @return podIp
     */
    public String getPodIp() {
        return this.podIp;
    }

    /**
     * @return podIps
     */
    public java.util.List<PodNetworkInterface> getPodIps() {
        return this.podIps;
    }

    /**
     * @return podUid
     */
    public String getPodUid() {
        return this.podUid;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subStatus
     */
    public String getSubStatus() {
        return this.subStatus;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return supportedProfilingTypes
     */
    public String getSupportedProfilingTypes() {
        return this.supportedProfilingTypes;
    }

    public static final class Builder {
        private String gmtCreateTime; 
        private String gmtFinishTime; 
        private String gmtStartTime; 
        private java.util.List<PodItem> historyPods; 
        private String ip; 
        private String nodeName; 
        private String podId; 
        private String podIp; 
        private java.util.List<PodNetworkInterface> podIps; 
        private String podUid; 
        private String status; 
        private String subStatus; 
        private String type; 
        private String supportedProfilingTypes; 

        private Builder() {
        } 

        private Builder(PodItem model) {
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtFinishTime = model.gmtFinishTime;
            this.gmtStartTime = model.gmtStartTime;
            this.historyPods = model.historyPods;
            this.ip = model.ip;
            this.nodeName = model.nodeName;
            this.podId = model.podId;
            this.podIp = model.podIp;
            this.podIps = model.podIps;
            this.podUid = model.podUid;
            this.status = model.status;
            this.subStatus = model.subStatus;
            this.type = model.type;
            this.supportedProfilingTypes = model.supportedProfilingTypes;
        } 

        /**
         * <p>The time when the pod was created (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The time when the pod was completed (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T15:36:05Z</p>
         */
        public Builder gmtFinishTime(String gmtFinishTime) {
            this.gmtFinishTime = gmtFinishTime;
            return this;
        }

        /**
         * <p>The time when the pod was started (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:05Z</p>
         */
        public Builder gmtStartTime(String gmtStartTime) {
            this.gmtStartTime = gmtStartTime;
            return this;
        }

        /**
         * <p>The historical pods.</p>
         */
        public Builder historyPods(java.util.List<PodItem> historyPods) {
            this.historyPods = historyPods;
            return this;
        }

        /**
         * <p>Pod Ip</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.1.2</p>
         */
        public Builder ip(String ip) {
            this.ip = ip;
            return this;
        }

        /**
         * <p>The name of the compute node where the pod is located.</p>
         * 
         * <strong>example:</strong>
         * <p>i-a</p>
         */
        public Builder nodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        /**
         * <p>Pod Id</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-20210126170216-mtl37ge7gkvdz-worker-0</p>
         */
        public Builder podId(String podId) {
            this.podId = podId;
            return this;
        }

        /**
         * <p>The IP address of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.1.2</p>
         */
        public Builder podIp(String podIp) {
            this.podIp = podIp;
            return this;
        }

        /**
         * <p>The IP addresses of the pod. For Lingjun AI Computing Service: user VPC net0, management VPC net, and pod-to-pod communication ethx. For general-purpose computing: user VPC eth1 with dedicated gateway default route, management VPC eth0 with public gateway default route, and pod-to-pod communication net eRDMA.</p>
         */
        public Builder podIps(java.util.List<PodNetworkInterface> podIps) {
            this.podIps = podIps;
            return this;
        }

        /**
         * <p>Pod Uid</p>
         * 
         * <strong>example:</strong>
         * <p>fe846462-af2c-4521-bd6f-96787a57591d</p>
         */
        public Builder podUid(String podUid) {
            this.podUid = podUid;
            return this;
        }

        /**
         * <p>The status of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>Stopped</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The substatus of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>Restarting</p>
         */
        public Builder subStatus(String subStatus) {
            this.subStatus = subStatus;
            return this;
        }

        /**
         * <p>The type of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>Worker</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The list of supported profiling types, separated by commas, such as sysom. An empty string indicates that profiling is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>sysom</p>
         */
        public Builder supportedProfilingTypes(String supportedProfilingTypes) {
            this.supportedProfilingTypes = supportedProfilingTypes;
            return this;
        }

        public PodItem build() {
            return new PodItem(this);
        } 

    } 

}
