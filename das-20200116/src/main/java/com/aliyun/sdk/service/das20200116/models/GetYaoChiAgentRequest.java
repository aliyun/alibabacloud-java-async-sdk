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
 * {@link GetYaoChiAgentRequest} extends {@link RequestModel}
 *
 * <p>GetYaoChiAgentRequest</p>
 */
public class GetYaoChiAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private String extraInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageKeys")
    private String imageKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private GetYaoChiAgentRequest(Builder builder) {
        super(builder);
        this.extraInfo = builder.extraInfo;
        this.imageKeys = builder.imageKeys;
        this.query = builder.query;
        this.sessionId = builder.sessionId;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetYaoChiAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extraInfo
     */
    public String getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return imageKeys
     */
    public String getImageKeys() {
        return this.imageKeys;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<GetYaoChiAgentRequest, Builder> {
        private String extraInfo; 
        private String imageKeys; 
        private String query; 
        private String sessionId; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(GetYaoChiAgentRequest request) {
            super(request);
            this.extraInfo = request.extraInfo;
            this.imageKeys = request.imageKeys;
            this.query = request.query;
            this.sessionId = request.sessionId;
            this.source = request.source;
        } 

        /**
         * <p>The additional information in JSON string format. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder extraInfo(String extraInfo) {
            this.putQueryParameter("ExtraInfo", extraInfo);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * ImageKeys.
         */
        public Builder imageKeys(String imageKeys) {
            this.putQueryParameter("ImageKeys", imageKeys);
            this.imageKeys = imageKeys;
            return this;
        }

        /**
         * <p>The natural language description of the question.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Are there any issues or abnormalities with my instance rm-xxx?</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>The session ID in UUID string format. This parameter is optional. If you do not specify this parameter, a new session is created. To maintain context across a conversation, use the same session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-xxxxxxxxxxxx</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The cloud service source that specifies which cloud service the question belongs to. This parameter is optional. Default value: yaochi.</p>
         * 
         * <strong>example:</strong>
         * <p>yaochi</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public GetYaoChiAgentRequest build() {
            return new GetYaoChiAgentRequest(this);
        } 

    } 

}
