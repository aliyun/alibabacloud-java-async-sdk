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
 * {@link CrossAccountUser} extends {@link TeaModel}
 *
 * <p>CrossAccountUser</p>
 */
public class CrossAccountUser extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CrossAccountRoleName")
    private String crossAccountRoleName;

    @com.aliyun.core.annotation.NameInMap("CrossAccountType")
    private String crossAccountType;

    @com.aliyun.core.annotation.NameInMap("CrossAccountUserId")
    private Long crossAccountUserId;

    private CrossAccountUser(Builder builder) {
        this.crossAccountRoleName = builder.crossAccountRoleName;
        this.crossAccountType = builder.crossAccountType;
        this.crossAccountUserId = builder.crossAccountUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CrossAccountUser create() {
        return builder().build();
    }

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

    public static final class Builder {
        private String crossAccountRoleName; 
        private String crossAccountType; 
        private Long crossAccountUserId; 

        private Builder() {
        } 

        private Builder(CrossAccountUser model) {
            this.crossAccountRoleName = model.crossAccountRoleName;
            this.crossAccountType = model.crossAccountType;
            this.crossAccountUserId = model.crossAccountUserId;
        } 

        /**
         * CrossAccountRoleName.
         */
        public Builder crossAccountRoleName(String crossAccountRoleName) {
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }

        /**
         * CrossAccountType.
         */
        public Builder crossAccountType(String crossAccountType) {
            this.crossAccountType = crossAccountType;
            return this;
        }

        /**
         * CrossAccountUserId.
         */
        public Builder crossAccountUserId(Long crossAccountUserId) {
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }

        public CrossAccountUser build() {
            return new CrossAccountUser(this);
        } 

    } 

}
