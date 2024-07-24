// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRumAppRequest} extends {@link RequestModel}
 *
 * <p>UpdateRumAppRequest</p>
 */
public class UpdateRumAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRestart")
    private Boolean autoRestart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BonreeSDKConfigJson")
    private String bonreeSDKConfigJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSubscribe")
    private Boolean isSubscribe;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nickname")
    private String nickname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Restart")
    private Boolean restart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceDomainOperationJson")
    private String serviceDomainOperationJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Stop")
    private Boolean stop;

    private UpdateRumAppRequest(Builder builder) {
        super(builder);
        this.autoRestart = builder.autoRestart;
        this.bonreeSDKConfigJson = builder.bonreeSDKConfigJson;
        this.description = builder.description;
        this.isSubscribe = builder.isSubscribe;
        this.nickname = builder.nickname;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.restart = builder.restart;
        this.serviceDomainOperationJson = builder.serviceDomainOperationJson;
        this.stop = builder.stop;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRumAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRestart
     */
    public Boolean getAutoRestart() {
        return this.autoRestart;
    }

    /**
     * @return bonreeSDKConfigJson
     */
    public String getBonreeSDKConfigJson() {
        return this.bonreeSDKConfigJson;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return isSubscribe
     */
    public Boolean getIsSubscribe() {
        return this.isSubscribe;
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return restart
     */
    public Boolean getRestart() {
        return this.restart;
    }

    /**
     * @return serviceDomainOperationJson
     */
    public String getServiceDomainOperationJson() {
        return this.serviceDomainOperationJson;
    }

    /**
     * @return stop
     */
    public Boolean getStop() {
        return this.stop;
    }

    public static final class Builder extends Request.Builder<UpdateRumAppRequest, Builder> {
        private Boolean autoRestart; 
        private String bonreeSDKConfigJson; 
        private String description; 
        private Boolean isSubscribe; 
        private String nickname; 
        private String pid; 
        private String regionId; 
        private Boolean restart; 
        private String serviceDomainOperationJson; 
        private Boolean stop; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRumAppRequest request) {
            super(request);
            this.autoRestart = request.autoRestart;
            this.bonreeSDKConfigJson = request.bonreeSDKConfigJson;
            this.description = request.description;
            this.isSubscribe = request.isSubscribe;
            this.nickname = request.nickname;
            this.pid = request.pid;
            this.regionId = request.regionId;
            this.restart = request.restart;
            this.serviceDomainOperationJson = request.serviceDomainOperationJson;
            this.stop = request.stop;
        } 

        /**
         * Specifies whether to restart the application the next day. Valid values: true and false.
         */
        public Builder autoRestart(Boolean autoRestart) {
            this.putQueryParameter("AutoRestart", autoRestart);
            this.autoRestart = autoRestart;
            return this;
        }

        /**
         * BonreeSDKConfigJson.
         */
        public Builder bonreeSDKConfigJson(String bonreeSDKConfigJson) {
            this.putQueryParameter("BonreeSDKConfigJson", bonreeSDKConfigJson);
            this.bonreeSDKConfigJson = bonreeSDKConfigJson;
            return this;
        }

        /**
         * The description of the application.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether you want to subscribe to the application. Valid values: true and false.
         */
        public Builder isSubscribe(Boolean isSubscribe) {
            this.putQueryParameter("IsSubscribe", isSubscribe);
            this.isSubscribe = isSubscribe;
            return this;
        }

        /**
         * The alias of the application.
         */
        public Builder nickname(String nickname) {
            this.putQueryParameter("Nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * The application ID.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to restart the application. Valid values: true and false.
         */
        public Builder restart(Boolean restart) {
            this.putQueryParameter("Restart", restart);
            this.restart = restart;
            return this;
        }

        /**
         * Set the application service domain name, support creation, modification, and deletion of service domain name configuration.
         */
        public Builder serviceDomainOperationJson(String serviceDomainOperationJson) {
            this.putQueryParameter("ServiceDomainOperationJson", serviceDomainOperationJson);
            this.serviceDomainOperationJson = serviceDomainOperationJson;
            return this;
        }

        /**
         * Specifies whether to stop the application. Valid values: true and false.
         */
        public Builder stop(Boolean stop) {
            this.putQueryParameter("Stop", stop);
            this.stop = stop;
            return this;
        }

        @Override
        public UpdateRumAppRequest build() {
            return new UpdateRumAppRequest(this);
        } 

    } 

}
