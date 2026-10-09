// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

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
 * {@link ListCACertificateLogResponseBody} extends {@link TeaModel}
 *
 * <p>ListCACertificateLogResponseBody</p>
 */
public class ListCACertificateLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogList")
    private java.util.List<LogList> logList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCACertificateLogResponseBody(Builder builder) {
        this.logList = builder.logList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCACertificateLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logList
     */
    public java.util.List<LogList> getLogList() {
        return this.logList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<LogList> logList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListCACertificateLogResponseBody model) {
            this.logList = model.logList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>A list of operation logs for the CA certificate.</p>
         */
        public Builder logList(java.util.List<LogList> logList) {
            this.logList = logList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCACertificateLogResponseBody build() {
            return new ListCACertificateLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCACertificateLogResponseBody} extends {@link TeaModel}
     *
     * <p>ListCACertificateLogResponseBody</p>
     */
    public static class LogList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("OpType")
        private String opType;

        private LogList(Builder builder) {
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.identifier = builder.identifier;
            this.opType = builder.opType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogList create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return opType
         */
        public String getOpType() {
            return this.opType;
        }

        public static final class Builder {
            private String content; 
            private Long createTime; 
            private String identifier; 
            private String opType; 

            private Builder() {
            } 

            private Builder(LogList model) {
                this.content = model.content;
                this.createTime = model.createTime;
                this.identifier = model.identifier;
                this.opType = model.opType;
            } 

            /**
             * <p>The description of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>add sub-root ca</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The time of the operation. This is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1634539509000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The unique identifier of the CA certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>160ae6bb538d538c70c01f81dcf2****</p>
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>The type of the operation. Valid values:</p>
             * <ul>
             * <li><p><strong>ADD</strong>: A CA certificate is created.</p>
             * </li>
             * <li><p><strong>UPDATE</strong>: The status of the CA certificate is updated.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ADD</p>
             */
            public Builder opType(String opType) {
                this.opType = opType;
                return this;
            }

            public LogList build() {
                return new LogList(this);
            } 

        } 

    }
}
