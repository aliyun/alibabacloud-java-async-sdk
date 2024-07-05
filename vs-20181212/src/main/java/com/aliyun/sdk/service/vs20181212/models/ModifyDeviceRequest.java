// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDeviceRequest} extends {@link RequestModel}
 *
 * <p>ModifyDeviceRequest</p>
 */
public class ModifyDeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmMethod")
    private String alarmMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoDirectory")
    private Boolean autoDirectory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPos")
    private Boolean autoPos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoStart")
    private Boolean autoStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GbId")
    private String gbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Latitude")
    private String latitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Longitude")
    private String longitude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentId")
    private String parentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private Long port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PosInterval")
    private Long posInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendor")
    private String vendor;

    private ModifyDeviceRequest(Builder builder) {
        super(builder);
        this.alarmMethod = builder.alarmMethod;
        this.autoDirectory = builder.autoDirectory;
        this.autoPos = builder.autoPos;
        this.autoStart = builder.autoStart;
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.gbId = builder.gbId;
        this.groupId = builder.groupId;
        this.id = builder.id;
        this.ip = builder.ip;
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.params = builder.params;
        this.parentId = builder.parentId;
        this.password = builder.password;
        this.port = builder.port;
        this.posInterval = builder.posInterval;
        this.type = builder.type;
        this.url = builder.url;
        this.username = builder.username;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmMethod
     */
    public String getAlarmMethod() {
        return this.alarmMethod;
    }

    /**
     * @return autoDirectory
     */
    public Boolean getAutoDirectory() {
        return this.autoDirectory;
    }

    /**
     * @return autoPos
     */
    public Boolean getAutoPos() {
        return this.autoPos;
    }

    /**
     * @return autoStart
     */
    public Boolean getAutoStart() {
        return this.autoStart;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return gbId
     */
    public String getGbId() {
        return this.gbId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return latitude
     */
    public String getLatitude() {
        return this.latitude;
    }

    /**
     * @return longitude
     */
    public String getLongitude() {
        return this.longitude;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return port
     */
    public Long getPort() {
        return this.port;
    }

    /**
     * @return posInterval
     */
    public Long getPosInterval() {
        return this.posInterval;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<ModifyDeviceRequest, Builder> {
        private String alarmMethod; 
        private Boolean autoDirectory; 
        private Boolean autoPos; 
        private Boolean autoStart; 
        private String description; 
        private String directoryId; 
        private String gbId; 
        private String groupId; 
        private String id; 
        private String ip; 
        private String latitude; 
        private String longitude; 
        private String name; 
        private Long ownerId; 
        private String params; 
        private String parentId; 
        private String password; 
        private Long port; 
        private Long posInterval; 
        private String type; 
        private String url; 
        private String username; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDeviceRequest request) {
            super(request);
            this.alarmMethod = request.alarmMethod;
            this.autoDirectory = request.autoDirectory;
            this.autoPos = request.autoPos;
            this.autoStart = request.autoStart;
            this.description = request.description;
            this.directoryId = request.directoryId;
            this.gbId = request.gbId;
            this.groupId = request.groupId;
            this.id = request.id;
            this.ip = request.ip;
            this.latitude = request.latitude;
            this.longitude = request.longitude;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.params = request.params;
            this.parentId = request.parentId;
            this.password = request.password;
            this.port = request.port;
            this.posInterval = request.posInterval;
            this.type = request.type;
            this.url = request.url;
            this.username = request.username;
            this.vendor = request.vendor;
        } 

        /**
         * AlarmMethod.
         */
        public Builder alarmMethod(String alarmMethod) {
            this.putQueryParameter("AlarmMethod", alarmMethod);
            this.alarmMethod = alarmMethod;
            return this;
        }

        /**
         * AutoDirectory.
         */
        public Builder autoDirectory(Boolean autoDirectory) {
            this.putQueryParameter("AutoDirectory", autoDirectory);
            this.autoDirectory = autoDirectory;
            return this;
        }

        /**
         * AutoPos.
         */
        public Builder autoPos(Boolean autoPos) {
            this.putQueryParameter("AutoPos", autoPos);
            this.autoPos = autoPos;
            return this;
        }

        /**
         * AutoStart.
         */
        public Builder autoStart(Boolean autoStart) {
            this.putQueryParameter("AutoStart", autoStart);
            this.autoStart = autoStart;
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
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * GbId.
         */
        public Builder gbId(String gbId) {
            this.putQueryParameter("GbId", gbId);
            this.gbId = gbId;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * Latitude.
         */
        public Builder latitude(String latitude) {
            this.putQueryParameter("Latitude", latitude);
            this.latitude = latitude;
            return this;
        }

        /**
         * Longitude.
         */
        public Builder longitude(String longitude) {
            this.putQueryParameter("Longitude", longitude);
            this.longitude = longitude;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * ParentId.
         */
        public Builder parentId(String parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
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
         * Port.
         */
        public Builder port(Long port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * PosInterval.
         */
        public Builder posInterval(Long posInterval) {
            this.putQueryParameter("PosInterval", posInterval);
            this.posInterval = posInterval;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
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

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public ModifyDeviceRequest build() {
            return new ModifyDeviceRequest(this);
        } 

    } 

}
