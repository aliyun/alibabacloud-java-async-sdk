// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeWebAccessLogStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebAccessLogStatusResponseBody</p>
 */
public class DescribeWebAccessLogStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlsLogstore")
    private String slsLogstore;

    @com.aliyun.core.annotation.NameInMap("SlsProject")
    private String slsProject;

    @com.aliyun.core.annotation.NameInMap("SlsStatus")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The Logstore of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-logstore</p>
         */
        public Builder slsLogstore(String slsLogstore) {
            this.slsLogstore = slsLogstore;
            return this;
        }

        /**
         * <p>The Log Service project of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-project-128965410602****-cn-hangzhou</p>
         */
        public Builder slsProject(String slsProject) {
            this.slsProject = slsProject;
            return this;
        }

        /**
         * <p>Indicates whether the Log Analysis feature is enabled for the website. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled</li>
         * <li><strong>false</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
