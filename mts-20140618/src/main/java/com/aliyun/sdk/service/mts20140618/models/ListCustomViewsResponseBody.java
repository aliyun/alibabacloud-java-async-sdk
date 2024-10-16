// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListCustomViewsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomViewsResponseBody</p>
 */
public class ListCustomViewsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomViews")
    private CustomViews customViews;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListCustomViewsResponseBody(Builder builder) {
        this.customViews = builder.customViews;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomViewsResponseBody create() {
        return builder().build();
    }

    /**
     * @return customViews
     */
    public CustomViews getCustomViews() {
        return this.customViews;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private CustomViews customViews; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * CustomViews.
         */
        public Builder customViews(CustomViews customViews) {
            this.customViews = customViews;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCustomViewsResponseBody build() {
            return new ListCustomViewsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCustomViewsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomViewsResponseBody</p>
     */
    public static class CustomView extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomViewId")
        private String customViewId;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        private CustomView(Builder builder) {
            this.customViewId = builder.customViewId;
            this.imageUrl = builder.imageUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomView create() {
            return builder().build();
        }

        /**
         * @return customViewId
         */
        public String getCustomViewId() {
            return this.customViewId;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        public static final class Builder {
            private String customViewId; 
            private String imageUrl; 

            /**
             * CustomViewId.
             */
            public Builder customViewId(String customViewId) {
                this.customViewId = customViewId;
                return this;
            }

            /**
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            public CustomView build() {
                return new CustomView(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCustomViewsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomViewsResponseBody</p>
     */
    public static class CustomViews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomView")
        private java.util.List < CustomView> customView;

        private CustomViews(Builder builder) {
            this.customView = builder.customView;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomViews create() {
            return builder().build();
        }

        /**
         * @return customView
         */
        public java.util.List < CustomView> getCustomView() {
            return this.customView;
        }

        public static final class Builder {
            private java.util.List < CustomView> customView; 

            /**
             * CustomView.
             */
            public Builder customView(java.util.List < CustomView> customView) {
                this.customView = customView;
                return this;
            }

            public CustomViews build() {
                return new CustomViews(this);
            } 

        } 

    }
}
