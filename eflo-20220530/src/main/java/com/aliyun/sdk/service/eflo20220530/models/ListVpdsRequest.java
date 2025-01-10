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
 * {@link ListVpdsRequest} extends {@link RequestModel}
 *
 * <p>ListVpdsRequest</p>
 */
public class ListVpdsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnablePage")
    private Boolean enablePage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FilterErId")
    private String filterErId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ForSelect")
    private Boolean forSelect;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpdId")
    private String vpdId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpdName")
    private String vpdName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WithDependence")
    private Boolean withDependence;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WithoutVcc")
    private Boolean withoutVcc;

    private ListVpdsRequest(Builder builder) {
        super(builder);
        this.enablePage = builder.enablePage;
        this.filterErId = builder.filterErId;
        this.forSelect = builder.forSelect;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.tag = builder.tag;
        this.vpdId = builder.vpdId;
        this.vpdName = builder.vpdName;
        this.withDependence = builder.withDependence;
        this.withoutVcc = builder.withoutVcc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpdsRequest create() {
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
     * @return filterErId
     */
    public String getFilterErId() {
        return this.filterErId;
    }

    /**
     * @return forSelect
     */
    public Boolean getForSelect() {
        return this.forSelect;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vpdId
     */
    public String getVpdId() {
        return this.vpdId;
    }

    /**
     * @return vpdName
     */
    public String getVpdName() {
        return this.vpdName;
    }

    /**
     * @return withDependence
     */
    public Boolean getWithDependence() {
        return this.withDependence;
    }

    /**
     * @return withoutVcc
     */
    public Boolean getWithoutVcc() {
        return this.withoutVcc;
    }

    public static final class Builder extends Request.Builder<ListVpdsRequest, Builder> {
        private Boolean enablePage; 
        private String filterErId; 
        private Boolean forSelect; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private String status; 
        private java.util.List<Tag> tag; 
        private String vpdId; 
        private String vpdName; 
        private Boolean withDependence; 
        private Boolean withoutVcc; 

        private Builder() {
            super();
        } 

        private Builder(ListVpdsRequest request) {
            super(request);
            this.enablePage = request.enablePage;
            this.filterErId = request.filterErId;
            this.forSelect = request.forSelect;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.status = request.status;
            this.tag = request.tag;
            this.vpdId = request.vpdId;
            this.vpdName = request.vpdName;
            this.withDependence = request.withDependence;
            this.withoutVcc = request.withoutVcc;
        } 

        /**
         * <p>Specifies whether to enable paged query.</p>
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
         * <p>Queries the network segments of Lingjun that are not bound to a specified Lingjun HUB.</p>
         * 
         * <strong>example:</strong>
         * <p>er-kkopgtne</p>
         */
        public Builder filterErId(String filterErId) {
            this.putBodyParameter("FilterErId", filterErId);
            this.filterErId = filterErId;
            return this;
        }

        /**
         * <p>If you select a drop-down list, only the basic information (including the instance ID and instance name) is returned. Possible values:</p>
         * <ul>
         * <li><strong>true</strong>: Select Query Use from the drop-down list.</li>
         * <li><strong>false</strong>: Normal queries are used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder forSelect(Boolean forSelect) {
            this.putBodyParameter("ForSelect", forSelect);
            this.forSelect = forSelect;
            return this;
        }

        /**
         * <p>The page number of the page to return. Start value: 1 Default value: 1.</p>
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
         * <p>The number of entries per page.</p>
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
         * <p>The resource group ID.</p>
         * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.htm?spm=a2c4g.11186623.0.0.29e15d7akXhpuu">Resource groups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aeky5f3qx6ceapq</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The status of the CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>Available</strong>: Normal.</li>
         * <li><strong>Not Available</strong>: Not available.</li>
         * <li><strong>Executing</strong>: The task is being executed.</li>
         * <li><strong>Deleting</strong>: The account is being deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tag information.</p>
         * <p>You can specify up to 20 tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the VPD instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-fuliephf</p>
         */
        public Builder vpdId(String vpdId) {
            this.putBodyParameter("VpdId", vpdId);
            this.vpdId = vpdId;
            return this;
        }

        /**
         * <p>The name of the VPD instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-1</p>
         */
        public Builder vpdName(String vpdName) {
            this.putBodyParameter("VpdName", vpdName);
            this.vpdName = vpdName;
            return this;
        }

        /**
         * <p>Specifies whether to include the dependent resource information. We recommend that you do not query the dependent resource information when you query by page. You can query the dependent resource information separately when you delete it. Possible values:</p>
         * <ul>
         * <li><strong>true</strong>: with dependency information.</li>
         * <li><strong>false</strong>: does not include dependency information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder withDependence(Boolean withDependence) {
            this.putBodyParameter("WithDependence", withDependence);
            this.withDependence = withDependence;
            return this;
        }

        /**
         * <p>Queries the information about a Lingjun CIDR block that is not bound to a Lingjun connection. Possible values:</p>
         * <ul>
         * <li><strong>true</strong>: filters out VPDs that have been bound to VCC</li>
         * <li><strong>false</strong>: does not filter VPD that has been bound to VCC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder withoutVcc(Boolean withoutVcc) {
            this.putBodyParameter("WithoutVcc", withoutVcc);
            this.withoutVcc = withoutVcc;
            return this;
        }

        @Override
        public ListVpdsRequest build() {
            return new ListVpdsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListVpdsRequest} extends {@link TeaModel}
     *
     * <p>ListVpdsRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key of the VPN attachment.</p>
             * <p>You cannot specify an empty string as a tag key. It can be up to 64 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
             * <p>You can specify at most 20 tag keys in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-vpd-region</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the VPN connection.</p>
             * <p>The tag value can be empty or a string of up to 128 characters. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
             * <p>Each key-value pair must be unique. You can specify values for at most 20 tag keys in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>wulanchabu</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
