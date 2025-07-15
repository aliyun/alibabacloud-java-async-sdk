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
 * {@link DeleteCasterEpisodeGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteCasterEpisodeGroupRequest</p>
 */
public class DeleteCasterEpisodeGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProgramId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String programId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteCasterEpisodeGroupRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.programId = builder.programId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCasterEpisodeGroupRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteCasterEpisodeGroupRequest, Builder> {
        private Long ownerId; 
        private String programId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCasterEpisodeGroupRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.programId = request.programId;
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
         * <p>The ID of the episode list. If the episode list was added by calling the <a href="https://help.aliyun.com/document_detail/2848071.html">AddCasterEpisodeGroup</a> operation, check the value of the response parameter ProgramId to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf932738****</p>
         */
        public Builder programId(String programId) {
            this.putQueryParameter("ProgramId", programId);
            this.programId = programId;
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
        public DeleteCasterEpisodeGroupRequest build() {
            return new DeleteCasterEpisodeGroupRequest(this);
        } 

    } 

}
