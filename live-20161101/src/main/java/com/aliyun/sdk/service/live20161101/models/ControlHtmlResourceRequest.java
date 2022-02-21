// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ControlHtmlResourceRequest} extends {@link RequestModel}
 *
 * <p>ControlHtmlResourceRequest</p>
 */
public class ControlHtmlResourceRequest extends Request {
    @Query
    @NameInMap("CasterId")
    private String casterId;

    @Query
    @NameInMap("HtmlResourceId")
    private String htmlResourceId;

    @Query
    @NameInMap("Operate")
    @Validation(required = true)
    private String operate;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("htmlUrl")
    private String htmlUrl;

    private ControlHtmlResourceRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.htmlResourceId = builder.htmlResourceId;
        this.operate = builder.operate;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.htmlUrl = builder.htmlUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ControlHtmlResourceRequest create() {
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
     * @return htmlResourceId
     */
    public String getHtmlResourceId() {
        return this.htmlResourceId;
    }

    /**
     * @return operate
     */
    public String getOperate() {
        return this.operate;
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
     * @return htmlUrl
     */
    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public static final class Builder extends Request.Builder<ControlHtmlResourceRequest, Builder> {
        private String casterId; 
        private String htmlResourceId; 
        private String operate; 
        private Long ownerId; 
        private String regionId; 
        private String htmlUrl; 

        private Builder() {
            super();
        } 

        private Builder(ControlHtmlResourceRequest response) {
            super(response);
            this.casterId = response.casterId;
            this.htmlResourceId = response.htmlResourceId;
            this.operate = response.operate;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.htmlUrl = response.htmlUrl;
        } 

        /**
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * HtmlResourceId.
         */
        public Builder htmlResourceId(String htmlResourceId) {
            this.putQueryParameter("HtmlResourceId", htmlResourceId);
            this.htmlResourceId = htmlResourceId;
            return this;
        }

        /**
         * Operate.
         */
        public Builder operate(String operate) {
            this.putQueryParameter("Operate", operate);
            this.operate = operate;
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
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * htmlUrl.
         */
        public Builder htmlUrl(String htmlUrl) {
            this.putQueryParameter("htmlUrl", htmlUrl);
            this.htmlUrl = htmlUrl;
            return this;
        }

        @Override
        public ControlHtmlResourceRequest build() {
            return new ControlHtmlResourceRequest(this);
        } 

    } 

}
