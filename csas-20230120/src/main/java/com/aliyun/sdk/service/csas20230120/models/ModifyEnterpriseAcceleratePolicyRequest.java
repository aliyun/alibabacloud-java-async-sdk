// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ModifyEnterpriseAcceleratePolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyEnterpriseAcceleratePolicyRequest</p>
 */
public class ModifyEnterpriseAcceleratePolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccelerationType")
    private String accelerationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EapId")
    private String eapId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OnTls")
    private Integer onTls;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    @com.aliyun.core.annotation.Validation(maximum = 99)
    private Integer priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShowInClient")
    private Integer showInClient;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpstreamHost")
    @com.aliyun.core.annotation.Validation(required = true)
    private String upstreamHost;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpstreamPort")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer upstreamPort;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpstreamType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String upstreamType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserAttributeGroup")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userAttributeGroup;

    private ModifyEnterpriseAcceleratePolicyRequest(Builder builder) {
        super(builder);
        this.accelerationType = builder.accelerationType;
        this.description = builder.description;
        this.eapId = builder.eapId;
        this.name = builder.name;
        this.onTls = builder.onTls;
        this.priority = builder.priority;
        this.showInClient = builder.showInClient;
        this.upstreamHost = builder.upstreamHost;
        this.upstreamPort = builder.upstreamPort;
        this.upstreamType = builder.upstreamType;
        this.userAttributeGroup = builder.userAttributeGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyEnterpriseAcceleratePolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accelerationType
     */
    public String getAccelerationType() {
        return this.accelerationType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return eapId
     */
    public String getEapId() {
        return this.eapId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return onTls
     */
    public Integer getOnTls() {
        return this.onTls;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return showInClient
     */
    public Integer getShowInClient() {
        return this.showInClient;
    }

    /**
     * @return upstreamHost
     */
    public String getUpstreamHost() {
        return this.upstreamHost;
    }

    /**
     * @return upstreamPort
     */
    public Integer getUpstreamPort() {
        return this.upstreamPort;
    }

    /**
     * @return upstreamType
     */
    public String getUpstreamType() {
        return this.upstreamType;
    }

    /**
     * @return userAttributeGroup
     */
    public String getUserAttributeGroup() {
        return this.userAttributeGroup;
    }

    public static final class Builder extends Request.Builder<ModifyEnterpriseAcceleratePolicyRequest, Builder> {
        private String accelerationType; 
        private String description; 
        private String eapId; 
        private String name; 
        private Integer onTls; 
        private Integer priority; 
        private Integer showInClient; 
        private String upstreamHost; 
        private Integer upstreamPort; 
        private String upstreamType; 
        private String userAttributeGroup; 

        private Builder() {
            super();
        } 

        private Builder(ModifyEnterpriseAcceleratePolicyRequest request) {
            super(request);
            this.accelerationType = request.accelerationType;
            this.description = request.description;
            this.eapId = request.eapId;
            this.name = request.name;
            this.onTls = request.onTls;
            this.priority = request.priority;
            this.showInClient = request.showInClient;
            this.upstreamHost = request.upstreamHost;
            this.upstreamPort = request.upstreamPort;
            this.upstreamType = request.upstreamType;
            this.userAttributeGroup = request.userAttributeGroup;
        } 

        /**
         * AccelerationType.
         */
        public Builder accelerationType(String accelerationType) {
            this.putBodyParameter("AccelerationType", accelerationType);
            this.accelerationType = accelerationType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EapId.
         */
        public Builder eapId(String eapId) {
            this.putBodyParameter("EapId", eapId);
            this.eapId = eapId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OnTls.
         */
        public Builder onTls(Integer onTls) {
            this.putBodyParameter("OnTls", onTls);
            this.onTls = onTls;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * ShowInClient.
         */
        public Builder showInClient(Integer showInClient) {
            this.putBodyParameter("ShowInClient", showInClient);
            this.showInClient = showInClient;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12.34.56.XX</p>
         */
        public Builder upstreamHost(String upstreamHost) {
            this.putBodyParameter("UpstreamHost", upstreamHost);
            this.upstreamHost = upstreamHost;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder upstreamPort(Integer upstreamPort) {
            this.putBodyParameter("UpstreamPort", upstreamPort);
            this.upstreamPort = upstreamPort;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ga</p>
         */
        public Builder upstreamType(String upstreamType) {
            this.putBodyParameter("UpstreamType", upstreamType);
            this.upstreamType = upstreamType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userAttributeGroup(String userAttributeGroup) {
            this.putBodyParameter("UserAttributeGroup", userAttributeGroup);
            this.userAttributeGroup = userAttributeGroup;
            return this;
        }

        @Override
        public ModifyEnterpriseAcceleratePolicyRequest build() {
            return new ModifyEnterpriseAcceleratePolicyRequest(this);
        } 

    } 

}
