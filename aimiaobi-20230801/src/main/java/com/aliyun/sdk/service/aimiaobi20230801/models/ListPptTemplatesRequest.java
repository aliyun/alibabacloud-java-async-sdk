// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link ListPptTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListPptTemplatesRequest</p>
 */
public class ListPptTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CareerId")
    private Integer careerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ColourId")
    private Integer colourId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private Integer sceneId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StyleId")
    private Integer styleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListPptTemplatesRequest(Builder builder) {
        super(builder);
        this.careerId = builder.careerId;
        this.colourId = builder.colourId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.sceneId = builder.sceneId;
        this.styleId = builder.styleId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPptTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return careerId
     */
    public Integer getCareerId() {
        return this.careerId;
    }

    /**
     * @return colourId
     */
    public Integer getColourId() {
        return this.colourId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return sceneId
     */
    public Integer getSceneId() {
        return this.sceneId;
    }

    /**
     * @return styleId
     */
    public Integer getStyleId() {
        return this.styleId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListPptTemplatesRequest, Builder> {
        private Integer careerId; 
        private Integer colourId; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer sceneId; 
        private Integer styleId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListPptTemplatesRequest request) {
            super(request);
            this.careerId = request.careerId;
            this.colourId = request.colourId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.sceneId = request.sceneId;
            this.styleId = request.styleId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * CareerId.
         */
        public Builder careerId(Integer careerId) {
            this.putBodyParameter("CareerId", careerId);
            this.careerId = careerId;
            return this;
        }

        /**
         * ColourId.
         */
        public Builder colourId(Integer colourId) {
            this.putBodyParameter("ColourId", colourId);
            this.colourId = colourId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(Integer sceneId) {
            this.putBodyParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * StyleId.
         */
        public Builder styleId(Integer styleId) {
            this.putBodyParameter("StyleId", styleId);
            this.styleId = styleId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListPptTemplatesRequest build() {
            return new ListPptTemplatesRequest(this);
        } 

    } 

}
