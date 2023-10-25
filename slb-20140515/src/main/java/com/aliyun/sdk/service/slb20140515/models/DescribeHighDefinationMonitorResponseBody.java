// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHighDefinationMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHighDefinationMonitorResponseBody</p>
 */
public class DescribeHighDefinationMonitorResponseBody extends TeaModel {
    @NameInMap("LogProject")
    private String logProject;

    @NameInMap("LogStore")
    private String logStore;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The name of the Log Service project.
         */
        public Builder logProject(String logProject) {
            this.logProject = logProject;
            return this;
        }

        /**
         * The name of the Logstore.
         */
        public Builder logStore(String logStore) {
            this.logStore = logStore;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call is successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
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
