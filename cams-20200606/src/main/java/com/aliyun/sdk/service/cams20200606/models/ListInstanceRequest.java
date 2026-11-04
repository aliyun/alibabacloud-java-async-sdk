// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link ListInstanceRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceRequest</p>
 */
public class ListInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindId")
    private String bindId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelType")
    private String channelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterStr")
    private String filterStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsBind")
    private Boolean isBind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageIndex")
    private Long pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubmitTime")
    private String submitTime;

    private ListInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bindId = builder.bindId;
        this.channelType = builder.channelType;
        this.filterStr = builder.filterStr;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.isBind = builder.isBind;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.submitTime = builder.submitTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bindId
     */
    public String getBindId() {
        return this.bindId;
    }

    /**
     * @return channelType
     */
    public String getChannelType() {
        return this.channelType;
    }

    /**
     * @return filterStr
     */
    public String getFilterStr() {
        return this.filterStr;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return isBind
     */
    public Boolean getIsBind() {
        return this.isBind;
    }

    /**
     * @return pageIndex
     */
    public Long getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return submitTime
     */
    public String getSubmitTime() {
        return this.submitTime;
    }

    public static final class Builder extends Request.Builder<ListInstanceRequest, Builder> {
        private String regionId; 
        private String bindId; 
        private String channelType; 
        private String filterStr; 
        private String instanceId; 
        private String instanceName; 
        private Boolean isBind; 
        private Long pageIndex; 
        private Long pageSize; 
        private String resourceGroupId; 
        private String submitTime; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bindId = request.bindId;
            this.channelType = request.channelType;
            this.filterStr = request.filterStr;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.isBind = request.isBind;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.submitTime = request.submitTime;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The binding ID.</p>
         */
        public Builder bindId(String bindId) {
            this.putQueryParameter("BindId", bindId);
            this.bindId = bindId;
            return this;
        }

        /**
         * <p>The channel type. Valid values:</p>
         * <ul>
         * <li><p><strong>whatsapp</strong></p>
         * </li>
         * <li><p><strong>messenger</strong></p>
         * </li>
         * <li><p><strong>instagram</strong></p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;- <strong>viber</strong></p>
         * 
         * <strong>example:</strong>
         * <p>VIBER</p>
         */
        public Builder channelType(String channelType) {
            this.putQueryParameter("ChannelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * <p>The filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>aa</p>
         */
        public Builder filterStr(String filterStr) {
            this.putQueryParameter("FilterStr", filterStr);
            this.filterStr = filterStr;
            return this;
        }

        /**
         * <p>The instance ID. Only non-Alibaba Cloud hosts are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>r-uf6wd7pkyjwxvlxfhk</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>viber_ins</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>Indicates whether the instance is bound.</p>
         */
        public Builder isBind(Boolean isBind) {
            this.putQueryParameter("IsBind", isBind);
            this.isBind = isBind;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>92</p>
         */
        public Builder pageIndex(Long pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>87</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the enterprise resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The submit time in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-12 00:00:00</p>
         */
        public Builder submitTime(String submitTime) {
            this.putQueryParameter("SubmitTime", submitTime);
            this.submitTime = submitTime;
            return this;
        }

        @Override
        public ListInstanceRequest build() {
            return new ListInstanceRequest(this);
        } 

    } 

}
