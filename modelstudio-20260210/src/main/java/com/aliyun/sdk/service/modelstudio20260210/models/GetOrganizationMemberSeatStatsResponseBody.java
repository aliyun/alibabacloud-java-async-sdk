// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetOrganizationMemberSeatStatsResponseBody} extends {@link TeaModel}
 *
 * <p>GetOrganizationMemberSeatStatsResponseBody</p>
 */
public class GetOrganizationMemberSeatStatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdminRoleUserCount")
    private Integer adminRoleUserCount;

    @com.aliyun.core.annotation.NameInMap("MemberRoleUserCount")
    private Integer memberRoleUserCount;

    @com.aliyun.core.annotation.NameInMap("OrgId")
    private String orgId;

    @com.aliyun.core.annotation.NameInMap("OwnerRoleUserCount")
    private Integer ownerRoleUserCount;

    @com.aliyun.core.annotation.NameInMap("SeatedMemberCount")
    private Integer seatedMemberCount;

    @com.aliyun.core.annotation.NameInMap("TotalMemberCount")
    private Integer totalMemberCount;

    @com.aliyun.core.annotation.NameInMap("UnseatedMemberCount")
    private Integer unseatedMemberCount;

    private GetOrganizationMemberSeatStatsResponseBody(Builder builder) {
        this.adminRoleUserCount = builder.adminRoleUserCount;
        this.memberRoleUserCount = builder.memberRoleUserCount;
        this.orgId = builder.orgId;
        this.ownerRoleUserCount = builder.ownerRoleUserCount;
        this.seatedMemberCount = builder.seatedMemberCount;
        this.totalMemberCount = builder.totalMemberCount;
        this.unseatedMemberCount = builder.unseatedMemberCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrganizationMemberSeatStatsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adminRoleUserCount
     */
    public Integer getAdminRoleUserCount() {
        return this.adminRoleUserCount;
    }

    /**
     * @return memberRoleUserCount
     */
    public Integer getMemberRoleUserCount() {
        return this.memberRoleUserCount;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return ownerRoleUserCount
     */
    public Integer getOwnerRoleUserCount() {
        return this.ownerRoleUserCount;
    }

    /**
     * @return seatedMemberCount
     */
    public Integer getSeatedMemberCount() {
        return this.seatedMemberCount;
    }

    /**
     * @return totalMemberCount
     */
    public Integer getTotalMemberCount() {
        return this.totalMemberCount;
    }

    /**
     * @return unseatedMemberCount
     */
    public Integer getUnseatedMemberCount() {
        return this.unseatedMemberCount;
    }

    public static final class Builder {
        private Integer adminRoleUserCount; 
        private Integer memberRoleUserCount; 
        private String orgId; 
        private Integer ownerRoleUserCount; 
        private Integer seatedMemberCount; 
        private Integer totalMemberCount; 
        private Integer unseatedMemberCount; 

        private Builder() {
        } 

        private Builder(GetOrganizationMemberSeatStatsResponseBody model) {
            this.adminRoleUserCount = model.adminRoleUserCount;
            this.memberRoleUserCount = model.memberRoleUserCount;
            this.orgId = model.orgId;
            this.ownerRoleUserCount = model.ownerRoleUserCount;
            this.seatedMemberCount = model.seatedMemberCount;
            this.totalMemberCount = model.totalMemberCount;
            this.unseatedMemberCount = model.unseatedMemberCount;
        } 

        /**
         * AdminRoleUserCount.
         */
        public Builder adminRoleUserCount(Integer adminRoleUserCount) {
            this.adminRoleUserCount = adminRoleUserCount;
            return this;
        }

        /**
         * MemberRoleUserCount.
         */
        public Builder memberRoleUserCount(Integer memberRoleUserCount) {
            this.memberRoleUserCount = memberRoleUserCount;
            return this;
        }

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
         * OwnerRoleUserCount.
         */
        public Builder ownerRoleUserCount(Integer ownerRoleUserCount) {
            this.ownerRoleUserCount = ownerRoleUserCount;
            return this;
        }

        /**
         * SeatedMemberCount.
         */
        public Builder seatedMemberCount(Integer seatedMemberCount) {
            this.seatedMemberCount = seatedMemberCount;
            return this;
        }

        /**
         * TotalMemberCount.
         */
        public Builder totalMemberCount(Integer totalMemberCount) {
            this.totalMemberCount = totalMemberCount;
            return this;
        }

        /**
         * UnseatedMemberCount.
         */
        public Builder unseatedMemberCount(Integer unseatedMemberCount) {
            this.unseatedMemberCount = unseatedMemberCount;
            return this;
        }

        public GetOrganizationMemberSeatStatsResponseBody build() {
            return new GetOrganizationMemberSeatStatsResponseBody(this);
        } 

    } 

}
