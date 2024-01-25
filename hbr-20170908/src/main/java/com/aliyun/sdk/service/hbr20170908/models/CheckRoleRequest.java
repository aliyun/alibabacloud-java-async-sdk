// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckRoleRequest} extends {@link RequestModel}
 *
 * <p>CheckRoleRequest</p>
 */
public class CheckRoleRequest extends Request {
    @Query
    @NameInMap("CheckRoleType")
    private String checkRoleType;

    @Query
    @NameInMap("CrossAccountRoleName")
    private String crossAccountRoleName;

    @Query
    @NameInMap("CrossAccountUserId")
    private Long crossAccountUserId;

    private CheckRoleRequest(Builder builder) {
        super(builder);
        this.checkRoleType = builder.checkRoleType;
        this.crossAccountRoleName = builder.crossAccountRoleName;
        this.crossAccountUserId = builder.crossAccountUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkRoleType
     */
    public String getCheckRoleType() {
        return this.checkRoleType;
    }

    /**
     * @return crossAccountRoleName
     */
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    /**
     * @return crossAccountUserId
     */
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    public static final class Builder extends Request.Builder<CheckRoleRequest, Builder> {
        private String checkRoleType; 
        private String crossAccountRoleName; 
        private Long crossAccountUserId; 

        private Builder() {
            super();
        } 

        private Builder(CheckRoleRequest request) {
            super(request);
            this.checkRoleType = request.checkRoleType;
            this.crossAccountRoleName = request.crossAccountRoleName;
            this.crossAccountUserId = request.crossAccountUserId;
        } 

        /**
         * CheckRoleType.
         */
        public Builder checkRoleType(String checkRoleType) {
            this.putQueryParameter("CheckRoleType", checkRoleType);
            this.checkRoleType = checkRoleType;
            return this;
        }

        /**
         * CrossAccountRoleName.
         */
        public Builder crossAccountRoleName(String crossAccountRoleName) {
            this.putQueryParameter("CrossAccountRoleName", crossAccountRoleName);
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }

        /**
         * CrossAccountUserId.
         */
        public Builder crossAccountUserId(Long crossAccountUserId) {
            this.putQueryParameter("CrossAccountUserId", crossAccountUserId);
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }

        @Override
        public CheckRoleRequest build() {
            return new CheckRoleRequest(this);
        } 

    } 

}
