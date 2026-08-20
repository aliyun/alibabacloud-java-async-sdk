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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
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
         * PolicyId.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * SoftwareId.
         */
        public Builder softwareId(SoftwareId softwareId) {
            String softwareIdShrink = shrink(softwareId, "SoftwareId", "json");
            this.putQueryParameter("SoftwareId", softwareIdShrink);
            this.softwareId = softwareId;
            return this;
        }

        /**
         * TagIds.
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
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * SoftwareId.
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
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * TagId.
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
