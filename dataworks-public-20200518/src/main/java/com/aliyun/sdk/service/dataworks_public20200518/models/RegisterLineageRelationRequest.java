// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterLineageRelationRequest} extends {@link RequestModel}
 *
 * <p>RegisterLineageRelationRequest</p>
 */
public class RegisterLineageRelationRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("LineageRelationRegisterVO")
    @Validation(required = true)
    private LineageRelationRegisterVO lineageRelationRegisterVO;

    private RegisterLineageRelationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.lineageRelationRegisterVO = builder.lineageRelationRegisterVO;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterLineageRelationRequest create() {
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
     * @return lineageRelationRegisterVO
     */
    public LineageRelationRegisterVO getLineageRelationRegisterVO() {
        return this.lineageRelationRegisterVO;
    }

    public static final class Builder extends Request.Builder<RegisterLineageRelationRequest, Builder> {
        private String regionId; 
        private LineageRelationRegisterVO lineageRelationRegisterVO; 

        private Builder() {
            super();
        } 

        private Builder(RegisterLineageRelationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.lineageRelationRegisterVO = request.lineageRelationRegisterVO;
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
         * LineageRelationRegisterVO.
         */
        public Builder lineageRelationRegisterVO(LineageRelationRegisterVO lineageRelationRegisterVO) {
            String lineageRelationRegisterVOShrink = shrink(lineageRelationRegisterVO, "LineageRelationRegisterVO", "json");
            this.putBodyParameter("LineageRelationRegisterVO", lineageRelationRegisterVOShrink);
            this.lineageRelationRegisterVO = lineageRelationRegisterVO;
            return this;
        }

        @Override
        public RegisterLineageRelationRequest build() {
            return new RegisterLineageRelationRequest(this);
        } 

    } 

}
