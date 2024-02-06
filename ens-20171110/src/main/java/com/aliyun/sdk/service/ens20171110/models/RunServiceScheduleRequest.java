// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunServiceScheduleRequest} extends {@link RequestModel}
 *
 * <p>RunServiceScheduleRequest</p>
 */
public class RunServiceScheduleRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("ClientIp")
    @Validation(required = true)
    private String clientIp;

    @Query
    @NameInMap("Directorys")
    private String directorys;

    @Query
    @NameInMap("PodConfigName")
    private String podConfigName;

    @Query
    @NameInMap("PreLockedTimeout")
    private Integer preLockedTimeout;

    @Query
    @NameInMap("ScheduleStrategy")
    private String scheduleStrategy;

    @Query
    @NameInMap("ServiceAction")
    @Validation(required = true)
    private String serviceAction;

    @Query
    @NameInMap("ServiceCommands")
    private String serviceCommands;

    @Query
    @NameInMap("Uuid")
    @Validation(required = true)
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
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The IP address of the client.
         */
        public Builder clientIp(String clientIp) {
            this.putQueryParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        /**
         * The directory to which the data file is mounted. The value must be a full path and cannot be \"/../\". Example: \["/data/app01", "/data/user"]. Specify the relative path of the virtual device for this parameter. For example, specify /data for this parameter when the actual path of the virtual device is /data/{input path}.
         */
        public Builder directorys(String directorys) {
            this.putQueryParameter("Directorys", directorys);
            this.directorys = directorys;
            return this;
        }

        /**
         * The parameter does not take effect.
         */
        public Builder podConfigName(String podConfigName) {
            this.putQueryParameter("PodConfigName", podConfigName);
            this.podConfigName = podConfigName;
            return this;
        }

        /**
         * The maximum duration for locking an idle device. Unit: seconds. This parameter takes effect only if you set ServiceAction to PreSchedule. Default value: 300.
         */
        public Builder preLockedTimeout(Integer preLockedTimeout) {
            this.putQueryParameter("PreLockedTimeout", preLockedTimeout);
            this.preLockedTimeout = preLockedTimeout;
            return this;
        }

        /**
         * The scheduling policy of the device. The value must be a JSON string.
         */
        public Builder scheduleStrategy(String scheduleStrategy) {
            this.putQueryParameter("ScheduleStrategy", scheduleStrategy);
            this.scheduleStrategy = scheduleStrategy;
            return this;
        }

        /**
         * The scheduling operation. The value must be of the enumeration type. Valid values:
         * <p>
         * 
         * Container scenario:
         * 
         * *   Start: selects and activates an idle cloud device.
         * *   Stop: stops and releases the cloud device.
         * *   Console: performs the scheduling operation when the device is in the scheduling state.
         * 
         * Bare metal instance or virtual machine scenario:
         * 
         * *   PreSchedule: locks a virtual machine instance for scheduling.
         * *   Confirm: confirms the scheduling operation.
         * *   Cancel: cancels the scheduling operation.
         * *   Console: performs the scheduling operation when the device is in the scheduling state.
         */
        public Builder serviceAction(String serviceAction) {
            this.putQueryParameter("ServiceAction", serviceAction);
            this.serviceAction = serviceAction;
            return this;
        }

        /**
         * The service commands. The value must be a JSON string.
         */
        public Builder serviceCommands(String serviceCommands) {
            this.putQueryParameter("ServiceCommands", serviceCommands);
            this.serviceCommands = serviceCommands;
            return this;
        }

        /**
         * The UUID of the device.
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
