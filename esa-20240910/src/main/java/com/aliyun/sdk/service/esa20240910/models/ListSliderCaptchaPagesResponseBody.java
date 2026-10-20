// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListSliderCaptchaPagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSliderCaptchaPagesResponseBody</p>
 */
public class ListSliderCaptchaPagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Pages")
    private java.util.List<Pages> pages;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListSliderCaptchaPagesResponseBody(Builder builder) {
        this.pages = builder.pages;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSliderCaptchaPagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pages
     */
    public java.util.List<Pages> getPages() {
        return this.pages;
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
        private java.util.List<Pages> pages; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListSliderCaptchaPagesResponseBody model) {
            this.pages = model.pages;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of custom slider CAPTCHA pages.</p>
         */
        public Builder pages(java.util.List<Pages> pages) {
            this.pages = pages;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSliderCaptchaPagesResponseBody build() {
            return new ListSliderCaptchaPagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSliderCaptchaPagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSliderCaptchaPagesResponseBody</p>
     */
    public static class Pages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SiteIds")
        private java.util.List<Long> siteIds;

        private Pages(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.siteIds = builder.siteIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pages create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return siteIds
         */
        public java.util.List<Long> getSiteIds() {
            return this.siteIds;
        }

        public static final class Builder {
            private Long id; 
            private String name; 
            private java.util.List<Long> siteIds; 

            private Builder() {
            } 

            private Builder(Pages model) {
                this.id = model.id;
                this.name = model.name;
                this.siteIds = model.siteIds;
            } 

            /**
             * <p>The ID of the custom slider CAPTCHA page.</p>
             * 
             * <strong>example:</strong>
             * <p>50000001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the custom slider CAPTCHA page.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of associated site IDs.</p>
             */
            public Builder siteIds(java.util.List<Long> siteIds) {
                this.siteIds = siteIds;
                return this;
            }

            public Pages build() {
                return new Pages(this);
            } 

        } 

    }
}
