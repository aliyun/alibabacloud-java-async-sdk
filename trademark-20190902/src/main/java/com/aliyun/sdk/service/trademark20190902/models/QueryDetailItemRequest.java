// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDetailItemRequest} extends {@link RequestModel}
 *
 * <p>QueryDetailItemRequest</p>
 */
public class QueryDetailItemRequest extends Request {
    @Query
    @NameInMap("DetailConvertType")
    private String detailConvertType;

    @Query
    @NameInMap("DetailId")
    private String detailId;

    @Query
    @NameInMap("DetailType")
    private String detailType;

    @Query
    @NameInMap("Mock")
    private Boolean mock;

    private QueryDetailItemRequest(Builder builder) {
        super(builder);
        this.detailConvertType = builder.detailConvertType;
        this.detailId = builder.detailId;
        this.detailType = builder.detailType;
        this.mock = builder.mock;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDetailItemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detailConvertType
     */
    public String getDetailConvertType() {
        return this.detailConvertType;
    }

    /**
     * @return detailId
     */
    public String getDetailId() {
        return this.detailId;
    }

    /**
     * @return detailType
     */
    public String getDetailType() {
        return this.detailType;
    }

    /**
     * @return mock
     */
    public Boolean getMock() {
        return this.mock;
    }

    public static final class Builder extends Request.Builder<QueryDetailItemRequest, Builder> {
        private String detailConvertType; 
        private String detailId; 
        private String detailType; 
        private Boolean mock; 

        private Builder() {
            super();
        } 

        private Builder(QueryDetailItemRequest request) {
            super(request);
            this.detailConvertType = request.detailConvertType;
            this.detailId = request.detailId;
            this.detailType = request.detailType;
            this.mock = request.mock;
        } 

        /**
         * DetailConvertType.
         */
        public Builder detailConvertType(String detailConvertType) {
            this.putQueryParameter("DetailConvertType", detailConvertType);
            this.detailConvertType = detailConvertType;
            return this;
        }

        /**
         * DetailId.
         */
        public Builder detailId(String detailId) {
            this.putQueryParameter("DetailId", detailId);
            this.detailId = detailId;
            return this;
        }

        /**
         * DetailType.
         */
        public Builder detailType(String detailType) {
            this.putQueryParameter("DetailType", detailType);
            this.detailType = detailType;
            return this;
        }

        /**
         * Mock.
         */
        public Builder mock(Boolean mock) {
            this.putQueryParameter("Mock", mock);
            this.mock = mock;
            return this;
        }

        @Override
        public QueryDetailItemRequest build() {
            return new QueryDetailItemRequest(this);
        } 

    } 

}
