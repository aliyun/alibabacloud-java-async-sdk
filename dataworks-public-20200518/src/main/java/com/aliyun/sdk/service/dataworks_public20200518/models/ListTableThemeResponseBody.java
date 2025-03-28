// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListTableThemeResponseBody} extends {@link TeaModel}
 *
 * <p>ListTableThemeResponseBody</p>
 */
public class ListTableThemeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListTableThemeResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTableThemeResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListTableThemeResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>1031203110005</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameters are invalid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abcde</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListTableThemeResponseBody build() {
            return new ListTableThemeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTableThemeResponseBody} extends {@link TeaModel}
     *
     * <p>ListTableThemeResponseBody</p>
     */
    public static class ThemeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTimeStamp")
        private Long createTimeStamp;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Integer level;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ThemeId")
        private Long themeId;

        private ThemeList(Builder builder) {
            this.createTimeStamp = builder.createTimeStamp;
            this.creator = builder.creator;
            this.level = builder.level;
            this.name = builder.name;
            this.parentId = builder.parentId;
            this.projectId = builder.projectId;
            this.themeId = builder.themeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ThemeList create() {
            return builder().build();
        }

        /**
         * @return createTimeStamp
         */
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return level
         */
        public Integer getLevel() {
            return this.level;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return themeId
         */
        public Long getThemeId() {
            return this.themeId;
        }

        public static final class Builder {
            private Long createTimeStamp; 
            private String creator; 
            private Integer level; 
            private String name; 
            private Long parentId; 
            private Long projectId; 
            private Long themeId; 

            private Builder() {
            } 

            private Builder(ThemeList model) {
                this.createTimeStamp = model.createTimeStamp;
                this.creator = model.creator;
                this.level = model.level;
                this.name = model.name;
                this.parentId = model.parentId;
                this.projectId = model.projectId;
                this.themeId = model.themeId;
            } 

            /**
             * <p>The time when the table level was created.</p>
             * 
             * <strong>example:</strong>
             * <p>123432343243</p>
             */
            public Builder createTimeStamp(Long createTimeStamp) {
                this.createTimeStamp = createTimeStamp;
                return this;
            }

            /**
             * <p>The creator of the table level.</p>
             * 
             * <strong>example:</strong>
             * <p>123455</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The level of the table folder. Valid values: 1 and 2. The value 1 indicates the first level. The value 2 indicates the second level.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The name of the table level.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ancestor node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>122</p>
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The DataWorks workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The table theme ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder themeId(Long themeId) {
                this.themeId = themeId;
                return this;
            }

            public ThemeList build() {
                return new ThemeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTableThemeResponseBody} extends {@link TeaModel}
     *
     * <p>ListTableThemeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ThemeList")
        private java.util.List<ThemeList> themeList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.themeList = builder.themeList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return themeList
         */
        public java.util.List<ThemeList> getThemeList() {
            return this.themeList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<ThemeList> themeList; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.themeList = model.themeList;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of table levels.</p>
             */
            public Builder themeList(java.util.List<ThemeList> themeList) {
                this.themeList = themeList;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
