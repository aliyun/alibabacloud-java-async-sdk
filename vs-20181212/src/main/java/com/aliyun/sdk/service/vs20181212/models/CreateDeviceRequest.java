// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceRequest} extends {@link RequestModel}
 *
 * <p>CreateDeviceRequest</p>
 */
public class CreateDeviceRequest extends Request {
    @Query
    @NameInMap("AlarmMethod")
    private String alarmMethod;

    @Query
    @NameInMap("AutoPos")
    private Boolean autoPos;

    @Query
    @NameInMap("AutoStart")
    private Boolean autoStart;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("Dsn")
    private String dsn;

    @Query
    @NameInMap("GbId")
    private String gbId;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("Ip")
    private String ip;

    @Query
    @NameInMap("Latitude")
    private String latitude;

    @Query
    @NameInMap("Longitude")
    private String longitude;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Params")
    private String params;

    @Query
    @NameInMap("ParentId")
    private String parentId;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("Port")
    private Long port;

    @Query
    @NameInMap("PosInterval")
    private Long posInterval;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("Url")
    private String url;

    @Query
    @NameInMap("Username")
    private String username;

    @Query
    @NameInMap("Vendor")
    private String vendor;

    private CreateDeviceRequest(Builder builder) {
        super(builder);
        this.alarmMethod = builder.alarmMethod;
        this.autoPos = builder.autoPos;
        this.autoStart = builder.autoStart;
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.dsn = builder.dsn;
        this.gbId = builder.gbId;
        this.groupId = builder.groupId;
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

    public static CreateDeviceRequest create() {
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
     * @return dsn
     */
    public String getDsn() {
        return this.dsn;
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

    public static final class Builder extends Request.Builder<CreateDeviceRequest, Builder> {
        private String alarmMethod; 
        private Boolean autoPos; 
        private Boolean autoStart; 
        private String description; 
        private String directoryId; 
        private String dsn; 
        private String gbId; 
        private String groupId; 
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

        private Builder(CreateDeviceRequest response) {
            super(response);
            this.alarmMethod = response.alarmMethod;
            this.autoPos = response.autoPos;
            this.autoStart = response.autoStart;
            this.description = response.description;
            this.directoryId = response.directoryId;
            this.dsn = response.dsn;
            this.gbId = response.gbId;
            this.groupId = response.groupId;
            this.ip = response.ip;
            this.latitude = response.latitude;
            this.longitude = response.longitude;
            this.name = response.name;
            this.ownerId = response.ownerId;
            this.params = response.params;
            this.parentId = response.parentId;
            this.password = response.password;
            this.port = response.port;
            this.posInterval = response.posInterval;
            this.type = response.type;
            this.url = response.url;
            this.username = response.username;
            this.vendor = response.vendor;
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
         * Dsn.
         */
        public Builder dsn(String dsn) {
            this.putQueryParameter("Dsn", dsn);
            this.dsn = dsn;
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
        public CreateDeviceRequest build() {
            return new CreateDeviceRequest(this);
        } 

    } 

}
