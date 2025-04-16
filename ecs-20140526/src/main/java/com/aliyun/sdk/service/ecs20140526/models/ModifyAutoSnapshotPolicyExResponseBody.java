// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link ModifyAutoSnapshotPolicyExResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyAutoSnapshotPolicyExResponseBody</p>
 */
public class ModifyAutoSnapshotPolicyExResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyAutoSnapshotPolicyExResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAutoSnapshotPolicyExResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyAutoSnapshotPolicyExResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyAutoSnapshotPolicyExResponseBody build() {
            return new ModifyAutoSnapshotPolicyExResponseBody(this);
        } 

    } 

}
