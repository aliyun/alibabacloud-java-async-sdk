// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRegionsRequest} extends {@link RequestModel}
 *
 * <p>ListRegionsRequest</p>
 */
public class ListRegionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    private ListRegionsRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRegionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public static final class Builder extends Request.Builder<ListRegionsRequest, Builder> {
        private String acceptLanguage; 

        private Builder() {
            super();
        } 

        private Builder(ListRegionsRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh-CN</strong> (default): Chinese</li>
         * <li><strong>en-US</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        @Override
        public ListRegionsRequest build() {
            return new ListRegionsRequest(this);
        } 

    } 

}
