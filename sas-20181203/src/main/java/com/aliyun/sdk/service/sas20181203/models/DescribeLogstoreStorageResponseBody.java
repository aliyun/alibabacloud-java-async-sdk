// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogstoreStorageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogstoreStorageResponseBody</p>
 */
public class DescribeLogstoreStorageResponseBody extends TeaModel {
    @NameInMap("Logstore")
    private String logstore;

    @NameInMap("Preserve")
    private Long preserve;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Ttl")
    private Integer ttl;

    @NameInMap("Used")
    private Long used;

    @NameInMap("UserProject")
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

        /**
         * The name of the dedicated Logstore that is used to store full logs of Security Center. The value is fixed as **sas-log**.
         */
        public Builder logstore(String logstore) {
            this.logstore = logstore;
            return this;
        }

        /**
         * The purchased log storage capacity, in GB.
         */
        public Builder preserve(Long preserve) {
            this.preserve = preserve;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of days during which logs can be retained. The value is fixed as **180**, which indicates that logs can be retained for 180 days.
         * <p>
         * 
         * >  You are not allowed to change the value of this parameter.
         */
        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }

        /**
         * The used log storage capacity, in GB.
         */
        public Builder used(Long used) {
            this.used = used;
            return this;
        }

        /**
         * The name of the dedicated Project that is used to store full logs of Security Center.
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
