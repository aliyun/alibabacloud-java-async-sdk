// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlsLogStoreResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlsLogStoreResponseBody</p>
 */
public class DescribeSlsLogStoreResponseBody extends TeaModel {
    @NameInMap("LogStoreName")
    private String logStoreName;

    @NameInMap("ProjectName")
    private String projectName;

    @NameInMap("Quota")
    private Long quota;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Ttl")
    private Integer ttl;

    @NameInMap("Used")
    private Long used;

    private DescribeSlsLogStoreResponseBody(Builder builder) {
        this.logStoreName = builder.logStoreName;
        this.projectName = builder.projectName;
        this.quota = builder.quota;
        this.requestId = builder.requestId;
        this.ttl = builder.ttl;
        this.used = builder.used;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlsLogStoreResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private Integer ttl; 
        private Long used; 

        /**
         * LogStoreName.
         */
        public Builder logStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * Quota.
         */
        public Builder quota(Long quota) {
            this.quota = quota;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Ttl.
         */
        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }

        /**
         * Used.
         */
        public Builder used(Long used) {
            this.used = used;
            return this;
        }

        public DescribeSlsLogStoreResponseBody build() {
            return new DescribeSlsLogStoreResponseBody(this);
        } 

    } 

}
