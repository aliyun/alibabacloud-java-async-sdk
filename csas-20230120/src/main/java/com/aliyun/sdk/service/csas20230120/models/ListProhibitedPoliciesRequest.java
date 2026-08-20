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
 * {@link ListProhibitedPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListProhibitedPoliciesRequest</p>
 */
public class ListProhibitedPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchMode")
    private String matchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyIds")
    private java.util.List<String> policyIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    private String policyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SoftwareId")
    private SoftwareId softwareId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SoftwareName")
    private String softwareName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagId")
    private String tagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagName")
    private String tagName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    private String userGroupId;

    private ListProhibitedPoliciesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.enabled = builder.enabled;
        this.matchMode = builder.matchMode;
        this.name = builder.name;
        this.objectType = builder.objectType;
        this.pageSize = builder.pageSize;
        this.policyIds = builder.policyIds;
        this.policyType = builder.policyType;
        this.softwareId = builder.softwareId;
        this.softwareName = builder.softwareName;
        this.tagId = builder.tagId;
        this.tagName = builder.tagName;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProhibitedPoliciesRequest create() {
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
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return matchMode
     */
    public String getMatchMode() {
        return this.matchMode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return policyIds
     */
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * @return softwareId
     */
    public SoftwareId getSoftwareId() {
        return this.softwareId;
    }

    /**
     * @return softwareName
     */
    public String getSoftwareName() {
        return this.softwareName;
    }

    /**
     * @return tagId
     */
    public String getTagId() {
        return this.tagId;
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<ListProhibitedPoliciesRequest, Builder> {
        private Long currentPage; 
        private Boolean enabled; 
        private String matchMode; 
        private String name; 
        private String objectType; 
        private Long pageSize; 
        private java.util.List<String> policyIds; 
        private String policyType; 
        private SoftwareId softwareId; 
        private String softwareName; 
        private String tagId; 
        private String tagName; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListProhibitedPoliciesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.enabled = request.enabled;
            this.matchMode = request.matchMode;
            this.name = request.name;
            this.objectType = request.objectType;
            this.pageSize = request.pageSize;
            this.policyIds = request.policyIds;
            this.policyType = request.policyType;
            this.softwareId = request.softwareId;
            this.softwareName = request.softwareName;
            this.tagId = request.tagId;
            this.tagName = request.tagName;
            this.userGroupId = request.userGroupId;
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
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * MatchMode.
         */
        public Builder matchMode(String matchMode) {
            this.putQueryParameter("MatchMode", matchMode);
            this.matchMode = matchMode;
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
         * ObjectType.
         */
        public Builder objectType(String objectType) {
            this.putQueryParameter("ObjectType", objectType);
            this.objectType = objectType;
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
         * PolicyIds.
         */
        public Builder policyIds(java.util.List<String> policyIds) {
            this.putQueryParameter("PolicyIds", policyIds);
            this.policyIds = policyIds;
            return this;
        }

        /**
         * PolicyType.
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
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
         * SoftwareName.
         */
        public Builder softwareName(String softwareName) {
            this.putQueryParameter("SoftwareName", softwareName);
            this.softwareName = softwareName;
            return this;
        }

        /**
         * TagId.
         */
        public Builder tagId(String tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        /**
         * TagName.
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        /**
         * UserGroupId.
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public ListProhibitedPoliciesRequest build() {
            return new ListProhibitedPoliciesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListProhibitedPoliciesRequest} extends {@link TeaModel}
     *
     * <p>ListProhibitedPoliciesRequest</p>
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
}
