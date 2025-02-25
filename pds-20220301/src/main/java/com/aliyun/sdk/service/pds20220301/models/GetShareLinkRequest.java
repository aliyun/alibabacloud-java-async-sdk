// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link GetShareLinkRequest} extends {@link RequestModel}
 *
 * <p>GetShareLinkRequest</p>
 */
public class GetShareLinkRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("share_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shareId;

    private GetShareLinkRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.shareId = builder.shareId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetShareLinkRequest create() {
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
     * @return shareId
     */
    public String getShareId() {
        return this.shareId;
    }

    public static final class Builder extends Request.Builder<GetShareLinkRequest, Builder> {
        private String domainId; 
        private String shareId; 

        private Builder() {
            super();
        } 

        private Builder(GetShareLinkRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.shareId = request.shareId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The share ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7JQX1FswpQ8</p>
         */
        public Builder shareId(String shareId) {
            this.putBodyParameter("share_id", shareId);
            this.shareId = shareId;
            return this;
        }

        @Override
        public GetShareLinkRequest build() {
            return new GetShareLinkRequest(this);
        } 

    } 

}
