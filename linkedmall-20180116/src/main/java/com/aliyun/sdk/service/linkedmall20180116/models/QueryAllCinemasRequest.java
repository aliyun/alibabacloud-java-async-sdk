// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAllCinemasRequest} extends {@link RequestModel}
 *
 * <p>QueryAllCinemasRequest</p>
 */
public class QueryAllCinemasRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("CityCode")
    @Validation(required = true)
    private Long cityCode;

    @Query
    @NameInMap("ExtJson")
    private String extJson;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Long pageNumber;

    private QueryAllCinemasRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.cityCode = builder.cityCode;
        this.extJson = builder.extJson;
        this.pageNumber = builder.pageNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAllCinemasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return cityCode
     */
    public Long getCityCode() {
        return this.cityCode;
    }

    /**
     * @return extJson
     */
    public String getExtJson() {
        return this.extJson;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public static final class Builder extends Request.Builder<QueryAllCinemasRequest, Builder> {
        private String bizId; 
        private Long cityCode; 
        private String extJson; 
        private Long pageNumber; 

        private Builder() {
            super();
        } 

        private Builder(QueryAllCinemasRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.cityCode = request.cityCode;
            this.extJson = request.extJson;
            this.pageNumber = request.pageNumber;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * CityCode.
         */
        public Builder cityCode(Long cityCode) {
            this.putQueryParameter("CityCode", cityCode);
            this.cityCode = cityCode;
            return this;
        }

        /**
         * ExtJson.
         */
        public Builder extJson(String extJson) {
            this.putQueryParameter("ExtJson", extJson);
            this.extJson = extJson;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        @Override
        public QueryAllCinemasRequest build() {
            return new QueryAllCinemasRequest(this);
        } 

    } 

}
