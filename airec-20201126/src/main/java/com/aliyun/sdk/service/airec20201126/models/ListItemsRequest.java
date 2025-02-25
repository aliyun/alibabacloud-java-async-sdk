// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListItemsRequest} extends {@link RequestModel}
 *
 * <p>ListItemsRequest</p>
 */
public class ListItemsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("strategyUsed")
    private Boolean strategyUsed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withInvalidDetail")
    private Boolean withInvalidDetail;

    private ListItemsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.page = builder.page;
        this.size = builder.size;
        this.strategyUsed = builder.strategyUsed;
        this.withInvalidDetail = builder.withInvalidDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListItemsRequest create() {
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
     * @return strategyUsed
     */
    public Boolean getStrategyUsed() {
        return this.strategyUsed;
    }

    /**
     * @return withInvalidDetail
     */
    public Boolean getWithInvalidDetail() {
        return this.withInvalidDetail;
    }

    public static final class Builder extends Request.Builder<ListItemsRequest, Builder> {
        private String instanceId; 
        private Integer page; 
        private Integer size; 
        private Boolean strategyUsed; 
        private Boolean withInvalidDetail; 

        private Builder() {
            super();
        } 

        private Builder(ListItemsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.page = request.page;
            this.size = request.size;
            this.strategyUsed = request.strategyUsed;
            this.withInvalidDetail = request.withInvalidDetail;
        } 

        /**
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
         * strategyUsed.
         */
        public Builder strategyUsed(Boolean strategyUsed) {
            this.putQueryParameter("strategyUsed", strategyUsed);
            this.strategyUsed = strategyUsed;
            return this;
        }

        /**
         * withInvalidDetail.
         */
        public Builder withInvalidDetail(Boolean withInvalidDetail) {
            this.putQueryParameter("withInvalidDetail", withInvalidDetail);
            this.withInvalidDetail = withInvalidDetail;
            return this;
        }

        @Override
        public ListItemsRequest build() {
            return new ListItemsRequest(this);
        } 

    } 

}
