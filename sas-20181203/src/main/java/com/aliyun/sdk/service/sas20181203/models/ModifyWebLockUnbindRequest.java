// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyWebLockUnbindRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebLockUnbindRequest</p>
 */
public class ModifyWebLockUnbindRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private ModifyWebLockUnbindRequest(Builder builder) {
        super(builder);
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebLockUnbindRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ModifyWebLockUnbindRequest, Builder> {
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebLockUnbindRequest request) {
            super(request);
            this.uuid = request.uuid;
        } 

        /**
         * <p>The UUID of the server from which you want to remove the protection directories.</p>
         * <blockquote>
         * <p>Call <a href="~~DescribeWebLockBindList~~">DescribeWebLockBindList</a> to obtain the UUID of the server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8d217d3f-6999-43a6-a435-c7a6854180e9</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ModifyWebLockUnbindRequest build() {
            return new ModifyWebLockUnbindRequest(this);
        } 

    } 

}
