// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudwifi_pop20191118.models;

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
 * {@link UpdateNetDeviceInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateNetDeviceInfoRequest</p>
 */
public class UpdateNetDeviceInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Devices")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Devices> devices;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    private UpdateNetDeviceInfoRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.devices = builder.devices;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNetDeviceInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return devices
     */
    public java.util.List<Devices> getDevices() {
        return this.devices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder extends Request.Builder<UpdateNetDeviceInfoRequest, Builder> {
        private String appCode; 
        private String appName; 
        private java.util.List<Devices> devices; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNetDeviceInfoRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.devices = request.devices;
            this.requestId = request.requestId;
        } 

        /**
         * AppCode.
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder devices(java.util.List<Devices> devices) {
            this.putBodyParameter("Devices", devices);
            this.devices = devices;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        @Override
        public UpdateNetDeviceInfoRequest build() {
            return new UpdateNetDeviceInfoRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateNetDeviceInfoRequest} extends {@link TeaModel}
     *
     * <p>UpdateNetDeviceInfoRequest</p>
     */
    public static class Devices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Idc")
        private String idc;

        @com.aliyun.core.annotation.NameInMap("LogicNetPod")
        private String logicNetPod;

        @com.aliyun.core.annotation.NameInMap("Manufacturer")
        @com.aliyun.core.annotation.Validation(required = true)
        private String manufacturer;

        @com.aliyun.core.annotation.NameInMap("MgnIp")
        private String mgnIp;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("NetPod")
        private String netPod;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("ServiceTag")
        @com.aliyun.core.annotation.Validation(required = true)
        private String serviceTag;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private Devices(Builder builder) {
            this.hostName = builder.hostName;
            this.id = builder.id;
            this.idc = builder.idc;
            this.logicNetPod = builder.logicNetPod;
            this.manufacturer = builder.manufacturer;
            this.mgnIp = builder.mgnIp;
            this.model = builder.model;
            this.netPod = builder.netPod;
            this.password = builder.password;
            this.role = builder.role;
            this.serviceTag = builder.serviceTag;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Devices create() {
            return builder().build();
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return idc
         */
        public String getIdc() {
            return this.idc;
        }

        /**
         * @return logicNetPod
         */
        public String getLogicNetPod() {
            return this.logicNetPod;
        }

        /**
         * @return manufacturer
         */
        public String getManufacturer() {
            return this.manufacturer;
        }

        /**
         * @return mgnIp
         */
        public String getMgnIp() {
            return this.mgnIp;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return netPod
         */
        public String getNetPod() {
            return this.netPod;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return serviceTag
         */
        public String getServiceTag() {
            return this.serviceTag;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String hostName; 
            private Long id; 
            private String idc; 
            private String logicNetPod; 
            private String manufacturer; 
            private String mgnIp; 
            private String model; 
            private String netPod; 
            private String password; 
            private String role; 
            private String serviceTag; 
            private String username; 

            private Builder() {
            } 

            private Builder(Devices model) {
                this.hostName = model.hostName;
                this.id = model.id;
                this.idc = model.idc;
                this.logicNetPod = model.logicNetPod;
                this.manufacturer = model.manufacturer;
                this.mgnIp = model.mgnIp;
                this.model = model.model;
                this.netPod = model.netPod;
                this.password = model.password;
                this.role = model.role;
                this.serviceTag = model.serviceTag;
                this.username = model.username;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Idc.
             */
            public Builder idc(String idc) {
                this.idc = idc;
                return this;
            }

            /**
             * LogicNetPod.
             */
            public Builder logicNetPod(String logicNetPod) {
                this.logicNetPod = logicNetPod;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder manufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
                return this;
            }

            /**
             * MgnIp.
             */
            public Builder mgnIp(String mgnIp) {
                this.mgnIp = mgnIp;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * NetPod.
             */
            public Builder netPod(String netPod) {
                this.netPod = netPod;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder serviceTag(String serviceTag) {
                this.serviceTag = serviceTag;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Devices build() {
                return new Devices(this);
            } 

        } 

    }
}
