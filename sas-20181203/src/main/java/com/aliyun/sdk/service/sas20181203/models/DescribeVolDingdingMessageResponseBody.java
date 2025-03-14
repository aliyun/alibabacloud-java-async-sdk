// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeVolDingdingMessageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVolDingdingMessageResponseBody</p>
 */
public class DescribeVolDingdingMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DingdingUrl")
    private String dingdingUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVolDingdingMessageResponseBody(Builder builder) {
        this.dingdingUrl = builder.dingdingUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVolDingdingMessageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dingdingUrl
     */
    public String getDingdingUrl() {
        return this.dingdingUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dingdingUrl; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeVolDingdingMessageResponseBody model) {
            this.dingdingUrl = model.dingdingUrl;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The QR code address of the DingTalk group.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.wikihow.com/images_en/thumb/4/48/Get-the-URL-for-Pictures-Step-4-Version-4.jpg/v4-728px-Get-the-URL-for-Pictures-Step-4-Version-4.jpg.webp">https://www.wikihow.com/images_en/thumb/4/48/Get-the-URL-for-Pictures-Step-4-Version-4.jpg/v4-728px-Get-the-URL-for-Pictures-Step-4-Version-4.jpg.webp</a></p>
         */
        public Builder dingdingUrl(String dingdingUrl) {
            this.dingdingUrl = dingdingUrl;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7A437E93-47EE-548F-ABCE-13F89AA85585</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVolDingdingMessageResponseBody build() {
            return new DescribeVolDingdingMessageResponseBody(this);
        } 

    } 

}
