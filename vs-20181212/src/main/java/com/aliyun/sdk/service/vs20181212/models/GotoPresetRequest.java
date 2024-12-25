// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link GotoPresetRequest} extends {@link RequestModel}
 *
 * <p>GotoPresetRequest</p>
 */
public class GotoPresetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PresetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String presetId;

    private GotoPresetRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.ownerId = builder.ownerId;
        this.presetId = builder.presetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GotoPresetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return presetId
     */
    public String getPresetId() {
        return this.presetId;
    }

    public static final class Builder extends Request.Builder<GotoPresetRequest, Builder> {
        private String id; 
        private Long ownerId; 
        private String presetId; 

        private Builder() {
            super();
        } 

        private Builder(GotoPresetRequest request) {
            super(request);
            this.id = request.id;
            this.ownerId = request.ownerId;
            this.presetId = request.presetId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>348*****380-cn-qingdao</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder presetId(String presetId) {
            this.putQueryParameter("PresetId", presetId);
            this.presetId = presetId;
            return this;
        }

        @Override
        public GotoPresetRequest build() {
            return new GotoPresetRequest(this);
        } 

    } 

}
