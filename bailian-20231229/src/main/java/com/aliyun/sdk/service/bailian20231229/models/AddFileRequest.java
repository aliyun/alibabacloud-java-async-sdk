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
 * {@link AddFileRequest} extends {@link RequestModel}
 *
 * <p>AddFileRequest</p>
 */
public class AddFileRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String categoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryType")
    private String categoryType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LeaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String leaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Parser")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parser;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<String> tags;

    private AddFileRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
        this.categoryId = builder.categoryId;
        this.categoryType = builder.categoryType;
        this.leaseId = builder.leaseId;
        this.parser = builder.parser;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFileRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return categoryType
     */
    public String getCategoryType() {
        return this.categoryType;
    }

    /**
     * @return leaseId
     */
    public String getLeaseId() {
        return this.leaseId;
    }

    /**
     * @return parser
     */
    public String getParser() {
        return this.parser;
    }

    /**
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<AddFileRequest, Builder> {
        private String workspaceId; 
        private String regionId; 
        private String categoryId; 
        private String categoryType; 
        private String leaseId; 
        private String parser; 
        private java.util.List<String> tags; 

        private Builder() {
            super();
        } 

        private Builder(AddFileRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
            this.categoryId = request.categoryId;
            this.categoryType = request.categoryType;
            this.leaseId = request.leaseId;
            this.parser = request.parser;
            this.tags = request.tags;
        } 

        /**
         * <p>The ID of the workspace to which the document is uploaded. On the <a href="https://bailian.console.alibabacloud.com/#/home">homepage</a> of the console, click the workspace Details icon in the upper-left corner to view the workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws_3AXoiweeTyTd03IN</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The primary key ID of the category to which the document is uploaded. This parameter corresponds to the <code>CategoryId</code>&lt;props=&quot;china&quot;&gt; returned by the <a href="https://www.alibabacloud.com/help/zh/model-studio/developer-reference/api-bailian-2023-12-29-addcategory">AddCategory</a> operation. You can also click the ID icon next to the category name on the Unstructured Data tab of the <a href="https://bailian.console.alibabacloud.com/#/data-center">Data Management</a> page to view the ID. You can set the parameter to default, which specifies the Default Category created by the system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cate_cdd11b1b79a74e8bbd675c356a91ee3510024405</p>
         */
        public Builder categoryId(String categoryId) {
            this.putBodyParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * CategoryType.
         */
        public Builder categoryType(String categoryType) {
            this.putBodyParameter("CategoryType", categoryType);
            this.categoryType = categoryType;
            return this;
        }

        /**
         * <p>The lease ID, which corresponds to the <code>FileUploadLeaseId</code> parameter returned by the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-applyfileuploadlease">ApplyFileUploadLease</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>68abd1dea7b6404d8f7d7b9f7fbd332d.1716698936847</p>
         */
        public Builder leaseId(String leaseId) {
            this.putBodyParameter("LeaseId", leaseId);
            this.leaseId = leaseId;
            return this;
        }

        /**
         * <p>The parser. Valid value:</p>
         * <ul>
         * <li>DASHSCOPE_DOCMIND: Intelligent document parsing by Alibaba Cloud.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DASHSCOPE_DOCMIND</p>
         */
        public Builder parser(String parser) {
            this.putBodyParameter("Parser", parser);
            this.parser = parser;
            return this;
        }

        /**
         * <p>A list of tags associated with the document. The default value is null, which means no tags. You can specify up to 10 tags.</p>
         */
        public Builder tags(java.util.List<String> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putBodyParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public AddFileRequest build() {
            return new AddFileRequest(this);
        } 

    } 

}
