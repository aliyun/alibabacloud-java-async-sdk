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
 * {@link DescribeParentPlatformResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParentPlatformResponseBody</p>
 */
public class DescribeParentPlatformResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoStart")
    private Boolean autoStart;

    @com.aliyun.core.annotation.NameInMap("ClientAuth")
    private Boolean clientAuth;

    @com.aliyun.core.annotation.NameInMap("ClientGbId")
    private String clientGbId;

    @com.aliyun.core.annotation.NameInMap("ClientIp")
    private String clientIp;

    @com.aliyun.core.annotation.NameInMap("ClientPassword")
    private String clientPassword;

    @com.aliyun.core.annotation.NameInMap("ClientPort")
    private Long clientPort;

    @com.aliyun.core.annotation.NameInMap("ClientUsername")
    private String clientUsername;

    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GbId")
    private String gbId;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Port")
    private Long port;

    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeParentPlatformResponseBody(Builder builder) {
        this.autoStart = builder.autoStart;
        this.clientAuth = builder.clientAuth;
        this.clientGbId = builder.clientGbId;
        this.clientIp = builder.clientIp;
        this.clientPassword = builder.clientPassword;
        this.clientPort = builder.clientPort;
        this.clientUsername = builder.clientUsername;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.gbId = builder.gbId;
        this.id = builder.id;
        this.ip = builder.ip;
        this.name = builder.name;
        this.port = builder.port;
        this.protocol = builder.protocol;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParentPlatformResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoStart
     */
    public Boolean getAutoStart() {
        return this.autoStart;
    }

    /**
     * @return clientAuth
     */
    public Boolean getClientAuth() {
        return this.clientAuth;
    }

    /**
     * @return clientGbId
     */
    public String getClientGbId() {
        return this.clientGbId;
    }

    /**
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * @return clientPassword
     */
    public String getClientPassword() {
        return this.clientPassword;
    }

    /**
     * @return clientPort
     */
    public Long getClientPort() {
        return this.clientPort;
    }

    /**
     * @return clientUsername
     */
    public String getClientUsername() {
        return this.clientUsername;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gbId
     */
    public String getGbId() {
        return this.gbId;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return port
     */
    public Long getPort() {
        return this.port;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Boolean autoStart; 
        private Boolean clientAuth; 
        private String clientGbId; 
        private String clientIp; 
        private String clientPassword; 
        private Long clientPort; 
        private String clientUsername; 
        private String createdTime; 
        private String description; 
        private String gbId; 
        private String id; 
        private String ip; 
        private String name; 
        private Long port; 
        private String protocol; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(DescribeParentPlatformResponseBody model) {
            this.autoStart = model.autoStart;
            this.clientAuth = model.clientAuth;
            this.clientGbId = model.clientGbId;
            this.clientIp = model.clientIp;
            this.clientPassword = model.clientPassword;
            this.clientPort = model.clientPort;
            this.clientUsername = model.clientUsername;
            this.createdTime = model.createdTime;
            this.description = model.description;
            this.gbId = model.gbId;
            this.id = model.id;
            this.ip = model.ip;
            this.name = model.name;
            this.port = model.port;
            this.protocol = model.protocol;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>Specifies whether to enable the parent platform automatically. Valid values:</p>
         * <ul>
         * <li>false (default)</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoStart(Boolean autoStart) {
            this.autoStart = autoStart;
            return this;
        }

        /**
         * <p>Specifies whether to enable local authentication. Valid values:</p>
         * <ul>
         * <li>true (default)</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder clientAuth(Boolean clientAuth) {
            this.clientAuth = clientAuth;
            return this;
        }

        /**
         * <p>The local GB ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31010*****317542006</p>
         */
        public Builder clientGbId(String clientGbId) {
            this.clientGbId = clientGbId;
            return this;
        }

        /**
         * <p>The local SIP service IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        public Builder clientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }

        /**
         * <p>The local password.</p>
         * 
         * <strong>example:</strong>
         * <p>admin123</p>
         */
        public Builder clientPassword(String clientPassword) {
            this.clientPassword = clientPassword;
            return this;
        }

        /**
         * <p>The local SIP service port.</p>
         * 
         * <strong>example:</strong>
         * <p>5160</p>
         */
        public Builder clientPort(Long clientPort) {
            this.clientPort = clientPort;
            return this;
        }

        /**
         * <p>The local username.</p>
         * 
         * <strong>example:</strong>
         * <p>user01</p>
         */
        public Builder clientUsername(String clientUsername) {
            this.clientUsername = clientUsername;
            return this;
        }

        /**
         * <p>The time when the parent platform was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-10T21:00:00Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The description of the parent platform.</p>
         * 
         * <strong>example:</strong>
         * <p>级联平台描述</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The GB ID of the parent platform.</p>
         * 
         * <strong>example:</strong>
         * <p>31000*****2170123451</p>
         */
        public Builder gbId(String gbId) {
            this.gbId = gbId;
            return this;
        }

        /**
         * <p>The ID of the parent platform.</p>
         * 
         * <strong>example:</strong>
         * <p>359*****374-cn-qingdao</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The SIP service IP address of the parent platform.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.10.10</p>
         */
        public Builder ip(String ip) {
            this.ip = ip;
            return this;
        }

        /**
         * <p>The name of the parent platform.</p>
         * 
         * <strong>example:</strong>
         * <p>国标级联平台测试</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The SIP service port of the parent platform.</p>
         * 
         * <strong>example:</strong>
         * <p>5060</p>
         */
        public Builder port(Long port) {
            this.port = port;
            return this;
        }

        /**
         * <p>The protocol of the parent platform. Valid values:</p>
         * <ul>
         * <li>gb28181 (GB standard)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gb28181</p>
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the parent platform. Valid values:</p>
         * <ul>
         * <li>on (online)</li>
         * <li>off (offline)</li>
         * <li>failed (failed)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeParentPlatformResponseBody build() {
            return new DescribeParentPlatformResponseBody(this);
        } 

    } 

}
