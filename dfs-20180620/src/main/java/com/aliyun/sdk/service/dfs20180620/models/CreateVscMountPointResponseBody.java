// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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
 * {@link CreateVscMountPointResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVscMountPointResponseBody</p>
 */
public class CreateVscMountPointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MountPointId")
    private String mountPointId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateVscMountPointResponseBody(Builder builder) {
        this.mountPointId = builder.mountPointId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVscMountPointResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mountPointId
     */
    public String getMountPointId() {
        return this.mountPointId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String mountPointId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateVscMountPointResponseBody model) {
            this.mountPointId = model.mountPointId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The mount target ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e389e5c7-bcb4-4558-846a-e5afc444****</p>
         */
        public Builder mountPointId(String mountPointId) {
            this.mountPointId = mountPointId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateVscMountPointResponseBody build() {
            return new CreateVscMountPointResponseBody(this);
        } 

    } 

}
