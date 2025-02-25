// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListFilteringAlgorithmsRequest} extends {@link RequestModel}
 *
 * <p>ListFilteringAlgorithmsRequest</p>
 */
public class ListFilteringAlgorithmsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("algorithmId")
    private String algorithmId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ListFilteringAlgorithmsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.algorithmId = builder.algorithmId;
        this.page = builder.page;
        this.size = builder.size;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFilteringAlgorithmsRequest create() {
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
     * @return algorithmId
     */
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListFilteringAlgorithmsRequest, Builder> {
        private String instanceId; 
        private String algorithmId; 
        private Integer page; 
        private Integer size; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListFilteringAlgorithmsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.algorithmId = request.algorithmId;
            this.page = request.page;
            this.size = request.size;
            this.status = request.status;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * algorithmId.
         */
        public Builder algorithmId(String algorithmId) {
            this.putQueryParameter("algorithmId", algorithmId);
            this.algorithmId = algorithmId;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListFilteringAlgorithmsRequest build() {
            return new ListFilteringAlgorithmsRequest(this);
        } 

    } 

}
