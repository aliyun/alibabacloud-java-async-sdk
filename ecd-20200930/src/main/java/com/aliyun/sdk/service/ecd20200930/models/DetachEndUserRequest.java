// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DetachEndUserRequest} extends {@link RequestModel}
 *
 * <p>DetachEndUserRequest</p>
 */
public class DetachEndUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdDomain")
    private String adDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    private DetachEndUserRequest(Builder builder) {
        super(builder);
        this.adDomain = builder.adDomain;
        this.clientType = builder.clientType;
        this.deviceId = builder.deviceId;
        this.directoryId = builder.directoryId;
        this.endUserId = builder.endUserId;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachEndUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adDomain
     */
    public String getAdDomain() {
        return this.adDomain;
    }

    /**
     * @return clientType
     */
    public String getClientType() {
        return this.clientType;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<DetachEndUserRequest, Builder> {
        private String adDomain; 
        private String clientType; 
        private String deviceId; 
        private String directoryId; 
        private String endUserId; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(DetachEndUserRequest request) {
            super(request);
            this.adDomain = request.adDomain;
            this.clientType = request.clientType;
            this.deviceId = request.deviceId;
            this.directoryId = request.directoryId;
            this.endUserId = request.endUserId;
            this.region = request.region;
        } 

        /**
         * <p>The address of the Active Directory (AD) office network.</p>
         * 
         * <strong>example:</strong>
         * <p>xn--0zw****</p>
         */
        public Builder adDomain(String adDomain) {
            this.putQueryParameter("AdDomain", adDomain);
            this.adDomain = adDomain;
            return this;
        }

        /**
         * <p>The type of the client.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>1: hardware client.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder clientType(String clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * <p>The serial number (SN) of the hardware client.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>F9E52EDCCB2B****</p>
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * <p>The ID of the convenient office network.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-jedbpr4sl9l37****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The ID of the user that you want to unbind from the hardware client.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>moli</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions supported by WUYING Workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public DetachEndUserRequest build() {
            return new DetachEndUserRequest(this);
        } 

    } 

}
