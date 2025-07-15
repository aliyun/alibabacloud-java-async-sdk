// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveStreamStateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamStateResponseBody</p>
 */
public class DescribeLiveStreamStateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StreamState")
    private String streamState;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeLiveStreamStateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.streamState = builder.streamState;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamStateResponseBody create() {
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
     * @return streamState
     */
    public String getStreamState() {
        return this.streamState;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String requestId; 
        private String streamState; 
        private String type; 

        private Builder() {
        } 

        private Builder(DescribeLiveStreamStateResponseBody model) {
            this.requestId = model.requestId;
            this.streamState = model.streamState;
            this.type = model.type;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CE6CD79D-0A98-1F22-A15F-FADA74DF2729</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the stream. Valid values:</p>
         * <ul>
         * <li>online: The stream is being ingested.</li>
         * <li>offline: The stream is offline. This may be caused by failed or completed stream ingest. For the specific reason, check the stream ingest callback. This operation does not provide detailed information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        public Builder streamState(String streamState) {
            this.streamState = streamState;
            return this;
        }

        /**
         * <p>The mode of the stream. Valid values:</p>
         * <ul>
         * <li>push: stream ingest</li>
         * <li>pull: triggered stream pulling</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>push</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeLiveStreamStateResponseBody build() {
            return new DescribeLiveStreamStateResponseBody(this);
        } 

    } 

}
