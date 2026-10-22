// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ModifyHostsActiveAddressTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyHostsActiveAddressTypeRequest</p>
 */
public class ModifyHostsActiveAddressTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActiveAddressType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String activeAddressType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hostIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyHostsActiveAddressTypeRequest(Builder builder) {
        super(builder);
        this.activeAddressType = builder.activeAddressType;
        this.hostIds = builder.hostIds;
        this.instanceId = builder.instanceId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHostsActiveAddressTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activeAddressType
     */
    public String getActiveAddressType() {
        return this.activeAddressType;
    }

    /**
     * @return hostIds
     */
    public String getHostIds() {
        return this.hostIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyHostsActiveAddressTypeRequest, Builder> {
        private String activeAddressType; 
        private String hostIds; 
        private String instanceId; 
        private Long projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHostsActiveAddressTypeRequest request) {
            super(request);
            this.activeAddressType = request.activeAddressType;
            this.hostIds = request.hostIds;
            this.instanceId = request.instanceId;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The new endpoint type of the host. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong>: Internet</li>
         * <li><strong>Private</strong>: private network</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        public Builder activeAddressType(String activeAddressType) {
            this.putQueryParameter("ActiveAddressType", activeAddressType);
            this.activeAddressType = activeAddressType;
            return this;
        }

        /**
         * <p>The IDs of the hosts whose endpoint types you want to modify. The value is a character string in JSON format. You can specify up to 100 host IDs.
         * You can invoke the <a href="https://help.aliyun.com/document_detail/200665.html">ListHosts</a> operation to obtain the value of this parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;1&quot;,&quot;2&quot;]</p>
         */
        public Builder hostIds(String hostIds) {
            this.putQueryParameter("HostIds", hostIds);
            this.hostIds = hostIds;
            return this;
        }

        /**
         * <p>The instance ID of the Bastionhost instance to which the host whose endpoint type you want to modify belongs.</p>
         * <blockquote>
         * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain the value of this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The area ID of the Bastionhost instance to which the host whose endpoint type you want to modify belongs.</p>
         * <blockquote>
         * <p>For more information about the mapping between area IDs and area names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and active zones</a>.</p>
         * </blockquote>
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
        public ModifyHostsActiveAddressTypeRequest build() {
            return new ModifyHostsActiveAddressTypeRequest(this);
        } 

    } 

}
