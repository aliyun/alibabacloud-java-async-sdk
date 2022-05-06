// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachGadInstanceMemberRequest} extends {@link RequestModel}
 *
 * <p>DetachGadInstanceMemberRequest</p>
 */
public class DetachGadInstanceMemberRequest extends Request {
    @Query
    @NameInMap("GadInstanceName")
    @Validation(required = true)
    private String gadInstanceName;

    @Query
    @NameInMap("MemberInstanceName")
    @Validation(required = true)
    private String memberInstanceName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DetachGadInstanceMemberRequest(Builder builder) {
        super(builder);
        this.gadInstanceName = builder.gadInstanceName;
        this.memberInstanceName = builder.memberInstanceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachGadInstanceMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gadInstanceName
     */
    public String getGadInstanceName() {
        return this.gadInstanceName;
    }

    /**
     * @return memberInstanceName
     */
    public String getMemberInstanceName() {
        return this.memberInstanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DetachGadInstanceMemberRequest, Builder> {
        private String gadInstanceName; 
        private String memberInstanceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DetachGadInstanceMemberRequest request) {
            super(request);
            this.gadInstanceName = request.gadInstanceName;
            this.memberInstanceName = request.memberInstanceName;
            this.regionId = request.regionId;
        } 

        /**
         * GadInstanceName.
         */
        public Builder gadInstanceName(String gadInstanceName) {
            this.putQueryParameter("GadInstanceName", gadInstanceName);
            this.gadInstanceName = gadInstanceName;
            return this;
        }

        /**
         * MemberInstanceName.
         */
        public Builder memberInstanceName(String memberInstanceName) {
            this.putQueryParameter("MemberInstanceName", memberInstanceName);
            this.memberInstanceName = memberInstanceName;
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
        public DetachGadInstanceMemberRequest build() {
            return new DetachGadInstanceMemberRequest(this);
        } 

    } 

}
