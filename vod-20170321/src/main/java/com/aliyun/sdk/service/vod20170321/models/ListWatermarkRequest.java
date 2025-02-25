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
         * <p>The ID of the application. Default value: <strong>app-1000000</strong>.</p>
         * <p>If you have activated the multi-application service, specify the ID of the application to query all image and text watermark templates in the specified application. If you leave this parameter empty, image and text watermark templates in all applications are queried. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Overview</a>.</p>
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
