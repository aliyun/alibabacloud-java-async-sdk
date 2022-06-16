// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstTransInfoRequest} extends {@link RequestModel}
 *
 * <p>GetInstTransInfoRequest</p>
 */
public class GetInstTransInfoRequest extends Request {
    @Body
    @NameInMap("aliyunCommodityCode")
    @Validation(required = true)
    private String aliyunCommodityCode;

    @Body
    @NameInMap("aliyunEquipId")
    @Validation(required = true)
    private String aliyunEquipId;

    @Body
    @NameInMap("aliyunUid")
    @Validation(required = true)
    private String aliyunUid;

    private GetInstTransInfoRequest(Builder builder) {
        super(builder);
        this.aliyunCommodityCode = builder.aliyunCommodityCode;
        this.aliyunEquipId = builder.aliyunEquipId;
        this.aliyunUid = builder.aliyunUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstTransInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunCommodityCode
     */
    public String getAliyunCommodityCode() {
        return this.aliyunCommodityCode;
    }

    /**
     * @return aliyunEquipId
     */
    public String getAliyunEquipId() {
        return this.aliyunEquipId;
    }

    /**
     * @return aliyunUid
     */
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    public static final class Builder extends Request.Builder<GetInstTransInfoRequest, Builder> {
        private String aliyunCommodityCode; 
        private String aliyunEquipId; 
        private String aliyunUid; 

        private Builder() {
            super();
        } 

        private Builder(GetInstTransInfoRequest request) {
            super(request);
            this.aliyunCommodityCode = request.aliyunCommodityCode;
            this.aliyunEquipId = request.aliyunEquipId;
            this.aliyunUid = request.aliyunUid;
        } 

        /**
         * aliyunCommodityCode.
         */
        public Builder aliyunCommodityCode(String aliyunCommodityCode) {
            this.putBodyParameter("aliyunCommodityCode", aliyunCommodityCode);
            this.aliyunCommodityCode = aliyunCommodityCode;
            return this;
        }

        /**
         * aliyunEquipId.
         */
        public Builder aliyunEquipId(String aliyunEquipId) {
            this.putBodyParameter("aliyunEquipId", aliyunEquipId);
            this.aliyunEquipId = aliyunEquipId;
            return this;
        }

        /**
         * aliyunUid.
         */
        public Builder aliyunUid(String aliyunUid) {
            this.putBodyParameter("aliyunUid", aliyunUid);
            this.aliyunUid = aliyunUid;
            return this;
        }

        @Override
        public GetInstTransInfoRequest build() {
            return new GetInstTransInfoRequest(this);
        } 

    } 

}
