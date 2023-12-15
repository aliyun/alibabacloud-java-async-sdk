// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest} extends {@link RequestModel}
 *
 * <p>BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest</p>
 */
public class BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Body
    @NameInMap("PhoneList")
    @Validation(required = true)
    private java.util.Map < String, ? > phoneList;

    private BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.antChainId = builder.antChainId;
        this.phoneList = builder.phoneList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest create() {
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
     * @return antChainId
     */
    public String getAntChainId() {
        return this.antChainId;
    }

    /**
     * @return phoneList
     */
    public java.util.Map < String, ? > getPhoneList() {
        return this.phoneList;
    }

    public static final class Builder extends Request.Builder<BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest, Builder> {
        private String regionId; 
        private String antChainId; 
        private java.util.Map < String, ? > phoneList; 

        private Builder() {
            super();
        } 

        private Builder(BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.antChainId = request.antChainId;
            this.phoneList = request.phoneList;
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
         * AntChainId.
         */
        public Builder antChainId(String antChainId) {
            this.putBodyParameter("AntChainId", antChainId);
            this.antChainId = antChainId;
            return this;
        }

        /**
         * PhoneList.
         */
        public Builder phoneList(java.util.Map < String, ? > phoneList) {
            String phoneListShrink = shrink(phoneList, "PhoneList", "json");
            this.putBodyParameter("PhoneList", phoneListShrink);
            this.phoneList = phoneList;
            return this;
        }

        @Override
        public BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest build() {
            return new BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest(this);
        } 

    } 

}
