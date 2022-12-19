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

        private Builder(DeleteTagWithUuidRequest request) {
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
         * The list of server UUIDs.
         * <p>
         * 
         * >  If the UuidList parameter is configured, Security Center removes the tag only from the servers whose UUIDs are specified by UuidList. If the UuidList parameter is not configured, Security Center removes the tag from all servers.
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
