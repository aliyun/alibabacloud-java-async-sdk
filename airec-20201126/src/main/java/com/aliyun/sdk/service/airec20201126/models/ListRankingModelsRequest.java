// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRankingModelsRequest} extends {@link RequestModel}
 *
 * <p>ListRankingModelsRequest</p>
 */
public class ListRankingModelsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("rankingModelId")
    private String rankingModelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer size;

    private ListRankingModelsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.page = builder.page;
        this.rankingModelId = builder.rankingModelId;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRankingModelsRequest create() {
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
     * @return rankingModelId
     */
    public String getRankingModelId() {
        return this.rankingModelId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListRankingModelsRequest, Builder> {
        private String instanceId; 
        private Integer page; 
        private String rankingModelId; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListRankingModelsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.page = request.page;
            this.rankingModelId = request.rankingModelId;
            this.size = request.size;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-test001</p>
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
         * rankingModelId.
         */
        public Builder rankingModelId(String rankingModelId) {
            this.putQueryParameter("rankingModelId", rankingModelId);
            this.rankingModelId = rankingModelId;
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

        @Override
        public ListRankingModelsRequest build() {
            return new ListRankingModelsRequest(this);
        } 

    } 

}
