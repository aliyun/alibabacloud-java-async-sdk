// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeLogStoreInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogStoreInfoResponseBody</p>
 */
public class DescribeLogStoreInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InfoList")
    private java.util.List<InfoList> infoList;

    @com.aliyun.core.annotation.NameInMap("LogModifyQuota")
    private Integer logModifyQuota;

    @com.aliyun.core.annotation.NameInMap("LogStoreName")
    private String logStoreName;

    @com.aliyun.core.annotation.NameInMap("LogVersion")
    private Integer logVersion;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("Quota")
    private Long quota;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TotalQuota")
    private Long totalQuota;

    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Integer ttl;

    @com.aliyun.core.annotation.NameInMap("Used")
    private Long used;

    private DescribeLogStoreInfoResponseBody(Builder builder) {
        this.infoList = builder.infoList;
        this.logModifyQuota = builder.logModifyQuota;
        this.logStoreName = builder.logStoreName;
        this.logVersion = builder.logVersion;
        this.projectName = builder.projectName;
        this.quota = builder.quota;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
        this.totalQuota = builder.totalQuota;
        this.ttl = builder.ttl;
        this.used = builder.used;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogStoreInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return infoList
     */
    public java.util.List<InfoList> getInfoList() {
        return this.infoList;
    }

    /**
     * @return logModifyQuota
     */
    public Integer getLogModifyQuota() {
        return this.logModifyQuota;
    }

    /**
     * @return logStoreName
     */
    public String getLogStoreName() {
        return this.logStoreName;
    }

    /**
     * @return logVersion
     */
    public Integer getLogVersion() {
        return this.logVersion;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return quota
     */
    public Long getQuota() {
        return this.quota;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return totalQuota
     */
    public Long getTotalQuota() {
        return this.totalQuota;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    /**
     * @return used
     */
    public Long getUsed() {
        return this.used;
    }

    public static final class Builder {
        private java.util.List<InfoList> infoList; 
        private Integer logModifyQuota; 
        private String logStoreName; 
        private Integer logVersion; 
        private String projectName; 
        private Long quota; 
        private String regionId; 
        private String requestId; 
        private String taskId; 
        private Long totalQuota; 
        private Integer ttl; 
        private Long used; 

        private Builder() {
        } 

        private Builder(DescribeLogStoreInfoResponseBody model) {
            this.infoList = model.infoList;
            this.logModifyQuota = model.logModifyQuota;
            this.logStoreName = model.logStoreName;
            this.logVersion = model.logVersion;
            this.projectName = model.projectName;
            this.quota = model.quota;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
            this.totalQuota = model.totalQuota;
            this.ttl = model.ttl;
            this.used = model.used;
        } 

        /**
         * InfoList.
         */
        public Builder infoList(java.util.List<InfoList> infoList) {
            this.infoList = infoList;
            return this;
        }

        /**
         * LogModifyQuota.
         */
        public Builder logModifyQuota(Integer logModifyQuota) {
            this.logModifyQuota = logModifyQuota;
            return this;
        }

        /**
         * <p>The name of the SLS LogStore in the log service.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx-logstore</p>
         */
        public Builder logStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }

        /**
         * LogVersion.
         */
        public Builder logVersion(Integer logVersion) {
            this.logVersion = logVersion;
            return this;
        }

        /**
         * <p>The Project name of the log service.</p>
         * 
         * <strong>example:</strong>
         * <p>project-xxx-cn-hangzhou</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>Available log storage capacity. Unit: Byte.</p>
         * 
         * <strong>example:</strong>
         * <p>50000000</p>
         */
        public Builder quota(Long quota) {
            this.quota = quota;
            return this;
        }

        /**
         * <p>The region ID for log delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>C6C3B72B********E95FB0A161</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TotalQuota.
         */
        public Builder totalQuota(Long totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }

        /**
         * <p>Log storage duration. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }

        /**
         * <p>Used storage capacity. Unit: Byte.</p>
         * <blockquote>
         * <p>The statistics of the log service have a delay of approximately two hours.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder used(Long used) {
            this.used = used;
            return this;
        }

        public DescribeLogStoreInfoResponseBody build() {
            return new DescribeLogStoreInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLogStoreInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogStoreInfoResponseBody</p>
     */
    public static class InfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("MaxSplitShard")
        private Integer maxSplitShard;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("Quota")
        private Long quota;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Shard")
        private Integer shard;

        @com.aliyun.core.annotation.NameInMap("Site")
        private String site;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Integer ttl;

        @com.aliyun.core.annotation.NameInMap("Used")
        private Long used;

        private InfoList(Builder builder) {
            this.logStoreName = builder.logStoreName;
            this.maxSplitShard = builder.maxSplitShard;
            this.projectName = builder.projectName;
            this.quota = builder.quota;
            this.regionId = builder.regionId;
            this.shard = builder.shard;
            this.site = builder.site;
            this.ttl = builder.ttl;
            this.used = builder.used;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InfoList create() {
            return builder().build();
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return maxSplitShard
         */
        public Integer getMaxSplitShard() {
            return this.maxSplitShard;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return quota
         */
        public Long getQuota() {
            return this.quota;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return shard
         */
        public Integer getShard() {
            return this.shard;
        }

        /**
         * @return site
         */
        public String getSite() {
            return this.site;
        }

        /**
         * @return ttl
         */
        public Integer getTtl() {
            return this.ttl;
        }

        /**
         * @return used
         */
        public Long getUsed() {
            return this.used;
        }

        public static final class Builder {
            private String logStoreName; 
            private Integer maxSplitShard; 
            private String projectName; 
            private Long quota; 
            private String regionId; 
            private Integer shard; 
            private String site; 
            private Integer ttl; 
            private Long used; 

            private Builder() {
            } 

            private Builder(InfoList model) {
                this.logStoreName = model.logStoreName;
                this.maxSplitShard = model.maxSplitShard;
                this.projectName = model.projectName;
                this.quota = model.quota;
                this.regionId = model.regionId;
                this.shard = model.shard;
                this.site = model.site;
                this.ttl = model.ttl;
                this.used = model.used;
            } 

            /**
             * <p>The name of the SLS LogStore in the log service.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx-logstore</p>
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * MaxSplitShard.
             */
            public Builder maxSplitShard(Integer maxSplitShard) {
                this.maxSplitShard = maxSplitShard;
                return this;
            }

            /**
             * <p>The Project name of the log service.</p>
             * 
             * <strong>example:</strong>
             * <p>project-xxx-cn-hangzhou</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>Available log storage capacity. Unit: Byte.</p>
             * 
             * <strong>example:</strong>
             * <p>50000000</p>
             */
            public Builder quota(Long quota) {
                this.quota = quota;
                return this;
            }

            /**
             * <p>The region ID for log delivery.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Shard.
             */
            public Builder shard(Integer shard) {
                this.shard = shard;
                return this;
            }

            /**
             * Site.
             */
            public Builder site(String site) {
                this.site = site;
                return this;
            }

            /**
             * <p>Log storage duration. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * <p>Used storage capacity. Unit: Byte.</p>
             * <blockquote>
             * <p>The statistics of the log service have a delay of approximately two hours.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder used(Long used) {
                this.used = used;
                return this;
            }

            public InfoList build() {
                return new InfoList(this);
            } 

        } 

    }
}
