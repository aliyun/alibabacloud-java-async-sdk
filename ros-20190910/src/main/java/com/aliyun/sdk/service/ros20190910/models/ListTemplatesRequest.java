// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListTemplatesRequest</p>
 */
public class ListTemplatesRequest extends Request {
    @Query
    @NameInMap("IncludeTags")
    private String includeTags;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ShareType")
    private String shareType;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("TemplateName")
    private String templateName;

    private ListTemplatesRequest(Builder builder) {
        super(builder);
        this.includeTags = builder.includeTags;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.shareType = builder.shareType;
        this.tag = builder.tag;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return includeTags
     */
    public String getIncludeTags() {
        return this.includeTags;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
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
     * @return shareType
     */
    public String getShareType() {
        return this.shareType;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<ListTemplatesRequest, Builder> {
        private String includeTags; 
        private Long pageNumber; 
        private Long pageSize; 
        private String resourceGroupId; 
        private String shareType; 
        private java.util.List < Tag> tag; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(ListTemplatesRequest request) {
            super(request);
            this.includeTags = request.includeTags;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.shareType = request.shareType;
            this.tag = request.tag;
            this.templateName = request.templateName;
        } 

        /**
         * IncludeTags.
         */
        public Builder includeTags(String includeTags) {
            this.putQueryParameter("IncludeTags", includeTags);
            this.includeTags = includeTags;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ShareType.
         */
        public Builder shareType(String shareType) {
            this.putQueryParameter("ShareType", shareType);
            this.shareType = shareType;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public ListTemplatesRequest build() {
            return new ListTemplatesRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
