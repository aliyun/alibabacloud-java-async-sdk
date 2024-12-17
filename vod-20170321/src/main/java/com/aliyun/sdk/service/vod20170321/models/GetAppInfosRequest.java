// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetAppInfosRequest} extends {@link RequestModel}
 *
 * <p>GetAppInfosRequest</p>
 */
public class GetAppInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appIds;

    private GetAppInfosRequest(Builder builder) {
        super(builder);
        this.appIds = builder.appIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppInfosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appIds
     */
    public String getAppIds() {
        return this.appIds;
    }

    public static final class Builder extends Request.Builder<GetAppInfosRequest, Builder> {
        private String appIds; 

        private Builder() {
            super();
        } 

        private Builder(GetAppInfosRequest request) {
            super(request);
            this.appIds = request.appIds;
        } 

        /**
         * <p>The IDs of applications. You can obtain application IDs from the response to the <a href="https://help.aliyun.com/document_detail/113266.html">CreateAppInfo</a> or <a href="https://help.aliyun.com/document_detail/114000.html">ListAppInfo</a> operation.</p>
         * <ul>
         * <li>You can specify a maximum of 10 application IDs.</li>
         * <li>Separate application IDs with commas (,).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        public Builder appIds(String appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
        }

        @Override
        public GetAppInfosRequest build() {
            return new GetAppInfosRequest(this);
        } 

    } 

}
