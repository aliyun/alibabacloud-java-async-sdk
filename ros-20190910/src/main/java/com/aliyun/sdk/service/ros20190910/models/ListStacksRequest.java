// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStacksRequest} extends {@link RequestModel}
 *
 * <p>ListStacksRequest</p>
 */
public class ListStacksRequest extends Request {
    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("ParentStackId")
    private String parentStackId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ShowNestedStack")
    private Boolean showNestedStack;

    @Query
    @NameInMap("StackId")
    private String stackId;

    @Query
    @NameInMap("StackIds")
    private java.util.List < String > stackIds;

    @Query
    @NameInMap("StackName")
    private java.util.List < String > stackName;

    @Query
    @NameInMap("Status")
    private java.util.List < String > status;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private ListStacksRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.parentStackId = builder.parentStackId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.showNestedStack = builder.showNestedStack;
        this.stackId = builder.stackId;
        this.stackIds = builder.stackIds;
        this.stackName = builder.stackName;
        this.status = builder.status;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStacksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return parentStackId
     */
    public String getParentStackId() {
        return this.parentStackId;
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
     * @return showNestedStack
     */
    public Boolean getShowNestedStack() {
        return this.showNestedStack;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    /**
     * @return stackIds
     */
    public java.util.List < String > getStackIds() {
        return this.stackIds;
    }

    /**
     * @return stackName
     */
    public java.util.List < String > getStackName() {
        return this.stackName;
    }

    /**
     * @return status
     */
    public java.util.List < String > getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListStacksRequest, Builder> {
        private Long pageNumber; 
        private Long pageSize; 
        private String parentStackId; 
        private String regionId; 
        private String resourceGroupId; 
        private Boolean showNestedStack; 
        private String stackId; 
        private java.util.List < String > stackIds; 
        private java.util.List < String > stackName; 
        private java.util.List < String > status; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListStacksRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.parentStackId = request.parentStackId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.showNestedStack = request.showNestedStack;
            this.stackId = request.stackId;
            this.stackIds = request.stackIds;
            this.stackName = request.stackName;
            this.status = request.status;
            this.tag = request.tag;
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
         * ParentStackId.
         */
        public Builder parentStackId(String parentStackId) {
            this.putQueryParameter("ParentStackId", parentStackId);
            this.parentStackId = parentStackId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * ShowNestedStack.
         */
        public Builder showNestedStack(Boolean showNestedStack) {
            this.putQueryParameter("ShowNestedStack", showNestedStack);
            this.showNestedStack = showNestedStack;
            return this;
        }

        /**
         * StackId.
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * StackIds.
         */
        public Builder stackIds(java.util.List < String > stackIds) {
            this.putQueryParameter("StackIds", stackIds);
            this.stackIds = stackIds;
            return this;
        }

        /**
         * StackName.
         */
        public Builder stackName(java.util.List < String > stackName) {
            this.putQueryParameter("StackName", stackName);
            this.stackName = stackName;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(java.util.List < String > status) {
            this.putQueryParameter("Status", status);
            this.status = status;
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

        @Override
        public ListStacksRequest build() {
            return new ListStacksRequest(this);
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
