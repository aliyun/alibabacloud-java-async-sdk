// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAllTrendCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetAllTrendCategoryResponseBody</p>
 */
public class GetAllTrendCategoryResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuccessResponse")
    private Boolean successResponse;

    private GetAllTrendCategoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.successResponse = builder.successResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAllTrendCategoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successResponse
     */
    public Boolean getSuccessResponse() {
        return this.successResponse;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean successResponse; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SuccessResponse.
         */
        public Builder successResponse(Boolean successResponse) {
            this.successResponse = successResponse;
            return this;
        }

        public GetAllTrendCategoryResponseBody build() {
            return new GetAllTrendCategoryResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CategoryId")
        private Long categoryId;

        @NameInMap("CategoryLevel")
        private Integer categoryLevel;

        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("ChildCategory")
        private java.util.List < ? > childCategory;

        @NameInMap("SuperCategoryName")
        private String superCategoryName;

        private Data(Builder builder) {
            this.categoryId = builder.categoryId;
            this.categoryLevel = builder.categoryLevel;
            this.categoryName = builder.categoryName;
            this.childCategory = builder.childCategory;
            this.superCategoryName = builder.superCategoryName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryLevel
         */
        public Integer getCategoryLevel() {
            return this.categoryLevel;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return childCategory
         */
        public java.util.List < ? > getChildCategory() {
            return this.childCategory;
        }

        /**
         * @return superCategoryName
         */
        public String getSuperCategoryName() {
            return this.superCategoryName;
        }

        public static final class Builder {
            private Long categoryId; 
            private Integer categoryLevel; 
            private String categoryName; 
            private java.util.List < ? > childCategory; 
            private String superCategoryName; 

            /**
             * CategoryId.
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * CategoryLevel.
             */
            public Builder categoryLevel(Integer categoryLevel) {
                this.categoryLevel = categoryLevel;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * ChildCategory.
             */
            public Builder childCategory(java.util.List < ? > childCategory) {
                this.childCategory = childCategory;
                return this;
            }

            /**
             * SuperCategoryName.
             */
            public Builder superCategoryName(String superCategoryName) {
                this.superCategoryName = superCategoryName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
