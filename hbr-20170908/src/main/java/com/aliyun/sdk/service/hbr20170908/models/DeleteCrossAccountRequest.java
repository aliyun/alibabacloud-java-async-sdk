// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link DeleteCrossAccountRequest} extends {@link RequestModel}
 *
 * <p>DeleteCrossAccountRequest</p>
 */
public class DeleteCrossAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountRoleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String crossAccountRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountType")
    private String crossAccountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long crossAccountUserId;

    private DeleteCrossAccountRequest(Builder builder) {
        super(builder);
        this.crossAccountRoleName = builder.crossAccountRoleName;
        this.crossAccountType = builder.crossAccountType;
        this.crossAccountUserId = builder.crossAccountUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCrossAccountRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteCrossAccountRequest, Builder> {
        private String crossAccountRoleName; 
        private String crossAccountType; 
        private Long crossAccountUserId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCrossAccountRequest request) {
            super(request);
            this.crossAccountRoleName = request.crossAccountRoleName;
            this.crossAccountType = request.crossAccountType;
            this.crossAccountUserId = request.crossAccountUserId;
        } 

        /**
         * <p>The name of the RAM role of the account to back up. This parameter is required when you configure cross-account backup by assuming a RAM role.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hbrcrossrole</p>
         */
        public Builder crossAccountRoleName(String crossAccountRoleName) {
            this.putQueryParameter("CrossAccountRoleName", crossAccountRoleName);
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }

        /**
         * <p>The type of cross-account backup. Valid values:</p>
         * <ul>
         * <li><p><strong>CROSS_ACCOUNT</strong>: Cross-account backup is configured by assuming a RAM role.</p>
         * </li>
         * <li><p><strong>CROSS_ACCOUNT_BY_RD</strong>: Cross-account backup is configured based on a resource directory.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CROSS_ACCOUNT</p>
         */
        public Builder crossAccountType(String crossAccountType) {
            this.putQueryParameter("CrossAccountType", crossAccountType);
            this.crossAccountType = crossAccountType;
            return this;
        }

        /**
         * <p>The UID of the account to back up.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1841xxxxx3649795</p>
         */
        public Builder crossAccountUserId(Long crossAccountUserId) {
            this.putQueryParameter("CrossAccountUserId", crossAccountUserId);
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }

        @Override
        public DeleteCrossAccountRequest build() {
            return new DeleteCrossAccountRequest(this);
        } 

    } 

}
