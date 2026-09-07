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
 * {@link ListProhibitedTagsRequest} extends {@link RequestModel}
 *
 * <p>ListProhibitedTagsRequest</p>
 */
public class ListProhibitedTagsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

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
    @com.aliyun.core.annotation.NameInMap("SoftwareId")
    private SoftwareId softwareId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagIds")
    private java.util.List<TagIds> tagIds;

    private ListProhibitedTagsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.policyId = builder.policyId;
        this.softwareId = builder.softwareId;
        this.tagIds = builder.tagIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProhibitedTagsRequest create() {
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
     * @return softwareId
     */
    public SoftwareId getSoftwareId() {
        return this.softwareId;
    }

    /**
     * @return tagIds
     */
    public java.util.List<TagIds> getTagIds() {
        return this.tagIds;
    }

    public static final class Builder extends Request.Builder<ListProhibitedTagsRequest, Builder> {
        private Long currentPage; 
        private String name; 
        private Long pageSize; 
        private String policyId; 
        private SoftwareId softwareId; 
        private java.util.List<TagIds> tagIds; 

        private Builder() {
            super();
        } 

        private Builder(ListProhibitedTagsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.policyId = request.policyId;
            this.softwareId = request.softwareId;
            this.tagIds = request.tagIds;
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
         * <p>The name of the prohibited software tag. Fuzzy match is supported. The name can be up to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-). Spaces are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>pid-867ef4007c8a****</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The unique identifier of the prohibited software.</p>
         */
        public Builder softwareId(SoftwareId softwareId) {
            String softwareIdShrink = shrink(softwareId, "SoftwareId", "json");
            this.putQueryParameter("SoftwareId", softwareIdShrink);
            this.softwareId = softwareId;
            return this;
        }

        /**
         * <p>The collection of prohibited software tag IDs. Duplicate values are not allowed. A maximum of 500 IDs can be specified.</p>
         */
        public Builder tagIds(java.util.List<TagIds> tagIds) {
            this.putQueryParameter("TagIds", tagIds);
            this.tagIds = tagIds;
            return this;
        }

        @Override
        public ListProhibitedTagsRequest build() {
            return new ListProhibitedTagsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListProhibitedTagsRequest} extends {@link TeaModel}
     *
     * <p>ListProhibitedTagsRequest</p>
     */
    public static class SoftwareId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("SoftwareId")
        private String softwareId;

        private SoftwareId(Builder builder) {
            this.isDefault = builder.isDefault;
            this.softwareId = builder.softwareId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoftwareId create() {
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

            private Builder(SoftwareId model) {
                this.isDefault = model.isDefault;
                this.softwareId = model.softwareId;
            } 

            /**
             * <p>Indicates whether the prohibited software is a system built-in entry. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: A system built-in prohibited software entry that is shared across all Alibaba Cloud accounts and cannot be modified or deleted.</li>
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
             * <p>swb-83995ff2ae38****</p>
             */
            public Builder softwareId(String softwareId) {
                this.softwareId = softwareId;
                return this;
            }

            public SoftwareId build() {
                return new SoftwareId(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProhibitedTagsRequest} extends {@link TeaModel}
     *
     * <p>ListProhibitedTagsRequest</p>
     */
    public static class TagIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("TagId")
        private String tagId;

        private TagIds(Builder builder) {
            this.isDefault = builder.isDefault;
            this.tagId = builder.tagId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagIds create() {
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

            private Builder(TagIds model) {
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
             * <p>tag-3a5f8e50c396****</p>
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            public TagIds build() {
                return new TagIds(this);
            } 

        } 

    }
}
