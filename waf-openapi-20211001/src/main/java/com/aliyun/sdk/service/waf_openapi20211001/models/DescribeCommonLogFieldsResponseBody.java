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
         * <p>The list of log fields returned.</p>
         */
        public Builder logFieldList(java.util.List<LogFieldList> logFieldList) {
            this.logFieldList = logFieldList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AB0775EB-2594-598A-97E1-51B1*******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of log fields returned.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
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
             * <p>Indicates whether the log field is a default field.</p>
             * <ul>
             * <li><p><strong>true</strong>: The log field is a default field.</p>
             * </li>
             * <li><p><strong>false</strong>: The log field is not a default field.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>Indicates whether the log field is required.</p>
             * <ul>
             * <li><p><strong>true</strong>: The log field is required.</p>
             * </li>
             * <li><p><strong>false</strong>: The log field is not required.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isRequired(Boolean isRequired) {
                this.isRequired = isRequired;
                return this;
            }

            /**
             * <p>The name of the log field.</p>
             * <blockquote>
             * <p>For more information about the log fields, see <a href="https://help.aliyun.com/zh/waf/web-application-firewall-3-0/user-guide/fields-in-logs?spm=openapi-amp.newDocPublishment.0.0.ccef281fNAb0XR"><strong>Log field descriptions</strong></a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>final_action</p>
             */
            public Builder logKey(String logKey) {
                this.logKey = logKey;
                return this;
            }

            /**
             * <p>The status of the log field. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: offline.</p>
             * </li>
             * <li><p><strong>1</strong>: online or in use.</p>
             * </li>
             * <li><p><strong>2</strong>: about to be unpublished.</p>
             * </li>
             * <li><p><strong>3</strong>: about to be published.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
