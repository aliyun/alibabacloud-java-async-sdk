// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSceneItemsRequest} extends {@link RequestModel}
 *
 * <p>ListSceneItemsRequest</p>
 */
public class ListSceneItemsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("operationRuleId")
    private String operationRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("previewType")
    private String previewType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("queryCount")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer queryCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("selectionRuleId")
    private String selectionRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    @com.aliyun.core.annotation.Validation(maximum = 128)
    private Integer size;

    private ListSceneItemsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.sceneId = builder.sceneId;
        this.operationRuleId = builder.operationRuleId;
        this.page = builder.page;
        this.previewType = builder.previewType;
        this.queryCount = builder.queryCount;
        this.selectionRuleId = builder.selectionRuleId;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSceneItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return operationRuleId
     */
    public String getOperationRuleId() {
        return this.operationRuleId;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return previewType
     */
    public String getPreviewType() {
        return this.previewType;
    }

    /**
     * @return queryCount
     */
    public Integer getQueryCount() {
        return this.queryCount;
    }

    /**
     * @return selectionRuleId
     */
    public String getSelectionRuleId() {
        return this.selectionRuleId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListSceneItemsRequest, Builder> {
        private String instanceId; 
        private String sceneId; 
        private String operationRuleId; 
        private Integer page; 
        private String previewType; 
        private Integer queryCount; 
        private String selectionRuleId; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListSceneItemsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.sceneId = request.sceneId;
            this.operationRuleId = request.operationRuleId;
            this.page = request.page;
            this.previewType = request.previewType;
            this.queryCount = request.queryCount;
            this.selectionRuleId = request.selectionRuleId;
            this.size = request.size;
        } 

        /**
         * <p>GET openapi/instances/{instanceId}/scenes/{sceneId}/items?selectionRuleId=xxx&amp;operrationRuleId=xxx</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-o400whm78004</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testid</p>
         */
        public Builder sceneId(String sceneId) {
            this.putPathParameter("sceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * operationRuleId.
         */
        public Builder operationRuleId(String operationRuleId) {
            this.putQueryParameter("operationRuleId", operationRuleId);
            this.operationRuleId = operationRuleId;
            return this;
        }

        /**
         * <p>The scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The ID of the item selection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>PREVIEW_ITEM</p>
         */
        public Builder previewType(String previewType) {
            this.putQueryParameter("previewType", previewType);
            this.previewType = previewType;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder queryCount(Integer queryCount) {
            this.putQueryParameter("queryCount", queryCount);
            this.queryCount = queryCount;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder selectionRuleId(String selectionRuleId) {
            this.putQueryParameter("selectionRuleId", selectionRuleId);
            this.selectionRuleId = selectionRuleId;
            return this;
        }

        /**
         * <p>The ID of the operation rule.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListSceneItemsRequest build() {
            return new ListSceneItemsRequest(this);
        } 

    } 

}
