// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTagsToCardRequest} extends {@link RequestModel}
 *
 * <p>AddTagsToCardRequest</p>
 */
public class AddTagsToCardRequest extends Request {
    @Query
    @NameInMap("Iccid")
    @Validation(required = true)
    private String iccid;

    @Query
    @NameInMap("TagNameList")
    private java.util.List < String > tagNameList;

    private AddTagsToCardRequest(Builder builder) {
        super(builder);
        this.iccid = builder.iccid;
        this.tagNameList = builder.tagNameList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTagsToCardRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iccid
     */
    public String getIccid() {
        return this.iccid;
    }

    /**
     * @return tagNameList
     */
    public java.util.List < String > getTagNameList() {
        return this.tagNameList;
    }

    public static final class Builder extends Request.Builder<AddTagsToCardRequest, Builder> {
        private String iccid; 
        private java.util.List < String > tagNameList; 

        private Builder() {
            super();
        } 

        private Builder(AddTagsToCardRequest request) {
            super(request);
            this.iccid = request.iccid;
            this.tagNameList = request.tagNameList;
        } 

        /**
         * Iccid.
         */
        public Builder iccid(String iccid) {
            this.putQueryParameter("Iccid", iccid);
            this.iccid = iccid;
            return this;
        }

        /**
         * TagNameList.
         */
        public Builder tagNameList(java.util.List < String > tagNameList) {
            String tagNameListShrink = shrink(tagNameList, "TagNameList", "json");
            this.putQueryParameter("TagNameList", tagNameListShrink);
            this.tagNameList = tagNameList;
            return this;
        }

        @Override
        public AddTagsToCardRequest build() {
            return new AddTagsToCardRequest(this);
        } 

    } 

}
