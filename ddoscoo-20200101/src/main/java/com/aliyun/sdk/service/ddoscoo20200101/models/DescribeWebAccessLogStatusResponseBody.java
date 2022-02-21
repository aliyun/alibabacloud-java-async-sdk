// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebAccessLogStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebAccessLogStatusResponseBody</p>
 */
public class DescribeWebAccessLogStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlsLogstore")
    private String slsLogstore;

    @NameInMap("SlsProject")
    private String slsProject;

    @NameInMap("SlsStatus")
    private Boolean slsStatus;

    private DescribeWebAccessLogStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slsLogstore = builder.slsLogstore;
        this.slsProject = builder.slsProject;
        this.slsStatus = builder.slsStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebAccessLogStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slsLogstore
     */
    public String getSlsLogstore() {
        return this.slsLogstore;
    }

    /**
     * @return slsProject
     */
    public String getSlsProject() {
        return this.slsProject;
    }

    /**
     * @return slsStatus
     */
    public Boolean getSlsStatus() {
        return this.slsStatus;
    }

    public static final class Builder {
        private String requestId; 
        private String slsLogstore; 
        private String slsProject; 
        private Boolean slsStatus; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SlsLogstore.
         */
        public Builder slsLogstore(String slsLogstore) {
            this.slsLogstore = slsLogstore;
            return this;
        }

        /**
         * SlsProject.
         */
        public Builder slsProject(String slsProject) {
            this.slsProject = slsProject;
            return this;
        }

        /**
         * SlsStatus.
         */
        public Builder slsStatus(Boolean slsStatus) {
            this.slsStatus = slsStatus;
            return this;
        }

        public DescribeWebAccessLogStatusResponseBody build() {
            return new DescribeWebAccessLogStatusResponseBody(this);
        } 

    } 

}
