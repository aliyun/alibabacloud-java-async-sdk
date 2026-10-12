// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link ListModelVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListModelVersionsRequest</p>
 */
public class ListModelVersionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovalStatus")
    private String approvalStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FormatType")
    private String formatType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FrameworkType")
    private String frameworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceId")
    private String sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private ListModelVersionsRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
        this.approvalStatus = builder.approvalStatus;
        this.formatType = builder.formatType;
        this.frameworkType = builder.frameworkType;
        this.label = builder.label;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelVersionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return approvalStatus
     */
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    /**
     * @return formatType
     */
    public String getFormatType() {
        return this.formatType;
    }

    /**
     * @return frameworkType
     */
    public String getFrameworkType() {
        return this.frameworkType;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder extends Request.Builder<ListModelVersionsRequest, Builder> {
        private String modelId; 
        private String approvalStatus; 
        private String formatType; 
        private String frameworkType; 
        private String label; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sortBy; 
        private String sourceId; 
        private String sourceType; 
        private String versionName; 

        private Builder() {
            super();
        } 

        private Builder(ListModelVersionsRequest request) {
            super(request);
            this.modelId = request.modelId;
            this.approvalStatus = request.approvalStatus;
            this.formatType = request.formatType;
            this.frameworkType = request.frameworkType;
            this.label = request.label;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
            this.versionName = request.versionName;
        } 

        /**
         * <p>The model ID. For more information, see <a href="https://help.aliyun.com/document_detail/461944.html">ListModels</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>model-dajbueh******</p>
         */
        public Builder modelId(String modelId) {
            this.putPathParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>The approval status. This parameter is used to filter the model version list. Valid values:</p>
         * <ul>
         * <li><p>Pending: The model version is pending approval.</p>
         * </li>
         * <li><p>Approved: The model version is approved for publishing.</p>
         * </li>
         * <li><p>Rejected: The model version is rejected for publishing.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Approved</p>
         */
        public Builder approvalStatus(String approvalStatus) {
            this.putQueryParameter("ApprovalStatus", approvalStatus);
            this.approvalStatus = approvalStatus;
            return this;
        }

        /**
         * <p>The model format. This parameter is used to filter the model version list. Valid values:</p>
         * <ul>
         * <li><p>OfflineModel</p>
         * </li>
         * <li><p>SavedModel</p>
         * </li>
         * <li><p>Keras H5</p>
         * </li>
         * <li><p>Frozen Pb</p>
         * </li>
         * <li><p>Caffe Prototxt</p>
         * </li>
         * <li><p>TorchScript</p>
         * </li>
         * <li><p>XGBoost</p>
         * </li>
         * <li><p>PMML</p>
         * </li>
         * <li><p>AlinkModel</p>
         * </li>
         * <li><p>ONNX</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SavedModel</p>
         */
        public Builder formatType(String formatType) {
            this.putQueryParameter("FormatType", formatType);
            this.formatType = formatType;
            return this;
        }

        /**
         * <p>The model framework. This parameter is used to filter the model version list. Valid values:</p>
         * <ul>
         * <li><p>Pytorch
         * -XGBoost</p>
         * </li>
         * <li><p>Keras</p>
         * </li>
         * <li><p>Caffe</p>
         * </li>
         * <li><p>Alink</p>
         * </li>
         * <li><p>Xflow</p>
         * </li>
         * <li><p>TensorFlow</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TensorFlow</p>
         */
        public Builder frameworkType(String frameworkType) {
            this.putQueryParameter("FrameworkType", frameworkType);
            this.frameworkType = frameworkType;
            return this;
        }

        /**
         * <p>The label string. This parameter is used to filter the list. Model versions that have the specified string in the key or value of their labels are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        public Builder label(String label) {
            this.putQueryParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * <p>The order in which to sort the entries in the paged query. The default value is ASC.</p>
         * <ul>
         * <li><p>ASC: ascending order.</p>
         * </li>
         * <li><p>DESC: descending order.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number of the model version list. The value starts from 1. The default value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page for a paged query. The default value is 10.</p>
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
         * <p>The field to use for sorting in the paged query. Currently, the GmtCreateTime field is used for sorting.</p>
         * 
         * <strong>example:</strong>
         * <p>GmtCreateTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The source ID.</p>
         * <ul>
         * <li><p>If the source type is Custom, this parameter is not restricted.</p>
         * </li>
         * <li><p>If the source is PAIFlow or TrainingService, the format is as follows:</p>
         * </li>
         * </ul>
         * <pre><code>region=&lt;region_id&gt;,workspaceId=&lt;workspace_id&gt;,kind=&lt;kind&gt;,id=&lt;id&gt;
         * </code></pre>
         * <p>where:</p>
         * <ul>
         * <li><p>region is the Alibaba Cloud region ID.</p>
         * </li>
         * <li><p>workspaceId is the workspace ID.</p>
         * </li>
         * <li><p>kind: the type. Valid values: PipelineRun (PAIFlow pipeline) and ServiceJob (training service).</p>
         * </li>
         * <li><p>id: the unique identifier.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>region=cn-shanghai,workspaceId=13**,kind=PipelineRun,id=run-sakdb****jdf</p>
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The source type of the model. This parameter is used to filter the model version list. Valid values:</p>
         * <ul>
         * <li><p>Custom (default): a custom model.</p>
         * </li>
         * <li><p>PAIFlow: a model from a PAI pipeline.</p>
         * </li>
         * <li><p>TrainingService: a model from a PAI training service.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PAIFlow</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The model version name. This parameter is used to filter the model version list.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.1</p>
         */
        public Builder versionName(String versionName) {
            this.putQueryParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        @Override
        public ListModelVersionsRequest build() {
            return new ListModelVersionsRequest(this);
        } 

    } 

}
