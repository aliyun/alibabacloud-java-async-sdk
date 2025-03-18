// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateMountTargetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMountTargetResponseBody</p>
 */
public class CreateMountTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CreateMountTargetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMountTargetResponseBody create() {
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(CreateMountTargetResponseBody model) {
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>70EACC9C-D07A-4A34-ADA4-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state of the mount target. Valid values:</p>
         * <ul>
         * <li>active</li>
         * <li>inactive</li>
         * <li>pending</li>
         * <li>deleting</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateMountTargetResponseBody build() {
            return new CreateMountTargetResponseBody(this);
        } 

    } 

}
