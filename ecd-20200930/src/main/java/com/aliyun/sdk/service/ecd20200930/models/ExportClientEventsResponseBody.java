// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ExportClientEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ExportClientEventsResponseBody</p>
 */
public class ExportClientEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private ExportClientEventsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportClientEventsResponseBody create() {
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

        private Builder(ExportClientEventsResponseBody model) {
            this.requestId = model.requestId;
            this.url = model.url;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The download address from which you can export desktop groups.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-shanghai-servicemanager.oss-cn-shanghai.aliyuncs.com/A0_CLIENT_EVENT/EDS_Events%20List_20220519234611_w5HuD83KGs.csv?Expires=1652975773&OSSAccessKeyId=LTYL****8tso&Signature=4erMG*********k%3D">https://cn-shanghai-servicemanager.oss-cn-shanghai.aliyuncs.com/A0_CLIENT_EVENT/EDS_Events%20List_20220519234611_w5HuD83KGs.csv?Expires=1652975773&amp;OSSAccessKeyId=LTYL****8tso&amp;Signature=4erMG*********k%3D</a></p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public ExportClientEventsResponseBody build() {
            return new ExportClientEventsResponseBody(this);
        } 

    } 

}
