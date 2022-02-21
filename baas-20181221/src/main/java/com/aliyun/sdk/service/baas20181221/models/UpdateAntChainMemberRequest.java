// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAntChainMemberRequest} extends {@link RequestModel}
 *
 * <p>UpdateAntChainMemberRequest</p>
 */
public class UpdateAntChainMemberRequest extends Request {
    @Body
    @NameInMap("ConsortiumId")
    @Validation(required = true)
    private String consortiumId;

    @Body
    @NameInMap("MemberId")
    @Validation(required = true)
    private String memberId;

    @Body
    @NameInMap("MemberName")
    @Validation(required = true)
    private String memberName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateAntChainMemberRequest(Builder builder) {
        super(builder);
        this.consortiumId = builder.consortiumId;
        this.memberId = builder.memberId;
        this.memberName = builder.memberName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAntChainMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
    }

    /**
     * @return memberId
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * @return memberName
     */
    public String getMemberName() {
        return this.memberName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateAntChainMemberRequest, Builder> {
        private String consortiumId; 
        private String memberId; 
        private String memberName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAntChainMemberRequest response) {
            super(response);
            this.consortiumId = response.consortiumId;
            this.memberId = response.memberId;
            this.memberName = response.memberName;
            this.regionId = response.regionId;
        } 

        /**
         * ConsortiumId.
         */
        public Builder consortiumId(String consortiumId) {
            this.putBodyParameter("ConsortiumId", consortiumId);
            this.consortiumId = consortiumId;
            return this;
        }

        /**
         * MemberId.
         */
        public Builder memberId(String memberId) {
            this.putBodyParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * MemberName.
         */
        public Builder memberName(String memberName) {
            this.putBodyParameter("MemberName", memberName);
            this.memberName = memberName;
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
        public UpdateAntChainMemberRequest build() {
            return new UpdateAntChainMemberRequest(this);
        } 

    } 

}
