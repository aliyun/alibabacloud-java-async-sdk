// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceLogResponseBody</p>
 */
public class DescribeResourceLogResponseBody extends TeaModel {
    @NameInMap("LogStore")
    private String logStore;

    @NameInMap("Message")
    private String message;

    @NameInMap("ProjectName")
    private String projectName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
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
         * sls日志库
         */
        public Builder logStore(String logStore) {
            this.logStore = logStore;
            return this;
        }

        /**
         * sls日志信息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 资源组对应的sls日志管理项目
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 资源组状态
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
