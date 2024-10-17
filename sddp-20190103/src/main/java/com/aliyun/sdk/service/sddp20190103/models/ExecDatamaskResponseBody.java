// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ExecDatamaskResponseBody} extends {@link TeaModel}
 *
 * <p>ExecDatamaskResponseBody</p>
 */
public class ExecDatamaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ExecDatamaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecDatamaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String data; 
        private String requestId; 

        /**
         * <p>The de-identified data, which is described in a JSON string. The JSON string contains the following parameters:</p>
         * <ul>
         * <li><strong>dataHeaderList</strong>: the names of columns that contain the de-identified data.</li>
         * <li><strong>dataList</strong>: the de-identified data. The column order of the de-identified data is the same as that indicated by the dataHeaderList parameter.</li>
         * <li><strong>ruleList</strong>: the IDs of sensitive data detection rules.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;dataHeaderList&quot;:[&quot;name&quot;,&quot;age&quot;],&quot;dataList&quot;:[[&quot;l***&quot;,18],[&quot;l***&quot;,17]],&quot;ruleList&quot;:[1002,null]}</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>813BA9FA-D062-42C4-8CD5-11A7640B96E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExecDatamaskResponseBody build() {
            return new ExecDatamaskResponseBody(this);
        } 

    } 

}
