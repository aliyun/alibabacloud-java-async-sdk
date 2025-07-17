// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GetRetcodeShareUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetRetcodeShareUrlResponseBody</p>
 */
public class GetRetcodeShareUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private GetRetcodeShareUrlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRetcodeShareUrlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String requestId; 
        private String url; 

        private Builder() {
        } 

        private Builder(GetRetcodeShareUrlResponseBody model) {
            this.requestId = model.requestId;
            this.url = model.url;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>01FF8DD9-A09C-47A1-895A-B6E321******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The share URL of the application monitored by Browser Monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://arms-daily.console.aliyun.com:8080/shareapi/retcode.json?login_arms_t3h_token=XXXxxx&action=RetcodeAction&eventSubmitDoGetData=1">http://arms-daily.console.aliyun.com:8080/shareapi/retcode.json?login_arms_t3h_token=XXXxxx&amp;action=RetcodeAction&amp;eventSubmitDoGetData=1</a></p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public GetRetcodeShareUrlResponseBody build() {
            return new GetRetcodeShareUrlResponseBody(this);
        } 

    } 

}
