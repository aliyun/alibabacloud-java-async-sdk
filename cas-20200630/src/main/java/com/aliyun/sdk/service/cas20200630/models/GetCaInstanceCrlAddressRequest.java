// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

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
 * {@link GetCaInstanceCrlAddressRequest} extends {@link RequestModel}
 *
 * <p>GetCaInstanceCrlAddressRequest</p>
 */
public class GetCaInstanceCrlAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaIdentifier")
    private String caIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private GetCaInstanceCrlAddressRequest(Builder builder) {
        super(builder);
        this.caIdentifier = builder.caIdentifier;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCaInstanceCrlAddressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caIdentifier
     */
    public String getCaIdentifier() {
        return this.caIdentifier;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<GetCaInstanceCrlAddressRequest, Builder> {
        private String caIdentifier; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(GetCaInstanceCrlAddressRequest request) {
            super(request);
            this.caIdentifier = request.caIdentifier;
            this.uuid = request.uuid;
        } 

        /**
         * CaIdentifier.
         */
        public Builder caIdentifier(String caIdentifier) {
            this.putQueryParameter("CaIdentifier", caIdentifier);
            this.caIdentifier = caIdentifier;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public GetCaInstanceCrlAddressRequest build() {
            return new GetCaInstanceCrlAddressRequest(this);
        } 

    } 

}
