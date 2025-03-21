// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link AddTagWithUuidRequest} extends {@link RequestModel}
 *
 * <p>AddTagWithUuidRequest</p>
 */
public class AddTagWithUuidRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tagName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
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
         * <p>The name of the tag.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>InternetIp</p>
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        /**
         * <p>The UUIDs of the servers. Separate multiple UUIDs with commas (,).</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>71f5313e-4355-4c59-86d1-557dda7b****,71f5313e-4355-4c59-86d1-557dda7b****</p>
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
