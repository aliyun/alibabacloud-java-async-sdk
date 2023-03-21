// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTagWithUuidRequest} extends {@link RequestModel}
 *
 * <p>AddTagWithUuidRequest</p>
 */
public class AddTagWithUuidRequest extends Request {
    @Query
    @NameInMap("TagName")
    @Validation(required = true)
    private String tagName;

    @Query
    @NameInMap("UuidList")
    private String uuidList;

    private AddTagWithUuidRequest(Builder builder) {
        super(builder);
        this.tagName = builder.tagName;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTagWithUuidRequest create() {
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

    public static final class Builder extends Request.Builder<AddTagWithUuidRequest, Builder> {
        private String tagName; 
        private String uuidList; 

        private Builder() {
            super();
        } 

        private Builder(AddTagWithUuidRequest request) {
            super(request);
            this.tagName = request.tagName;
            this.uuidList = request.uuidList;
        } 

        /**
         * The name of the tag.
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        /**
         * The UUIDs of the servers. Separate multiple UUIDs with commas (,).
         * <p>
         * 
         * > You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
         */
        public Builder uuidList(String uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public AddTagWithUuidRequest build() {
            return new AddTagWithUuidRequest(this);
        } 

    } 

}
