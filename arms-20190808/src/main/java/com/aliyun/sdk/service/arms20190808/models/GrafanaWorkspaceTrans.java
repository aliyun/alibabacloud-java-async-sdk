// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrafanaWorkspaceTrans} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceTrans</p>
 */
public class GrafanaWorkspaceTrans extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiUrl")
    private String apiUrl;

    @com.aliyun.core.annotation.NameInMap("authType")
    private String authType;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private Float gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private Float gmtModified;

    @com.aliyun.core.annotation.NameInMap("grafanaWorkspaceId")
    private String grafanaWorkspaceId;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("processStatus")
    private String processStatus;

    @com.aliyun.core.annotation.NameInMap("transDetails")
    private java.util.List < GrafanaWorkspaceTransDetail > transDetails;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private GrafanaWorkspaceTrans(Builder builder) {
        this.apiUrl = builder.apiUrl;
        this.authType = builder.authType;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.grafanaWorkspaceId = builder.grafanaWorkspaceId;
        this.id = builder.id;
        this.msg = builder.msg;
        this.processStatus = builder.processStatus;
        this.transDetails = builder.transDetails;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceTrans create() {
        return builder().build();
    }

    /**
     * @return apiUrl
     */
    public String getApiUrl() {
        return this.apiUrl;
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return gmtCreate
     */
    public Float getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public Float getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return grafanaWorkspaceId
     */
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return processStatus
     */
    public String getProcessStatus() {
        return this.processStatus;
    }

    /**
     * @return transDetails
     */
    public java.util.List < GrafanaWorkspaceTransDetail > getTransDetails() {
        return this.transDetails;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String apiUrl; 
        private String authType; 
        private Float gmtCreate; 
        private Float gmtModified; 
        private String grafanaWorkspaceId; 
        private Long id; 
        private String msg; 
        private String processStatus; 
        private java.util.List < GrafanaWorkspaceTransDetail > transDetails; 
        private String userId; 

        /**
         * apiUrl.
         */
        public Builder apiUrl(String apiUrl) {
            this.apiUrl = apiUrl;
            return this;
        }

        /**
         * authType.
         */
        public Builder authType(String authType) {
            this.authType = authType;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(Float gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(Float gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * grafanaWorkspaceId.
         */
        public Builder grafanaWorkspaceId(String grafanaWorkspaceId) {
            this.grafanaWorkspaceId = grafanaWorkspaceId;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * processStatus.
         */
        public Builder processStatus(String processStatus) {
            this.processStatus = processStatus;
            return this;
        }

        /**
         * transDetails.
         */
        public Builder transDetails(java.util.List < GrafanaWorkspaceTransDetail > transDetails) {
            this.transDetails = transDetails;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public GrafanaWorkspaceTrans build() {
            return new GrafanaWorkspaceTrans(this);
        } 

    } 

}
