// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220729.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReClassifyTradeDocumentExtractRequest} extends {@link RequestModel}
 *
 * <p>ReClassifyTradeDocumentExtractRequest</p>
 */
public class ReClassifyTradeDocumentExtractRequest extends Request {
    @Query
    @NameInMap("BizId")
    private String bizId;

    @Query
    @NameInMap("PageUpdateInfoModels")
    private java.util.List < PageUpdateInfoModels> pageUpdateInfoModels;

    private ReClassifyTradeDocumentExtractRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.pageUpdateInfoModels = builder.pageUpdateInfoModels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReClassifyTradeDocumentExtractRequest create() {
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
     * @return pageUpdateInfoModels
     */
    public java.util.List < PageUpdateInfoModels> getPageUpdateInfoModels() {
        return this.pageUpdateInfoModels;
    }

    public static final class Builder extends Request.Builder<ReClassifyTradeDocumentExtractRequest, Builder> {
        private String bizId; 
        private java.util.List < PageUpdateInfoModels> pageUpdateInfoModels; 

        private Builder() {
            super();
        } 

        private Builder(ReClassifyTradeDocumentExtractRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.pageUpdateInfoModels = request.pageUpdateInfoModels;
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
         * PageUpdateInfoModels.
         */
        public Builder pageUpdateInfoModels(java.util.List < PageUpdateInfoModels> pageUpdateInfoModels) {
            String pageUpdateInfoModelsShrink = shrink(pageUpdateInfoModels, "PageUpdateInfoModels", "json");
            this.putQueryParameter("PageUpdateInfoModels", pageUpdateInfoModelsShrink);
            this.pageUpdateInfoModels = pageUpdateInfoModels;
            return this;
        }

        @Override
        public ReClassifyTradeDocumentExtractRequest build() {
            return new ReClassifyTradeDocumentExtractRequest(this);
        } 

    } 

    public static class PageUpdateInfoModels extends TeaModel {
        @NameInMap("AttTypeCode")
        @Validation(required = true)
        private String attTypeCode;

        @NameInMap("PageId")
        @Validation(required = true)
        private String pageId;

        private PageUpdateInfoModels(Builder builder) {
            this.attTypeCode = builder.attTypeCode;
            this.pageId = builder.pageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageUpdateInfoModels create() {
            return builder().build();
        }

        /**
         * @return attTypeCode
         */
        public String getAttTypeCode() {
            return this.attTypeCode;
        }

        /**
         * @return pageId
         */
        public String getPageId() {
            return this.pageId;
        }

        public static final class Builder {
            private String attTypeCode; 
            private String pageId; 

            /**
             * AttTypeCode.
             */
            public Builder attTypeCode(String attTypeCode) {
                this.attTypeCode = attTypeCode;
                return this;
            }

            /**
             * PageId.
             */
            public Builder pageId(String pageId) {
                this.pageId = pageId;
                return this;
            }

            public PageUpdateInfoModels build() {
                return new PageUpdateInfoModels(this);
            } 

        } 

    }
}
