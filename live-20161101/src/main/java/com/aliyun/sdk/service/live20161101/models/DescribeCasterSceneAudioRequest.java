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
 * {@link DescribeCasterSceneAudioRequest} extends {@link RequestModel}
 *
 * <p>DescribeCasterSceneAudioRequest</p>
 */
public class DescribeCasterSceneAudioRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String casterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    private DescribeCasterSceneAudioRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCasterSceneAudioRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
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
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<DescribeCasterSceneAudioRequest, Builder> {
        private String casterId; 
        private Long ownerId; 
        private String regionId; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCasterSceneAudioRequest request) {
            super(request);
            this.casterId = request.casterId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.sceneId = request.sceneId;
        } 

        /**
         * <p>The ID of the production studio.</p>
         * <ul>
         * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/69338.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
         * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
         * </ul>
         * <blockquote>
         * <p> You can find the ID of the production studio in the Instance Name column.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>97df6b7f-3490-47d2-ac50-88338765****</p>
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the scene.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>97df6b7f-3490-47d2-ac50-88339087****</p>
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public DescribeCasterSceneAudioRequest build() {
            return new DescribeCasterSceneAudioRequest(this);
        } 

    } 

}
