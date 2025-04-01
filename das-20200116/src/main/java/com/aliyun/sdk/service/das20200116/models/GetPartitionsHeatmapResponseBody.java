// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetPartitionsHeatmapResponseBody} extends {@link TeaModel}
 *
 * <p>GetPartitionsHeatmapResponseBody</p>
 */
public class GetPartitionsHeatmapResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetPartitionsHeatmapResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPartitionsHeatmapResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String data; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(GetPartitionsHeatmapResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The hot data of the PolarDB-X 2.0 instance. The data is returned in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;boundAxis&quot;: [
         *         {
         *             &quot;bound&quot;: &quot;A,B,C,D&quot;,
         *             &quot;labels&quot;: [
         *                 &quot;L1&quot;,
         *                 &quot;L2&quot;,
         *                 &quot;L3&quot;,
         *                 &quot;L4&quot;
         *             ],
         *             &quot;rows&quot;: 3171
         *         },
         *         {
         *             &quot;bound&quot;: &quot;A,B,C,D&quot;,
         *             &quot;labels&quot;: [
         *                 &quot;L1&quot;,
         *                 &quot;L2&quot;,
         *                 &quot;L3&quot;,
         *                 &quot;L4&quot;
         *             ],
         *             &quot;rows&quot;: 277128
         *         }
         *     ],
         *     &quot;dataMap&quot;: {
         *         &quot;READ_WRITTEN_ROWS&quot;: [
         *             [
         *                 0,
         *                 0,
         *                 0
         *             ],
         *             [
         *                 0,
         *                 0,
         *                 0
         *             ]
         *         ]
         *     },
         *     &quot;timeAxis&quot;: [
         *         1671701056070,
         *         1671701116551,
         *         1671701177020
         *     ]
         * }</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message that contains information such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D00DB161-FEF6-5428-B37A-8D29A4C2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetPartitionsHeatmapResponseBody build() {
            return new GetPartitionsHeatmapResponseBody(this);
        } 

    } 

}
