// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSceneItemsRequest} extends {@link RequestModel}
 *
 * <p>ListSceneItemsRequest</p>
 */
public class ListSceneItemsRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    @Query
    @NameInMap("OperationRuleId")
    private String operationRuleId;

    @Query
    @NameInMap("Page")
    private Integer page;

    @Query
    @NameInMap("PreviewType")
    private String previewType;

    @Query
    @NameInMap("QueryCount")
    private Integer queryCount;

    @Query
    @NameInMap("SelectionRuleId")
    private String selectionRuleId;

    @Query
    @NameInMap("Size")
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

        private Builder(ListSceneItemsRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.sceneId = response.sceneId;
            this.operationRuleId = response.operationRuleId;
            this.page = response.page;
            this.previewType = response.previewType;
            this.queryCount = response.queryCount;
            this.selectionRuleId = response.selectionRuleId;
            this.size = response.size;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putPathParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * OperationRuleId.
         */
        public Builder operationRuleId(String operationRuleId) {
            this.putQueryParameter("OperationRuleId", operationRuleId);
            this.operationRuleId = operationRuleId;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * PreviewType.
         */
        public Builder previewType(String previewType) {
            this.putQueryParameter("PreviewType", previewType);
            this.previewType = previewType;
            return this;
        }

        /**
         * QueryCount.
         */
        public Builder queryCount(Integer queryCount) {
            this.putQueryParameter("QueryCount", queryCount);
            this.queryCount = queryCount;
            return this;
        }

        /**
         * SelectionRuleId.
         */
        public Builder selectionRuleId(String selectionRuleId) {
            this.putQueryParameter("SelectionRuleId", selectionRuleId);
            this.selectionRuleId = selectionRuleId;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListSceneItemsRequest build() {
            return new ListSceneItemsRequest(this);
        } 

    } 

}
