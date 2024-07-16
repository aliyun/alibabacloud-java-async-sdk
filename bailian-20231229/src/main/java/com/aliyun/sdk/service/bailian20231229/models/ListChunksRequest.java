// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChunksRequest} extends {@link RequestModel}
 *
 * <p>ListChunksRequest</p>
 */
public class ListChunksRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Fields")
    private java.util.List < String > fields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filed")
    private String filed;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IndexId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String indexId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListChunksRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.fields = builder.fields;
        this.filed = builder.filed;
        this.indexId = builder.indexId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChunksRequest create() {
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
     * @return fields
     */
    public java.util.List < String > getFields() {
        return this.fields;
    }

    /**
     * @return filed
     */
    public String getFiled() {
        return this.filed;
    }

    /**
     * @return indexId
     */
    public String getIndexId() {
        return this.indexId;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListChunksRequest, Builder> {
        private String workspaceId; 
        private java.util.List < String > fields; 
        private String filed; 
        private String indexId; 
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListChunksRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.fields = request.fields;
            this.filed = request.filed;
            this.indexId = request.indexId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
        } 

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * Fields.
         */
        public Builder fields(java.util.List < String > fields) {
            this.putBodyParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * Filed.
         */
        public Builder filed(String filed) {
            this.putBodyParameter("Filed", filed);
            this.filed = filed;
            return this;
        }

        /**
         * IndexId.
         */
        public Builder indexId(String indexId) {
            this.putBodyParameter("IndexId", indexId);
            this.indexId = indexId;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putBodyParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListChunksRequest build() {
            return new ListChunksRequest(this);
        } 

    } 

}
