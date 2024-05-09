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
         * AutoRestart.
         */
        public Builder autoRestart(Boolean autoRestart) {
            this.putQueryParameter("AutoRestart", autoRestart);
            this.autoRestart = autoRestart;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * IsSubscribe.
         */
        public Builder isSubscribe(Boolean isSubscribe) {
            this.putQueryParameter("IsSubscribe", isSubscribe);
            this.isSubscribe = isSubscribe;
            return this;
        }

        /**
         * Nickname.
         */
        public Builder nickname(String nickname) {
            this.putQueryParameter("Nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * Pid.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Restart.
         */
        public Builder restart(Boolean restart) {
            this.putQueryParameter("Restart", restart);
            this.restart = restart;
            return this;
        }

        /**
         * ServiceDomainOperationJson.
         */
        public Builder serviceDomainOperationJson(String serviceDomainOperationJson) {
            this.putQueryParameter("ServiceDomainOperationJson", serviceDomainOperationJson);
            this.serviceDomainOperationJson = serviceDomainOperationJson;
            return this;
        }

        /**
         * Stop.
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
