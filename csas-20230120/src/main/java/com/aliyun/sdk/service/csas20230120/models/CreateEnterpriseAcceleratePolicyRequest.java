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
 * {@link CreateEnterpriseAcceleratePolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateEnterpriseAcceleratePolicyRequest</p>
 */
public class CreateEnterpriseAcceleratePolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccelerationType")
    private String accelerationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    @com.aliyun.core.annotation.Validation(maxLength = 99)
    private String priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShowInClient")
    private Integer showInClient;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpstreamHost")
    private String upstreamHost;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpstreamPort")
    private Integer upstreamPort;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpstreamType")
    private String upstreamType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserAttributeGroup")
    private String userAttributeGroup;

    private CreateEnterpriseAcceleratePolicyRequest(Builder builder) {
        super(builder);
        this.accelerationType = builder.accelerationType;
        this.description = builder.description;
        this.name = builder.name;
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

    public static CreateEnterpriseAcceleratePolicyRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return priority
     */
    public String getPriority() {
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

    public static final class Builder extends Request.Builder<CreateEnterpriseAcceleratePolicyRequest, Builder> {
        private String accelerationType; 
        private String description; 
        private String name; 
        private String priority; 
        private Integer showInClient; 
        private String upstreamHost; 
        private Integer upstreamPort; 
        private String upstreamType; 
        private String userAttributeGroup; 

        private Builder() {
            super();
        } 

        private Builder(CreateEnterpriseAcceleratePolicyRequest request) {
            super(request);
            this.accelerationType = request.accelerationType;
            this.description = request.description;
            this.name = request.name;
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
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(String priority) {
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
         * UpstreamHost.
         */
        public Builder upstreamHost(String upstreamHost) {
            this.putBodyParameter("UpstreamHost", upstreamHost);
            this.upstreamHost = upstreamHost;
            return this;
        }

        /**
         * UpstreamPort.
         */
        public Builder upstreamPort(Integer upstreamPort) {
            this.putBodyParameter("UpstreamPort", upstreamPort);
            this.upstreamPort = upstreamPort;
            return this;
        }

        /**
         * UpstreamType.
         */
        public Builder upstreamType(String upstreamType) {
            this.putBodyParameter("UpstreamType", upstreamType);
            this.upstreamType = upstreamType;
            return this;
        }

        /**
         * UserAttributeGroup.
         */
        public Builder userAttributeGroup(String userAttributeGroup) {
            this.putBodyParameter("UserAttributeGroup", userAttributeGroup);
            this.userAttributeGroup = userAttributeGroup;
            return this;
        }

        @Override
        public CreateEnterpriseAcceleratePolicyRequest build() {
            return new CreateEnterpriseAcceleratePolicyRequest(this);
        } 

    } 

}
