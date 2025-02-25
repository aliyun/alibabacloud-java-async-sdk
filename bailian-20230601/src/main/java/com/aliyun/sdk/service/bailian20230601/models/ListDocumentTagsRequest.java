// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDocumentTagsRequest} extends {@link RequestModel}
 *
 * <p>ListDocumentTagsRequest</p>
 */
public class ListDocumentTagsRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("TagId")
    private String tagId;

    private ListDocumentTagsRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.name = builder.name;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.tagId = builder.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDocumentTagsRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return tagId
     */
    public String getTagId() {
        return this.tagId;
    }

    public static final class Builder extends Request.Builder<ListDocumentTagsRequest, Builder> {
        private String agentKey; 
        private String name; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String tagId; 

        private Builder() {
            super();
        } 

        private Builder(ListDocumentTagsRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.name = request.name;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.tagId = request.tagId;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * TagId.
         */
        public Builder tagId(String tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        @Override
        public ListDocumentTagsRequest build() {
            return new ListDocumentTagsRequest(this);
        } 

    } 

}
