// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeMemberInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMemberInfoResponseBody</p>
 */
public class DescribeMemberInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdminName")
    private String adminName;

    @com.aliyun.core.annotation.NameInMap("AdminUid")
    private String adminUid;

    @com.aliyun.core.annotation.NameInMap("IsMember")
    private Boolean isMember;

    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private String memberUid;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMemberInfoResponseBody(Builder builder) {
        this.adminName = builder.adminName;
        this.adminUid = builder.adminUid;
        this.isMember = builder.isMember;
        this.memberUid = builder.memberUid;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMemberInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adminName
     */
    public String getAdminName() {
        return this.adminName;
    }

    /**
     * @return adminUid
     */
    public String getAdminUid() {
        return this.adminUid;
    }

    /**
     * @return isMember
     */
    public Boolean getIsMember() {
        return this.isMember;
    }

    /**
     * @return memberUid
     */
    public String getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String adminName; 
        private String adminUid; 
        private Boolean isMember; 
        private String memberUid; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeMemberInfoResponseBody model) {
            this.adminName = model.adminName;
            this.adminUid = model.adminUid;
            this.isMember = model.isMember;
            this.memberUid = model.memberUid;
            this.requestId = model.requestId;
        } 

        /**
         * AdminName.
         */
        public Builder adminName(String adminName) {
            this.adminName = adminName;
            return this;
        }

        /**
         * AdminUid.
         */
        public Builder adminUid(String adminUid) {
            this.adminUid = adminUid;
            return this;
        }

        /**
         * IsMember.
         */
        public Builder isMember(Boolean isMember) {
            this.isMember = isMember;
            return this;
        }

        /**
         * MemberUid.
         */
        public Builder memberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMemberInfoResponseBody build() {
            return new DescribeMemberInfoResponseBody(this);
        } 

    } 

}
