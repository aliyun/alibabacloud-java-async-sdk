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
 * {@link DescribeLogstoreStorageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogstoreStorageResponseBody</p>
 */
public class DescribeLogstoreStorageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Logstore")
    private String logstore;

    @com.aliyun.core.annotation.NameInMap("Preserve")
    private Long preserve;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Integer ttl;

    @com.aliyun.core.annotation.NameInMap("Used")
    private Long used;

    @com.aliyun.core.annotation.NameInMap("UserProject")
    private String userProject;

    private DescribeLogstoreStorageResponseBody(Builder builder) {
        this.logstore = builder.logstore;
        this.preserve = builder.preserve;
        this.requestId = builder.requestId;
        this.ttl = builder.ttl;
        this.used = builder.used;
        this.userProject = builder.userProject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogstoreStorageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return preserve
     */
    public Long getPreserve() {
        return this.preserve;
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

    /**
     * @return userProject
     */
    public String getUserProject() {
        return this.userProject;
    }

    public static final class Builder {
        private String logstore; 
        private Long preserve; 
        private String requestId; 
        private Integer ttl; 
        private Long used; 
        private String userProject; 

        private Builder() {
        } 

        private Builder(DescribeLogstoreStorageResponseBody model) {
            this.logstore = model.logstore;
            this.preserve = model.preserve;
            this.requestId = model.requestId;
            this.ttl = model.ttl;
            this.used = model.used;
            this.userProject = model.userProject;
        } 

        /**
         * <p>The name of the dedicated Logstore that is used to store full logs of Security Center. The value is fixed as <strong>sas-log</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-log</p>
         */
        public Builder logstore(String logstore) {
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>The purchased log storage capacity, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>12240</p>
         */
        public Builder preserve(Long preserve) {
            this.preserve = preserve;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>25EC270F-5783-4416-AD7C-1EDF063A039C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of days during which logs can be retained. The value is fixed as <strong>180</strong>, which indicates that logs can be retained for 180 days.</p>
         * <blockquote>
         * <p> You are not allowed to change the value of this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }

        /**
         * <p>The used log storage capacity, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>335</p>
         */
        public Builder used(Long used) {
            this.used = used;
            return this;
        }

        /**
         * <p>The name of the dedicated Project that is used to store full logs of Security Center.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-log-XXXX-cn-hangzhou</p>
         */
        public Builder userProject(String userProject) {
            this.userProject = userProject;
            return this;
        }

        public DescribeLogstoreStorageResponseBody build() {
            return new DescribeLogstoreStorageResponseBody(this);
        } 

    } 

}
