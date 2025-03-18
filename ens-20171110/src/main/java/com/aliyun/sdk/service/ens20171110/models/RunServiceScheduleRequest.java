// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link RunServiceScheduleRequest} extends {@link RequestModel}
 *
 * <p>RunServiceScheduleRequest</p>
 */
public class RunServiceScheduleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Directorys")
    private String directorys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PodConfigName")
    private String podConfigName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreLockedTimeout")
    private Integer preLockedTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleStrategy")
    private String scheduleStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCommands")
    private String serviceCommands;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuid;

    private RunServiceScheduleRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clientIp = builder.clientIp;
        this.directorys = builder.directorys;
        this.podConfigName = builder.podConfigName;
        this.preLockedTimeout = builder.preLockedTimeout;
        this.scheduleStrategy = builder.scheduleStrategy;
        this.serviceAction = builder.serviceAction;
        this.serviceCommands = builder.serviceCommands;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunServiceScheduleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * @return directorys
     */
    public String getDirectorys() {
        return this.directorys;
    }

    /**
     * @return podConfigName
     */
    public String getPodConfigName() {
        return this.podConfigName;
    }

    /**
     * @return preLockedTimeout
     */
    public Integer getPreLockedTimeout() {
        return this.preLockedTimeout;
    }

    /**
     * @return scheduleStrategy
     */
    public String getScheduleStrategy() {
        return this.scheduleStrategy;
    }

    /**
     * @return serviceAction
     */
    public String getServiceAction() {
        return this.serviceAction;
    }

    /**
     * @return serviceCommands
     */
    public String getServiceCommands() {
        return this.serviceCommands;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<RunServiceScheduleRequest, Builder> {
        private String appId; 
        private String clientIp; 
        private String directorys; 
        private String podConfigName; 
        private Integer preLockedTimeout; 
        private String scheduleStrategy; 
        private String serviceAction; 
        private String serviceCommands; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(RunServiceScheduleRequest request) {
            super(request);
            this.appId = request.appId;
            this.clientIp = request.clientIp;
            this.directorys = request.directorys;
            this.podConfigName = request.podConfigName;
            this.preLockedTimeout = request.preLockedTimeout;
            this.scheduleStrategy = request.scheduleStrategy;
            this.serviceAction = request.serviceAction;
            this.serviceCommands = request.serviceCommands;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>474bdef0-d149-4695-abfb-52912d9143f0</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The IP address of the client.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>180.166.45.146</p>
         */
        public Builder clientIp(String clientIp) {
            this.putQueryParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        /**
         * <p>The directory to which the data file is mounted. The value must be a full path and cannot be &quot;/../&quot;. Example: [&quot;/data/app01&quot;, &quot;/data/user&quot;]. Specify the relative path of the virtual device for this parameter. For example, specify /data for this parameter when the actual path of the virtual device is /data/{input path}.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;/data/app01&quot;, &quot;/data/user&quot;]</p>
         */
        public Builder directorys(String directorys) {
            this.putQueryParameter("Directorys", directorys);
            this.directorys = directorys;
            return this;
        }

        /**
         * <p>The parameter does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>android</p>
         */
        public Builder podConfigName(String podConfigName) {
            this.putQueryParameter("PodConfigName", podConfigName);
            this.podConfigName = podConfigName;
            return this;
        }

        /**
         * <p>The maximum duration for locking an idle device. Unit: seconds. This parameter takes effect only if you set ServiceAction to PreSchedule. Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder preLockedTimeout(Integer preLockedTimeout) {
            this.putQueryParameter("PreLockedTimeout", preLockedTimeout);
            this.preLockedTimeout = preLockedTimeout;
            return this;
        }

        /**
         * <p>The scheduling policy of the device. The value must be a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;selectLevel&quot;: &quot;RegionId&quot;, &quot;values&quot;: [&quot;cn-chengdu-telecom-2&quot;]  }</p>
         */
        public Builder scheduleStrategy(String scheduleStrategy) {
            this.putQueryParameter("ScheduleStrategy", scheduleStrategy);
            this.scheduleStrategy = scheduleStrategy;
            return this;
        }

        /**
         * <p>The scheduling operation. The value must be of the enumeration type. Valid values:</p>
         * <p>Container scenario:</p>
         * <ul>
         * <li>Start: selects and activates an idle cloud device.</li>
         * <li>Stop: stops and releases the cloud device.</li>
         * <li>Console: performs the scheduling operation when the device is in the scheduling state.</li>
         * </ul>
         * <p>Bare metal instance or virtual machine scenario:</p>
         * <ul>
         * <li>PreSchedule: locks a virtual machine instance for scheduling.</li>
         * <li>Confirm: confirms the scheduling operation.</li>
         * <li>Cancel: cancels the scheduling operation.</li>
         * <li>Console: performs the scheduling operation when the device is in the scheduling state.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Start</p>
         */
        public Builder serviceAction(String serviceAction) {
            this.putQueryParameter("ServiceAction", serviceAction);
            this.serviceAction = serviceAction;
            return this;
        }

        /**
         * <p>The service commands. The value must be a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;containerName&quot;: &quot;android&quot;,       &quot;commands&quot;:[&quot;cat /tmp/token.json&quot;]    },    {      &quot;commands&quot;:[&quot;ls -l /data/data&quot;]    }]</p>
         */
        public Builder serviceCommands(String serviceCommands) {
            this.putQueryParameter("ServiceCommands", serviceCommands);
            this.serviceCommands = serviceCommands;
            return this;
        }

        /**
         * <p>The UUID of the device.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hdm_d4f1059a8e1afc0956bd71b497faa433</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public RunServiceScheduleRequest build() {
            return new RunServiceScheduleRequest(this);
        } 

    } 

}
