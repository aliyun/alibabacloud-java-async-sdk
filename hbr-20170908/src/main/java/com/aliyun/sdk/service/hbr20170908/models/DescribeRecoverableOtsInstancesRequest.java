// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecoverableOtsInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeRecoverableOtsInstancesRequest</p>
 */
public class DescribeRecoverableOtsInstancesRequest extends Request {
    @Query
    @NameInMap("CrossAccountRoleName")
    private String crossAccountRoleName;

    @Query
    @NameInMap("CrossAccountType")
    private String crossAccountType;

    @Query
    @NameInMap("CrossAccountUserId")
    private Long crossAccountUserId;

    private DescribeRecoverableOtsInstancesRequest(Builder builder) {
        super(builder);
        this.crossAccountRoleName = builder.crossAccountRoleName;
        this.crossAccountType = builder.crossAccountType;
        this.crossAccountUserId = builder.crossAccountUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecoverableOtsInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crossAccountRoleName
     */
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    /**
     * @return crossAccountType
     */
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    /**
     * @return crossAccountUserId
     */
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    public static final class Builder extends Request.Builder<DescribeRecoverableOtsInstancesRequest, Builder> {
        private String crossAccountRoleName; 
        private String crossAccountType; 
        private Long crossAccountUserId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRecoverableOtsInstancesRequest request) {
            super(request);
            this.crossAccountRoleName = request.crossAccountRoleName;
            this.crossAccountType = request.crossAccountType;
            this.crossAccountUserId = request.crossAccountUserId;
        } 

        /**
         * The role name created in the RAM of the original account used for cross-account backup.
         */
        public Builder crossAccountRoleName(String crossAccountRoleName) {
            this.putQueryParameter("CrossAccountRoleName", crossAccountRoleName);
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }

        /**
         * The type of cross-account backup. Supported:
         * <p>
         * * SELF_ACCOUNT: backup of this account
         * * CROSS_ACCOUNT: Cross-account backup
         */
        public Builder crossAccountType(String crossAccountType) {
            this.putQueryParameter("CrossAccountType", crossAccountType);
            this.crossAccountType = crossAccountType;
            return this;
        }

        /**
         * The Alibaba Cloud Uid of the original account used to cross accounts.
         */
        public Builder crossAccountUserId(Long crossAccountUserId) {
            this.putQueryParameter("CrossAccountUserId", crossAccountUserId);
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }

        @Override
        public DescribeRecoverableOtsInstancesRequest build() {
            return new DescribeRecoverableOtsInstancesRequest(this);
        } 

    } 

}
