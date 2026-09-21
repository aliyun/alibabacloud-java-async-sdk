// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListBrowserInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>ListBrowserInstanceGroupRequest</p>
 */
public class ListBrowserInstanceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupSetId")
    private String appInstanceGroupSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BrowserInstanceGroupId")
    private String browserInstanceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BrowserInstanceGroupName")
    private String browserInstanceGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudBrowserName")
    private String cloudBrowserName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExcludedUserGroupIds")
    private java.util.List<String> excludedUserGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private java.util.List<String> status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tier")
    private String tier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private java.util.List<String> userGroupIds;

    private ListBrowserInstanceGroupRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupSetId = builder.appInstanceGroupSetId;
        this.bizRegionId = builder.bizRegionId;
        this.browserInstanceGroupId = builder.browserInstanceGroupId;
        this.browserInstanceGroupName = builder.browserInstanceGroupName;
        this.cloudBrowserName = builder.cloudBrowserName;
        this.excludedUserGroupIds = builder.excludedUserGroupIds;
        this.officeSiteId = builder.officeSiteId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.tag = builder.tag;
        this.tier = builder.tier;
        this.userGroupIds = builder.userGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBrowserInstanceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupSetId
     */
    public String getAppInstanceGroupSetId() {
        return this.appInstanceGroupSetId;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return browserInstanceGroupId
     */
    public String getBrowserInstanceGroupId() {
        return this.browserInstanceGroupId;
    }

    /**
     * @return browserInstanceGroupName
     */
    public String getBrowserInstanceGroupName() {
        return this.browserInstanceGroupName;
    }

    /**
     * @return cloudBrowserName
     */
    public String getCloudBrowserName() {
        return this.cloudBrowserName;
    }

    /**
     * @return excludedUserGroupIds
     */
    public java.util.List<String> getExcludedUserGroupIds() {
        return this.excludedUserGroupIds;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
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
     * @return status
     */
    public java.util.List<String> getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return tier
     */
    public String getTier() {
        return this.tier;
    }

    /**
     * @return userGroupIds
     */
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public static final class Builder extends Request.Builder<ListBrowserInstanceGroupRequest, Builder> {
        private String appInstanceGroupSetId; 
        private String bizRegionId; 
        private String browserInstanceGroupId; 
        private String browserInstanceGroupName; 
        private String cloudBrowserName; 
        private java.util.List<String> excludedUserGroupIds; 
        private String officeSiteId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<String> status; 
        private java.util.List<Tag> tag; 
        private String tier; 
        private java.util.List<String> userGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(ListBrowserInstanceGroupRequest request) {
            super(request);
            this.appInstanceGroupSetId = request.appInstanceGroupSetId;
            this.bizRegionId = request.bizRegionId;
            this.browserInstanceGroupId = request.browserInstanceGroupId;
            this.browserInstanceGroupName = request.browserInstanceGroupName;
            this.cloudBrowserName = request.cloudBrowserName;
            this.excludedUserGroupIds = request.excludedUserGroupIds;
            this.officeSiteId = request.officeSiteId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.tag = request.tag;
            this.tier = request.tier;
            this.userGroupIds = request.userGroupIds;
        } 

        /**
         * <p>The browser group set ID for exact match queries of active members in the set.</p>
         * 
         * <strong>example:</strong>
         * <p>set-3jm9d0abc00example</p>
         */
        public Builder appInstanceGroupSetId(String appInstanceGroupSetId) {
            this.putQueryParameter("AppInstanceGroupSetId", appInstanceGroupSetId);
            this.appInstanceGroupSetId = appInstanceGroupSetId;
            return this;
        }

        /**
         * <p>Filters browser groups by business region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The cloud browser group ID for exact match queries.</p>
         * 
         * <strong>example:</strong>
         * <p>big-0c7loey7fzjq****</p>
         */
        public Builder browserInstanceGroupId(String browserInstanceGroupId) {
            this.putQueryParameter("BrowserInstanceGroupId", browserInstanceGroupId);
            this.browserInstanceGroupId = browserInstanceGroupId;
            return this;
        }

        /**
         * <p>The browser group name. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Office</p>
         */
        public Builder browserInstanceGroupName(String browserInstanceGroupName) {
            this.putQueryParameter("BrowserInstanceGroupName", browserInstanceGroupName);
            this.browserInstanceGroupName = browserInstanceGroupName;
            return this;
        }

        /**
         * <p>Performs a contains match by browser group name or ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Office</p>
         */
        public Builder cloudBrowserName(String cloudBrowserName) {
            this.putQueryParameter("CloudBrowserName", cloudBrowserName);
            this.cloudBrowserName = cloudBrowserName;
            return this;
        }

        /**
         * <p>Excludes browser groups that are authorized to the specified user groups.</p>
         */
        public Builder excludedUserGroupIds(java.util.List<String> excludedUserGroupIds) {
            this.putBodyParameter("ExcludedUserGroupIds", excludedUserGroupIds);
            this.excludedUserGroupIds = excludedUserGroupIds;
            return this;
        }

        /**
         * <p>Filters browser groups by office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-843734****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The page number, starting from page 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Filters by browser group status.</p>
         * <p><strong>Limit:</strong> Only one status value can be specified at a time.</p>
         */
        public Builder status(java.util.List<String> status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tag filter parameters. This parameter is not supported in customer-facing scenarios. Do not specify this parameter.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Filters by version of the browser.</p>
         * <ul>
         * <li><code>Basic</code>: Basic Edition.</li>
         * <li><code>Pro</code>: Premium Edition.</li>
         * </ul>
         * <p>Use <code>Pro</code> to query MAU browser groups.</p>
         * 
         * <strong>example:</strong>
         * <p>Pro</p>
         */
        public Builder tier(String tier) {
            this.putQueryParameter("Tier", tier);
            this.tier = tier;
            return this;
        }

        /**
         * <p>Filters by authorized user group IDs.</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.putBodyParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        @Override
        public ListBrowserInstanceGroupRequest build() {
            return new ListBrowserInstanceGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListBrowserInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>ListBrowserInstanceGroupRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(maxLength = 256, minLength = 1)
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. Do not specify this parameter in customer-facing scenarios.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. Do not specify this parameter in customer-facing scenarios.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
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
