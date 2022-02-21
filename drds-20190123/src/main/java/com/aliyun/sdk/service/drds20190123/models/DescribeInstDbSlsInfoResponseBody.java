// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstDbSlsInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstDbSlsInfoResponseBody</p>
 */
public class DescribeInstDbSlsInfoResponseBody extends TeaModel {
    @NameInMap("AuditInfo")
    private AuditInfo auditInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * AuditInfo.
         */
        public Builder auditInfo(AuditInfo auditInfo) {
            this.auditInfo = auditInfo;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeInstDbSlsInfoResponseBody build() {
            return new DescribeInstDbSlsInfoResponseBody(this);
        } 

    } 

    public static class AuditInfo extends TeaModel {
        @NameInMap("LogStore")
        private String logStore;

        @NameInMap("Project")
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

            public AuditInfo build() {
                return new AuditInfo(this);
            } 

        } 

    }
}
