// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeSlsLogstoreInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlsLogstoreInfoResponseBody</p>
 */
public class DescribeSlsLogstoreInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogStore")
    private String logStore;

    @com.aliyun.core.annotation.NameInMap("Project")
    private String project;

    @com.aliyun.core.annotation.NameInMap("Quota")
    private Long quota;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Integer ttl;

    @com.aliyun.core.annotation.NameInMap("Used")
    private Long used;

    private DescribeSlsLogstoreInfoResponseBody(Builder builder) {
        this.logStore = builder.logStore;
        this.project = builder.project;
        this.quota = builder.quota;
        this.requestId = builder.requestId;
        this.ttl = builder.ttl;
        this.used = builder.used;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlsLogstoreInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return logStore
     */
    public String getLogStore() {
        return this.logStore;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
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
        private String logStore; 
        private String project; 
        private Long quota; 
        private String requestId; 
        private Integer ttl; 
        private Long used; 

        /**
         * <p>The Logstore of the Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-logstore</p>
         */
        public Builder logStore(String logStore) {
            this.logStore = logStore;
            return this;
        }

        /**
         * <p>The Logstore project of the Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-project-181071506993****-cn-hangzhou</p>
         */
        public Builder project(String project) {
            this.project = project;
            return this;
        }

        /**
         * <p>The available log storage capacity. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>3298534883328</p>
         */
        public Builder quota(Long quota) {
            this.quota = quota;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The log storage duration. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }

        /**
         * <p>The used log storage capacity. Unit: bytes.</p>
         * <blockquote>
         * <p>The statistics on Log Service are delayed for about two hours.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder used(Long used) {
            this.used = used;
            return this;
        }

        public DescribeSlsLogstoreInfoResponseBody build() {
            return new DescribeSlsLogstoreInfoResponseBody(this);
        } 

    } 

}
