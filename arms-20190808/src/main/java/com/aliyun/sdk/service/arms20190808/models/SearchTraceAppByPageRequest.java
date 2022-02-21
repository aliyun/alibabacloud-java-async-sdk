// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTraceAppByPageRequest} extends {@link RequestModel}
 *
 * <p>SearchTraceAppByPageRequest</p>
 */
public class SearchTraceAppByPageRequest extends Request {
    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TraceAppName")
    private String traceAppName;

    private SearchTraceAppByPageRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.traceAppName = builder.traceAppName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTraceAppByPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return traceAppName
     */
    public String getTraceAppName() {
        return this.traceAppName;
    }

    public static final class Builder extends Request.Builder<SearchTraceAppByPageRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String traceAppName; 

        private Builder() {
            super();
        } 

        private Builder(SearchTraceAppByPageRequest response) {
            super(response);
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.traceAppName = response.traceAppName;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TraceAppName.
         */
        public Builder traceAppName(String traceAppName) {
            this.putQueryParameter("TraceAppName", traceAppName);
            this.traceAppName = traceAppName;
            return this;
        }

        @Override
        public SearchTraceAppByPageRequest build() {
            return new SearchTraceAppByPageRequest(this);
        } 

    } 

}
