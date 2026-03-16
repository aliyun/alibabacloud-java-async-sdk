// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link CreateResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceGroupRequest</p>
 */
public class CreateResourceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsResourceGroupWithOfficeSite")
    private Long isResourceGroupWithOfficeSite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    private String resourceGroupName;

    private CreateResourceGroupRequest(Builder builder) {
        super(builder);
        this.businessChannel = builder.businessChannel;
        this.isResourceGroupWithOfficeSite = builder.isResourceGroupWithOfficeSite;
        this.platform = builder.platform;
        this.resourceGroupName = builder.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessChannel
     */
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    /**
     * @return isResourceGroupWithOfficeSite
     */
    public Long getIsResourceGroupWithOfficeSite() {
        return this.isResourceGroupWithOfficeSite;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public static final class Builder extends Request.Builder<CreateResourceGroupRequest, Builder> {
        private String businessChannel; 
        private Long isResourceGroupWithOfficeSite; 
        private String platform; 
        private String resourceGroupName; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceGroupRequest request) {
            super(request);
            this.businessChannel = request.businessChannel;
            this.isResourceGroupWithOfficeSite = request.isResourceGroupWithOfficeSite;
            this.platform = request.platform;
            this.resourceGroupName = request.resourceGroupName;
        } 

        /**
         * BusinessChannel.
         */
        public Builder businessChannel(String businessChannel) {
            this.putQueryParameter("BusinessChannel", businessChannel);
            this.businessChannel = businessChannel;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isResourceGroupWithOfficeSite(Long isResourceGroupWithOfficeSite) {
            this.putQueryParameter("IsResourceGroupWithOfficeSite", isResourceGroupWithOfficeSite);
            this.isResourceGroupWithOfficeSite = isResourceGroupWithOfficeSite;
            return this;
        }

        /**
         * <blockquote>
         * <p> Set the value to AliyunConsole.</p>
         * </blockquote>
         * <ul>
         * <li>This parameter is not publicly available in other platforms.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliyunConsole</p>
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * <p>The name of the resource group.</p>
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putQueryParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        @Override
        public CreateResourceGroupRequest build() {
            return new CreateResourceGroupRequest(this);
        } 

    } 

}
