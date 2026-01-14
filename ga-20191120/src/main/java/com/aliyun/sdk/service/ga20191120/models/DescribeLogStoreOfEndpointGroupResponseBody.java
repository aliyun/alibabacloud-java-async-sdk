// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link DescribeLogStoreOfEndpointGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogStoreOfEndpointGroupResponseBody</p>
 */
public class DescribeLogStoreOfEndpointGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    private String acceleratorId;

    @com.aliyun.core.annotation.NameInMap("AccessLogRecordCustomizedHeaderList")
    private java.util.List<String> accessLogRecordCustomizedHeaderList;

    @com.aliyun.core.annotation.NameInMap("AccessLogRecordCustomizedHeadersEnabled")
    private Boolean accessLogRecordCustomizedHeadersEnabled;

    @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
    private String endpointGroupId;

    @com.aliyun.core.annotation.NameInMap("ListenerId")
    private String listenerId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlsLogStoreName")
    private String slsLogStoreName;

    @com.aliyun.core.annotation.NameInMap("SlsProjectName")
    private String slsProjectName;

    @com.aliyun.core.annotation.NameInMap("SlsRegionId")
    private String slsRegionId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeLogStoreOfEndpointGroupResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.accessLogRecordCustomizedHeaderList = builder.accessLogRecordCustomizedHeaderList;
        this.accessLogRecordCustomizedHeadersEnabled = builder.accessLogRecordCustomizedHeadersEnabled;
        this.endpointGroupId = builder.endpointGroupId;
        this.listenerId = builder.listenerId;
        this.requestId = builder.requestId;
        this.slsLogStoreName = builder.slsLogStoreName;
        this.slsProjectName = builder.slsProjectName;
        this.slsRegionId = builder.slsRegionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogStoreOfEndpointGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return accessLogRecordCustomizedHeaderList
     */
    public java.util.List<String> getAccessLogRecordCustomizedHeaderList() {
        return this.accessLogRecordCustomizedHeaderList;
    }

    /**
     * @return accessLogRecordCustomizedHeadersEnabled
     */
    public Boolean getAccessLogRecordCustomizedHeadersEnabled() {
        return this.accessLogRecordCustomizedHeadersEnabled;
    }

    /**
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slsLogStoreName
     */
    public String getSlsLogStoreName() {
        return this.slsLogStoreName;
    }

    /**
     * @return slsProjectName
     */
    public String getSlsProjectName() {
        return this.slsProjectName;
    }

    /**
     * @return slsRegionId
     */
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String acceleratorId; 
        private java.util.List<String> accessLogRecordCustomizedHeaderList; 
        private Boolean accessLogRecordCustomizedHeadersEnabled; 
        private String endpointGroupId; 
        private String listenerId; 
        private String requestId; 
        private String slsLogStoreName; 
        private String slsProjectName; 
        private String slsRegionId; 
        private String status; 

        private Builder() {
        } 

        private Builder(DescribeLogStoreOfEndpointGroupResponseBody model) {
            this.acceleratorId = model.acceleratorId;
            this.accessLogRecordCustomizedHeaderList = model.accessLogRecordCustomizedHeaderList;
            this.accessLogRecordCustomizedHeadersEnabled = model.accessLogRecordCustomizedHeadersEnabled;
            this.endpointGroupId = model.endpointGroupId;
            this.listenerId = model.listenerId;
            this.requestId = model.requestId;
            this.slsLogStoreName = model.slsLogStoreName;
            this.slsProjectName = model.slsProjectName;
            this.slsRegionId = model.slsRegionId;
            this.status = model.status;
        } 

        /**
         * <p>The ID of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-xxxxxxxxxxxxx</p>
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * AccessLogRecordCustomizedHeaderList.
         */
        public Builder accessLogRecordCustomizedHeaderList(java.util.List<String> accessLogRecordCustomizedHeaderList) {
            this.accessLogRecordCustomizedHeaderList = accessLogRecordCustomizedHeaderList;
            return this;
        }

        /**
         * AccessLogRecordCustomizedHeadersEnabled.
         */
        public Builder accessLogRecordCustomizedHeadersEnabled(Boolean accessLogRecordCustomizedHeadersEnabled) {
            this.accessLogRecordCustomizedHeadersEnabled = accessLogRecordCustomizedHeadersEnabled;
            return this;
        }

        /**
         * <p>The ID of the endpoint group.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-xxxxxxxxxxxxxxx</p>
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * <p>The ID of the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-xxxxxxxxxxxxxxx</p>
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>1777E713-8456-55F1-9A69-9AD9EAE2B3B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>ga_log</p>
         */
        public Builder slsLogStoreName(String slsLogStoreName) {
            this.slsLogStoreName = slsLogStoreName;
            return this;
        }

        /**
         * <p>The name of the Simple Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>ga_project_name</p>
         */
        public Builder slsProjectName(String slsProjectName) {
            this.slsProjectName = slsProjectName;
            return this;
        }

        /**
         * <p>The region ID of the Simple Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder slsRegionId(String slsRegionId) {
            this.slsRegionId = slsRegionId;
            return this;
        }

        /**
         * <p>Indicates whether the endpoint group is bound to the Simple Log Service project.</p>
         * <ul>
         * <li><strong>on:</strong> The endpoint group is bound to the Simple Log Service project.</li>
         * <li><strong>off:</strong> The endpoint group is not bound to the Simple Log Service project.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on - binding
         * off - unbinding</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeLogStoreOfEndpointGroupResponseBody build() {
            return new DescribeLogStoreOfEndpointGroupResponseBody(this);
        } 

    } 

}
