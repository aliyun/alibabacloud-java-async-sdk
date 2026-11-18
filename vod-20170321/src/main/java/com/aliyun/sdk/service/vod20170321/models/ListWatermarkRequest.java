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
 * {@link ListWatermarkRequest} extends {@link RequestModel}
 *
 * <p>ListWatermarkRequest</p>
 */
public class ListWatermarkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    private ListWatermarkRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWatermarkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    public static final class Builder extends Request.Builder<ListWatermarkRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(ListWatermarkRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * <p>The application ID. Default value: <strong>app-1000000</strong>.</p>
         * <p>If the multi-application system is enabled, you can specify an application ID to query the image and text watermark templates of a specific application. If you do not specify this parameter, the system returns the image and text watermark templates of all applications by default. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public ListWatermarkRequest build() {
            return new ListWatermarkRequest(this);
        } 

    } 

}
