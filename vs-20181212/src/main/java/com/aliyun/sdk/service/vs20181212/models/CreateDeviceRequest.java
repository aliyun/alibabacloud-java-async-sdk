// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link CreateDeviceRequest} extends {@link RequestModel}
 *
 * <p>CreateDeviceRequest</p>
 */
public class CreateDeviceRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Dsn")
    private String dsn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GbId")
    private String gbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

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
    @com.aliyun.core.annotation.Validation(required = true)
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

    private CreateDeviceRequest(Builder builder) {
        super(builder);
        this.alarmMethod = builder.alarmMethod;
        this.autoDirectory = builder.autoDirectory;
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
        private Boolean autoDirectory; 
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

        private Builder(CreateDeviceRequest request) {
            super(request);
            this.alarmMethod = request.alarmMethod;
            this.autoDirectory = request.autoDirectory;
            this.autoPos = request.autoPos;
            this.autoStart = request.autoStart;
            this.description = request.description;
            this.directoryId = request.directoryId;
            this.dsn = request.dsn;
            this.gbId = request.gbId;
            this.groupId = request.groupId;
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
         * <p>GB-compliant alarm method to subscribe to. Valid values:</p>
         * <ul>
         * <li><p>0 (all)</p>
         * </li>
         * <li><p>5 (video alarm)</p>
         * </li>
         * <li><p>7 (other alarms)</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>An empty value means no subscription.</p>
         * </li>
         * <li><p>You can specify multiple values, separated by commas (,).</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>Whether to enable location subscription for the device. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoPos(Boolean autoPos) {
            this.putQueryParameter("AutoPos", autoPos);
            this.autoPos = autoPos;
            return this;
        }

        /**
         * <p>Whether to automatically start the stream. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoStart(Boolean autoStart) {
            this.putQueryParameter("AutoStart", autoStart);
            this.autoStart = autoStart;
            return this;
        }

        /**
         * <p>Device description.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx路口摄像头</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>ID of the folder that contains the device.</p>
         * 
         * <strong>example:</strong>
         * <p>399*****488-cn-qingdao</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>Device serial number.</p>
         * 
         * <strong>example:</strong>
         * <p>7D0*****4C0</p>
         */
        public Builder dsn(String dsn) {
            this.putQueryParameter("Dsn", dsn);
            this.dsn = dsn;
            return this;
        }

        /**
         * <p>GB-compliant device ID.</p>
         * <blockquote>
         * <p>This parameter applies only to GB-compliant protocols.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>31000000****00000002</p>
         */
        public Builder gbId(String gbId) {
            this.putQueryParameter("GbId", gbId);
            this.gbId = gbId;
            return this;
        }

        /**
         * <p>ID of the space that contains the device.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>348*****174-cn-qingdao</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>Device IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.10.10</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The dimension of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>119.20</p>
         */
        public Builder latitude(String latitude) {
            this.putQueryParameter("Latitude", latitude);
            this.latitude = latitude;
            return this;
        }

        /**
         * <p>Device longitude.</p>
         * 
         * <strong>example:</strong>
         * <p>45.00</p>
         */
        public Builder longitude(String longitude) {
            this.putQueryParameter("Longitude", longitude);
            this.longitude = longitude;
            return this;
        }

        /**
         * <p>Device name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx路口摄像头</p>
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
         * <p>Additional device parameters, formatted as a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>ID of the parent device. For example, the ID of the platform that hosts the camera.</p>
         * 
         * <strong>example:</strong>
         * <p>399*****774-cn-qingdao</p>
         */
        public Builder parentId(String parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * <p>Device password.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>Device port.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder port(Long port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>Location subscription interval, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder posInterval(Long posInterval) {
            this.putQueryParameter("PosInterval", posInterval);
            this.posInterval = posInterval;
            return this;
        }

        /**
         * <p>Device type. Valid values:</p>
         * <ul>
         * <li><p>ipc (camera)</p>
         * </li>
         * <li><p>platform (platform)</p>
         * </li>
         * <li><p>ied (intelligent device)</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ipc</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>Stream URL on the device.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://xxx/xxx</p>
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        /**
         * <p>Device username.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * <p>Device vendor.</p>
         * 
         * <strong>example:</strong>
         * <p>公司A</p>
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
