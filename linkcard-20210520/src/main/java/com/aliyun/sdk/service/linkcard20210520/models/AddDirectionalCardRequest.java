// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDirectionalCardRequest} extends {@link RequestModel}
 *
 * <p>AddDirectionalCardRequest</p>
 */
public class AddDirectionalCardRequest extends Request {
    @Query
    @NameInMap("FileUri")
    private String fileUri;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("OrderList")
    private java.util.List < String > orderList;

    @Query
    @NameInMap("TagList")
    private java.util.List < String > tagList;

    @Query
    @NameInMap("UploadMethod")
    @Validation(required = true)
    private String uploadMethod;

    @Query
    @NameInMap("UploadType")
    @Validation(required = true)
    private String uploadType;

    private AddDirectionalCardRequest(Builder builder) {
        super(builder);
        this.fileUri = builder.fileUri;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.orderList = builder.orderList;
        this.tagList = builder.tagList;
        this.uploadMethod = builder.uploadMethod;
        this.uploadType = builder.uploadType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDirectionalCardRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileUri
     */
    public String getFileUri() {
        return this.fileUri;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return orderList
     */
    public java.util.List < String > getOrderList() {
        return this.orderList;
    }

    /**
     * @return tagList
     */
    public java.util.List < String > getTagList() {
        return this.tagList;
    }

    /**
     * @return uploadMethod
     */
    public String getUploadMethod() {
        return this.uploadMethod;
    }

    /**
     * @return uploadType
     */
    public String getUploadType() {
        return this.uploadType;
    }

    public static final class Builder extends Request.Builder<AddDirectionalCardRequest, Builder> {
        private String fileUri; 
        private String groupId; 
        private String groupName; 
        private java.util.List < String > orderList; 
        private java.util.List < String > tagList; 
        private String uploadMethod; 
        private String uploadType; 

        private Builder() {
            super();
        } 

        private Builder(AddDirectionalCardRequest request) {
            super(request);
            this.fileUri = request.fileUri;
            this.groupId = request.groupId;
            this.groupName = request.groupName;
            this.orderList = request.orderList;
            this.tagList = request.tagList;
            this.uploadMethod = request.uploadMethod;
            this.uploadType = request.uploadType;
        } 

        /**
         * FileUri.
         */
        public Builder fileUri(String fileUri) {
            this.putQueryParameter("FileUri", fileUri);
            this.fileUri = fileUri;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * OrderList.
         */
        public Builder orderList(java.util.List < String > orderList) {
            String orderListShrink = shrink(orderList, "OrderList", "json");
            this.putQueryParameter("OrderList", orderListShrink);
            this.orderList = orderList;
            return this;
        }

        /**
         * TagList.
         */
        public Builder tagList(java.util.List < String > tagList) {
            String tagListShrink = shrink(tagList, "TagList", "json");
            this.putQueryParameter("TagList", tagListShrink);
            this.tagList = tagList;
            return this;
        }

        /**
         * UploadMethod.
         */
        public Builder uploadMethod(String uploadMethod) {
            this.putQueryParameter("UploadMethod", uploadMethod);
            this.uploadMethod = uploadMethod;
            return this;
        }

        /**
         * UploadType.
         */
        public Builder uploadType(String uploadType) {
            this.putQueryParameter("UploadType", uploadType);
            this.uploadType = uploadType;
            return this;
        }

        @Override
        public AddDirectionalCardRequest build() {
            return new AddDirectionalCardRequest(this);
        } 

    } 

}
