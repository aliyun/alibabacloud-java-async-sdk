// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupPolicyRequest</p>
 */
public class DescribeBackupPolicyRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    private DescribeBackupPolicyRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DescribeBackupPolicyRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupPolicyRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * The status of the anti-ransomware policy. Valid values:
         * <p>
         * 
         * *   **enabled**: The anti-ransomware policy is manually enabled.
         * *   **disabled**: The anti-ransomware policy is manually disabled. After an anti-ransomware policy is disabled, the data backup task that is running based on the policy stops.
         * *   **closed**: The anti-ransomware policy automatically stops because the anti-ransomware capacity is insufficient.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DescribeBackupPolicyRequest build() {
            return new DescribeBackupPolicyRequest(this);
        } 

    } 

}
