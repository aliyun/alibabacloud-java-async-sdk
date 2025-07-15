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
 * {@link DeleteLiveAISubtitleRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveAISubtitleRequest</p>
 */
public class DeleteLiveAISubtitleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubtitleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subtitleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubtitleName")
    private String subtitleName;

    private DeleteLiveAISubtitleRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.subtitleId = builder.subtitleId;
        this.subtitleName = builder.subtitleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveAISubtitleRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return subtitleId
     */
    public String getSubtitleId() {
        return this.subtitleId;
    }

    /**
     * @return subtitleName
     */
    public String getSubtitleName() {
        return this.subtitleName;
    }

    public static final class Builder extends Request.Builder<DeleteLiveAISubtitleRequest, Builder> {
        private Long ownerId; 
        private String regionId; 
        private String subtitleId; 
        private String subtitleName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveAISubtitleRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.subtitleId = request.subtitleId;
            this.subtitleName = request.subtitleName;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the subtitle template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        public Builder subtitleId(String subtitleId) {
            this.putQueryParameter("SubtitleId", subtitleId);
            this.subtitleId = subtitleId;
            return this;
        }

        /**
         * <p>The name of the subtitle template. The name can contain only digits, letters, and hyphens (-). The name cannot start with a hyphen.</p>
         * 
         * <strong>example:</strong>
         * <p>sub01</p>
         */
        public Builder subtitleName(String subtitleName) {
            this.putQueryParameter("SubtitleName", subtitleName);
            this.subtitleName = subtitleName;
            return this;
        }

        @Override
        public DeleteLiveAISubtitleRequest build() {
            return new DeleteLiveAISubtitleRequest(this);
        } 

    } 

}
