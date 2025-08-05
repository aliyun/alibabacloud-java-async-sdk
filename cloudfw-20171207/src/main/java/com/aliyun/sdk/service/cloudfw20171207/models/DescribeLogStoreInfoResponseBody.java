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
    @com.aliyun.core.annotation.NameInMap("LogStoreName")
    private String logStoreName;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("Quota")
    private Long quota;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Integer ttl;

    @com.aliyun.core.annotation.NameInMap("Used")
    private Long used;

    private DescribeLogStoreInfoResponseBody(Builder builder) {
        this.logStoreName = builder.logStoreName;
        this.projectName = builder.projectName;
        this.quota = builder.quota;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
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
     * @return logStoreName
     */
    public String getLogStoreName() {
        return this.logStoreName;
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
        private String projectName; 
        private Long quota; 
        private String regionId; 
        private String requestId; 
        private Integer ttl; 
        private Long used; 

        private Builder() {
        } 

        private Builder(DescribeLogStoreInfoResponseBody model) {
            this.logStoreName = model.logStoreName;
            this.projectName = model.projectName;
            this.quota = model.quota;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
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

}
