// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRankingModelTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListRankingModelTemplatesRequest</p>
 */
public class ListRankingModelTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    private ListRankingModelTemplatesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.page = builder.page;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRankingModelTemplatesRequest create() {
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

    public static final class Builder extends Request.Builder<ListRankingModelTemplatesRequest, Builder> {
        private String instanceId; 
        private Long page; 
        private Long size; 

        private Builder() {
            super();
        } 

        private Builder(ListRankingModelTemplatesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.page = request.page;
            this.size = request.size;
        } 

        /**
         * <p>The instance ID.</p>
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
         * <p>1</p>
         */
        public Builder size(Long size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListRankingModelTemplatesRequest build() {
            return new ListRankingModelTemplatesRequest(this);
        } 

    } 

}
