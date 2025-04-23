// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link ListCloudGtmMonitorNodesRequest} extends {@link RequestModel}
 *
 * <p>ListCloudGtmMonitorNodesRequest</p>
 */
public class ListCloudGtmMonitorNodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    private ListCloudGtmMonitorNodesRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudGtmMonitorNodesRequest create() {
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

    public static final class Builder extends Request.Builder<ListCloudGtmMonitorNodesRequest, Builder> {
        private String acceptLanguage; 

        private Builder() {
            super();
        } 

        private Builder(ListCloudGtmMonitorNodesRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh-CN</strong>: Chinese</li>
         * <li><strong>en-US</strong> (default): English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en-US</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        @Override
        public ListCloudGtmMonitorNodesRequest build() {
            return new ListCloudGtmMonitorNodesRequest(this);
        } 

    } 

}
