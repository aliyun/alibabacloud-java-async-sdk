// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListTemplatesRequest</p>
 */
public class ListTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateSource")
    private String createSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortType")
    private String sortType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListTemplatesRequest(Builder builder) {
        super(builder);
        this.createSource = builder.createSource;
        this.keyword = builder.keyword;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sortType = builder.sortType;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createSource
     */
    public String getCreateSource() {
        return this.createSource;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sortType
     */
    public String getSortType() {
        return this.sortType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListTemplatesRequest, Builder> {
        private String createSource; 
        private String keyword; 
        private Long pageNo; 
        private Long pageSize; 
        private String sortType; 
        private String status; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListTemplatesRequest request) {
            super(request);
            this.createSource = request.createSource;
            this.keyword = request.keyword;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.sortType = request.sortType;
            this.status = request.status;
            this.type = request.type;
        } 

        /**
         * <p>The source from which the template was created.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AliyunConsole</li>
         * <li>WebSDK</li>
         * <li>OpenAPI</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI</p>
         */
        public Builder createSource(String createSource) {
            this.putQueryParameter("CreateSource", createSource);
            this.createSource = createSource;
            return this;
        }

        /**
         * <p>The search keyword. You can use the template ID or title as the keyword to search for templates.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The sorting parameter. By default, the query results are sorted by creation time in descending order.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CreationTime:Asc: sorted by creation time in ascending order.</li>
         * <li>CreationTime:Desc: sorted by creation time in descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreationTime:Desc</p>
         */
        public Builder sortType(String sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        /**
         * <p>The template state.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>UploadFailed: Failed to upload the video.</li>
         * <li>ProcessFailed: Failed to process the advanced template.</li>
         * <li>Available: The template is available.</li>
         * <li>Uploading: The video is being uploaded.</li>
         * <li>Created: The template is created but not ready for use.</li>
         * <li>Processing: The advanced template is being processed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The template type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Timeline</li>
         * <li>VETemplate</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Timeline</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListTemplatesRequest build() {
            return new ListTemplatesRequest(this);
        } 

    } 

}
