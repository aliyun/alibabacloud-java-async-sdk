// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeInstDbSlsInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstDbSlsInfoResponseBody</p>
 */
public class DescribeInstDbSlsInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuditInfo")
    private AuditInfo auditInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeInstDbSlsInfoResponseBody(Builder builder) {
        this.auditInfo = builder.auditInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstDbSlsInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return auditInfo
     */
    public AuditInfo getAuditInfo() {
        return this.auditInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private AuditInfo auditInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The details of the SQL audit.</p>
         */
        public Builder auditInfo(AuditInfo auditInfo) {
            this.auditInfo = auditInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DC3ABA3E-0F8A-4596-9104-F5155C******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeInstDbSlsInfoResponseBody build() {
            return new DescribeInstDbSlsInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstDbSlsInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstDbSlsInfoResponseBody</p>
     */
    public static class AuditInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogStore")
        private String logStore;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        private AuditInfo(Builder builder) {
            this.logStore = builder.logStore;
            this.project = builder.project;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuditInfo create() {
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

        public static final class Builder {
            private String logStore; 
            private String project; 

            /**
             * <p>The name of the LogStore.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * <p>The name of the Log Service project.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            public AuditInfo build() {
                return new AuditInfo(this);
            } 

        } 

    }
}
