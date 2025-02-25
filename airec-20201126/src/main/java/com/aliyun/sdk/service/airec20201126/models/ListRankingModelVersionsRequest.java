// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRankingModelVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListRankingModelVersionsRequest</p>
 */
public class ListRankingModelVersionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    private ListRankingModelVersionsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.page = builder.page;
        this.size = builder.size;
        this.status = builder.status;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRankingModelVersionsRequest create() {
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
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<ListRankingModelVersionsRequest, Builder> {
        private String instanceId; 
        private Long page; 
        private Long size; 
        private String status; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(ListRankingModelVersionsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.page = request.page;
            this.size = request.size;
            this.status = request.status;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder size(Long size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The state of the version. Valid values: DRAFT: The version is in the draft state. EFFECTIVE: The version is effective. PUBLISHING: The version is being published. INEFFECTIVE: The version has expired. FAILED: The version has not taken effect.</p>
         * 
         * <strong>example:</strong>
         * <p>TRAINING</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ranking model ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a-a-a</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("templateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public ListRankingModelVersionsRequest build() {
            return new ListRankingModelVersionsRequest(this);
        } 

    } 

}
