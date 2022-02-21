// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeExcelRecordRequest} extends {@link RequestModel}
 *
 * <p>RecognizeExcelRecordRequest</p>
 */
public class RecognizeExcelRecordRequest extends Request {
    @Query
    @NameInMap("CurrPage")
    @Validation(required = true)
    private Long currPage;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Long pageSize;

    private RecognizeExcelRecordRequest(Builder builder) {
        super(builder);
        this.currPage = builder.currPage;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeExcelRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currPage
     */
    public Long getCurrPage() {
        return this.currPage;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<RecognizeExcelRecordRequest, Builder> {
        private Long currPage; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeExcelRecordRequest response) {
            super(response);
            this.currPage = response.currPage;
            this.pageSize = response.pageSize;
        } 

        /**
         * 页码
         */
        public Builder currPage(Long currPage) {
            this.putQueryParameter("CurrPage", currPage);
            this.currPage = currPage;
            return this;
        }

        /**
         * 每页数据
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public RecognizeExcelRecordRequest build() {
            return new RecognizeExcelRecordRequest(this);
        } 

    } 

}
