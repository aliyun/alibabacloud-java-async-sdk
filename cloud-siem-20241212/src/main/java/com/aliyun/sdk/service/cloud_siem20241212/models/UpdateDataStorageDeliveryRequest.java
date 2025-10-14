// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link UpdateDataStorageDeliveryRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataStorageDeliveryRequest</p>
 */
public class UpdateDataStorageDeliveryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogDeliveryStatus")
    @com.aliyun.core.annotation.Validation(maxLength = 1000)
    private String logDeliveryStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private UpdateDataStorageDeliveryRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.logCode = builder.logCode;
        this.logDeliveryStatus = builder.logDeliveryStatus;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataStorageDeliveryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return logCode
     */
    public String getLogCode() {
        return this.logCode;
    }

    /**
     * @return logDeliveryStatus
     */
    public String getLogDeliveryStatus() {
        return this.logDeliveryStatus;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static final class Builder extends Request.Builder<UpdateDataStorageDeliveryRequest, Builder> {
        private String lang; 
        private String logCode; 
        private String logDeliveryStatus; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataStorageDeliveryRequest request) {
            super(request);
            this.lang = request.lang;
            this.logCode = request.logCode;
            this.logDeliveryStatus = request.logDeliveryStatus;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aegis-log-login</p>
         */
        public Builder logCode(String logCode) {
            this.putBodyParameter("LogCode", logCode);
            this.logCode = logCode;
            return this;
        }

        /**
         * LogDeliveryStatus.
         */
        public Builder logDeliveryStatus(String logDeliveryStatus) {
            this.putBodyParameter("LogDeliveryStatus", logDeliveryStatus);
            this.logDeliveryStatus = logDeliveryStatus;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public UpdateDataStorageDeliveryRequest build() {
            return new UpdateDataStorageDeliveryRequest(this);
        } 

    } 

}
