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
 * {@link CreateHpcClusterResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHpcClusterResponseBody</p>
 */
public class CreateHpcClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HpcClusterId")
    private String hpcClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateHpcClusterResponseBody(Builder builder) {
        this.hpcClusterId = builder.hpcClusterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHpcClusterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hpcClusterId
     */
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String hpcClusterId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateHpcClusterResponseBody model) {
            this.hpcClusterId = model.hpcClusterId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>hpc-pnlg1ds9rky4****</p>
         */
        public Builder hpcClusterId(String hpcClusterId) {
            this.hpcClusterId = hpcClusterId;
            return this;
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

        public CreateHpcClusterResponseBody build() {
            return new CreateHpcClusterResponseBody(this);
        } 

    } 

}
