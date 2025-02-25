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
 * {@link ModifyWebLockRefreshRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebLockRefreshRequest</p>
 */
public class ModifyWebLockRefreshRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private ModifyWebLockRefreshRequest(Builder builder) {
        super(builder);
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebLockRefreshRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyWebLockRefreshRequest, Builder> {
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebLockRefreshRequest request) {
            super(request);
            this.uuid = request.uuid;
        } 

        /**
         * <p>The UUID of the server for which you want to refresh the status of the web tamper proofing feature.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeWebLockBindList~~">DescribeWebLockBindList</a> operation to query the servers for which the web tamper proofing feature is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>55c0f41b-3093-47a7-8eae-02d3a584****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ModifyWebLockRefreshRequest build() {
            return new ModifyWebLockRefreshRequest(this);
        } 

    } 

}
