// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeSlsLogStoreResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlsLogStoreResponseBody</p>
 */
public class DescribeSlsLogStoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogStoreName")
    private String logStoreName;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("Quota")
    private Long quota;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Integer ttl;

    @com.aliyun.core.annotation.NameInMap("Used")
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
         * <p>The name of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>wafng-logstore</p>
         */
        public Builder logStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }

        /**
         * <p>The name of the Simple Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>wafng-project-14316572********-cn-hangzhou</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The capacity of the Logstore. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>3298534883328</p>
         */
        public Builder quota(Long quota) {
            this.quota = quota;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CAC0A24B-486A-5E12-9894-BE860E5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The storage duration of the Logstore. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }

        /**
         * <p>The used capacity of the Logstore. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>35471136</p>
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
