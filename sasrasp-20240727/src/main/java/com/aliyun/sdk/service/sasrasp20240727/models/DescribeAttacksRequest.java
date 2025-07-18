// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sasrasp20240727.models;

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
 * {@link DescribeAttacksRequest} extends {@link RequestModel}
 *
 * <p>DescribeAttacksRequest</p>
 */
public class DescribeAttacksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentType")
    private String agentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackHostId")
    private String attackHostId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackType")
    private String attackType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackUrl")
    private String attackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HandlerType")
    private String handlerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hostname")
    private String hostname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RaspType")
    private String raspType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remote")
    private String remote;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Severity")
    private String severity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnionId")
    private String unionId;

    private DescribeAttacksRequest(Builder builder) {
        super(builder);
        this.agentType = builder.agentType;
        this.applicationId = builder.applicationId;
        this.attackHostId = builder.attackHostId;
        this.attackType = builder.attackType;
        this.attackUrl = builder.attackUrl;
        this.endTimestamp = builder.endTimestamp;
        this.handlerType = builder.handlerType;
        this.hostname = builder.hostname;
        this.ip = builder.ip;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pid = builder.pid;
        this.raspType = builder.raspType;
        this.region = builder.region;
        this.remote = builder.remote;
        this.severity = builder.severity;
        this.startTimestamp = builder.startTimestamp;
        this.unionId = builder.unionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAttacksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentType
     */
    public String getAgentType() {
        return this.agentType;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return attackHostId
     */
    public String getAttackHostId() {
        return this.attackHostId;
    }

    /**
     * @return attackType
     */
    public String getAttackType() {
        return this.attackType;
    }

    /**
     * @return attackUrl
     */
    public String getAttackUrl() {
        return this.attackUrl;
    }

    /**
     * @return endTimestamp
     */
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @return handlerType
     */
    public String getHandlerType() {
        return this.handlerType;
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return raspType
     */
    public String getRaspType() {
        return this.raspType;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return remote
     */
    public String getRemote() {
        return this.remote;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return startTimestamp
     */
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * @return unionId
     */
    public String getUnionId() {
        return this.unionId;
    }

    public static final class Builder extends Request.Builder<DescribeAttacksRequest, Builder> {
        private String agentType; 
        private String applicationId; 
        private String attackHostId; 
        private String attackType; 
        private String attackUrl; 
        private Long endTimestamp; 
        private String handlerType; 
        private String hostname; 
        private String ip; 
        private String lang; 
        private Long pageNumber; 
        private Long pageSize; 
        private String pid; 
        private String raspType; 
        private String region; 
        private String remote; 
        private String severity; 
        private Long startTimestamp; 
        private String unionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAttacksRequest request) {
            super(request);
            this.agentType = request.agentType;
            this.applicationId = request.applicationId;
            this.attackHostId = request.attackHostId;
            this.attackType = request.attackType;
            this.attackUrl = request.attackUrl;
            this.endTimestamp = request.endTimestamp;
            this.handlerType = request.handlerType;
            this.hostname = request.hostname;
            this.ip = request.ip;
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.pid = request.pid;
            this.raspType = request.raspType;
            this.region = request.region;
            this.remote = request.remote;
            this.severity = request.severity;
            this.startTimestamp = request.startTimestamp;
            this.unionId = request.unionId;
        } 

        /**
         * AgentType.
         */
        public Builder agentType(String agentType) {
            this.putQueryParameter("AgentType", agentType);
            this.agentType = agentType;
            return this;
        }

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * AttackHostId.
         */
        public Builder attackHostId(String attackHostId) {
            this.putQueryParameter("AttackHostId", attackHostId);
            this.attackHostId = attackHostId;
            return this;
        }

        /**
         * AttackType.
         */
        public Builder attackType(String attackType) {
            this.putQueryParameter("AttackType", attackType);
            this.attackType = attackType;
            return this;
        }

        /**
         * AttackUrl.
         */
        public Builder attackUrl(String attackUrl) {
            this.putQueryParameter("AttackUrl", attackUrl);
            this.attackUrl = attackUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1737216000000</p>
         */
        public Builder endTimestamp(Long endTimestamp) {
            this.putQueryParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * HandlerType.
         */
        public Builder handlerType(String handlerType) {
            this.putQueryParameter("HandlerType", handlerType);
            this.handlerType = handlerType;
            return this;
        }

        /**
         * Hostname.
         */
        public Builder hostname(String hostname) {
            this.putQueryParameter("Hostname", hostname);
            this.hostname = hostname;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Pid.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * RaspType.
         */
        public Builder raspType(String raspType) {
            this.putQueryParameter("RaspType", raspType);
            this.raspType = raspType;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * Remote.
         */
        public Builder remote(String remote) {
            this.putQueryParameter("Remote", remote);
            this.remote = remote;
            return this;
        }

        /**
         * Severity.
         */
        public Builder severity(String severity) {
            this.putQueryParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1727281449756</p>
         */
        public Builder startTimestamp(Long startTimestamp) {
            this.putQueryParameter("StartTimestamp", startTimestamp);
            this.startTimestamp = startTimestamp;
            return this;
        }

        /**
         * UnionId.
         */
        public Builder unionId(String unionId) {
            this.putQueryParameter("UnionId", unionId);
            this.unionId = unionId;
            return this;
        }

        @Override
        public DescribeAttacksRequest build() {
            return new DescribeAttacksRequest(this);
        } 

    } 

}
