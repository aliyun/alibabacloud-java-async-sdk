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
 * {@link CopyCasterSceneConfigRequest} extends {@link RequestModel}
 *
 * <p>CopyCasterSceneConfigRequest</p>
 */
public class CopyCasterSceneConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String casterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromSceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fromSceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToSceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String toSceneId;

    private CopyCasterSceneConfigRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.fromSceneId = builder.fromSceneId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.toSceneId = builder.toSceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyCasterSceneConfigRequest create() {
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
     * @return fromSceneId
     */
    public String getFromSceneId() {
        return this.fromSceneId;
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
     * @return toSceneId
     */
    public String getToSceneId() {
        return this.toSceneId;
    }

    public static final class Builder extends Request.Builder<CopyCasterSceneConfigRequest, Builder> {
        private String casterId; 
        private String fromSceneId; 
        private Long ownerId; 
        private String regionId; 
        private String toSceneId; 

        private Builder() {
            super();
        } 

        private Builder(CopyCasterSceneConfigRequest request) {
            super(request);
            this.casterId = request.casterId;
            this.fromSceneId = request.fromSceneId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.toSceneId = request.toSceneId;
        } 

        /**
         * <p>The ID of the production studio.</p>
         * <ul>
         * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
         * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
         * </ul>
         * <blockquote>
         * <p> You can find the ID of the production studio in the Instance ID/Name column.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The ID of the source scene, which must be a PVW scene.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f1a361f4-bee3-436d-ae6e-d38e6943****</p>
         */
        public Builder fromSceneId(String fromSceneId) {
            this.putQueryParameter("FromSceneId", fromSceneId);
            this.fromSceneId = fromSceneId;
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
         * <p>The ID of the destination scene, which must be a PGM scene.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>05ab713c-676e-49c0-96ce-cc408da1****</p>
         */
        public Builder toSceneId(String toSceneId) {
            this.putQueryParameter("ToSceneId", toSceneId);
            this.toSceneId = toSceneId;
            return this;
        }

        @Override
        public CopyCasterSceneConfigRequest build() {
            return new CopyCasterSceneConfigRequest(this);
        } 

    } 

}
