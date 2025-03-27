// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListProjectsRequest} extends {@link RequestModel}
 *
 * <p>ListProjectsRequest</p>
 */
public class ListProjectsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AliyunResourceGroupId")
    private String aliyunResourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AliyunResourceTags")
    private java.util.List<AliyunResourceTags> aliyunResourceTags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DevEnvironmentEnabled")
    private Boolean devEnvironmentEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DevRoleDisabled")
    private Boolean devRoleDisabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ids")
    private java.util.List<Long> ids;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Names")
    private java.util.List<String> names;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PaiTaskEnabled")
    private Boolean paiTaskEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListProjectsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.aliyunResourceGroupId = builder.aliyunResourceGroupId;
        this.aliyunResourceTags = builder.aliyunResourceTags;
        this.devEnvironmentEnabled = builder.devEnvironmentEnabled;
        this.devRoleDisabled = builder.devRoleDisabled;
        this.ids = builder.ids;
        this.names = builder.names;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.paiTaskEnabled = builder.paiTaskEnabled;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsRequest create() {
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
     * @return aliyunResourceGroupId
     */
    public String getAliyunResourceGroupId() {
        return this.aliyunResourceGroupId;
    }

    /**
     * @return aliyunResourceTags
     */
    public java.util.List<AliyunResourceTags> getAliyunResourceTags() {
        return this.aliyunResourceTags;
    }

    /**
     * @return devEnvironmentEnabled
     */
    public Boolean getDevEnvironmentEnabled() {
        return this.devEnvironmentEnabled;
    }

    /**
     * @return devRoleDisabled
     */
    public Boolean getDevRoleDisabled() {
        return this.devRoleDisabled;
    }

    /**
     * @return ids
     */
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    /**
     * @return names
     */
    public java.util.List<String> getNames() {
        return this.names;
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
     * @return paiTaskEnabled
     */
    public Boolean getPaiTaskEnabled() {
        return this.paiTaskEnabled;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListProjectsRequest, Builder> {
        private String regionId; 
        private String aliyunResourceGroupId; 
        private java.util.List<AliyunResourceTags> aliyunResourceTags; 
        private Boolean devEnvironmentEnabled; 
        private Boolean devRoleDisabled; 
        private java.util.List<Long> ids; 
        private java.util.List<String> names; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean paiTaskEnabled; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.aliyunResourceGroupId = request.aliyunResourceGroupId;
            this.aliyunResourceTags = request.aliyunResourceTags;
            this.devEnvironmentEnabled = request.devEnvironmentEnabled;
            this.devRoleDisabled = request.devRoleDisabled;
            this.ids = request.ids;
            this.names = request.names;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.paiTaskEnabled = request.paiTaskEnabled;
            this.status = request.status;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud resource group to which the workspaces belong. You can log on to the <a href="https://resourcemanager.console.aliyun.com/resource-groups">Resource Management console</a> and go to the Resource Group page to query the ID.</p>
         * <p>This parameter is used to query the information about workspaces that belong to a specific resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzbn7pti3zff</p>
         */
        public Builder aliyunResourceGroupId(String aliyunResourceGroupId) {
            this.putBodyParameter("AliyunResourceGroupId", aliyunResourceGroupId);
            this.aliyunResourceGroupId = aliyunResourceGroupId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder aliyunResourceTags(java.util.List<AliyunResourceTags> aliyunResourceTags) {
            String aliyunResourceTagsShrink = shrink(aliyunResourceTags, "AliyunResourceTags", "json");
            this.putBodyParameter("AliyunResourceTags", aliyunResourceTagsShrink);
            this.aliyunResourceTags = aliyunResourceTags;
            return this;
        }

        /**
         * <p>Specifies whether the development environment is enabled. Valid values:</p>
         * <ul>
         * <li>true: The development environment is enabled. In this case, the development environment is isolated from the production environment in a workspace.</li>
         * <li>false: The development environment is disabled. In this case, only the production environment is used in a workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder devEnvironmentEnabled(Boolean devEnvironmentEnabled) {
            this.putBodyParameter("DevEnvironmentEnabled", devEnvironmentEnabled);
            this.devEnvironmentEnabled = devEnvironmentEnabled;
            return this;
        }

        /**
         * <p>Specifies whether the Develop role is disabled. Valid values:</p>
         * <ul>
         * <li>false (default)</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder devRoleDisabled(Boolean devRoleDisabled) {
            this.putBodyParameter("DevRoleDisabled", devRoleDisabled);
            this.devRoleDisabled = devRoleDisabled;
            return this;
        }

        /**
         * <p>The IDs of the DataWorks workspaces.</p>
         */
        public Builder ids(java.util.List<Long> ids) {
            String idsShrink = shrink(ids, "Ids", "json");
            this.putBodyParameter("Ids", idsShrink);
            this.ids = ids;
            return this;
        }

        /**
         * <p>The names of the DataWorks workspaces.</p>
         */
        public Builder names(java.util.List<String> names) {
            String namesShrink = shrink(names, "Names", "json");
            this.putBodyParameter("Names", namesShrink);
            this.names = names;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
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
         * <p>Specifies whether scheduling of Platform for AI (PAI) tasks is enabled. Valid values:</p>
         * <ul>
         * <li>true: Scheduling of PAI tasks is enabled. In this case, you can create a PAI node in a DataWorks workspace and configure scheduling properties for the node to implement periodic scheduling of PAI tasks.</li>
         * <li>false: Scheduling of PAI tasks is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder paiTaskEnabled(Boolean paiTaskEnabled) {
            this.putBodyParameter("PaiTaskEnabled", paiTaskEnabled);
            this.paiTaskEnabled = paiTaskEnabled;
            return this;
        }

        /**
         * <p>The status of the workspaces. Valid values:</p>
         * <ul>
         * <li>Available</li>
         * <li>Initializing</li>
         * <li>InitFailed</li>
         * <li>Forbidden</li>
         * <li>Deleting</li>
         * <li>DeleteFailed</li>
         * <li>Frozen</li>
         * <li>Updating</li>
         * <li>UpdateFailed</li>
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

        @Override
        public ListProjectsRequest build() {
            return new ListProjectsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListProjectsRequest} extends {@link TeaModel}
     *
     * <p>ListProjectsRequest</p>
     */
    public static class AliyunResourceTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private AliyunResourceTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AliyunResourceTags create() {
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

            private Builder() {
            } 

            private Builder(AliyunResourceTags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>batch</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>blue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AliyunResourceTags build() {
                return new AliyunResourceTags(this);
            } 

        } 

    }
}
