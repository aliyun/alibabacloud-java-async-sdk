// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link RumDnsResponse} extends {@link TeaModel}
 *
 * <p>RumDnsResponse</p>
 */
public class RumDnsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("result")
    private Boolean result;

    private RumDnsResponse(BuilderImpl builder) {
        super(builder);
        this.domain = builder.domain;
        this.message = builder.message;
        this.result = builder.result;
    }

    public static RumDnsResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public interface Builder extends Response.Builder<RumDnsResponse, Builder> {

        Builder domain(String domain);

        Builder message(String message);

        Builder result(Boolean result);

        @Override
        RumDnsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RumDnsResponse, Builder>
            implements Builder {
        private String domain; 
        private String message; 
        private Boolean result; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RumDnsResponse response) {
            super(response);
            this.domain = response.domain;
            this.message = response.message;
            this.result = response.result;
        } 

        /**
         * <p>The domain name for RUM reporting.</p>
         * 
         * <strong>example:</strong>
         * <p>rum</p>
         */
        @Override
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>The message returned if initialization fails.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @Override
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The DNS initialization status of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @Override
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        @Override
        public RumDnsResponse build() {
            return new RumDnsResponse(this);
        } 

    } 

}
