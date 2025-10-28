// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link DeleteUserDefineRegionRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserDefineRegionRequest</p>
 */
public class DeleteUserDefineRegionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionTag")
    private String regionTag;

    private DeleteUserDefineRegionRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.regionTag = builder.regionTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserDefineRegionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return regionTag
     */
    public String getRegionTag() {
        return this.regionTag;
    }

    public static final class Builder extends Request.Builder<DeleteUserDefineRegionRequest, Builder> {
        private Long id; 
        private String regionTag; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserDefineRegionRequest request) {
            super(request);
            this.id = request.id;
            this.regionTag = request.regionTag;
        } 

        /**
         * <p>The unique ID of the custom namespace. You can call the ListUserDefineRegion operation to query the ID. For more information, see <a href="https://help.aliyun.com/document_detail/149377.html">ListUserDefineRegion</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2564</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The tag of the custom namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>regiontag</p>
         */
        public Builder regionTag(String regionTag) {
            this.putQueryParameter("RegionTag", regionTag);
            this.regionTag = regionTag;
            return this;
        }

        @Override
        public DeleteUserDefineRegionRequest build() {
            return new DeleteUserDefineRegionRequest(this);
        } 

    } 

}
