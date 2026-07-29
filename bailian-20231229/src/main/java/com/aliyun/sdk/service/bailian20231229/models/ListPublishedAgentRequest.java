// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link ListPublishedAgentRequest} extends {@link RequestModel}
 *
 * <p>ListPublishedAgentRequest</p>
 */
public class ListPublishedAgentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("subTypes")
    private java.util.List<String> subTypes;

    private ListPublishedAgentRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.subTypes = builder.subTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublishedAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
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
     * @return subTypes
     */
    public java.util.List<String> getSubTypes() {
        return this.subTypes;
    }

    public static final class Builder extends Request.Builder<ListPublishedAgentRequest, Builder> {
        private String workspaceId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private java.util.List<String> subTypes; 

        private Builder() {
            super();
        } 

        private Builder(ListPublishedAgentRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.subTypes = request.subTypes;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * pageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("pageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * subTypes.
         */
        public Builder subTypes(java.util.List<String> subTypes) {
            String subTypesShrink = shrink(subTypes, "subTypes", "json");
            this.putQueryParameter("subTypes", subTypesShrink);
            this.subTypes = subTypes;
            return this;
        }

        @Override
        public ListPublishedAgentRequest build() {
            return new ListPublishedAgentRequest(this);
        } 

    } 

}
