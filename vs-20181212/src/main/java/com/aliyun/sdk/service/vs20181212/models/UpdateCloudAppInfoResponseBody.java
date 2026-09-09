// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link UpdateCloudAppInfoResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCloudAppInfoResponseBody</p>
 */
public class UpdateCloudAppInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PatchId")
    private String patchId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateCloudAppInfoResponseBody(Builder builder) {
        this.patchId = builder.patchId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCloudAppInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return patchId
     */
    public String getPatchId() {
        return this.patchId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String patchId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateCloudAppInfoResponseBody model) {
            this.patchId = model.patchId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the patch package.</p>
         * 
         * <strong>example:</strong>
         * <p>patch-03fa76e8e13a49b6a966b063d9d309b4</p>
         */
        public Builder patchId(String patchId) {
            this.patchId = patchId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateCloudAppInfoResponseBody build() {
            return new UpdateCloudAppInfoResponseBody(this);
        } 

    } 

}
