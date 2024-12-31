// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link ReserveDomainRequest} extends {@link RequestModel}
 *
 * <p>ReserveDomainRequest</p>
 */
public class ReserveDomainRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Channels")
    private java.util.List<String> channels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    private ReserveDomainRequest(Builder builder) {
        super(builder);
        this.channels = builder.channels;
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReserveDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channels
     */
    public java.util.List<String> getChannels() {
        return this.channels;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    public static final class Builder extends Request.Builder<ReserveDomainRequest, Builder> {
        private java.util.List<String> channels; 
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(ReserveDomainRequest request) {
            super(request);
            this.channels = request.channels;
            this.domainName = request.domainName;
        } 

        /**
         * Channels.
         */
        public Builder channels(java.util.List<String> channels) {
            this.putBodyParameter("Channels", channels);
            this.channels = channels;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun.com</p>
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        @Override
        public ReserveDomainRequest build() {
            return new ReserveDomainRequest(this);
        } 

    } 

}
