// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ListApiDatasourceRequest} extends {@link RequestModel}
 *
 * <p>ListApiDatasourceRequest</p>
 */
public class ListApiDatasourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyWord")
    private String keyWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ListApiDatasourceRequest(Builder builder) {
        super(builder);
        this.keyWord = builder.keyWord;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApiDatasourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyWord
     */
    public String getKeyWord() {
        return this.keyWord;
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

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListApiDatasourceRequest, Builder> {
        private String keyWord; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListApiDatasourceRequest request) {
            super(request);
            this.keyWord = request.keyWord;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The keyword of the API data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
            return this;
        }

        /**
         * <p>Current page number for API data source list:</p>
         * <ul>
         * <li>Pages start from page 1.</li>
         * <li>Default value: 1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of rows per page in a paged query.</p>
         * <ul>
         * <li>Default value: 10.</li>
         * <li>Valid values: 1 to 100.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>89713491-cb4f-4579-b889-e82c35f1****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListApiDatasourceRequest build() {
            return new ListApiDatasourceRequest(this);
        } 

    } 

}
