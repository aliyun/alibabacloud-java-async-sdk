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
 * {@link AddCrossAccountRequest} extends {@link RequestModel}
 *
 * <p>AddCrossAccountRequest</p>
 */
public class AddCrossAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Alias")
    private String alias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountRoleName")
    private String crossAccountRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountType")
    private String crossAccountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountUserId")
    private Long crossAccountUserId;

    private AddCrossAccountRequest(Builder builder) {
        super(builder);
        this.alias = builder.alias;
        this.crossAccountRoleName = builder.crossAccountRoleName;
        this.crossAccountType = builder.crossAccountType;
        this.crossAccountUserId = builder.crossAccountUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCrossAccountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
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

    public static final class Builder extends Request.Builder<AddCrossAccountRequest, Builder> {
        private String alias; 
        private String crossAccountRoleName; 
        private String crossAccountType; 
        private Long crossAccountUserId; 

        private Builder() {
            super();
        } 

        private Builder(AddCrossAccountRequest request) {
            super(request);
            this.alias = request.alias;
            this.crossAccountRoleName = request.crossAccountRoleName;
            this.crossAccountType = request.crossAccountType;
            this.crossAccountUserId = request.crossAccountUserId;
        } 

        /**
         * <p>The alias. The maximum length is 32 characters. This parameter is not required for cross-account backups that are configured based on a resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>Source account 1</p>
         */
        public Builder alias(String alias) {
            this.putQueryParameter("Alias", alias);
            this.alias = alias;
            return this;
        }

        /**
         * <p>The name of the RAM role for the account to back up. This parameter is used when you configure a cross-account backup by assuming a RAM role.</p>
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
         * <li><p><strong>CROSS_ACCOUNT</strong>: Configures a cross-account backup by assuming a RAM role.</p>
         * </li>
         * <li><p><strong>CROSS_ACCOUNT_BY_RD</strong>: Configures a cross-account backup based on a resource directory.</p>
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
         * 
         * <strong>example:</strong>
         * <p>1589753xxxxxx625</p>
         */
        public Builder crossAccountUserId(Long crossAccountUserId) {
            this.putQueryParameter("CrossAccountUserId", crossAccountUserId);
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }

        @Override
        public AddCrossAccountRequest build() {
            return new AddCrossAccountRequest(this);
        } 

    } 

}
