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
 * {@link ListProhibitedSoftwareRequest} extends {@link RequestModel}
 *
 * <p>ListProhibitedSoftwareRequest</p>
 */
public class ListProhibitedSoftwareRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceType")
    private String deviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessName")
    private String processName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SoftwareIds")
    private java.util.List<SoftwareIds> softwareIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagId")
    private TagId tagId;

    private ListProhibitedSoftwareRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.deviceType = builder.deviceType;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.policyId = builder.policyId;
        this.processName = builder.processName;
        this.softwareIds = builder.softwareIds;
        this.tagId = builder.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProhibitedSoftwareRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return processName
     */
    public String getProcessName() {
        return this.processName;
    }

    /**
     * @return softwareIds
     */
    public java.util.List<SoftwareIds> getSoftwareIds() {
        return this.softwareIds;
    }

    /**
     * @return tagId
     */
    public TagId getTagId() {
        return this.tagId;
    }

    public static final class Builder extends Request.Builder<ListProhibitedSoftwareRequest, Builder> {
        private Long currentPage; 
        private String deviceType; 
        private String name; 
        private Long pageSize; 
        private String policyId; 
        private String processName; 
        private java.util.List<SoftwareIds> softwareIds; 
        private TagId tagId; 

        private Builder() {
            super();
        } 

        private Builder(ListProhibitedSoftwareRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.deviceType = request.deviceType;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.policyId = request.policyId;
            this.processName = request.processName;
            this.softwareIds = request.softwareIds;
            this.tagId = request.tagId;
        } 

        /**
         * <p>The page number of the current page in a paged query. Valid values: 1 to 10000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The operating system type for which the prohibited software has configured processes.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        public Builder deviceType(String deviceType) {
            this.putQueryParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * <p>The name of the prohibited software.</p>
         * 
         * <strong>example:</strong>
         * <p>Thunder</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query. Valid values: 1 to 500.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the software prohibition policy. You can obtain the value from the following operations:</p>
         * <ul>
         * <li><a href="~~ListProhibitedPolicies~~">ListProhibitedPolicies</a>: Lists software prohibition policies.</li>
         * <li><a href="~~CreateProhibitedPolicy~~">CreateProhibitedPolicy</a>: Creates a software prohibition policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pid-5a1e8c3f7b09****</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The process name.</p>
         * 
         * <strong>example:</strong>
         * <p>Thunder.exe</p>
         */
        public Builder processName(String processName) {
            this.putQueryParameter("ProcessName", processName);
            this.processName = processName;
            return this;
        }

        /**
         * <p>The collection of prohibited software IDs. Duplicate values are not allowed.</p>
         */
        public Builder softwareIds(java.util.List<SoftwareIds> softwareIds) {
            this.putQueryParameter("SoftwareIds", softwareIds);
            this.softwareIds = softwareIds;
            return this;
        }

        /**
         * <p>The unique identifier of the prohibited software tag.</p>
         */
        public Builder tagId(TagId tagId) {
            String tagIdShrink = shrink(tagId, "TagId", "json");
            this.putQueryParameter("TagId", tagIdShrink);
            this.tagId = tagId;
            return this;
        }

        @Override
        public ListProhibitedSoftwareRequest build() {
            return new ListProhibitedSoftwareRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListProhibitedSoftwareRequest} extends {@link TeaModel}
     *
     * <p>ListProhibitedSoftwareRequest</p>
     */
    public static class SoftwareIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("SoftwareId")
        private String softwareId;

        private SoftwareIds(Builder builder) {
            this.isDefault = builder.isDefault;
            this.softwareId = builder.softwareId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoftwareIds create() {
            return builder().build();
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return softwareId
         */
        public String getSoftwareId() {
            return this.softwareId;
        }

        public static final class Builder {
            private Boolean isDefault; 
            private String softwareId; 

            private Builder() {
            } 

            private Builder(SoftwareIds model) {
                this.isDefault = model.isDefault;
                this.softwareId = model.softwareId;
            } 

            /**
             * <p>Indicates whether the prohibited software is a system built-in prohibited software. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: A system built-in prohibited software that is shared across all Alibaba Cloud accounts and cannot be modified or deleted.</li>
             * <li><strong>false</strong>: Custom prohibited software under the current Alibaba Cloud account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The ID of the prohibited software. You can obtain the value from the following operations:</p>
             * <ul>
             * <li><a href="~~ListProhibitedSoftware~~">ListProhibitedSoftware</a>: Lists prohibited software.</li>
             * <li><a href="~~CreateProhibitedSoftware~~">CreateProhibitedSoftware</a>: Creates custom prohibited software.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>swb-d9f669a09746****</p>
             */
            public Builder softwareId(String softwareId) {
                this.softwareId = softwareId;
                return this;
            }

            public SoftwareIds build() {
                return new SoftwareIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProhibitedSoftwareRequest} extends {@link TeaModel}
     *
     * <p>ListProhibitedSoftwareRequest</p>
     */
    public static class TagId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("TagId")
        private String tagId;

        private TagId(Builder builder) {
            this.isDefault = builder.isDefault;
            this.tagId = builder.tagId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagId create() {
            return builder().build();
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return tagId
         */
        public String getTagId() {
            return this.tagId;
        }

        public static final class Builder {
            private Boolean isDefault; 
            private String tagId; 

            private Builder() {
            } 

            private Builder(TagId model) {
                this.isDefault = model.isDefault;
                this.tagId = model.tagId;
            } 

            /**
             * <p>Indicates whether the prohibited software tag is a system built-in tag. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: A system built-in tag that is shared across all Alibaba Cloud accounts and cannot be modified or deleted.</li>
             * <li><strong>false</strong>: A custom tag under the current Alibaba Cloud account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The ID of the prohibited software tag. You can obtain the value from the following operations:</p>
             * <ul>
             * <li><a href="~~ListProhibitedTags~~">ListProhibitedTags</a>: Lists prohibited software tags.</li>
             * <li><a href="~~CreateProhibitedTag~~">CreateProhibitedTag</a>: Creates a custom prohibited software tag.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tag-7b2c9e4a1d8f****</p>
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            public TagId build() {
                return new TagId(this);
            } 

        } 

    }
}
