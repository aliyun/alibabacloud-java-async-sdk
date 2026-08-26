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
 * {@link DescribeDataAgentThemeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataAgentThemeResponseBody</p>
 */
public class DescribeDataAgentThemeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeDataAgentThemeResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataAgentThemeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
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

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeDataAgentThemeResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDataAgentThemeResponseBody build() {
            return new DescribeDataAgentThemeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataAgentThemeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentThemeResponseBody</p>
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
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CreatedAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ModifiedAt.
             */
            public Builder modifiedAt(String modifiedAt) {
                this.modifiedAt = modifiedAt;
                return this;
            }

            /**
             * ReferTo.
             */
            public Builder referTo(String referTo) {
                this.referTo = referTo;
                return this;
            }

            /**
             * ThemeFrom.
             */
            public Builder themeFrom(String themeFrom) {
                this.themeFrom = themeFrom;
                return this;
            }

            /**
             * ThemeId.
             */
            public Builder themeId(String themeId) {
                this.themeId = themeId;
                return this;
            }

            /**
             * ThemeName.
             */
            public Builder themeName(String themeName) {
                this.themeName = themeName;
                return this;
            }

            /**
             * ThemeType.
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
