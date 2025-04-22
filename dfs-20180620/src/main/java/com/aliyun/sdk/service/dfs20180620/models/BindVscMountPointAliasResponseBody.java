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
 * {@link BindVscMountPointAliasResponseBody} extends {@link TeaModel}
 *
 * <p>BindVscMountPointAliasResponseBody</p>
 */
public class BindVscMountPointAliasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MountPointAlias")
    private String mountPointAlias;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BindVscMountPointAliasResponseBody(Builder builder) {
        this.mountPointAlias = builder.mountPointAlias;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindVscMountPointAliasResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mountPointAlias
     */
    public String getMountPointAlias() {
        return this.mountPointAlias;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String mountPointAlias; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(BindVscMountPointAliasResponseBody model) {
            this.mountPointAlias = model.mountPointAlias;
            this.requestId = model.requestId;
        } 

        /**
         * MountPointAlias.
         */
        public Builder mountPointAlias(String mountPointAlias) {
            this.mountPointAlias = mountPointAlias;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BindVscMountPointAliasResponseBody build() {
            return new BindVscMountPointAliasResponseBody(this);
        } 

    } 

}
