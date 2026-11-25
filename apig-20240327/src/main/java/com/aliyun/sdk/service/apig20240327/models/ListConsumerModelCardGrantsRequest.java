// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListConsumerModelCardGrantsRequest} extends {@link RequestModel}
 *
 * <p>ListConsumerModelCardGrantsRequest</p>
 */
public class ListConsumerModelCardGrantsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String httpApiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modelCardId")
    private String modelCardId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("principalId")
    private String principalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("principalType")
    private String principalType;

    private ListConsumerModelCardGrantsRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.modelCardId = builder.modelCardId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.principalId = builder.principalId;
        this.principalType = builder.principalType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConsumerModelCardGrantsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    /**
     * @return modelCardId
     */
    public String getModelCardId() {
        return this.modelCardId;
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
     * @return principalId
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * @return principalType
     */
    public String getPrincipalType() {
        return this.principalType;
    }

    public static final class Builder extends Request.Builder<ListConsumerModelCardGrantsRequest, Builder> {
        private String httpApiId; 
        private String modelCardId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String principalId; 
        private String principalType; 

        private Builder() {
            super();
        } 

        private Builder(ListConsumerModelCardGrantsRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.modelCardId = request.modelCardId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.principalId = request.principalId;
            this.principalType = request.principalType;
        } 

        /**
         * <p>The immutable ID of the new Model API. Authorization is valid only within this API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api-d00000000000000000000</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * <p>Filters by model card ID for reverse lookup.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-d00000000000000000000</p>
         */
        public Builder modelCardId(String modelCardId) {
            this.putQueryParameter("modelCardId", modelCardId);
            this.modelCardId = modelCardId;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Filters by principal ID. This parameter must be paired with principalType.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-d00000000000000000000</p>
         */
        public Builder principalId(String principalId) {
            this.putQueryParameter("principalId", principalId);
            this.principalId = principalId;
            return this;
        }

        /**
         * <p>Filters by principal type. Valid values: Consumer and ConsumerGroup. This parameter must be paired with principalId.</p>
         * 
         * <strong>example:</strong>
         * <p>Consumer</p>
         */
        public Builder principalType(String principalType) {
            this.putQueryParameter("principalType", principalType);
            this.principalType = principalType;
            return this;
        }

        @Override
        public ListConsumerModelCardGrantsRequest build() {
            return new ListConsumerModelCardGrantsRequest(this);
        } 

    } 

}
