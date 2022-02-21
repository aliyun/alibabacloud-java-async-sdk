// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecoveryOriginImageRequest} extends {@link RequestModel}
 *
 * <p>RecoveryOriginImageRequest</p>
 */
public class RecoveryOriginImageRequest extends Request {
    @Query
    @NameInMap("SubSceneId")
    @Validation(required = true)
    private String subSceneId;

    private RecoveryOriginImageRequest(Builder builder) {
        super(builder);
        this.subSceneId = builder.subSceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecoveryOriginImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return subSceneId
     */
    public String getSubSceneId() {
        return this.subSceneId;
    }

    public static final class Builder extends Request.Builder<RecoveryOriginImageRequest, Builder> {
        private String subSceneId; 

        private Builder() {
            super();
        } 

        private Builder(RecoveryOriginImageRequest response) {
            super(response);
            this.subSceneId = response.subSceneId;
        } 

        /**
         * 子场景ID
         */
        public Builder subSceneId(String subSceneId) {
            this.putQueryParameter("SubSceneId", subSceneId);
            this.subSceneId = subSceneId;
            return this;
        }

        @Override
        public RecoveryOriginImageRequest build() {
            return new RecoveryOriginImageRequest(this);
        } 

    } 

}
