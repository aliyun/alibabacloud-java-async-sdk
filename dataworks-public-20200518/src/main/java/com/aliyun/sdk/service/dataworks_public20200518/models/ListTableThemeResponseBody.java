// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The returned data about the level of the table folder.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListTableThemeResponseBody build() {
            return new ListTableThemeResponseBody(this);
        } 

    } 

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

            /**
             * The time when the level was created.
             */
            public Builder createTimeStamp(Long createTimeStamp) {
                this.createTimeStamp = createTimeStamp;
                return this;
            }

            /**
             * The creator of the level.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * The level of the table folder. Valid values: 1 and 2. A value of 1 indicates a table folder of level 1. A value of 2 indicates a table folder of level 2.
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            /**
             * The name of the level of the table folder.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the parent node.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * The ID of the DataWorks workspace.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The ID of the table folder.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ThemeList")
        private java.util.List < ThemeList> themeList;

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
        public java.util.List < ThemeList> getThemeList() {
            return this.themeList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < ThemeList> themeList; 
            private Long totalCount; 

            /**
             * The list of levels of the table folders.
             */
            public Builder themeList(java.util.List < ThemeList> themeList) {
                this.themeList = themeList;
                return this;
            }

            /**
             * The total number of table folders.
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
