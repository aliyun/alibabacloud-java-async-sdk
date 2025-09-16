// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link UpdateRumAppRequest} extends {@link RequestModel}
 *
 * <p>UpdateRumAppRequest</p>
 */
public class UpdateRumAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppConfig")
    private String appConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRestart")
    private Boolean autoRestart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendServiceTraceRegion")
    private String backendServiceTraceRegion;

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
    @com.aliyun.core.annotation.NameInMap("RealRegionId")
    private String realRegionId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebSDKConfigJson")
    private String webSDKConfigJson;

    private UpdateRumAppRequest(Builder builder) {
        super(builder);
        this.appConfig = builder.appConfig;
        this.autoRestart = builder.autoRestart;
        this.backendServiceTraceRegion = builder.backendServiceTraceRegion;
        this.bonreeSDKConfigJson = builder.bonreeSDKConfigJson;
        this.description = builder.description;
        this.isSubscribe = builder.isSubscribe;
        this.nickname = builder.nickname;
        this.pid = builder.pid;
        this.realRegionId = builder.realRegionId;
        this.regionId = builder.regionId;
        this.restart = builder.restart;
        this.serviceDomainOperationJson = builder.serviceDomainOperationJson;
        this.stop = builder.stop;
        this.webSDKConfigJson = builder.webSDKConfigJson;
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
     * @return appConfig
     */
    public String getAppConfig() {
        return this.appConfig;
    }

    /**
     * @return autoRestart
     */
    public Boolean getAutoRestart() {
        return this.autoRestart;
    }

    /**
     * @return backendServiceTraceRegion
     */
    public String getBackendServiceTraceRegion() {
        return this.backendServiceTraceRegion;
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
     * @return realRegionId
     */
    public String getRealRegionId() {
        return this.realRegionId;
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

    /**
     * @return webSDKConfigJson
     */
    public String getWebSDKConfigJson() {
        return this.webSDKConfigJson;
    }

    public static final class Builder extends Request.Builder<UpdateRumAppRequest, Builder> {
        private String appConfig; 
        private Boolean autoRestart; 
        private String backendServiceTraceRegion; 
        private String bonreeSDKConfigJson; 
        private String description; 
        private Boolean isSubscribe; 
        private String nickname; 
        private String pid; 
        private String realRegionId; 
        private String regionId; 
        private Boolean restart; 
        private String serviceDomainOperationJson; 
        private Boolean stop; 
        private String webSDKConfigJson; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRumAppRequest request) {
            super(request);
            this.appConfig = request.appConfig;
            this.autoRestart = request.autoRestart;
            this.backendServiceTraceRegion = request.backendServiceTraceRegion;
            this.bonreeSDKConfigJson = request.bonreeSDKConfigJson;
            this.description = request.description;
            this.isSubscribe = request.isSubscribe;
            this.nickname = request.nickname;
            this.pid = request.pid;
            this.realRegionId = request.realRegionId;
            this.regionId = request.regionId;
            this.restart = request.restart;
            this.serviceDomainOperationJson = request.serviceDomainOperationJson;
            this.stop = request.stop;
            this.webSDKConfigJson = request.webSDKConfigJson;
        } 

        /**
         * <p>The application configurations in the JSON format. This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;apiRequestOfH5&quot;:300,&quot;apiRequestOfOriginal&quot;:500,&quot;coldStart&quot;:5000,&quot;hotStart&quot;:3000,&quot;staticResourceLoad&quot;:300,&quot;stutter&quot;:1000,&quot;viewLoadOfH5&quot;:1000,&quot;viewLoadOfOriginal&quot;:2000}</p>
         */
        public Builder appConfig(String appConfig) {
            this.putQueryParameter("AppConfig", appConfig);
            this.appConfig = appConfig;
            return this;
        }

        /**
         * <p>Specifies whether to restart the application the next day. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRestart(Boolean autoRestart) {
            this.putQueryParameter("AutoRestart", autoRestart);
            this.autoRestart = autoRestart;
            return this;
        }

        /**
         * <p>The region where the backend application is deployed. This parameter is used in end-to-end tracing scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;moduleConfig&quot;:{&quot;enable&quot;:true,&quot;defaultConfig&quot;:{&quot;network&quot;:{&quot;enable&quot;:true},&quot;h5&quot;:{&quot;enable&quot;:true},&quot;routechange&quot;:{&quot;enable&quot;:true},&quot;crash&quot;:{&quot;enable&quot;:true},&quot;view&quot;:{&quot;enable&quot;:true},&quot;coollaunch&quot;:{&quot;enable&quot;:true},&quot;hotlaunch&quot;:{&quot;enable&quot;:true},&quot;action&quot;:{&quot;enable&quot;:true},&quot;lagstuck&quot;:{&quot;enable&quot;:true},&quot;lagfps&quot;:{&quot;enable&quot;:true},&quot;statechange&quot;:{&quot;enable&quot;:true},&quot;anr&quot;:{&quot;enable&quot;:true},&quot;customlog&quot;:{&quot;enable&quot;:true},&quot;customevent&quot;:{&quot;enable&quot;:true},&quot;custommetric&quot;:{&quot;enable&quot;:true}},&quot;versionConfigs&quot;:{&quot;1.1.0&quot;:{&quot;useCustom&quot;:true,&quot;customConfig&quot;:{&quot;network&quot;:{&quot;enable&quot;:true},&quot;h5&quot;:{&quot;enable&quot;:true},&quot;routechange&quot;:{&quot;enable&quot;:true},&quot;crash&quot;:{&quot;enable&quot;:true},&quot;view&quot;:{&quot;enable&quot;:true},&quot;coollaunch&quot;:{&quot;enable&quot;:true},&quot;hotlaunch&quot;:{&quot;enable&quot;:true},&quot;action&quot;:{&quot;enable&quot;:true},&quot;lagstuck&quot;:{&quot;enable&quot;:false},&quot;lagfps&quot;:{&quot;enable&quot;:false},&quot;statechange&quot;:{&quot;enable&quot;:true},&quot;anr&quot;:{&quot;enable&quot;:true},&quot;customlog&quot;:{&quot;enable&quot;:true},&quot;customevent&quot;:{&quot;enable&quot;:true},&quot;custommetric&quot;:{&quot;enable&quot;:true}}},&quot;1.2.0&quot;:{&quot;useCustom&quot;:false,&quot;customConfig&quot;:{}}}}}</p>
         */
        public Builder backendServiceTraceRegion(String backendServiceTraceRegion) {
            this.putQueryParameter("BackendServiceTraceRegion", backendServiceTraceRegion);
            this.backendServiceTraceRegion = backendServiceTraceRegion;
            return this;
        }

        /**
         * <p>The collection configurations of the mobile SDK. You can enable or disable collection configurations based on the app version.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;moduleConfig&quot;:{&quot;enable&quot;:true,&quot;defaultConfig&quot;:{&quot;network&quot;:{&quot;enable&quot;:true},&quot;h5&quot;:{&quot;enable&quot;:true},&quot;routechange&quot;:{&quot;enable&quot;:true},&quot;crash&quot;:{&quot;enable&quot;:true},&quot;view&quot;:{&quot;enable&quot;:true},&quot;coollaunch&quot;:{&quot;enable&quot;:true},&quot;hotlaunch&quot;:{&quot;enable&quot;:true},&quot;action&quot;:{&quot;enable&quot;:true},&quot;lagstuck&quot;:{&quot;enable&quot;:true},&quot;lagfps&quot;:{&quot;enable&quot;:true},&quot;statechange&quot;:{&quot;enable&quot;:true},&quot;anr&quot;:{&quot;enable&quot;:true},&quot;customlog&quot;:{&quot;enable&quot;:true},&quot;customevent&quot;:{&quot;enable&quot;:true},&quot;custommetric&quot;:{&quot;enable&quot;:true}},&quot;versionConfigs&quot;:{&quot;1.1.0&quot;:{&quot;useCustom&quot;:true,&quot;customConfig&quot;:{&quot;network&quot;:{&quot;enable&quot;:true},&quot;h5&quot;:{&quot;enable&quot;:true},&quot;routechange&quot;:{&quot;enable&quot;:true},&quot;crash&quot;:{&quot;enable&quot;:true},&quot;view&quot;:{&quot;enable&quot;:true},&quot;coollaunch&quot;:{&quot;enable&quot;:true},&quot;hotlaunch&quot;:{&quot;enable&quot;:true},&quot;action&quot;:{&quot;enable&quot;:true},&quot;lagstuck&quot;:{&quot;enable&quot;:false},&quot;lagfps&quot;:{&quot;enable&quot;:false},&quot;statechange&quot;:{&quot;enable&quot;:true},&quot;anr&quot;:{&quot;enable&quot;:true},&quot;customlog&quot;:{&quot;enable&quot;:true},&quot;customevent&quot;:{&quot;enable&quot;:true},&quot;custommetric&quot;:{&quot;enable&quot;:true}}},&quot;1.2.0&quot;:{&quot;useCustom&quot;:false,&quot;customConfig&quot;:{}}}}}</p>
         */
        public Builder bonreeSDKConfigJson(String bonreeSDKConfigJson) {
            this.putQueryParameter("BonreeSDKConfigJson", bonreeSDKConfigJson);
            this.bonreeSDKConfigJson = bonreeSDKConfigJson;
            return this;
        }

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether you want to subscribe to the application. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSubscribe(Boolean isSubscribe) {
            this.putQueryParameter("IsSubscribe", isSubscribe);
            this.isSubscribe = isSubscribe;
            return this;
        }

        /**
         * <p>The alias of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Android Test</p>
         */
        public Builder nickname(String nickname) {
            this.putQueryParameter("Nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b5xxxxs@d8deedfa9bf****</p>
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * <p>The region where the application resides. You can leave this parameter empty or set it to China East 2 Finance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder realRegionId(String realRegionId) {
            this.putQueryParameter("RealRegionId", realRegionId);
            this.realRegionId = realRegionId;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>Specifies whether to restart the application. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder restart(Boolean restart) {
            this.putQueryParameter("Restart", restart);
            this.restart = restart;
            return this;
        }

        /**
         * <p>The service domain name of the application. You can create, modify, and delete service domain name configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Op&quot;:&quot;Update&quot;,&quot;Domain&quot;:&quot;example.com&quot;,&quot;Config&quot;:{&quot;Description&quot;:&quot;message&quot;,&quot;Tracing&quot;:&quot;true&quot;,&quot;PropagatorTypes&quot;:[&quot;sw8&quot;]}}</p>
         */
        public Builder serviceDomainOperationJson(String serviceDomainOperationJson) {
            this.putQueryParameter("ServiceDomainOperationJson", serviceDomainOperationJson);
            this.serviceDomainOperationJson = serviceDomainOperationJson;
            return this;
        }

        /**
         * <p>Specifies whether to stop the application. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder stop(Boolean stop) {
            this.putQueryParameter("Stop", stop);
            this.stop = stop;
            return this;
        }

        /**
         * WebSDKConfigJson.
         */
        public Builder webSDKConfigJson(String webSDKConfigJson) {
            this.putQueryParameter("WebSDKConfigJson", webSDKConfigJson);
            this.webSDKConfigJson = webSDKConfigJson;
            return this;
        }

        @Override
        public UpdateRumAppRequest build() {
            return new UpdateRumAppRequest(this);
        } 

    } 

}
