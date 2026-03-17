// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link GetSmartAGDpiAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetSmartAGDpiAttributeResponseBody</p>
 */
public class GetSmartAGDpiAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DpiMonitorStatus")
    private String dpiMonitorStatus;

    @com.aliyun.core.annotation.NameInMap("DpiStatus")
    private String dpiStatus;

    @com.aliyun.core.annotation.NameInMap("LogstoreName")
    private String logstoreName;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlsRegion")
    private String slsRegion;

    private GetSmartAGDpiAttributeResponseBody(Builder builder) {
        this.dpiMonitorStatus = builder.dpiMonitorStatus;
        this.dpiStatus = builder.dpiStatus;
        this.logstoreName = builder.logstoreName;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
        this.slsRegion = builder.slsRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSmartAGDpiAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dpiMonitorStatus
     */
    public String getDpiMonitorStatus() {
        return this.dpiMonitorStatus;
    }

    /**
     * @return dpiStatus
     */
    public String getDpiStatus() {
        return this.dpiStatus;
    }

    /**
     * @return logstoreName
     */
    public String getLogstoreName() {
        return this.logstoreName;
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
     * @return slsRegion
     */
    public String getSlsRegion() {
        return this.slsRegion;
    }

    public static final class Builder {
        private String dpiMonitorStatus; 
        private String dpiStatus; 
        private String logstoreName; 
        private String projectName; 
        private String requestId; 
        private String slsRegion; 

        private Builder() {
        } 

        private Builder(GetSmartAGDpiAttributeResponseBody model) {
            this.dpiMonitorStatus = model.dpiMonitorStatus;
            this.dpiStatus = model.dpiStatus;
            this.logstoreName = model.logstoreName;
            this.projectName = model.projectName;
            this.requestId = model.requestId;
            this.slsRegion = model.slsRegion;
        } 

        /**
         * <p>The status of the DPI-based monitoring feature. Valid values:</p>
         * <ul>
         * <li><strong>Active</strong>: enabled</li>
         * <li><strong>Inactive</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Inactive</p>
         */
        public Builder dpiMonitorStatus(String dpiMonitorStatus) {
            this.dpiMonitorStatus = dpiMonitorStatus;
            return this;
        }

        /**
         * <p>The status of the DPI feature. Valid values:</p>
         * <ul>
         * <li><strong>On</strong>: enabled</li>
         * <li><strong>Off</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>On</p>
         */
        public Builder dpiStatus(String dpiStatus) {
            this.dpiStatus = dpiStatus;
            return this;
        }

        /**
         * <p>The name of the Log Service Logstore that is associated with the DPI feature.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder logstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * <p>The name of the Log Service project that is associated with the DPI feature.</p>
         * 
         * <strong>example:</strong>
         * <p>test2</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B2997DC4-F1A2-418B-81FC-C8892CD31CFF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The region where Log Service is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder slsRegion(String slsRegion) {
            this.slsRegion = slsRegion;
            return this;
        }

        public GetSmartAGDpiAttributeResponseBody build() {
            return new GetSmartAGDpiAttributeResponseBody(this);
        } 

    } 

}
