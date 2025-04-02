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

    @com.aliyun.core.annotation.NameInMap("PodUid")
    private String podUid;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SubStatus")
    private String subStatus;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private PodItem(Builder builder) {
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtFinishTime = builder.gmtFinishTime;
        this.gmtStartTime = builder.gmtStartTime;
        this.historyPods = builder.historyPods;
        this.ip = builder.ip;
        this.nodeName = builder.nodeName;
        this.podId = builder.podId;
        this.podUid = builder.podUid;
        this.status = builder.status;
        this.subStatus = builder.subStatus;
        this.type = builder.type;
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

    public static final class Builder {
        private String gmtCreateTime; 
        private String gmtFinishTime; 
        private String gmtStartTime; 
        private java.util.List<PodItem> historyPods; 
        private String ip; 
        private String nodeName; 
        private String podId; 
        private String podUid; 
        private String status; 
        private String subStatus; 
        private String type; 

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
            this.podUid = model.podUid;
            this.status = model.status;
            this.subStatus = model.subStatus;
            this.type = model.type;
        } 

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtFinishTime.
         */
        public Builder gmtFinishTime(String gmtFinishTime) {
            this.gmtFinishTime = gmtFinishTime;
            return this;
        }

        /**
         * GmtStartTime.
         */
        public Builder gmtStartTime(String gmtStartTime) {
            this.gmtStartTime = gmtStartTime;
            return this;
        }

        /**
         * HistoryPods.
         */
        public Builder historyPods(java.util.List<PodItem> historyPods) {
            this.historyPods = historyPods;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.ip = ip;
            return this;
        }

        /**
         * NodeName.
         */
        public Builder nodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        /**
         * PodId.
         */
        public Builder podId(String podId) {
            this.podId = podId;
            return this;
        }

        /**
         * PodUid.
         */
        public Builder podUid(String podUid) {
            this.podUid = podUid;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SubStatus.
         */
        public Builder subStatus(String subStatus) {
            this.subStatus = subStatus;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public PodItem build() {
            return new PodItem(this);
        } 

    } 

}
