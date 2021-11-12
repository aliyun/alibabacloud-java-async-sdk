// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpgradeBackupPolicyVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeBackupPolicyVersionRequest</p>
 */
public class UpgradeBackupPolicyVersionRequest extends Request {
    @Query
    @NameInMap("Id")
    private Long id;


    private UpgradeBackupPolicyVersionRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeBackupPolicyVersionRequest create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder {
        private Long id; 

        /**
         * <p>Id.</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        public UpgradeBackupPolicyVersionRequest build() {
            return new UpgradeBackupPolicyVersionRequest(this);
        } 

    } 

}
