// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeApplicationPromptsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationPromptsResponseBody</p>
 */
public class DescribeApplicationPromptsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private String pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private String totalRecordCount;

    private DescribeApplicationPromptsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationPromptsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private String pageNumber; 
        private String pageRecordCount; 
        private String requestId; 
        private String totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeApplicationPromptsResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * TotalRecordCount.
         */
        public Builder totalRecordCount(String totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeApplicationPromptsResponseBody build() {
            return new DescribeApplicationPromptsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationPromptsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationPromptsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PromptEnabled")
        private Integer promptEnabled;

        @com.aliyun.core.annotation.NameInMap("PromptId")
        private String promptId;

        @com.aliyun.core.annotation.NameInMap("PromptName")
        private String promptName;

        @com.aliyun.core.annotation.NameInMap("PromptType")
        private String promptType;

        @com.aliyun.core.annotation.NameInMap("PromptValue")
        private String promptValue;

        private Items(Builder builder) {
            this.promptEnabled = builder.promptEnabled;
            this.promptId = builder.promptId;
            this.promptName = builder.promptName;
            this.promptType = builder.promptType;
            this.promptValue = builder.promptValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return promptEnabled
         */
        public Integer getPromptEnabled() {
            return this.promptEnabled;
        }

        /**
         * @return promptId
         */
        public String getPromptId() {
            return this.promptId;
        }

        /**
         * @return promptName
         */
        public String getPromptName() {
            return this.promptName;
        }

        /**
         * @return promptType
         */
        public String getPromptType() {
            return this.promptType;
        }

        /**
         * @return promptValue
         */
        public String getPromptValue() {
            return this.promptValue;
        }

        public static final class Builder {
            private Integer promptEnabled; 
            private String promptId; 
            private String promptName; 
            private String promptType; 
            private String promptValue; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.promptEnabled = model.promptEnabled;
                this.promptId = model.promptId;
                this.promptName = model.promptName;
                this.promptType = model.promptType;
                this.promptValue = model.promptValue;
            } 

            /**
             * PromptEnabled.
             */
            public Builder promptEnabled(Integer promptEnabled) {
                this.promptEnabled = promptEnabled;
                return this;
            }

            /**
             * PromptId.
             */
            public Builder promptId(String promptId) {
                this.promptId = promptId;
                return this;
            }

            /**
             * PromptName.
             */
            public Builder promptName(String promptName) {
                this.promptName = promptName;
                return this;
            }

            /**
             * PromptType.
             */
            public Builder promptType(String promptType) {
                this.promptType = promptType;
                return this;
            }

            /**
             * PromptValue.
             */
            public Builder promptValue(String promptValue) {
                this.promptValue = promptValue;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
