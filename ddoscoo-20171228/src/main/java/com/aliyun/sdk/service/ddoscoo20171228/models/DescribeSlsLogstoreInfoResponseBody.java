// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeSlsLogstoreInfoResponseBody model) {
            this.logStore = model.logStore;
            this.project = model.project;
            this.quota = model.quota;
            this.requestId = model.requestId;
            this.ttl = model.ttl;
            this.used = model.used;
        } 

        /**
         * LogStore.
         */
        public Builder logStore(String logStore) {
            this.logStore = logStore;
            return this;
        }

        /**
         * Project.
         */
        public Builder project(String project) {
            this.project = project;
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

        public DescribeSlsLogstoreInfoResponseBody build() {
            return new DescribeSlsLogstoreInfoResponseBody(this);
        } 

    } 

}
