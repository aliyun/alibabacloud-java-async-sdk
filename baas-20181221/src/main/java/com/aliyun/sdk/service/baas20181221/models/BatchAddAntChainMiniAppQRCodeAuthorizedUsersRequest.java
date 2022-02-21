// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

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
    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Body
    @NameInMap("PhoneList")
    @Validation(required = true)
    private java.util.Map < String, ? > phoneList;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest(Builder builder) {
        super(builder);
        this.antChainId = builder.antChainId;
        this.phoneList = builder.phoneList;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest, Builder> {
        private String antChainId; 
        private java.util.Map < String, ? > phoneList; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest response) {
            super(response);
            this.antChainId = response.antChainId;
            this.phoneList = response.phoneList;
            this.regionId = response.regionId;
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
            this.putBodyParameter("PhoneList", phoneList);
            this.phoneList = phoneList;
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

        @Override
        public BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest build() {
            return new BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest(this);
        } 

    } 

}
