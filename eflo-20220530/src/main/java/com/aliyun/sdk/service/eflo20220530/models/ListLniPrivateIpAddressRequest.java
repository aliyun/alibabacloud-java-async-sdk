// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link ListLniPrivateIpAddressRequest} extends {@link RequestModel}
 *
 * <p>ListLniPrivateIpAddressRequest</p>
 */
public class ListLniPrivateIpAddressRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnablePage")
    private Boolean enablePage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IpName")
    private String ipName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
    private String networkInterfaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ListLniPrivateIpAddressRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.enablePage = builder.enablePage;
        this.ip = builder.ip;
        this.ipName = builder.ipName;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLniPrivateIpAddressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enablePage
     */
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return ipName
     */
    public String getIpName() {
        return this.ipName;
    }

    /**
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ListLniPrivateIpAddressRequest, Builder> {
        private String description; 
        private Boolean enablePage; 
        private String ip; 
        private String ipName; 
        private String networkInterfaceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListLniPrivateIpAddressRequest request) {
            super(request);
            this.description = request.description;
            this.enablePage = request.enablePage;
            this.ip = request.ip;
            this.ipName = request.ipName;
            this.networkInterfaceId = request.networkInterfaceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The description of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Whether pagination is required</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enablePage(Boolean enablePage) {
            this.putBodyParameter("EnablePage", enablePage);
            this.enablePage = enablePage;
            return this;
        }

        /**
         * <p>network interface controller IP address</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.98.10</p>
         */
        public Builder ip(String ip) {
            this.putBodyParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>IP unique identifier</p>
         * 
         * <strong>example:</strong>
         * <p>sip-tynhdh2s</p>
         */
        public Builder ipName(String ipName) {
            this.putBodyParameter("IpName", ipName);
            this.ipName = ipName;
            return this;
        }

        /**
         * <p>Lingjun network interface controller ID</p>
         * 
         * <strong>example:</strong>
         * <p>lni-2ze4uww7n6hsfzrwq77y</p>
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putBodyParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Obtain the index number of the current mouse click for an animation</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ListLniPrivateIpAddressRequest build() {
            return new ListLniPrivateIpAddressRequest(this);
        } 

    } 

}
