// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link StartAIDiffAnalysisResponseBody} extends {@link TeaModel}
 *
 * <p>StartAIDiffAnalysisResponseBody</p>
 */
public class StartAIDiffAnalysisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private StartAIDiffAnalysisResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartAIDiffAnalysisResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private String data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(StartAIDiffAnalysisResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * <ul>
         * <li>If code is Success, the authorization is successful.</li>
         * <li>Other status codes indicate that the authorization has failed. Check the message field for the detailed fault information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The AI differential analysis result data.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;[
         *   {
         *       name: &quot;xxx&quot;, # Operator name
         *       before_time: 2, # Total time of the former
         *       after_time: 4, # Total time of the latter
         *       time_diff: 2,  # Time difference
         *       before_time_perc: &quot;80%&quot;, # Total time percentage of the former
         *       after_time_perc: &quot;23%&quot;, # Total time percentage of the latter
         *       time_perc_diff: &quot;-54%&quot;,  # Time percentage difference
         *       before_count: 1, # Total call count of the former
         *       after_count: 2,  # Total call count of the latter
         *       count_diff: 1,   # Call count difference
         *       before_count_perc: &quot;56%&quot;, # Total call percentage of the former
         *       after_count_perc: &quot;32%&quot;,  # Total call percentage of the latter
         *       count_perc_diff: &quot;44%&quot;,   # Call percentage difference
         *   },
         *   {...}
         * ]&quot;</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code description. This field is empty if no error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartAIDiffAnalysisResponseBody build() {
            return new StartAIDiffAnalysisResponseBody(this);
        } 

    } 

}
