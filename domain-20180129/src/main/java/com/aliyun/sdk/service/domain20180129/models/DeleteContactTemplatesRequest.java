// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteContactTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DeleteContactTemplatesRequest</p>
 */
public class DeleteContactTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrantProfileIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String registrantProfileIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private DeleteContactTemplatesRequest(Builder builder) {
        super(builder);
        this.registrantProfileIds = builder.registrantProfileIds;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContactTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return registrantProfileIds
     */
    public String getRegistrantProfileIds() {
        return this.registrantProfileIds;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<DeleteContactTemplatesRequest, Builder> {
        private String registrantProfileIds; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(DeleteContactTemplatesRequest request) {
            super(request);
            this.registrantProfileIds = request.registrantProfileIds;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder registrantProfileIds(String registrantProfileIds) {
            this.putQueryParameter("RegistrantProfileIds", registrantProfileIds);
            this.registrantProfileIds = registrantProfileIds;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public DeleteContactTemplatesRequest build() {
            return new DeleteContactTemplatesRequest(this);
        } 

    } 

}
