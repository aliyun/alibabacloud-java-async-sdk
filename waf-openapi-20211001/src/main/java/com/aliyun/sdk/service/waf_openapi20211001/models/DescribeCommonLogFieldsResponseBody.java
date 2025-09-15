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
 * {@link DescribeCommonLogFieldsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommonLogFieldsResponseBody</p>
 */
public class DescribeCommonLogFieldsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogFieldList")
    private java.util.List<LogFieldList> logFieldList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeCommonLogFieldsResponseBody(Builder builder) {
        this.logFieldList = builder.logFieldList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommonLogFieldsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logFieldList
     */
    public java.util.List<LogFieldList> getLogFieldList() {
        return this.logFieldList;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<LogFieldList> logFieldList; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeCommonLogFieldsResponseBody model) {
            this.logFieldList = model.logFieldList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * LogFieldList.
         */
        public Builder logFieldList(java.util.List<LogFieldList> logFieldList) {
            this.logFieldList = logFieldList;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCommonLogFieldsResponseBody build() {
            return new DescribeCommonLogFieldsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCommonLogFieldsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommonLogFieldsResponseBody</p>
     */
    public static class LogFieldList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("IsRequired")
        private Boolean isRequired;

        @com.aliyun.core.annotation.NameInMap("LogKey")
        private String logKey;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Boolean status;

        private LogFieldList(Builder builder) {
            this.isDefault = builder.isDefault;
            this.isRequired = builder.isRequired;
            this.logKey = builder.logKey;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogFieldList create() {
            return builder().build();
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return isRequired
         */
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        /**
         * @return logKey
         */
        public String getLogKey() {
            return this.logKey;
        }

        /**
         * @return status
         */
        public Boolean getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean isDefault; 
            private Boolean isRequired; 
            private String logKey; 
            private Boolean status; 

            private Builder() {
            } 

            private Builder(LogFieldList model) {
                this.isDefault = model.isDefault;
                this.isRequired = model.isRequired;
                this.logKey = model.logKey;
                this.status = model.status;
            } 

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * IsRequired.
             */
            public Builder isRequired(Boolean isRequired) {
                this.isRequired = isRequired;
                return this;
            }

            /**
             * LogKey.
             */
            public Builder logKey(String logKey) {
                this.logKey = logKey;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            public LogFieldList build() {
                return new LogFieldList(this);
            } 

        } 

    }
}
