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
 * {@link RemoveShowFromShowListRequest} extends {@link RequestModel}
 *
 * <p>RemoveShowFromShowListRequest</p>
 */
public class RemoveShowFromShowListRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ShowId")
    private String showId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isBatchMode")
    private Boolean isBatchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("showIdList")
    private java.util.List<String> showIdList;

    private RemoveShowFromShowListRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.showId = builder.showId;
        this.isBatchMode = builder.isBatchMode;
        this.showIdList = builder.showIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveShowFromShowListRequest create() {
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
     * @return showId
     */
    public String getShowId() {
        return this.showId;
    }

    /**
     * @return isBatchMode
     */
    public Boolean getIsBatchMode() {
        return this.isBatchMode;
    }

    /**
     * @return showIdList
     */
    public java.util.List<String> getShowIdList() {
        return this.showIdList;
    }

    public static final class Builder extends Request.Builder<RemoveShowFromShowListRequest, Builder> {
        private String casterId; 
        private Long ownerId; 
        private String regionId; 
        private String showId; 
        private Boolean isBatchMode; 
        private java.util.List<String> showIdList; 

        private Builder() {
            super();
        } 

        private Builder(RemoveShowFromShowListRequest request) {
            super(request);
            this.casterId = request.casterId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.showId = request.showId;
            this.isBatchMode = request.isBatchMode;
            this.showIdList = request.showIdList;
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
         * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
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
         * <p>The ID of the episode.</p>
         * <blockquote>
         * <p> You can obtain the ID by checking the value of the response parameter ShowId of the <a href="https://help.aliyun.com/document_detail/370861.html">AddShowIntoShowList</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
         */
        public Builder showId(String showId) {
            this.putQueryParameter("ShowId", showId);
            this.showId = showId;
            return this;
        }

        /**
         * <p>Specifies whether to remove multiple episodes at a time. Valid values:</p>
         * <ul>
         * <li>true: removes multiple episodes at a time.</li>
         * <li>false: removes a single episode.</li>
         * </ul>
         * <blockquote>
         * <p> If you do not configure this parameter or this parameter is left empty, a single episode is to be removed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isBatchMode(Boolean isBatchMode) {
            this.putQueryParameter("isBatchMode", isBatchMode);
            this.isBatchMode = isBatchMode;
            return this;
        }

        /**
         * <p>The IDs of episodes that you want to remove.</p>
         */
        public Builder showIdList(java.util.List<String> showIdList) {
            this.putQueryParameter("showIdList", showIdList);
            this.showIdList = showIdList;
            return this;
        }

        @Override
        public RemoveShowFromShowListRequest build() {
            return new RemoveShowFromShowListRequest(this);
        } 

    } 

}
