// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudGtmInstanceConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudGtmInstanceConfigRequest</p>
 */
public class CreateCloudGtmInstanceConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableStatus")
    private String enableStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleHostname")
    private String scheduleHostname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleRrType")
    private String scheduleRrType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleZoneMode")
    private String scheduleZoneMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleZoneName")
    private String scheduleZoneName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Integer ttl;

    private CreateCloudGtmInstanceConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clientToken = builder.clientToken;
        this.enableStatus = builder.enableStatus;
        this.instanceId = builder.instanceId;
        this.remark = builder.remark;
        this.scheduleHostname = builder.scheduleHostname;
        this.scheduleRrType = builder.scheduleRrType;
        this.scheduleZoneMode = builder.scheduleZoneMode;
        this.scheduleZoneName = builder.scheduleZoneName;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudGtmInstanceConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return enableStatus
     */
    public String getEnableStatus() {
        return this.enableStatus;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return scheduleHostname
     */
    public String getScheduleHostname() {
        return this.scheduleHostname;
    }

    /**
     * @return scheduleRrType
     */
    public String getScheduleRrType() {
        return this.scheduleRrType;
    }

    /**
     * @return scheduleZoneMode
     */
    public String getScheduleZoneMode() {
        return this.scheduleZoneMode;
    }

    /**
     * @return scheduleZoneName
     */
    public String getScheduleZoneName() {
        return this.scheduleZoneName;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    public static final class Builder extends Request.Builder<CreateCloudGtmInstanceConfigRequest, Builder> {
        private String acceptLanguage; 
        private String clientToken; 
        private String enableStatus; 
        private String instanceId; 
        private String remark; 
        private String scheduleHostname; 
        private String scheduleRrType; 
        private String scheduleZoneMode; 
        private String scheduleZoneName; 
        private Integer ttl; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudGtmInstanceConfigRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clientToken = request.clientToken;
            this.enableStatus = request.enableStatus;
            this.instanceId = request.instanceId;
            this.remark = request.remark;
            this.scheduleHostname = request.scheduleHostname;
            this.scheduleRrType = request.scheduleRrType;
            this.scheduleZoneMode = request.scheduleZoneMode;
            this.scheduleZoneName = request.scheduleZoneName;
            this.ttl = request.ttl;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
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
         * EnableStatus.
         */
        public Builder enableStatus(String enableStatus) {
            this.putQueryParameter("EnableStatus", enableStatus);
            this.enableStatus = enableStatus;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * ScheduleHostname.
         */
        public Builder scheduleHostname(String scheduleHostname) {
            this.putQueryParameter("ScheduleHostname", scheduleHostname);
            this.scheduleHostname = scheduleHostname;
            return this;
        }

        /**
         * ScheduleRrType.
         */
        public Builder scheduleRrType(String scheduleRrType) {
            this.putQueryParameter("ScheduleRrType", scheduleRrType);
            this.scheduleRrType = scheduleRrType;
            return this;
        }

        /**
         * ScheduleZoneMode.
         */
        public Builder scheduleZoneMode(String scheduleZoneMode) {
            this.putQueryParameter("ScheduleZoneMode", scheduleZoneMode);
            this.scheduleZoneMode = scheduleZoneMode;
            return this;
        }

        /**
         * ScheduleZoneName.
         */
        public Builder scheduleZoneName(String scheduleZoneName) {
            this.putQueryParameter("ScheduleZoneName", scheduleZoneName);
            this.scheduleZoneName = scheduleZoneName;
            return this;
        }

        /**
         * Ttl.
         */
        public Builder ttl(Integer ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        @Override
        public CreateCloudGtmInstanceConfigRequest build() {
            return new CreateCloudGtmInstanceConfigRequest(this);
        } 

    } 

}
