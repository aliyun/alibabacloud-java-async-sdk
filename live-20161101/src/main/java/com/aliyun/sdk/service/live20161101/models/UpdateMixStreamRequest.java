// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMixStreamRequest} extends {@link RequestModel}
 *
 * <p>UpdateMixStreamRequest</p>
 */
public class UpdateMixStreamRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("InputStreamList")
    @Validation(required = true)
    private String inputStreamList;

    @Query
    @NameInMap("LayoutId")
    private String layoutId;

    @Query
    @NameInMap("MixStreamId")
    @Validation(required = true)
    private String mixStreamId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private UpdateMixStreamRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domainName = builder.domainName;
        this.inputStreamList = builder.inputStreamList;
        this.layoutId = builder.layoutId;
        this.mixStreamId = builder.mixStreamId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMixStreamRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return inputStreamList
     */
    public String getInputStreamList() {
        return this.inputStreamList;
    }

    /**
     * @return layoutId
     */
    public String getLayoutId() {
        return this.layoutId;
    }

    /**
     * @return mixStreamId
     */
    public String getMixStreamId() {
        return this.mixStreamId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<UpdateMixStreamRequest, Builder> {
        private String regionId; 
        private String domainName; 
        private String inputStreamList; 
        private String layoutId; 
        private String mixStreamId; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMixStreamRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domainName = request.domainName;
            this.inputStreamList = request.inputStreamList;
            this.layoutId = request.layoutId;
            this.mixStreamId = request.mixStreamId;
            this.ownerId = request.ownerId;
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
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * InputStreamList.
         */
        public Builder inputStreamList(String inputStreamList) {
            this.putQueryParameter("InputStreamList", inputStreamList);
            this.inputStreamList = inputStreamList;
            return this;
        }

        /**
         * LayoutId.
         */
        public Builder layoutId(String layoutId) {
            this.putQueryParameter("LayoutId", layoutId);
            this.layoutId = layoutId;
            return this;
        }

        /**
         * MixStreamId.
         */
        public Builder mixStreamId(String mixStreamId) {
            this.putQueryParameter("MixStreamId", mixStreamId);
            this.mixStreamId = mixStreamId;
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

        @Override
        public UpdateMixStreamRequest build() {
            return new UpdateMixStreamRequest(this);
        } 

    } 

}
