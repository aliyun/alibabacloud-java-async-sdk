// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeResourceLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceLogResponseBody</p>
 */
public class DescribeResourceLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogStore")
    private String logStore;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeResourceLogResponseBody(Builder builder) {
        this.logStore = builder.logStore;
        this.message = builder.message;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return logStore
     */
    public String getLogStore() {
        return this.logStore;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String logStore; 
        private String message; 
        private String projectName; 
        private String requestId; 
        private String status; 

        /**
         * <p>The Logstore of Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>access_log</p>
         */
        public Builder logStore(String logStore) {
            this.logStore = logStore;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Network interfaces are updating</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The Log Service project that is associated with the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-r-asdasdasd-sls</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>ResourceReady</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeResourceLogResponseBody build() {
            return new DescribeResourceLogResponseBody(this);
        } 

    } 

}
