// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExportDeviceInfoOssUrlRequest} extends {@link RequestModel}
 *
 * <p>GetExportDeviceInfoOssUrlRequest</p>
 */
public class GetExportDeviceInfoOssUrlRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneName")
    private String zoneName;

    private GetExportDeviceInfoOssUrlRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.zoneId = builder.zoneId;
        this.zoneName = builder.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExportDeviceInfoOssUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return zoneName
     */
    public String getZoneName() {
        return this.zoneName;
    }

    public static final class Builder extends Request.Builder<GetExportDeviceInfoOssUrlRequest, Builder> {
        private String tenantId; 
        private String zoneId; 
        private String zoneName; 

        private Builder() {
            super();
        } 

        private Builder(GetExportDeviceInfoOssUrlRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.zoneId = request.zoneId;
            this.zoneName = request.zoneName;
        } 

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * ZoneName.
         */
        public Builder zoneName(String zoneName) {
            this.putBodyParameter("ZoneName", zoneName);
            this.zoneName = zoneName;
            return this;
        }

        @Override
        public GetExportDeviceInfoOssUrlRequest build() {
            return new GetExportDeviceInfoOssUrlRequest(this);
        } 

    } 

}
