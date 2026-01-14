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
 * {@link UpdateLogStoreConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateLogStoreConfigRequest</p>
 */
public class UpdateLogStoreConfigRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointGroupId;

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

    private UpdateLogStoreConfigRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.accessLogRecordCustomizedHeaderList = builder.accessLogRecordCustomizedHeaderList;
        this.accessLogRecordCustomizedHeadersEnabled = builder.accessLogRecordCustomizedHeadersEnabled;
        this.clientToken = builder.clientToken;
        this.endpointGroupId = builder.endpointGroupId;
        this.listenerId = builder.listenerId;
        this.regionId = builder.regionId;
        this.slsLogStoreName = builder.slsLogStoreName;
        this.slsProjectName = builder.slsProjectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLogStoreConfigRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateLogStoreConfigRequest, Builder> {
        private String acceleratorId; 
        private java.util.List<String> accessLogRecordCustomizedHeaderList; 
        private Boolean accessLogRecordCustomizedHeadersEnabled; 
        private String clientToken; 
        private String endpointGroupId; 
        private String listenerId; 
        private String regionId; 
        private String slsLogStoreName; 
        private String slsProjectName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLogStoreConfigRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.accessLogRecordCustomizedHeaderList = request.accessLogRecordCustomizedHeaderList;
            this.accessLogRecordCustomizedHeadersEnabled = request.accessLogRecordCustomizedHeadersEnabled;
            this.clientToken = request.clientToken;
            this.endpointGroupId = request.endpointGroupId;
            this.listenerId = request.listenerId;
            this.regionId = request.regionId;
            this.slsLogStoreName = request.slsLogStoreName;
            this.slsProjectName = request.slsProjectName;
        } 

        /**
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-bp1dmlohjjz4kqaun****</p>
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.putQueryParameter("EndpointGroupId", endpointGroupId);
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-xxxxxxxxxxxxxxx</p>
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-access-log-epg-01</p>
         */
        public Builder slsLogStoreName(String slsLogStoreName) {
            this.putQueryParameter("SlsLogStoreName", slsLogStoreName);
            this.slsLogStoreName = slsLogStoreName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-access-log</p>
         */
        public Builder slsProjectName(String slsProjectName) {
            this.putQueryParameter("SlsProjectName", slsProjectName);
            this.slsProjectName = slsProjectName;
            return this;
        }

        @Override
        public UpdateLogStoreConfigRequest build() {
            return new UpdateLogStoreConfigRequest(this);
        } 

    } 

}
