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
 * {@link SaveApgroupBasicConfigRequest} extends {@link RequestModel}
 *
 * <p>SaveApgroupBasicConfigRequest</p>
 */
public class SaveApgroupBasicConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Country")
    @com.aliyun.core.annotation.Validation(required = true)
    private String country;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dai")
    private String dai;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EchoInt")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer echoInt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Failover")
    private Integer failover;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InsecureAllowed")
    private Integer insecureAllowed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsConfigStrongConsistency")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean isConfigStrongConsistency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LanIp")
    private String lanIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LanMask")
    private String lanMask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LanStatus")
    private Integer lanStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogIp")
    private String logIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogLevel")
    private Integer logLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentApgroupId")
    private Long parentApgroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Passwd")
    private String passwd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Route")
    private String route;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scan")
    private Integer scan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TokenServer")
    private String tokenServer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vpn")
    private String vpn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkMode")
    private Integer workMode;

    private SaveApgroupBasicConfigRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.country = builder.country;
        this.dai = builder.dai;
        this.description = builder.description;
        this.echoInt = builder.echoInt;
        this.failover = builder.failover;
        this.id = builder.id;
        this.insecureAllowed = builder.insecureAllowed;
        this.isConfigStrongConsistency = builder.isConfigStrongConsistency;
        this.lanIp = builder.lanIp;
        this.lanMask = builder.lanMask;
        this.lanStatus = builder.lanStatus;
        this.logIp = builder.logIp;
        this.logLevel = builder.logLevel;
        this.name = builder.name;
        this.parentApgroupId = builder.parentApgroupId;
        this.passwd = builder.passwd;
        this.protocol = builder.protocol;
        this.route = builder.route;
        this.scan = builder.scan;
        this.tokenServer = builder.tokenServer;
        this.vpn = builder.vpn;
        this.workMode = builder.workMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveApgroupBasicConfigRequest create() {
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
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return dai
     */
    public String getDai() {
        return this.dai;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return echoInt
     */
    public Integer getEchoInt() {
        return this.echoInt;
    }

    /**
     * @return failover
     */
    public Integer getFailover() {
        return this.failover;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return insecureAllowed
     */
    public Integer getInsecureAllowed() {
        return this.insecureAllowed;
    }

    /**
     * @return isConfigStrongConsistency
     */
    public Boolean getIsConfigStrongConsistency() {
        return this.isConfigStrongConsistency;
    }

    /**
     * @return lanIp
     */
    public String getLanIp() {
        return this.lanIp;
    }

    /**
     * @return lanMask
     */
    public String getLanMask() {
        return this.lanMask;
    }

    /**
     * @return lanStatus
     */
    public Integer getLanStatus() {
        return this.lanStatus;
    }

    /**
     * @return logIp
     */
    public String getLogIp() {
        return this.logIp;
    }

    /**
     * @return logLevel
     */
    public Integer getLogLevel() {
        return this.logLevel;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentApgroupId
     */
    public Long getParentApgroupId() {
        return this.parentApgroupId;
    }

    /**
     * @return passwd
     */
    public String getPasswd() {
        return this.passwd;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return route
     */
    public String getRoute() {
        return this.route;
    }

    /**
     * @return scan
     */
    public Integer getScan() {
        return this.scan;
    }

    /**
     * @return tokenServer
     */
    public String getTokenServer() {
        return this.tokenServer;
    }

    /**
     * @return vpn
     */
    public String getVpn() {
        return this.vpn;
    }

    /**
     * @return workMode
     */
    public Integer getWorkMode() {
        return this.workMode;
    }

    public static final class Builder extends Request.Builder<SaveApgroupBasicConfigRequest, Builder> {
        private String appCode; 
        private String appName; 
        private String country; 
        private String dai; 
        private String description; 
        private Integer echoInt; 
        private Integer failover; 
        private Long id; 
        private Integer insecureAllowed; 
        private Boolean isConfigStrongConsistency; 
        private String lanIp; 
        private String lanMask; 
        private Integer lanStatus; 
        private String logIp; 
        private Integer logLevel; 
        private String name; 
        private Long parentApgroupId; 
        private String passwd; 
        private String protocol; 
        private String route; 
        private Integer scan; 
        private String tokenServer; 
        private String vpn; 
        private Integer workMode; 

        private Builder() {
            super();
        } 

        private Builder(SaveApgroupBasicConfigRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.country = request.country;
            this.dai = request.dai;
            this.description = request.description;
            this.echoInt = request.echoInt;
            this.failover = request.failover;
            this.id = request.id;
            this.insecureAllowed = request.insecureAllowed;
            this.isConfigStrongConsistency = request.isConfigStrongConsistency;
            this.lanIp = request.lanIp;
            this.lanMask = request.lanMask;
            this.lanStatus = request.lanStatus;
            this.logIp = request.logIp;
            this.logLevel = request.logLevel;
            this.name = request.name;
            this.parentApgroupId = request.parentApgroupId;
            this.passwd = request.passwd;
            this.protocol = request.protocol;
            this.route = request.route;
            this.scan = request.scan;
            this.tokenServer = request.tokenServer;
            this.vpn = request.vpn;
            this.workMode = request.workMode;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder country(String country) {
            this.putQueryParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * Dai.
         */
        public Builder dai(String dai) {
            this.putQueryParameter("Dai", dai);
            this.dai = dai;
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
         * <p>This parameter is required.</p>
         */
        public Builder echoInt(Integer echoInt) {
            this.putQueryParameter("EchoInt", echoInt);
            this.echoInt = echoInt;
            return this;
        }

        /**
         * Failover.
         */
        public Builder failover(Integer failover) {
            this.putQueryParameter("Failover", failover);
            this.failover = failover;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * InsecureAllowed.
         */
        public Builder insecureAllowed(Integer insecureAllowed) {
            this.putQueryParameter("InsecureAllowed", insecureAllowed);
            this.insecureAllowed = insecureAllowed;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isConfigStrongConsistency(Boolean isConfigStrongConsistency) {
            this.putQueryParameter("IsConfigStrongConsistency", isConfigStrongConsistency);
            this.isConfigStrongConsistency = isConfigStrongConsistency;
            return this;
        }

        /**
         * LanIp.
         */
        public Builder lanIp(String lanIp) {
            this.putQueryParameter("LanIp", lanIp);
            this.lanIp = lanIp;
            return this;
        }

        /**
         * LanMask.
         */
        public Builder lanMask(String lanMask) {
            this.putQueryParameter("LanMask", lanMask);
            this.lanMask = lanMask;
            return this;
        }

        /**
         * LanStatus.
         */
        public Builder lanStatus(Integer lanStatus) {
            this.putQueryParameter("LanStatus", lanStatus);
            this.lanStatus = lanStatus;
            return this;
        }

        /**
         * LogIp.
         */
        public Builder logIp(String logIp) {
            this.putQueryParameter("LogIp", logIp);
            this.logIp = logIp;
            return this;
        }

        /**
         * LogLevel.
         */
        public Builder logLevel(Integer logLevel) {
            this.putQueryParameter("LogLevel", logLevel);
            this.logLevel = logLevel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ParentApgroupId.
         */
        public Builder parentApgroupId(Long parentApgroupId) {
            this.putQueryParameter("ParentApgroupId", parentApgroupId);
            this.parentApgroupId = parentApgroupId;
            return this;
        }

        /**
         * Passwd.
         */
        public Builder passwd(String passwd) {
            this.putQueryParameter("Passwd", passwd);
            this.passwd = passwd;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * Route.
         */
        public Builder route(String route) {
            this.putQueryParameter("Route", route);
            this.route = route;
            return this;
        }

        /**
         * Scan.
         */
        public Builder scan(Integer scan) {
            this.putQueryParameter("Scan", scan);
            this.scan = scan;
            return this;
        }

        /**
         * TokenServer.
         */
        public Builder tokenServer(String tokenServer) {
            this.putQueryParameter("TokenServer", tokenServer);
            this.tokenServer = tokenServer;
            return this;
        }

        /**
         * Vpn.
         */
        public Builder vpn(String vpn) {
            this.putQueryParameter("Vpn", vpn);
            this.vpn = vpn;
            return this;
        }

        /**
         * WorkMode.
         */
        public Builder workMode(Integer workMode) {
            this.putQueryParameter("WorkMode", workMode);
            this.workMode = workMode;
            return this;
        }

        @Override
        public SaveApgroupBasicConfigRequest build() {
            return new SaveApgroupBasicConfigRequest(this);
        } 

    } 

}
