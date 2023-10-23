// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ots20160620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceRequest</p>
 */
public class ListInstanceRequest extends Request {
    @Query
    @NameInMap("PageNum")
    private Long pageNum;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TagInfo")
    private java.util.List < TagInfo> tagInfo;

    private ListInstanceRequest(Builder builder) {
        super(builder);
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tagInfo = builder.tagInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tagInfo
     */
    public java.util.List < TagInfo> getTagInfo() {
        return this.tagInfo;
    }

    public static final class Builder extends Request.Builder<ListInstanceRequest, Builder> {
        private Long pageNum; 
        private Long pageSize; 
        private Long resourceOwnerId; 
        private java.util.List < TagInfo> tagInfo; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceRequest request) {
            super(request);
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tagInfo = request.tagInfo;
        } 

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * TagInfo.
         */
        public Builder tagInfo(java.util.List < TagInfo> tagInfo) {
            this.putQueryParameter("TagInfo", tagInfo);
            this.tagInfo = tagInfo;
            return this;
        }

        @Override
        public ListInstanceRequest build() {
            return new ListInstanceRequest(this);
        } 

    } 

    public static class TagInfo extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private TagInfo(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagInfo create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public TagInfo build() {
                return new TagInfo(this);
            } 

        } 

    }
}
