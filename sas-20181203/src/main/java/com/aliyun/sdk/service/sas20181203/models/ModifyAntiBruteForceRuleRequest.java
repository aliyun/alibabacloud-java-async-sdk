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
 * {@link ModifyAntiBruteForceRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyAntiBruteForceRuleRequest</p>
 */
public class ModifyAntiBruteForceRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultRule")
    private Boolean defaultRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailCount")
    private Integer failCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForbiddenTime")
    private Integer forbiddenTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    private ProtocolType protocolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Span")
    private Integer span;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    private java.util.List<String> uuidList;

    private ModifyAntiBruteForceRuleRequest(Builder builder) {
        super(builder);
        this.defaultRule = builder.defaultRule;
        this.failCount = builder.failCount;
        this.forbiddenTime = builder.forbiddenTime;
        this.id = builder.id;
        this.name = builder.name;
        this.protocolType = builder.protocolType;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIp = builder.sourceIp;
        this.span = builder.span;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAntiBruteForceRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultRule
     */
    public Boolean getDefaultRule() {
        return this.defaultRule;
    }

    /**
     * @return failCount
     */
    public Integer getFailCount() {
        return this.failCount;
    }

    /**
     * @return forbiddenTime
     */
    public Integer getForbiddenTime() {
        return this.forbiddenTime;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return protocolType
     */
    public ProtocolType getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return span
     */
    public Integer getSpan() {
        return this.span;
    }

    /**
     * @return uuidList
     */
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<ModifyAntiBruteForceRuleRequest, Builder> {
        private Boolean defaultRule; 
        private Integer failCount; 
        private Integer forbiddenTime; 
        private Long id; 
        private String name; 
        private ProtocolType protocolType; 
        private Long resourceOwnerId; 
        private String sourceIp; 
        private Integer span; 
        private java.util.List<String> uuidList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAntiBruteForceRuleRequest request) {
            super(request);
            this.defaultRule = request.defaultRule;
            this.failCount = request.failCount;
            this.forbiddenTime = request.forbiddenTime;
            this.id = request.id;
            this.name = request.name;
            this.protocolType = request.protocolType;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceIp = request.sourceIp;
            this.span = request.span;
            this.uuidList = request.uuidList;
        } 

        /**
         * <p>Specifies whether the defense rule against brute-force attacks is set as the default policy in Settings. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The rule is set as the default policy.</p>
         * </li>
         * <li><p><strong>false</strong>: The rule is not set as the default policy.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder defaultRule(Boolean defaultRule) {
            this.putQueryParameter("DefaultRule", defaultRule);
            this.defaultRule = defaultRule;
            return this;
        }

        /**
         * <p>The threshold for the number of logon failures. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: 2 times</li>
         * <li><strong>3</strong>: 3 times</li>
         * <li><strong>4</strong>: 4 times</li>
         * <li><strong>5</strong>: 5 times</li>
         * <li><strong>10</strong>: 10 times</li>
         * <li><strong>50</strong>: 50 times</li>
         * <li><strong>80</strong>: 80 times</li>
         * <li><strong>100</strong>: 100 times.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder failCount(Integer failCount) {
            this.putQueryParameter("FailCount", failCount);
            this.failCount = failCount;
            return this;
        }

        /**
         * <p>The duration for which logon is prohibited, in minutes. Valid values:</p>
         * <ul>
         * <li><strong>5</strong>: 5 minutes</li>
         * <li><strong>15</strong>: 15 minutes</li>
         * <li><strong>30</strong>: 30 minutes</li>
         * <li><strong>60</strong>: 1 hour</li>
         * <li><strong>120</strong>: 2 hours</li>
         * <li><strong>360</strong>: 6 hours</li>
         * <li><strong>720</strong>: 12 hours</li>
         * <li><strong>1440</strong>: 24 hours</li>
         * <li><strong>10080</strong>: 7 days</li>
         * <li><strong>52560000</strong>: permanent (100 years).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder forbiddenTime(Integer forbiddenTime) {
            this.putQueryParameter("ForbiddenTime", forbiddenTime);
            this.forbiddenTime = forbiddenTime;
            return this;
        }

        /**
         * <p>The ID of the defense rule against brute-force attacks.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>65778</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the defense rule against brute-force attacks.</p>
         * 
         * <strong>example:</strong>
         * <p>TestRule</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The protocol types that the defense rule against brute-force attacks supports for interception.</p>
         */
        public Builder protocolType(ProtocolType protocolType) {
            String protocolTypeShrink = shrink(protocolType, "ProtocolType", "json");
            this.putQueryParameter("ProtocolType", protocolTypeShrink);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The IP address of the access source.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The threshold for the period of time during which logon failures are counted, in minutes. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: 1 minute</li>
         * <li><strong>2</strong>: 2 minutes</li>
         * <li><strong>5</strong>: 5 minutes</li>
         * <li><strong>10</strong>: 10 minutes</li>
         * <li><strong>15</strong>: 15 minutes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder span(Integer span) {
            this.putQueryParameter("Span", span);
            this.span = span;
            return this;
        }

        /**
         * <p>The list of servers to which the defense rule against brute-force attacks applies.</p>
         * 
         * <strong>example:</strong>
         * <p>uuid-13213-dasda</p>
         */
        public Builder uuidList(java.util.List<String> uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public ModifyAntiBruteForceRuleRequest build() {
            return new ModifyAntiBruteForceRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyAntiBruteForceRuleRequest} extends {@link TeaModel}
     *
     * <p>ModifyAntiBruteForceRuleRequest</p>
     */
    public static class ProtocolType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rdp")
        private String rdp;

        @com.aliyun.core.annotation.NameInMap("SqlServer")
        private String sqlServer;

        @com.aliyun.core.annotation.NameInMap("Ssh")
        private String ssh;

        private ProtocolType(Builder builder) {
            this.rdp = builder.rdp;
            this.sqlServer = builder.sqlServer;
            this.ssh = builder.ssh;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProtocolType create() {
            return builder().build();
        }

        /**
         * @return rdp
         */
        public String getRdp() {
            return this.rdp;
        }

        /**
         * @return sqlServer
         */
        public String getSqlServer() {
            return this.sqlServer;
        }

        /**
         * @return ssh
         */
        public String getSsh() {
            return this.ssh;
        }

        public static final class Builder {
            private String rdp; 
            private String sqlServer; 
            private String ssh; 

            private Builder() {
            } 

            private Builder(ProtocolType model) {
                this.rdp = model.rdp;
                this.sqlServer = model.sqlServer;
                this.ssh = model.ssh;
            } 

            /**
             * <p>Specifies whether to enable RDP interception. This is enabled by default. Valid values:</p>
             * <ul>
             * <li><strong>on</strong>: enabled</li>
             * <li><strong>off</strong>: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder rdp(String rdp) {
                this.rdp = rdp;
                return this;
            }

            /**
             * <p>Specifies whether to enable SqlServer interception. This is disabled by default. Valid values:</p>
             * <ul>
             * <li><strong>on</strong>: enabled</li>
             * <li><strong>off</strong>: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder sqlServer(String sqlServer) {
                this.sqlServer = sqlServer;
                return this;
            }

            /**
             * <p>Specifies whether to enable SSH interception. This is enabled by default. Valid values:</p>
             * <ul>
             * <li><strong>on</strong>: enabled</li>
             * <li><strong>off</strong>: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder ssh(String ssh) {
                this.ssh = ssh;
                return this;
            }

            public ProtocolType build() {
                return new ProtocolType(this);
            } 

        } 

    }
}
