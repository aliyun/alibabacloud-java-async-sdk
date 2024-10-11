// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTranscodeTemplateGroupRequest} extends {@link RequestModel}
 *
 * <p>ListTranscodeTemplateGroupRequest</p>
 */
public class ListTranscodeTemplateGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    private ListTranscodeTemplateGroupRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTranscodeTemplateGroupRequest create() {
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

    public static final class Builder extends Request.Builder<ListTranscodeTemplateGroupRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(ListTranscodeTemplateGroupRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * <p>The ID of the application. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Overview</a>.</p>
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
        public ListTranscodeTemplateGroupRequest build() {
            return new ListTranscodeTemplateGroupRequest(this);
        } 

    } 

}
