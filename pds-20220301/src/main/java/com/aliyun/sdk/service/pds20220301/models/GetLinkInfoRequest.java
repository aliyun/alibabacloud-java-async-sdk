// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLinkInfoRequest} extends {@link RequestModel}
 *
 * <p>GetLinkInfoRequest</p>
 */
public class GetLinkInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extra")
    private String extra;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("identity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private GetLinkInfoRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.extra = builder.extra;
        this.identity = builder.identity;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLinkInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return extra
     */
    public String getExtra() {
        return this.extra;
    }

    /**
     * @return identity
     */
    public String getIdentity() {
        return this.identity;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetLinkInfoRequest, Builder> {
        private String domainId; 
        private String extra; 
        private String identity; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetLinkInfoRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.extra = request.extra;
            this.identity = request.identity;
            this.type = request.type;
        } 

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * extra.
         */
        public Builder extra(String extra) {
            this.putBodyParameter("extra", extra);
            this.extra = extra;
            return this;
        }

        /**
         * identity.
         */
        public Builder identity(String identity) {
            this.putBodyParameter("identity", identity);
            this.identity = identity;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetLinkInfoRequest build() {
            return new GetLinkInfoRequest(this);
        } 

    } 

}
