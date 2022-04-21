// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIoTCloudConnectorAccessLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetIoTCloudConnectorAccessLogResponseBody</p>
 */
public class GetIoTCloudConnectorAccessLogResponseBody extends TeaModel {
    @NameInMap("AccessLogSlsLogStore")
    private String accessLogSlsLogStore;

    @NameInMap("AccessLogSlsProject")
    private String accessLogSlsProject;

    @NameInMap("AccessLogStatus")
    private String accessLogStatus;

    @NameInMap("RequestId")
    private String requestId;

    private GetIoTCloudConnectorAccessLogResponseBody(Builder builder) {
        this.accessLogSlsLogStore = builder.accessLogSlsLogStore;
        this.accessLogSlsProject = builder.accessLogSlsProject;
        this.accessLogStatus = builder.accessLogStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIoTCloudConnectorAccessLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessLogSlsLogStore
     */
    public String getAccessLogSlsLogStore() {
        return this.accessLogSlsLogStore;
    }

    /**
     * @return accessLogSlsProject
     */
    public String getAccessLogSlsProject() {
        return this.accessLogSlsProject;
    }

    /**
     * @return accessLogStatus
     */
    public String getAccessLogStatus() {
        return this.accessLogStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessLogSlsLogStore; 
        private String accessLogSlsProject; 
        private String accessLogStatus; 
        private String requestId; 

        /**
         * AccessLogSlsLogStore.
         */
        public Builder accessLogSlsLogStore(String accessLogSlsLogStore) {
            this.accessLogSlsLogStore = accessLogSlsLogStore;
            return this;
        }

        /**
         * AccessLogSlsProject.
         */
        public Builder accessLogSlsProject(String accessLogSlsProject) {
            this.accessLogSlsProject = accessLogSlsProject;
            return this;
        }

        /**
         * AccessLogStatus.
         */
        public Builder accessLogStatus(String accessLogStatus) {
            this.accessLogStatus = accessLogStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIoTCloudConnectorAccessLogResponseBody build() {
            return new GetIoTCloudConnectorAccessLogResponseBody(this);
        } 

    } 

}
