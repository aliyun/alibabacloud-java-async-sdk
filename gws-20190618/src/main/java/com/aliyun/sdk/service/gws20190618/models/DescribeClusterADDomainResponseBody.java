// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterADDomainResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterADDomainResponseBody</p>
 */
public class DescribeClusterADDomainResponseBody extends TeaModel {
    @NameInMap("DomainDnsIp")
    private String domainDnsIp;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("IsSupported")
    private Boolean isSupported;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskFinished")
    private Boolean taskFinished;

    @NameInMap("TaskId")
    private String taskId;

    private DescribeClusterADDomainResponseBody(Builder builder) {
        this.domainDnsIp = builder.domainDnsIp;
        this.domainName = builder.domainName;
        this.isSupported = builder.isSupported;
        this.requestId = builder.requestId;
        this.taskFinished = builder.taskFinished;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterADDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainDnsIp
     */
    public String getDomainDnsIp() {
        return this.domainDnsIp;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return isSupported
     */
    public Boolean getIsSupported() {
        return this.isSupported;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskFinished
     */
    public Boolean getTaskFinished() {
        return this.taskFinished;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String domainDnsIp; 
        private String domainName; 
        private Boolean isSupported; 
        private String requestId; 
        private Boolean taskFinished; 
        private String taskId; 

        /**
         * DomainDnsIp.
         */
        public Builder domainDnsIp(String domainDnsIp) {
            this.domainDnsIp = domainDnsIp;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * IsSupported.
         */
        public Builder isSupported(Boolean isSupported) {
            this.isSupported = isSupported;
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
         * TaskFinished.
         */
        public Builder taskFinished(Boolean taskFinished) {
            this.taskFinished = taskFinished;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public DescribeClusterADDomainResponseBody build() {
            return new DescribeClusterADDomainResponseBody(this);
        } 

    } 

}
