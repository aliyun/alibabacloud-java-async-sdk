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
 * {@link GetHoneypotNodeRequest} extends {@link RequestModel}
 *
 * <p>GetHoneypotNodeRequest</p>
 */
public class GetHoneypotNodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    private GetHoneypotNodeRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHoneypotNodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    public static final class Builder extends Request.Builder<GetHoneypotNodeRequest, Builder> {
        private String lang; 
        private String nodeId; 

        private Builder() {
            super();
        } 

        private Builder(GetHoneypotNodeRequest request) {
            super(request);
            this.lang = request.lang;
            this.nodeId = request.nodeId;
        } 

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the management node.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListHoneypotNode~~">ListHoneypotNode</a> operation to query the IDs of management nodes.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d3dd3864-4e02-4abd-8b6a-8f5f6fec4715</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        @Override
        public GetHoneypotNodeRequest build() {
            return new GetHoneypotNodeRequest(this);
        } 

    } 

}
