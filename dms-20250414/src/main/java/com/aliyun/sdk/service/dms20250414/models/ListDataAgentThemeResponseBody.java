// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListDataAgentThemeResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataAgentThemeResponseBody</p>
 */
public class ListDataAgentThemeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private ListDataAgentThemeResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataAgentThemeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 
        private Integer totalPages; 

        private Builder() {
        } 

        private Builder(ListDataAgentThemeResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
            this.totalPages = model.totalPages;
        } 

        /**
         * <p>The response struct.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned when the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned when the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>NesLoKLEdIZrKhDT7I2gS****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The current page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public ListDataAgentThemeResponseBody build() {
            return new ListDataAgentThemeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataAgentThemeResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataAgentThemeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ModifiedAt")
        private String modifiedAt;

        @com.aliyun.core.annotation.NameInMap("ReferTo")
        private String referTo;

        @com.aliyun.core.annotation.NameInMap("ThemeFrom")
        private String themeFrom;

        @com.aliyun.core.annotation.NameInMap("ThemeId")
        private String themeId;

        @com.aliyun.core.annotation.NameInMap("ThemeName")
        private String themeName;

        @com.aliyun.core.annotation.NameInMap("ThemeType")
        private String themeType;

        private Data(Builder builder) {
            this.category = builder.category;
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.modifiedAt = builder.modifiedAt;
            this.referTo = builder.referTo;
            this.themeFrom = builder.themeFrom;
            this.themeId = builder.themeId;
            this.themeName = builder.themeName;
            this.themeType = builder.themeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return modifiedAt
         */
        public String getModifiedAt() {
            return this.modifiedAt;
        }

        /**
         * @return referTo
         */
        public String getReferTo() {
            return this.referTo;
        }

        /**
         * @return themeFrom
         */
        public String getThemeFrom() {
            return this.themeFrom;
        }

        /**
         * @return themeId
         */
        public String getThemeId() {
            return this.themeId;
        }

        /**
         * @return themeName
         */
        public String getThemeName() {
            return this.themeName;
        }

        /**
         * @return themeType
         */
        public String getThemeType() {
            return this.themeType;
        }

        public static final class Builder {
            private String category; 
            private String createdAt; 
            private String description; 
            private String modifiedAt; 
            private String referTo; 
            private String themeFrom; 
            private String themeId; 
            private String themeName; 
            private String themeType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.category = model.category;
                this.createdAt = model.createdAt;
                this.description = model.description;
                this.modifiedAt = model.modifiedAt;
                this.referTo = model.referTo;
                this.themeFrom = model.themeFrom;
                this.themeId = model.themeId;
                this.themeName = model.themeName;
                this.themeType = model.themeType;
            } 

            /**
             * <p>The common scenarios. Valid values: report, infographic, and others.</p>
             * 
             * <strong>example:</strong>
             * <p>report</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The creation time in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-15T08:30:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>weekly report</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The modification time in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-20T10:15:30Z</p>
             */
            public Builder modifiedAt(String modifiedAt) {
                this.modifiedAt = modifiedAt;
                return this;
            }

            /**
             * <p>The tracing reference that points to the UUID of the source theme.</p>
             * 
             * <strong>example:</strong>
             * <p>6d1e3f9a-<strong><strong>-</strong></strong>-****-2b8c4e6f0a1d</p>
             */
            public Builder referTo(String referTo) {
                this.referTo = referTo;
                return this;
            }

            /**
             * <p>The source of the theme. Valid values:</p>
             * <ul>
             * <li>system</li>
             * <li>custom</li>
             * <li>derived</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder themeFrom(String themeFrom) {
                this.themeFrom = themeFrom;
                return this;
            }

            /**
             * <p>The business identifier of the theme.</p>
             * 
             * <strong>example:</strong>
             * <p>0f8b2c1d-<strong><strong>-</strong></strong>-****-9a3e5f7b1c2d</p>
             */
            public Builder themeId(String themeId) {
                this.themeId = themeId;
                return this;
            }

            /**
             * <p>The display name of the theme.</p>
             * 
             * <strong>example:</strong>
             * <p>weekly report</p>
             */
            public Builder themeName(String themeName) {
                this.themeName = themeName;
                return this;
            }

            /**
             * <p>The theme stage. Valid values:</p>
             * <ul>
             * <li>design: contains only design.md.</li>
             * <li>template: complete and renderable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>template</p>
             */
            public Builder themeType(String themeType) {
                this.themeType = themeType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
