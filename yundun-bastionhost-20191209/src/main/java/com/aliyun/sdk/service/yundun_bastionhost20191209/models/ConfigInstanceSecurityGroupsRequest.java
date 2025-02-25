// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ConfigInstanceSecurityGroupsRequest} extends {@link RequestModel}
 *
 * <p>ConfigInstanceSecurityGroupsRequest</p>
 */
public class ConfigInstanceSecurityGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizedSecurityGroups")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > authorizedSecurityGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ConfigInstanceSecurityGroupsRequest(Builder builder) {
        super(builder);
        this.authorizedSecurityGroups = builder.authorizedSecurityGroups;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigInstanceSecurityGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizedSecurityGroups
     */
    public java.util.List < String > getAuthorizedSecurityGroups() {
        return this.authorizedSecurityGroups;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ConfigInstanceSecurityGroupsRequest, Builder> {
        private java.util.List < String > authorizedSecurityGroups; 
        private String instanceId; 
        private String lang; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigInstanceSecurityGroupsRequest request) {
            super(request);
            this.authorizedSecurityGroups = request.authorizedSecurityGroups;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.regionId = request.regionId;
        } 

        /**
         * <p>An array that consists of the IDs of authorized security groups.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp14u00sh39jvw5****</p>
         */
        public Builder authorizedSecurityGroups(java.util.List < String > authorizedSecurityGroups) {
            this.putQueryParameter("AuthorizedSecurityGroups", authorizedSecurityGroups);
            this.authorizedSecurityGroups = authorizedSecurityGroups;
            return this;
        }

        /**
         * <p>The ID of the bastion host.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-78v1gh****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ConfigInstanceSecurityGroupsRequest build() {
            return new ConfigInstanceSecurityGroupsRequest(this);
        } 

    } 

}
