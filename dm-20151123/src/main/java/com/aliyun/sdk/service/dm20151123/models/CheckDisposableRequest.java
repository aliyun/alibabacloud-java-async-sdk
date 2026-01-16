// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link CheckDisposableRequest} extends {@link RequestModel}
 *
 * <p>CheckDisposableRequest</p>
 */
public class CheckDisposableRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    private CheckDisposableRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.email = builder.email;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDisposableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    public static final class Builder extends Request.Builder<CheckDisposableRequest, Builder> {
        private String regionId; 
        private String email; 

        private Builder() {
            super();
        } 

        private Builder(CheckDisposableRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.email = request.email;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        @Override
        public CheckDisposableRequest build() {
            return new CheckDisposableRequest(this);
        } 

    } 

}
