// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDocAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateDocAttributeRequest</p>
 */
public class UpdateDocAttributeRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Query
    @NameInMap("DelAllTags")
    private Boolean delAllTags;

    @Query
    @NameInMap("DocId")
    @Validation(required = true)
    private String docId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("TagIds")
    private java.util.List < String > tagIds;

    private UpdateDocAttributeRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.delAllTags = builder.delAllTags;
        this.docId = builder.docId;
        this.name = builder.name;
        this.tagIds = builder.tagIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDocAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return delAllTags
     */
    public Boolean getDelAllTags() {
        return this.delAllTags;
    }

    /**
     * @return docId
     */
    public String getDocId() {
        return this.docId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return tagIds
     */
    public java.util.List < String > getTagIds() {
        return this.tagIds;
    }

    public static final class Builder extends Request.Builder<UpdateDocAttributeRequest, Builder> {
        private String agentKey; 
        private Boolean delAllTags; 
        private String docId; 
        private String name; 
        private java.util.List < String > tagIds; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDocAttributeRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.delAllTags = request.delAllTags;
            this.docId = request.docId;
            this.name = request.name;
            this.tagIds = request.tagIds;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * DelAllTags.
         */
        public Builder delAllTags(Boolean delAllTags) {
            this.putQueryParameter("DelAllTags", delAllTags);
            this.delAllTags = delAllTags;
            return this;
        }

        /**
         * DocId.
         */
        public Builder docId(String docId) {
            this.putQueryParameter("DocId", docId);
            this.docId = docId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * TagIds.
         */
        public Builder tagIds(java.util.List < String > tagIds) {
            String tagIdsShrink = shrink(tagIds, "TagIds", "json");
            this.putQueryParameter("TagIds", tagIdsShrink);
            this.tagIds = tagIds;
            return this;
        }

        @Override
        public UpdateDocAttributeRequest build() {
            return new UpdateDocAttributeRequest(this);
        } 

    } 

}
