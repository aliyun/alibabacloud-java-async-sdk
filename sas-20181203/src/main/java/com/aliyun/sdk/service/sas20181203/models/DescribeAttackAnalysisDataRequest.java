// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAttackAnalysisDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeAttackAnalysisDataRequest</p>
 */
public class DescribeAttackAnalysisDataRequest extends Request {
    @Query
    @NameInMap("Base64")
    private String base64;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Data")
    private String data;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private DescribeAttackAnalysisDataRequest(Builder builder) {
        super(builder);
        this.base64 = builder.base64;
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAttackAnalysisDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return base64
     */
    public String getBase64() {
        return this.base64;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeAttackAnalysisDataRequest, Builder> {
        private String base64; 
        private Integer currentPage; 
        private String data; 
        private Long endTime; 
        private String lang; 
        private Integer pageSize; 
        private Long startTime; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAttackAnalysisDataRequest request) {
            super(request);
            this.base64 = request.base64;
            this.currentPage = request.currentPage;
            this.data = request.data;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.type = request.type;
        } 

        /**
         * Base64.
         */
        public Builder base64(String base64) {
            this.putQueryParameter("Base64", base64);
            this.base64 = base64;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeAttackAnalysisDataRequest build() {
            return new DescribeAttackAnalysisDataRequest(this);
        } 

    } 

}
