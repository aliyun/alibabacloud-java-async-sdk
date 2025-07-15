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
 * {@link InitializeAutoShowListTaskResponseBody} extends {@link TeaModel}
 *
 * <p>InitializeAutoShowListTaskResponseBody</p>
 */
public class InitializeAutoShowListTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CasterId")
    private String casterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StreamList")
    private String streamList;

    private InitializeAutoShowListTaskResponseBody(Builder builder) {
        this.casterId = builder.casterId;
        this.requestId = builder.requestId;
        this.streamList = builder.streamList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeAutoShowListTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return streamList
     */
    public String getStreamList() {
        return this.streamList;
    }

    public static final class Builder {
        private String casterId; 
        private String requestId; 
        private String streamList; 

        private Builder() {
        } 

        private Builder(InitializeAutoShowListTaskResponseBody model) {
            this.casterId = model.casterId;
            this.requestId = model.requestId;
            this.streamList = model.streamList;
        } 

        /**
         * <p>The ID of the production studio.</p>
         * <blockquote>
         * <p> The value of this parameter can be used as the value of a request parameter to query the streaming URL of the production studio, start the production studio, add video resources to the production studio, add a production studio layout, query production studio layouts, add a production studio component, and add a production studio playlist.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>b4810848-bcf9-4aef-bd4a-e6bba2d9****</p>
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of output video streams.</p>
         * <ul>
         * <li>videoFormat: the format of the streaming URL.</li>
         * <li>outputStreamUrl: the source URL.</li>
         * <li>transcodeConfig: the output resolution specified for video transcoding of the source URL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;videoFormat&quot;:&quot;flv&quot;,&quot;outputStreamUrl&quot;:&quot;<a href="http://example.aliyundoc.com%22,%22transcodeConfig%22:%22original%22%7D%5D">http://example.aliyundoc.com&quot;,&quot;transcodeConfig&quot;:&quot;original&quot;}]</a></p>
         */
        public Builder streamList(String streamList) {
            this.streamList = streamList;
            return this;
        }

        public InitializeAutoShowListTaskResponseBody build() {
            return new InitializeAutoShowListTaskResponseBody(this);
        } 

    } 

}
