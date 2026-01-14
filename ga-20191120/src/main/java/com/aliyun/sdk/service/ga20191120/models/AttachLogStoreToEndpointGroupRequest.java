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
 * {@link AttachLogStoreToEndpointGroupRequest} extends {@link RequestModel}
 *
 * <p>AttachLogStoreToEndpointGroupRequest</p>
 */
public class AttachLogStoreToEndpointGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceleratorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessLogRecordCustomizedHeaderList")
    private java.util.List<String> accessLogRecordCustomizedHeaderList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessLogRecordCustomizedHeadersEnabled")
    private Boolean accessLogRecordCustomizedHeadersEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointGroupIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> endpointGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listenerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsLogStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String slsLogStoreName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String slsProjectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String slsRegionId;

    private AttachLogStoreToEndpointGroupRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.accessLogRecordCustomizedHeaderList = builder.accessLogRecordCustomizedHeaderList;
        this.accessLogRecordCustomizedHeadersEnabled = builder.accessLogRecordCustomizedHeadersEnabled;
        this.clientToken = builder.clientToken;
        this.endpointGroupIds = builder.endpointGroupIds;
        this.listenerId = builder.listenerId;
        this.regionId = builder.regionId;
        this.slsLogStoreName = builder.slsLogStoreName;
        this.slsProjectName = builder.slsProjectName;
        this.slsRegionId = builder.slsRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachLogStoreToEndpointGroupRequest create() {
        return builder().build();
    }

@Override
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return endpointGroupIds
     */
    public java.util.List<String> getEndpointGroupIds() {
        return this.endpointGroupIds;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<AttachLogStoreToEndpointGroupRequest, Builder> {
        private String acceleratorId; 
        private java.util.List<String> accessLogRecordCustomizedHeaderList; 
        private Boolean accessLogRecordCustomizedHeadersEnabled; 
        private String clientToken; 
        private java.util.List<String> endpointGroupIds; 
        private String listenerId; 
        private String regionId; 
        private String slsLogStoreName; 
        private String slsProjectName; 
        private String slsRegionId; 

        private Builder() {
            super();
        } 

        private Builder(AttachLogStoreToEndpointGroupRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.accessLogRecordCustomizedHeaderList = request.accessLogRecordCustomizedHeaderList;
            this.accessLogRecordCustomizedHeadersEnabled = request.accessLogRecordCustomizedHeadersEnabled;
            this.clientToken = request.clientToken;
            this.endpointGroupIds = request.endpointGroupIds;
            this.listenerId = request.listenerId;
            this.regionId = request.regionId;
            this.slsLogStoreName = request.slsLogStoreName;
            this.slsProjectName = request.slsProjectName;
            this.slsRegionId = request.slsRegionId;
        } 

        /**
         * <p>The ID of the GA instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * AccessLogRecordCustomizedHeaderList.
         */
        public Builder accessLogRecordCustomizedHeaderList(java.util.List<String> accessLogRecordCustomizedHeaderList) {
            this.putQueryParameter("AccessLogRecordCustomizedHeaderList", accessLogRecordCustomizedHeaderList);
            this.accessLogRecordCustomizedHeaderList = accessLogRecordCustomizedHeaderList;
            return this;
        }

        /**
         * AccessLogRecordCustomizedHeadersEnabled.
         */
        public Builder accessLogRecordCustomizedHeadersEnabled(Boolean accessLogRecordCustomizedHeadersEnabled) {
            this.putQueryParameter("AccessLogRecordCustomizedHeadersEnabled", accessLogRecordCustomizedHeadersEnabled);
            this.accessLogRecordCustomizedHeadersEnabled = accessLogRecordCustomizedHeadersEnabled;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not set this parameter, <strong>ClientToken</strong> is set to the value of <strong>RequestId</strong>. The value of <strong>RequestId</strong> for each API request may be different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The IDs of the endpoint groups.</p>
         * <p>This parameter is required.</p>
         */
        public Builder endpointGroupIds(java.util.List<String> endpointGroupIds) {
            this.putQueryParameter("EndpointGroupIds", endpointGroupIds);
            this.endpointGroupIds = endpointGroupIds;
            return this;
        }

        /**
         * <p>The ID of the listener.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * <p>The ID of the region where the GA instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the Logstore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lsn-01</p>
         */
        public Builder slsLogStoreName(String slsLogStoreName) {
            this.putQueryParameter("SlsLogStoreName", slsLogStoreName);
            this.slsLogStoreName = slsLogStoreName;
            return this;
        }

        /**
         * <p>The name of the Log Service project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pn-01</p>
         */
        public Builder slsProjectName(String slsProjectName) {
            this.putQueryParameter("SlsProjectName", slsProjectName);
            this.slsProjectName = slsProjectName;
            return this;
        }

        /**
         * <p>The region ID of the Log Service project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder slsRegionId(String slsRegionId) {
            this.putQueryParameter("SlsRegionId", slsRegionId);
            this.slsRegionId = slsRegionId;
            return this;
        }

        @Override
        public AttachLogStoreToEndpointGroupRequest build() {
            return new AttachLogStoreToEndpointGroupRequest(this);
        } 

    } 

}
