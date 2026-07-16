// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetWaitingRoomPreviewPageRequest} extends {@link RequestModel}
 *
 * <p>GetWaitingRoomPreviewPageRequest</p>
 */
public class GetWaitingRoomPreviewPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomPageHtml")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customPageHtml;

    private GetWaitingRoomPreviewPageRequest(Builder builder) {
        super(builder);
        this.customPageHtml = builder.customPageHtml;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWaitingRoomPreviewPageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customPageHtml
     */
    public String getCustomPageHtml() {
        return this.customPageHtml;
    }

    public static final class Builder extends Request.Builder<GetWaitingRoomPreviewPageRequest, Builder> {
        private String customPageHtml; 

        private Builder() {
            super();
        } 

        private Builder(GetWaitingRoomPreviewPageRequest request) {
            super(request);
            this.customPageHtml = request.customPageHtml;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GetWaitingRoomPreviewPage</p>
         */
        public Builder customPageHtml(String customPageHtml) {
            this.putQueryParameter("CustomPageHtml", customPageHtml);
            this.customPageHtml = customPageHtml;
            return this;
        }

        @Override
        public GetWaitingRoomPreviewPageRequest build() {
            return new GetWaitingRoomPreviewPageRequest(this);
        } 

    } 

}
