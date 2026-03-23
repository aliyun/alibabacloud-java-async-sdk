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
 * {@link GetNetDeviceInfoRequest} extends {@link RequestModel}
 *
 * <p>GetNetDeviceInfoRequest</p>
 */
public class GetNetDeviceInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cursor")
    private Long cursor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Idc")
    private String idc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicNetPod")
    private String logicNetPod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Manufacturer")
    private String manufacturer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MgnIp")
    private String mgnIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetPod")
    private String netPod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceTag")
    private String serviceTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    private GetNetDeviceInfoRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.cursor = builder.cursor;
        this.hostName = builder.hostName;
        this.id = builder.id;
        this.idc = builder.idc;
        this.logicNetPod = builder.logicNetPod;
        this.manufacturer = builder.manufacturer;
        this.mgnIp = builder.mgnIp;
        this.model = builder.model;
        this.netPod = builder.netPod;
        this.pageSize = builder.pageSize;
        this.password = builder.password;
        this.requestId = builder.requestId;
        this.role = builder.role;
        this.serviceTag = builder.serviceTag;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNetDeviceInfoRequest create() {
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
     * @return cursor
     */
    public Long getCursor() {
        return this.cursor;
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder extends Request.Builder<GetNetDeviceInfoRequest, Builder> {
        private String appCode; 
        private String appName; 
        private Long cursor; 
        private String hostName; 
        private Long id; 
        private String idc; 
        private String logicNetPod; 
        private String manufacturer; 
        private String mgnIp; 
        private String model; 
        private String netPod; 
        private Integer pageSize; 
        private String password; 
        private String requestId; 
        private String role; 
        private String serviceTag; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(GetNetDeviceInfoRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.cursor = request.cursor;
            this.hostName = request.hostName;
            this.id = request.id;
            this.idc = request.idc;
            this.logicNetPod = request.logicNetPod;
            this.manufacturer = request.manufacturer;
            this.mgnIp = request.mgnIp;
            this.model = request.model;
            this.netPod = request.netPod;
            this.pageSize = request.pageSize;
            this.password = request.password;
            this.requestId = request.requestId;
            this.role = request.role;
            this.serviceTag = request.serviceTag;
            this.username = request.username;
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
         * Cursor.
         */
        public Builder cursor(Long cursor) {
            this.putQueryParameter("Cursor", cursor);
            this.cursor = cursor;
            return this;
        }

        /**
         * HostName.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Idc.
         */
        public Builder idc(String idc) {
            this.putQueryParameter("Idc", idc);
            this.idc = idc;
            return this;
        }

        /**
         * LogicNetPod.
         */
        public Builder logicNetPod(String logicNetPod) {
            this.putQueryParameter("LogicNetPod", logicNetPod);
            this.logicNetPod = logicNetPod;
            return this;
        }

        /**
         * Manufacturer.
         */
        public Builder manufacturer(String manufacturer) {
            this.putQueryParameter("Manufacturer", manufacturer);
            this.manufacturer = manufacturer;
            return this;
        }

        /**
         * MgnIp.
         */
        public Builder mgnIp(String mgnIp) {
            this.putQueryParameter("MgnIp", mgnIp);
            this.mgnIp = mgnIp;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * NetPod.
         */
        public Builder netPod(String netPod) {
            this.putQueryParameter("NetPod", netPod);
            this.netPod = netPod;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * ServiceTag.
         */
        public Builder serviceTag(String serviceTag) {
            this.putQueryParameter("ServiceTag", serviceTag);
            this.serviceTag = serviceTag;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public GetNetDeviceInfoRequest build() {
            return new GetNetDeviceInfoRequest(this);
        } 

    } 

}
