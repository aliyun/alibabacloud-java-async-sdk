// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceLinkedRoleResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceLinkedRoleResponseBody</p>
 */
public class GetServiceLinkedRoleResponseBody extends TeaModel {
    @NameInMap("AccountId")
    private String accountId;

    @NameInMap("DbfsLinkedRole")
    private Boolean dbfsLinkedRole;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    private GetServiceLinkedRoleResponseBody(Builder builder) {
        this.accountId = builder.accountId;
        this.dbfsLinkedRole = builder.dbfsLinkedRole;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceLinkedRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return dbfsLinkedRole
     */
    public Boolean getDbfsLinkedRole() {
        return this.dbfsLinkedRole;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accountId; 
        private Boolean dbfsLinkedRole; 
        private String regionId; 
        private String requestId; 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * DbfsLinkedRole.
         */
        public Builder dbfsLinkedRole(Boolean dbfsLinkedRole) {
            this.dbfsLinkedRole = dbfsLinkedRole;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetServiceLinkedRoleResponseBody build() {
            return new GetServiceLinkedRoleResponseBody(this);
        } 

    } 

}
