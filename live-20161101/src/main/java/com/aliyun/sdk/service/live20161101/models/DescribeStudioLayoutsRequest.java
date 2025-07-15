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
 * {@link DescribeStudioLayoutsRequest} extends {@link RequestModel}
 *
 * <p>DescribeStudioLayoutsRequest</p>
 */
public class DescribeStudioLayoutsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String casterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LayoutId")
    private String layoutId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeStudioLayoutsRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.layoutId = builder.layoutId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStudioLayoutsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeStudioLayoutsRequest, Builder> {
        private String casterId; 
        private String layoutId; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeStudioLayoutsRequest request) {
            super(request);
            this.casterId = request.casterId;
            this.layoutId = request.layoutId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the production studio instance.</p>
         * <ul>
         * <li>If you call the <a href="https://help.aliyun.com/document_detail/69338.html">CreateCaster</a> operation to create a production studio instance, you can obtain the instance ID from the CasterId parameter in the response.</li>
         * <li>If you create a production studio instance in the ApsaraVideo Live console, perform the following operations to obtain the instance ID: Log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane. Then, view the instance ID on the <strong>Production Studio Management</strong> page.</li>
         * </ul>
         * <blockquote>
         * <p> The value displayed in the Name column for an instance on the Production Studio Management page is the ID of the instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5c6a2a0d-f228-4a64-af62-20e91b96****</p>
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The ID of the layout.</p>
         * <p>You can specify multiple layout IDs and separate them with commas (,). If you leave this parameter empty, all layouts of the production studio are returned.</p>
         * <p>If you call the <a href="https://help.aliyun.com/document_detail/215388.html">AddStudioLayout</a> operation to configure a layout for a virtual studio, you can obtain the ID of the layout from the LayoutId parameter in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
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
        public DescribeStudioLayoutsRequest build() {
            return new DescribeStudioLayoutsRequest(this);
        } 

    } 

}
