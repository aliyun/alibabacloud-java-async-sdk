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
         * DomainNames.
         */
        public Builder domainNames(java.util.List<DomainNames> domainNames) {
            this.domainNames = domainNames;
            return this;
        }

        /**
         * Module.
         */
        public Builder module(String module) {
            this.module = module;
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
         * TotalCount.
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
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
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
             * IsMalicious.
             */
            public Builder isMalicious(Boolean isMalicious) {
                this.isMalicious = isMalicious;
                return this;
            }

            /**
             * OperationTime.
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
