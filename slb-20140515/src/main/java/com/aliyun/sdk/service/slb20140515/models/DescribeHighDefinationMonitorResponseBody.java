// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link DescribeHighDefinationMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHighDefinationMonitorResponseBody</p>
 */
public class DescribeHighDefinationMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogProject")
    private String logProject;

    @com.aliyun.core.annotation.NameInMap("LogStore")
    private String logStore;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeHighDefinationMonitorResponseBody(Builder builder) {
        this.logProject = builder.logProject;
        this.logStore = builder.logStore;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHighDefinationMonitorResponseBody create() {
        return builder().build();
    }

    /**
     * @return logProject
     */
    public String getLogProject() {
        return this.logProject;
    }

    /**
     * @return logStore
     */
    public String getLogStore() {
        return this.logStore;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String logProject; 
        private String logStore; 
        private String requestId; 
        private String success; 

        /**
         * <p>The name of the Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>my-project</p>
         */
        public Builder logProject(String logProject) {
            this.logProject = logProject;
            return this;
        }

        /**
         * <p>The name of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>my-log-store</p>
         */
        public Builder logStore(String logStore) {
            this.logStore = logStore;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2F398FF5-B349-5C01-8638-8E9A0BF1DBE6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeHighDefinationMonitorResponseBody build() {
            return new DescribeHighDefinationMonitorResponseBody(this);
        } 

    } 

}
