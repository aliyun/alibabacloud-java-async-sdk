// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTriggerResponseBody} extends {@link TeaModel}
 *
 * <p>GetTriggerResponseBody</p>
 */
public class GetTriggerResponseBody extends TeaModel {
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

    private GetTriggerResponseBody(Builder builder) {
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

    public static GetTriggerResponseBody create() {
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
         * ????????????
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
         * ???????????????????????????????????????????????????????????????????????????HTTP??????????????????????????????????????????????????????{domainName}.cn-shanghai.fc.aliyuncs.com
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * ?????????????????????RAM?????????ARN
         */
        public Builder invocationRole(String invocationRole) {
            this.invocationRole = invocationRole;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * service??????
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * event source???Aliyun Resource Name???ARN
         */
        public Builder sourceArn(String sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }

        /**
         * trigger????????????
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
         * trigger??????
         */
        public Builder triggerName(String triggerName) {
            this.triggerName = triggerName;
            return this;
        }

        /**
         * trigger???????????? oss, log, tablestore, timer, http, cdn_events, mns_topic
         */
        public Builder triggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }

        /**
         * ?????????????????????????????????????????????HTTP????????????HTTPS????????????HTTP Trigger???
         */
        public Builder urlInternet(String urlInternet) {
            this.urlInternet = urlInternet;
            return this;
        }

        /**
         * ????????????????????????VPC????????????HTTP????????????HTTPS????????????HTTP Trigger???
         */
        public Builder urlIntranet(String urlIntranet) {
            this.urlIntranet = urlIntranet;
            return this;
        }

        public GetTriggerResponseBody build() {
            return new GetTriggerResponseBody(this);
        } 

    } 

}
