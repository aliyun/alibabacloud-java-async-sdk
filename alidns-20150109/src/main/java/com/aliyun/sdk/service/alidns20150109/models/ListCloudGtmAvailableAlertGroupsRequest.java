// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCloudGtmAvailableAlertGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListCloudGtmAvailableAlertGroupsRequest</p>
 */
public class ListCloudGtmAvailableAlertGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    private ListCloudGtmAvailableAlertGroupsRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudGtmAvailableAlertGroupsRequest create() {
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

    public static final class Builder extends Request.Builder<ListCloudGtmAvailableAlertGroupsRequest, Builder> {
        private String acceptLanguage; 

        private Builder() {
            super();
        } 

        private Builder(ListCloudGtmAvailableAlertGroupsRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        @Override
        public ListCloudGtmAvailableAlertGroupsRequest build() {
            return new ListCloudGtmAvailableAlertGroupsRequest(this);
        } 

    } 

}
