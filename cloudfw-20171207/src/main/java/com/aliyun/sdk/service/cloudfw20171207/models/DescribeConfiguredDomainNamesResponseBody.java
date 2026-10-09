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
 * {@link DescribeConfiguredDomainNamesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConfiguredDomainNamesResponseBody</p>
 */
public class DescribeConfiguredDomainNamesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainNames")
    private java.util.List<DomainNames> domainNames;

    @com.aliyun.core.annotation.NameInMap("Module")
    private String module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeConfiguredDomainNamesResponseBody(Builder builder) {
        this.domainNames = builder.domainNames;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfiguredDomainNamesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainNames
     */
    public java.util.List<DomainNames> getDomainNames() {
        return this.domainNames;
    }

    /**
     * @return module
     */
    public String getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DomainNames> domainNames; 
        private String module; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeConfiguredDomainNamesResponseBody model) {
            this.domainNames = model.domainNames;
            this.module = model.module;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of domain names.</p>
         */
        public Builder domainNames(java.util.List<DomainNames> domainNames) {
            this.domainNames = domainNames;
            return this;
        }

        /**
         * <p>The application module.</p>
         * 
         * <strong>example:</strong>
         * <p>sg_server</p>
         */
        public Builder module(String module) {
            this.module = module;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>09A2D6F1-EA1B-56D9-977D-74878405****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeConfiguredDomainNamesResponseBody build() {
            return new DescribeConfiguredDomainNamesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeConfiguredDomainNamesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConfiguredDomainNamesResponseBody</p>
     */
    public static class DomainNames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("IsMalicious")
        private Boolean isMalicious;

        @com.aliyun.core.annotation.NameInMap("OperationTime")
        private Integer operationTime;

        private DomainNames(Builder builder) {
            this.comment = builder.comment;
            this.domainName = builder.domainName;
            this.isMalicious = builder.isMalicious;
            this.operationTime = builder.operationTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainNames create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return isMalicious
         */
        public Boolean getIsMalicious() {
            return this.isMalicious;
        }

        /**
         * @return operationTime
         */
        public Integer getOperationTime() {
            return this.operationTime;
        }

        public static final class Builder {
            private String comment; 
            private String domainName; 
            private Boolean isMalicious; 
            private Integer operationTime; 

            private Builder() {
            } 

            private Builder(DomainNames model) {
                this.comment = model.comment;
                this.domainName = model.domainName;
                this.isMalicious = model.isMalicious;
                this.operationTime = model.operationTime;
            } 

            /**
             * <p>The comment.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>Indicates whether the domain name is malicious. Valid values: <code>0</code> (not malicious) and <code>1</code> (malicious).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isMalicious(Boolean isMalicious) {
                this.isMalicious = isMalicious;
                return this;
            }

            /**
             * <p>The time of the operation, specified as a Unix timestamp in seconds. Example: <code>1672502400</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1534408189</p>
             */
            public Builder operationTime(Integer operationTime) {
                this.operationTime = operationTime;
                return this;
            }

            public DomainNames build() {
                return new DomainNames(this);
            } 

        } 

    }
}
