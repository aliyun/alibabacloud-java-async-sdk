// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAutoSnapshotPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteAutoSnapshotPolicyRequest</p>
 */
public class DeleteAutoSnapshotPolicyRequest extends Request {
    @Query
    @NameInMap("AutoSnapshotPolicyId")
    @Validation(required = true)
    private String autoSnapshotPolicyId;

    private DeleteAutoSnapshotPolicyRequest(Builder builder) {
        super(builder);
        this.autoSnapshotPolicyId = builder.autoSnapshotPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAutoSnapshotPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoSnapshotPolicyId
     */
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    public static final class Builder extends Request.Builder<DeleteAutoSnapshotPolicyRequest, Builder> {
        private String autoSnapshotPolicyId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAutoSnapshotPolicyRequest response) {
            super(response);
            this.autoSnapshotPolicyId = response.autoSnapshotPolicyId;
        } 

        /**
         * AutoSnapshotPolicyId.
         */
        public Builder autoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.putQueryParameter("AutoSnapshotPolicyId", autoSnapshotPolicyId);
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }

        @Override
        public DeleteAutoSnapshotPolicyRequest build() {
            return new DeleteAutoSnapshotPolicyRequest(this);
        } 

    } 

}
