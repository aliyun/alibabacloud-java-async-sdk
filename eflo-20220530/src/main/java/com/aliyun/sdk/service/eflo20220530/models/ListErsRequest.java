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
 * {@link ListErsRequest} extends {@link RequestModel}
 *
 * <p>ListErsRequest</p>
 */
public class ListErsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnablePage")
    private Boolean enablePage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErId")
    private String erId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErName")
    private String erName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MasterZoneId")
    private String masterZoneId;

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

    private ListErsRequest(Builder builder) {
        super(builder);
        this.enablePage = builder.enablePage;
        this.erId = builder.erId;
        this.erName = builder.erName;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.masterZoneId = builder.masterZoneId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListErsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enablePage
     */
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    /**
     * @return erId
     */
    public String getErId() {
        return this.erId;
    }

    /**
     * @return erName
     */
    public String getErName() {
        return this.erName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return masterZoneId
     */
    public String getMasterZoneId() {
        return this.masterZoneId;
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

    public static final class Builder extends Request.Builder<ListErsRequest, Builder> {
        private Boolean enablePage; 
        private String erId; 
        private String erName; 
        private String instanceId; 
        private String instanceType; 
        private String masterZoneId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListErsRequest request) {
            super(request);
            this.enablePage = request.enablePage;
            this.erId = request.erId;
            this.erName = request.erName;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.masterZoneId = request.masterZoneId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>Specifies whether to enable paged query. Valid values:</p>
         * <ul>
         * <li>true: enables paged query.</li>
         * <li>false: Paged query is disabled.</li>
         * </ul>
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
         * <p>The ID of the Lingjun HUB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>er-kkopgtne</p>
         */
        public Builder erId(String erId) {
            this.putBodyParameter("ErId", erId);
            this.erId = erId;
            return this;
        }

        /**
         * <p>Lingjun HUB name.</p>
         * 
         * <strong>example:</strong>
         * <p>er-heyuan-main</p>
         */
        public Builder erName(String erName) {
            this.putBodyParameter("ErName", erName);
            this.erName = erName;
            return this;
        }

        /**
         * <p>The ID of the network instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-209300qha01</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of the attached network instance. Valid values:</p>
         * <ul>
         * <li><strong>VPD</strong></li>
         * <li><strong>VCC</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VCC</p>
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The primary zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b</p>
         */
        public Builder masterZoneId(String masterZoneId) {
            this.putBodyParameter("MasterZoneId", masterZoneId);
            this.masterZoneId = masterZoneId;
            return this;
        }

        /**
         * <p>The page number to return. Pages start from page 1. Default value: 1.</p>
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
         * <p>The number of entries to return on each page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>Resource group instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmwfm33rlt6zi</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ListErsRequest build() {
            return new ListErsRequest(this);
        } 

    } 

}
