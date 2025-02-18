// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetComputeQuotaPlanResponseBody} extends {@link TeaModel}
 *
 * <p>GetComputeQuotaPlanResponseBody</p>
 */
public class GetComputeQuotaPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetComputeQuotaPlanResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetComputeQuotaPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpCode; 
        private String requestId; 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>QUOTA_PLAN_NOT_FOUND</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>plan &quot;***&quot; does not exist</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <ul>
         * <li>1xx: informational response. The request is received and is being processed.</li>
         * <li>2xx: success. The request is successfully received, understood, and accepted by the server.</li>
         * <li>3xx: redirection. The request is redirected, and further actions are required to complete the request.</li>
         * <li>4xx: client error. The request contains invalid request parameters or syntaxes, or specific request conditions cannot be met.</li>
         * <li>5xx: server error. The server cannot meet requirements due to other reasons.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EA1320AB-7766-5EC7-B0F6-8B20E2298567</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetComputeQuotaPlanResponseBody build() {
            return new GetComputeQuotaPlanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetComputeQuotaPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetComputeQuotaPlanResponseBody</p>
     */
    public static class Parameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("elasticReservedCU")
        private Long elasticReservedCU;

        @com.aliyun.core.annotation.NameInMap("maxCU")
        private Long maxCU;

        @com.aliyun.core.annotation.NameInMap("minCU")
        private Long minCU;

        private Parameter(Builder builder) {
            this.elasticReservedCU = builder.elasticReservedCU;
            this.maxCU = builder.maxCU;
            this.minCU = builder.minCU;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameter create() {
            return builder().build();
        }

        /**
         * @return elasticReservedCU
         */
        public Long getElasticReservedCU() {
            return this.elasticReservedCU;
        }

        /**
         * @return maxCU
         */
        public Long getMaxCU() {
            return this.maxCU;
        }

        /**
         * @return minCU
         */
        public Long getMinCU() {
            return this.minCU;
        }

        public static final class Builder {
            private Long elasticReservedCU; 
            private Long maxCU; 
            private Long minCU; 

            /**
             * <p>The value of elastic Reserved CUs.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder elasticReservedCU(Long elasticReservedCU) {
                this.elasticReservedCU = elasticReservedCU;
                return this;
            }

            /**
             * <p>The value of maxCU in Reserved CUs.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder maxCU(Long maxCU) {
                this.maxCU = maxCU;
                return this;
            }

            /**
             * <p>The value of minCU in Reserved CUs.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder minCU(Long minCU) {
                this.minCU = minCU;
                return this;
            }

            public Parameter build() {
                return new Parameter(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetComputeQuotaPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetComputeQuotaPlanResponseBody</p>
     */
    public static class SubQuotaInfoListParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("elasticReservedCU")
        private Long elasticReservedCU;

        @com.aliyun.core.annotation.NameInMap("enablePriority")
        private Boolean enablePriority;

        @com.aliyun.core.annotation.NameInMap("forceReservedMin")
        private Boolean forceReservedMin;

        @com.aliyun.core.annotation.NameInMap("maxCU")
        private Long maxCU;

        @com.aliyun.core.annotation.NameInMap("minCU")
        private Long minCU;

        @com.aliyun.core.annotation.NameInMap("schedulerType")
        private String schedulerType;

        @com.aliyun.core.annotation.NameInMap("singleJobCULimit")
        private Long singleJobCULimit;

        private SubQuotaInfoListParameter(Builder builder) {
            this.elasticReservedCU = builder.elasticReservedCU;
            this.enablePriority = builder.enablePriority;
            this.forceReservedMin = builder.forceReservedMin;
            this.maxCU = builder.maxCU;
            this.minCU = builder.minCU;
            this.schedulerType = builder.schedulerType;
            this.singleJobCULimit = builder.singleJobCULimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubQuotaInfoListParameter create() {
            return builder().build();
        }

        /**
         * @return elasticReservedCU
         */
        public Long getElasticReservedCU() {
            return this.elasticReservedCU;
        }

        /**
         * @return enablePriority
         */
        public Boolean getEnablePriority() {
            return this.enablePriority;
        }

        /**
         * @return forceReservedMin
         */
        public Boolean getForceReservedMin() {
            return this.forceReservedMin;
        }

        /**
         * @return maxCU
         */
        public Long getMaxCU() {
            return this.maxCU;
        }

        /**
         * @return minCU
         */
        public Long getMinCU() {
            return this.minCU;
        }

        /**
         * @return schedulerType
         */
        public String getSchedulerType() {
            return this.schedulerType;
        }

        /**
         * @return singleJobCULimit
         */
        public Long getSingleJobCULimit() {
            return this.singleJobCULimit;
        }

        public static final class Builder {
            private Long elasticReservedCU; 
            private Boolean enablePriority; 
            private Boolean forceReservedMin; 
            private Long maxCU; 
            private Long minCU; 
            private String schedulerType; 
            private Long singleJobCULimit; 

            /**
             * <p>The value of elastic Reserved CUs.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder elasticReservedCU(Long elasticReservedCU) {
                this.elasticReservedCU = elasticReservedCU;
                return this;
            }

            /**
             * <p>whether to enable the priority feature.</p>
             * 
             * <strong>example:</strong>
             * <p>true/false</p>
             */
            public Builder enablePriority(Boolean enablePriority) {
                this.enablePriority = enablePriority;
                return this;
            }

            /**
             * <p>Whether it is exclusive.</p>
             * 
             * <strong>example:</strong>
             * <p>true/false</p>
             */
            public Builder forceReservedMin(Boolean forceReservedMin) {
                this.forceReservedMin = forceReservedMin;
                return this;
            }

            /**
             * <p>The value of maxCU in Reserved CUs.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder maxCU(Long maxCU) {
                this.maxCU = maxCU;
                return this;
            }

            /**
             * <p>The value of minCU in Reserved CUs.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder minCU(Long minCU) {
                this.minCU = minCU;
                return this;
            }

            /**
             * <p>Scheduling policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Fifo/Fair</p>
             */
            public Builder schedulerType(String schedulerType) {
                this.schedulerType = schedulerType;
                return this;
            }

            /**
             * <p>The upper limit for CUs that can be concurrently used by a job scheduled to the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder singleJobCULimit(Long singleJobCULimit) {
                this.singleJobCULimit = singleJobCULimit;
                return this;
            }

            public SubQuotaInfoListParameter build() {
                return new SubQuotaInfoListParameter(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetComputeQuotaPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetComputeQuotaPlanResponseBody</p>
     */
    public static class SubQuotaInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster")
        private String cluster;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("creatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("parameter")
        private SubQuotaInfoListParameter parameter;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private SubQuotaInfoList(Builder builder) {
            this.cluster = builder.cluster;
            this.createTime = builder.createTime;
            this.creatorId = builder.creatorId;
            this.id = builder.id;
            this.name = builder.name;
            this.nickName = builder.nickName;
            this.parameter = builder.parameter;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubQuotaInfoList create() {
            return builder().build();
        }

        /**
         * @return cluster
         */
        public String getCluster() {
            return this.cluster;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return parameter
         */
        public SubQuotaInfoListParameter getParameter() {
            return this.parameter;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String cluster; 
            private Long createTime; 
            private String creatorId; 
            private String id; 
            private String name; 
            private String nickName; 
            private SubQuotaInfoListParameter parameter; 
            private String regionId; 
            private String status; 
            private String tenantId; 
            private String type; 
            private String version; 

            /**
             * <p>Cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>AT-120N</p>
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1718155201628</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Creator cloud account UID.</p>
             * 
             * <strong>example:</strong>
             * <p>672863518</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The ID of the level-2 quota.</p>
             * 
             * <strong>example:</strong>
             * <p>10940</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the level-2 quota.</p>
             * 
             * <strong>example:</strong>
             * <p>dp_cn_shanghai_1696659792_p</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The nickname of the level-2 quota.</p>
             * 
             * <strong>example:</strong>
             * <p>subquotaA</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>The parameters of the level-2 quota.</p>
             */
            public Builder parameter(SubQuotaInfoListParameter parameter) {
                this.parameter = parameter;
                return this;
            }

            /**
             * <p>Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Resource status.</p>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>478403690625249</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The type of quota.</p>
             * 
             * <strong>example:</strong>
             * <p>FUXI_ONLINE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1386</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public SubQuotaInfoList build() {
                return new SubQuotaInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetComputeQuotaPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetComputeQuotaPlanResponseBody</p>
     */
    public static class Quota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster")
        private String cluster;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("creatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("parameter")
        private Parameter parameter;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("subQuotaInfoList")
        private java.util.List<SubQuotaInfoList> subQuotaInfoList;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Quota(Builder builder) {
            this.cluster = builder.cluster;
            this.createTime = builder.createTime;
            this.creatorId = builder.creatorId;
            this.id = builder.id;
            this.name = builder.name;
            this.nickName = builder.nickName;
            this.parameter = builder.parameter;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.subQuotaInfoList = builder.subQuotaInfoList;
            this.tenantId = builder.tenantId;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quota create() {
            return builder().build();
        }

        /**
         * @return cluster
         */
        public String getCluster() {
            return this.cluster;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return parameter
         */
        public Parameter getParameter() {
            return this.parameter;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subQuotaInfoList
         */
        public java.util.List<SubQuotaInfoList> getSubQuotaInfoList() {
            return this.subQuotaInfoList;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String cluster; 
            private Long createTime; 
            private String creatorId; 
            private String id; 
            private String name; 
            private String nickName; 
            private Parameter parameter; 
            private String regionId; 
            private String status; 
            private java.util.List<SubQuotaInfoList> subQuotaInfoList; 
            private String tenantId; 
            private String type; 
            private String version; 

            /**
             * <p>Cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>AT-120N</p>
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1719886322347</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Creator&quot;s cloud account UID.</p>
             * 
             * <strong>example:</strong>
             * <p>672863518</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The ID of the level-1 quota.</p>
             * 
             * <strong>example:</strong>
             * <p>2413</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the level-1 quota.</p>
             * 
             * <strong>example:</strong>
             * <p>quota_a</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The nickname of the level-1 quota.</p>
             * 
             * <strong>example:</strong>
             * <p>quota_nickname</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>CU value parameters for the level-1 quota.</p>
             */
            public Builder parameter(Parameter parameter) {
                this.parameter = parameter;
                return this;
            }

            /**
             * <p>Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Resource status.</p>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of level-2 quotas.</p>
             */
            public Builder subQuotaInfoList(java.util.List<SubQuotaInfoList> subQuotaInfoList) {
                this.subQuotaInfoList = subQuotaInfoList;
                return this;
            }

            /**
             * <p>Tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>478403690625249</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>Corresponds to the <code>resourceSystemType</code> field of the control cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>FUXI_ONLINE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1964</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetComputeQuotaPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetComputeQuotaPlanResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("isEffective")
        private Boolean isEffective;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("quota")
        private Quota quota;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.isEffective = builder.isEffective;
            this.name = builder.name;
            this.quota = builder.quota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return isEffective
         */
        public Boolean getIsEffective() {
            return this.isEffective;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return quota
         */
        public Quota getQuota() {
            return this.quota;
        }

        public static final class Builder {
            private String createTime; 
            private Boolean isEffective; 
            private String name; 
            private Quota quota; 

            /**
             * <p>The time when the quota plan was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1730946421757</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Whether it is currently effective.</p>
             * <blockquote>
             * <ul>
             * <li>A Quota plan that has taken effect cannot be deleted, i.e., isEffective=true</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true/false</p>
             */
            public Builder isEffective(Boolean isEffective) {
                this.isEffective = isEffective;
                return this;
            }

            /**
             * <p>The name of the quota plan.</p>
             * 
             * <strong>example:</strong>
             * <p>planA</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The details of the quota.</p>
             */
            public Builder quota(Quota quota) {
                this.quota = quota;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
