// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link RiskCheckResults} extends {@link TeaModel}
 *
 * <p>RiskCheckResults</p>
 */
public class RiskCheckResults extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("checkTime")
    private Long checkTime;

    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("metadata")
    private Metadata metadata;

    @com.aliyun.core.annotation.NameInMap("riskDetails")
    private java.util.List<RiskDetails> riskDetails;

    @com.aliyun.core.annotation.NameInMap("riskLevel")
    private String riskLevel;

    @com.aliyun.core.annotation.NameInMap("score")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer score;

    @com.aliyun.core.annotation.NameInMap("snapshotTime")
    private Long snapshotTime;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("totalRisk")
    private Integer totalRisk;

    private RiskCheckResults(Builder builder) {
        this.checkTime = builder.checkTime;
        this.gatewayId = builder.gatewayId;
        this.metadata = builder.metadata;
        this.riskDetails = builder.riskDetails;
        this.riskLevel = builder.riskLevel;
        this.score = builder.score;
        this.snapshotTime = builder.snapshotTime;
        this.status = builder.status;
        this.totalRisk = builder.totalRisk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RiskCheckResults create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkTime
     */
    public Long getCheckTime() {
        return this.checkTime;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return metadata
     */
    public Metadata getMetadata() {
        return this.metadata;
    }

    /**
     * @return riskDetails
     */
    public java.util.List<RiskDetails> getRiskDetails() {
        return this.riskDetails;
    }

    /**
     * @return riskLevel
     */
    public String getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return score
     */
    public Integer getScore() {
        return this.score;
    }

    /**
     * @return snapshotTime
     */
    public Long getSnapshotTime() {
        return this.snapshotTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalRisk
     */
    public Integer getTotalRisk() {
        return this.totalRisk;
    }

    public static final class Builder {
        private Long checkTime; 
        private String gatewayId; 
        private Metadata metadata; 
        private java.util.List<RiskDetails> riskDetails; 
        private String riskLevel; 
        private Integer score; 
        private Long snapshotTime; 
        private String status; 
        private Integer totalRisk; 

        private Builder() {
        } 

        private Builder(RiskCheckResults model) {
            this.checkTime = model.checkTime;
            this.gatewayId = model.gatewayId;
            this.metadata = model.metadata;
            this.riskDetails = model.riskDetails;
            this.riskLevel = model.riskLevel;
            this.score = model.score;
            this.snapshotTime = model.snapshotTime;
            this.status = model.status;
            this.totalRisk = model.totalRisk;
        } 

        /**
         * checkTime.
         */
        public Builder checkTime(Long checkTime) {
            this.checkTime = checkTime;
            return this;
        }

        /**
         * <p>网关实例的唯一标识符</p>
         * 
         * <strong>example:</strong>
         * <p>gw-0364f863b1a04474911b48cd6d51d03d</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>实例的基本信息</p>
         */
        public Builder metadata(Metadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>详细的风险项信息列表</p>
         */
        public Builder riskDetails(java.util.List<RiskDetails> riskDetails) {
            this.riskDetails = riskDetails;
            return this;
        }

        /**
         * <p>整体风险等级，可选值：LOW（低风险）、MEDIUM（中风险）、HIGH（高风险）、CRITICAL（严重风险）</p>
         * 
         * <strong>example:</strong>
         * <p>MEDIUM</p>
         */
        public Builder riskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * <p>风险综合评分，取值范围0-100分，分数越高表示风险越低</p>
         * 
         * <strong>example:</strong>
         * <p>85</p>
         */
        public Builder score(Integer score) {
            this.score = score;
            return this;
        }

        /**
         * snapshotTime.
         */
        public Builder snapshotTime(Long snapshotTime) {
            this.snapshotTime = snapshotTime;
            return this;
        }

        /**
         * <p>风险检测状态，可选值：SUCCESS（成功）、FAIL（失败）、RUNNING（运行中）</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>检测到的风险项总数量</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRisk(Integer totalRisk) {
            this.totalRisk = totalRisk;
            return this;
        }

        public RiskCheckResults build() {
            return new RiskCheckResults(this);
        } 

    } 

    /**
     * 
     * {@link RiskCheckResults} extends {@link TeaModel}
     *
     * <p>RiskCheckResults</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("replica")
        private Integer replica;

        @com.aliyun.core.annotation.NameInMap("spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Metadata(Builder builder) {
            this.clusterType = builder.clusterType;
            this.replica = builder.replica;
            this.spec = builder.spec;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return replica
         */
        public Integer getReplica() {
            return this.replica;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String clusterType; 
            private Integer replica; 
            private String spec; 
            private String version; 

            private Builder() {
            } 

            private Builder(Metadata model) {
                this.clusterType = model.clusterType;
                this.replica = model.replica;
                this.spec = model.spec;
                this.version = model.version;
            } 

            /**
             * clusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * replica.
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            /**
             * spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link RiskCheckResults} extends {@link TeaModel}
     *
     * <p>RiskCheckResults</p>
     */
    public static class RiskDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkModule")
        private String checkModule;

        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.Map<String, String> data;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("isNoticeMute")
        private Boolean isNoticeMute;

        @com.aliyun.core.annotation.NameInMap("riskCode")
        private String riskCode;

        @com.aliyun.core.annotation.NameInMap("riskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("riskName")
        private String riskName;

        @com.aliyun.core.annotation.NameInMap("riskType")
        private String riskType;

        @com.aliyun.core.annotation.NameInMap("situation")
        private String situation;

        @com.aliyun.core.annotation.NameInMap("suggestion")
        private String suggestion;

        private RiskDetails(Builder builder) {
            this.checkModule = builder.checkModule;
            this.data = builder.data;
            this.description = builder.description;
            this.isNoticeMute = builder.isNoticeMute;
            this.riskCode = builder.riskCode;
            this.riskLevel = builder.riskLevel;
            this.riskName = builder.riskName;
            this.riskType = builder.riskType;
            this.situation = builder.situation;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskDetails create() {
            return builder().build();
        }

        /**
         * @return checkModule
         */
        public String getCheckModule() {
            return this.checkModule;
        }

        /**
         * @return data
         */
        public java.util.Map<String, String> getData() {
            return this.data;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return isNoticeMute
         */
        public Boolean getIsNoticeMute() {
            return this.isNoticeMute;
        }

        /**
         * @return riskCode
         */
        public String getRiskCode() {
            return this.riskCode;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return riskName
         */
        public String getRiskName() {
            return this.riskName;
        }

        /**
         * @return riskType
         */
        public String getRiskType() {
            return this.riskType;
        }

        /**
         * @return situation
         */
        public String getSituation() {
            return this.situation;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String checkModule; 
            private java.util.Map<String, String> data; 
            private String description; 
            private Boolean isNoticeMute; 
            private String riskCode; 
            private String riskLevel; 
            private String riskName; 
            private String riskType; 
            private String situation; 
            private String suggestion; 

            private Builder() {
            } 

            private Builder(RiskDetails model) {
                this.checkModule = model.checkModule;
                this.data = model.data;
                this.description = model.description;
                this.isNoticeMute = model.isNoticeMute;
                this.riskCode = model.riskCode;
                this.riskLevel = model.riskLevel;
                this.riskName = model.riskName;
                this.riskType = model.riskType;
                this.situation = model.situation;
                this.suggestion = model.suggestion;
            } 

            /**
             * <p>执行检测的模块名称</p>
             * 
             * <strong>example:</strong>
             * <p>BaseInfo</p>
             */
            public Builder checkModule(String checkModule) {
                this.checkModule = checkModule;
                return this;
            }

            /**
             * <p>风险相关的详细数据，不同风险类型数据结构不同</p>
             */
            public Builder data(java.util.Map<String, String> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>风险的详细描述，JSON字符串格式</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;desc&quot;:&quot;单节点实例存在架构风险，单点故障会导致服务不可用。建议扩容到2节点及以上。&quot;}</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>该风险项的告警通知是否已被屏蔽</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isNoticeMute(Boolean isNoticeMute) {
                this.isNoticeMute = isNoticeMute;
                return this;
            }

            /**
             * <p>风险项的唯一标识码</p>
             * 
             * <strong>example:</strong>
             * <p>30010010001</p>
             */
            public Builder riskCode(String riskCode) {
                this.riskCode = riskCode;
                return this;
            }

            /**
             * <p>该风险项的等级，可选值：LOW、MEDIUM、HIGH、CRITICAL</p>
             * 
             * <strong>example:</strong>
             * <p>HIGH</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>风险项的名称</p>
             * 
             * <strong>example:</strong>
             * <p>单节点架构风险</p>
             */
            public Builder riskName(String riskName) {
                this.riskName = riskName;
                return this;
            }

            /**
             * <p>风险分类，可选值：SYSTEM（系统风险）、VERSION（版本风险）、SAFE（安全风险）、CAPACITY（容量风险）</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder riskType(String riskType) {
                this.riskType = riskType;
                return this;
            }

            /**
             * <p>当前实例的风险现状，JSON字符串格式</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;desc&quot;:&quot;集群节点数为1，不具备高可用能力&quot;}</p>
             */
            public Builder situation(String situation) {
                this.situation = situation;
                return this;
            }

            /**
             * <p>针对该风险的优化建议，JSON字符串格式，包含描述和操作链接</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;desc&quot;:&quot;扩容到2节点及以上&quot;,&quot;links&quot;:[{&quot;descEn&quot;:&quot;click to upgrade specification&quot;,&quot;type&quot;:&quot;upgrade&quot;,&quot;desc&quot;:&quot;点击扩容&quot;}]}</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public RiskDetails build() {
                return new RiskDetails(this);
            } 

        } 

    }
}
