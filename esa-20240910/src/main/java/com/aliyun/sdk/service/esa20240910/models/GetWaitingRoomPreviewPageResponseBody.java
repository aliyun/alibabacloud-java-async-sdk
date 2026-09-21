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
 * {@link GetWaitingRoomPreviewPageResponseBody} extends {@link TeaModel}
 *
 * <p>GetWaitingRoomPreviewPageResponseBody</p>
 */
public class GetWaitingRoomPreviewPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageUrl")
    private String pageUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetWaitingRoomPreviewPageResponseBody(Builder builder) {
        this.pageUrl = builder.pageUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWaitingRoomPreviewPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageUrl
     */
    public String getPageUrl() {
        return this.pageUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String pageUrl; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetWaitingRoomPreviewPageResponseBody model) {
            this.pageUrl = model.pageUrl;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The waiting room preview page URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://waitingroom.myalicdn.com/testxxxx">http://waitingroom.myalicdn.com/testxxxx</a></p>
         */
        public Builder pageUrl(String pageUrl) {
            this.pageUrl = pageUrl;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9732E117-8A37-49FD-A36F-ABBB87556CA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetWaitingRoomPreviewPageResponseBody build() {
            return new GetWaitingRoomPreviewPageResponseBody(this);
        } 

    } 

}
