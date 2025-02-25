// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCardUsagesRequest} extends {@link RequestModel}
 *
 * <p>ListCardUsagesRequest</p>
 */
public class ListCardUsagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Iccids")
    private java.util.List < String > iccids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WirelessCloudConnectorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wirelessCloudConnectorId;

    private ListCardUsagesRequest(Builder builder) {
        super(builder);
        this.iccids = builder.iccids;
        this.wirelessCloudConnectorId = builder.wirelessCloudConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCardUsagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iccids
     */
    public java.util.List < String > getIccids() {
        return this.iccids;
    }

    /**
     * @return wirelessCloudConnectorId
     */
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

    public static final class Builder extends Request.Builder<ListCardUsagesRequest, Builder> {
        private java.util.List < String > iccids; 
        private String wirelessCloudConnectorId; 

        private Builder() {
            super();
        } 

        private Builder(ListCardUsagesRequest request) {
            super(request);
            this.iccids = request.iccids;
            this.wirelessCloudConnectorId = request.wirelessCloudConnectorId;
        } 

        /**
         * Iccids.
         */
        public Builder iccids(java.util.List < String > iccids) {
            this.putQueryParameter("Iccids", iccids);
            this.iccids = iccids;
            return this;
        }

        /**
         * WirelessCloudConnectorId.
         */
        public Builder wirelessCloudConnectorId(String wirelessCloudConnectorId) {
            this.putQueryParameter("WirelessCloudConnectorId", wirelessCloudConnectorId);
            this.wirelessCloudConnectorId = wirelessCloudConnectorId;
            return this;
        }

        @Override
        public ListCardUsagesRequest build() {
            return new ListCardUsagesRequest(this);
        } 

    } 

}
