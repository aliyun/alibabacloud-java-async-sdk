// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTriggerResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateTriggerResponseBody</p>
 */
public class UpdateTriggerResponseBody extends TeaModel {
    @NameInMap("createdTime")
    private String createdTime;

    @NameInMap("description")
    private String description;

    @NameInMap("domainName")
    private String domainName;

    @NameInMap("invocationRole")
    private String invocationRole;

    @NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @NameInMap("qualifier")
    private String qualifier;

    @NameInMap("sourceArn")
    private String sourceArn;

    @NameInMap("triggerConfig")
    private String triggerConfig;

    @NameInMap("triggerId")
    private String triggerId;

    @NameInMap("triggerName")
    private String triggerName;

    @NameInMap("triggerType")
    private String triggerType;

    @NameInMap("urlInternet")
    private String urlInternet;

    @NameInMap("urlIntranet")
    private String urlIntranet;

    private UpdateTriggerResponseBody(Builder builder) {
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.domainName = builder.domainName;
        this.invocationRole = builder.invocationRole;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.qualifier = builder.qualifier;
        this.sourceArn = builder.sourceArn;
        this.triggerConfig = builder.triggerConfig;
        this.triggerId = builder.triggerId;
        this.triggerName = builder.triggerName;
        this.triggerType = builder.triggerType;
        this.urlInternet = builder.urlInternet;
        this.urlIntranet = builder.urlIntranet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTriggerResponseBody create() {
        return builder().build();
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
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return invocationRole
     */
    public String getInvocationRole() {
        return this.invocationRole;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return sourceArn
     */
    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * @return triggerConfig
     */
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

    /**
     * @return triggerId
     */
    public String getTriggerId() {
        return this.triggerId;
    }

    /**
     * @return triggerName
     */
    public String getTriggerName() {
        return this.triggerName;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    /**
     * @return urlInternet
     */
    public String getUrlInternet() {
        return this.urlInternet;
    }

    /**
     * @return urlIntranet
     */
    public String getUrlIntranet() {
        return this.urlIntranet;
    }

    public static final class Builder {
        private String createdTime; 
        private String description; 
        private String domainName; 
        private String invocationRole; 
        private String lastModifiedTime; 
        private String qualifier; 
        private String sourceArn; 
        private String triggerConfig; 
        private String triggerId; 
        private String triggerName; 
        private String triggerType; 
        private String urlInternet; 
        private String urlIntranet; 

        /**
         * 创建时间
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * 域名名称，使用域名名称拼接上函数计算域名，可以采用HTTP协议调用到触发器对应版本的函数。例如{domainName}.cn-shanghai.fc.aliyuncs.com
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * 调用函数使用的RAM角色的ARN
         */
        public Builder invocationRole(String invocationRole) {
            this.invocationRole = invocationRole;
            return this;
        }

        /**
         * 上次修改时间
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * service版本
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * event source的Aliyun Resource Name（ARN
         */
        public Builder sourceArn(String sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }

        /**
         * trigger配置对象
         */
        public Builder triggerConfig(String triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }

        /**
         * triggerId.
         */
        public Builder triggerId(String triggerId) {
            this.triggerId = triggerId;
            return this;
        }

        /**
         * trigger名称
         */
        public Builder triggerName(String triggerName) {
            this.triggerName = triggerName;
            return this;
        }

        /**
         * trigger类型，如 oss, log, tablestore, timer, http, cdn_events, mns_topic
         */
        public Builder triggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }

        /**
         * 公网域名地址。在互联网可以通过HTTP协议或者HTTPS协议访问HTTP Trigger。
         */
        public Builder urlInternet(String urlInternet) {
            this.urlInternet = urlInternet;
            return this;
        }

        /**
         * 私网域名地址。在VPC可以通过HTTP协议或者HTTPS协议访问HTTP Trigger。
         */
        public Builder urlIntranet(String urlIntranet) {
            this.urlIntranet = urlIntranet;
            return this;
        }

        public UpdateTriggerResponseBody build() {
            return new UpdateTriggerResponseBody(this);
        } 

    } 

}
