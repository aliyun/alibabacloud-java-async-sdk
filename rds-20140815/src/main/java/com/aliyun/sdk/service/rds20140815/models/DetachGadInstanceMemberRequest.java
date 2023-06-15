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
         * The ID of the global active database cluster.
         */
        public Builder gadInstanceName(String gadInstanceName) {
            this.putQueryParameter("GadInstanceName", gadInstanceName);
            this.gadInstanceName = gadInstanceName;
            return this;
        }

        /**
         * The ID of the instance that serves as the unit node you want to remove. You can call the [DescribeGadInstances](~~330105~~) query the ID of the instance.
         */
        public Builder memberInstanceName(String memberInstanceName) {
            this.putQueryParameter("MemberInstanceName", memberInstanceName);
            this.memberInstanceName = memberInstanceName;
            return this;
        }

        /**
         * The region ID of the central node. You can call the [DescribeGadInstances](~~330105~~) operation to query the most recent region list.
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
