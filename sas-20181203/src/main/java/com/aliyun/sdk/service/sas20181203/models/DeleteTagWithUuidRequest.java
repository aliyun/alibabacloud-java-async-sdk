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
 * {@link DeleteTagWithUuidRequest} extends {@link RequestModel}
 *
 * <p>DeleteTagWithUuidRequest</p>
 */
public class DeleteTagWithUuidRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tagName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
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

        private Builder(DeleteTagWithUuidRequest request) {
            super(request);
            this.tagName = request.tagName;
            this.uuidList = request.uuidList;
        } 

        /**
         * <p>The name of the tag.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        /**
         * <p>The UUIDs of servers.</p>
         * <blockquote>
         * <p>If the UuidList parameter is specified, Security Center removes the tag only from the servers whose UUIDs are specified by UuidList. If the UuidList parameter is not specified, Security Center removes the tag from all servers.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>111-xx,aa-bb</p>
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
