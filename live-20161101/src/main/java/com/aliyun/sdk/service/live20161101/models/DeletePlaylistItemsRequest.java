// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DeletePlaylistItemsRequest} extends {@link RequestModel}
 *
 * <p>DeletePlaylistItemsRequest</p>
 */
public class DeletePlaylistItemsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProgramId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String programId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProgramItemIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String programItemIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeletePlaylistItemsRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.programId = builder.programId;
        this.programItemIds = builder.programItemIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePlaylistItemsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return programId
     */
    public String getProgramId() {
        return this.programId;
    }

    /**
     * @return programItemIds
     */
    public String getProgramItemIds() {
        return this.programItemIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeletePlaylistItemsRequest, Builder> {
        private Long ownerId; 
        private String programId; 
        private String programItemIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePlaylistItemsRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.programId = request.programId;
            this.programItemIds = request.programItemIds;
            this.regionId = request.regionId;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The ID of the episode list. If the episode list was created by calling the <a href="https://help.aliyun.com/document_detail/2848078.html">AddPlaylistItems</a> operation, check the value of the response parameter ProgramId to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        public Builder programId(String programId) {
            this.putQueryParameter("ProgramId", programId);
            this.programId = programId;
            return this;
        }

        /**
         * <p>The IDs of the episodes that you want to remove.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;c09f3d63-eacf-4fbf-bd48-a07a6ba7****&quot;,&quot;c10f3d63-eacf-4fbf-bd48-a07a6ba7****&quot;]</p>
         */
        public Builder programItemIds(String programItemIds) {
            this.putQueryParameter("ProgramItemIds", programItemIds);
            this.programItemIds = programItemIds;
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

        @Override
        public DeletePlaylistItemsRequest build() {
            return new DeletePlaylistItemsRequest(this);
        } 

    } 

}
