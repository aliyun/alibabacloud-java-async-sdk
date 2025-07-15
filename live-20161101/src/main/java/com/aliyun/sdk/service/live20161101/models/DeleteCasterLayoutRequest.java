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
 * {@link DeleteCasterLayoutRequest} extends {@link RequestModel}
 *
 * <p>DeleteCasterLayoutRequest</p>
 */
public class DeleteCasterLayoutRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String casterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LayoutId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String layoutId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteCasterLayoutRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.layoutId = builder.layoutId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCasterLayoutRequest create() {
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
     * @return layoutId
     */
    public String getLayoutId() {
        return this.layoutId;
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

    public static final class Builder extends Request.Builder<DeleteCasterLayoutRequest, Builder> {
        private String casterId; 
        private String layoutId; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCasterLayoutRequest request) {
            super(request);
            this.casterId = request.casterId;
            this.layoutId = request.layoutId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the production studio.</p>
         * <ul>
         * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/69338.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
         * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
         * </ul>
         * <blockquote>
         * <p> You can find the ID of the production studio in the Instance ID/Name column.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The ID of the layout. If the layout was added by calling the <a href="https://help.aliyun.com/document_detail/60249.html">AddCasterLayout</a> operation, check the value of the response parameter LayoutId to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>21926b36-7dd2-4fde-ae25-51b5bc8e****</p>
         */
        public Builder layoutId(String layoutId) {
            this.putQueryParameter("LayoutId", layoutId);
            this.layoutId = layoutId;
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

        @Override
        public DeleteCasterLayoutRequest build() {
            return new DeleteCasterLayoutRequest(this);
        } 

    } 

}
