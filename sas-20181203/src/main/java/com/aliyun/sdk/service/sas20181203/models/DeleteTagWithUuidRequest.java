// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTagWithUuidRequest} extends {@link RequestModel}
 *
 * <p>DeleteTagWithUuidRequest</p>
 */
public class DeleteTagWithUuidRequest extends Request {
    @Query
    @NameInMap("TagName")
    @Validation(required = true)
    private String tagName;

    @Query
    @NameInMap("UuidList")
    private String uuidList;

    private DeleteTagWithUuidRequest(Builder builder) {
        super(builder);
        this.tagName = builder.tagName;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTagWithUuidRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    /**
     * @return uuidList
     */
    public String getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<DeleteTagWithUuidRequest, Builder> {
        private String tagName; 
        private String uuidList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTagWithUuidRequest response) {
            super(response);
            this.tagName = response.tagName;
            this.uuidList = response.uuidList;
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
         * UuidList.
         */
        public Builder uuidList(String uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public DeleteTagWithUuidRequest build() {
            return new DeleteTagWithUuidRequest(this);
        } 

    } 

}
