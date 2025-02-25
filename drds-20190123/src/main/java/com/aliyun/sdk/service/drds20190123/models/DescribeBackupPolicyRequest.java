// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    private DescribeBackupPolicyRequest(Builder builder) {
        super(builder);
        this.drdsInstanceId = builder.drdsInstanceId;
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
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public static final class Builder extends Request.Builder<DescribeBackupPolicyRequest, Builder> {
        private String drdsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupPolicyRequest request) {
            super(request);
            this.drdsInstanceId = request.drdsInstanceId;
        } 

        /**
         * The ID of the instance.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        @Override
        public DescribeBackupPolicyRequest build() {
            return new DescribeBackupPolicyRequest(this);
        } 

    } 

}
