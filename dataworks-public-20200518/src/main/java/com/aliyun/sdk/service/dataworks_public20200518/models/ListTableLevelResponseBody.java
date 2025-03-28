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
 * {@link ListTableLevelResponseBody} extends {@link TeaModel}
 *
 * <p>ListTableLevelResponseBody</p>
 */
public class ListTableLevelResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("TableLevelInfo")
    private TableLevelInfo tableLevelInfo;

    private ListTableLevelResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tableLevelInfo = builder.tableLevelInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTableLevelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return tableLevelInfo
     */
    public TableLevelInfo getTableLevelInfo() {
        return this.tableLevelInfo;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 
        private TableLevelInfo tableLevelInfo; 

        private Builder() {
        } 

        private Builder(ListTableLevelResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
            this.tableLevelInfo = model.tableLevelInfo;
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
         * <p>abc</p>
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

        /**
         * <p>The information about the table levels.</p>
         */
        public Builder tableLevelInfo(TableLevelInfo tableLevelInfo) {
            this.tableLevelInfo = tableLevelInfo;
            return this;
        }

        public ListTableLevelResponseBody build() {
            return new ListTableLevelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTableLevelResponseBody} extends {@link TeaModel}
     *
     * <p>ListTableLevelResponseBody</p>
     */
    public static class LevelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("LevelId")
        private Long levelId;

        @com.aliyun.core.annotation.NameInMap("LevelType")
        private Integer levelType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        private LevelList(Builder builder) {
            this.description = builder.description;
            this.levelId = builder.levelId;
            this.levelType = builder.levelType;
            this.name = builder.name;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LevelList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return levelId
         */
        public Long getLevelId() {
            return this.levelId;
        }

        /**
         * @return levelType
         */
        public Integer getLevelType() {
            return this.levelType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private String description; 
            private Long levelId; 
            private Integer levelType; 
            private String name; 
            private Long projectId; 

            private Builder() {
            } 

            private Builder(LevelList model) {
                this.description = model.description;
                this.levelId = model.levelId;
                this.levelType = model.levelType;
                this.name = model.name;
                this.projectId = model.projectId;
            } 

            /**
             * <p>The description of the table level.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The table level ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder levelId(Long levelId) {
                this.levelId = levelId;
                return this;
            }

            /**
             * <p>The table level type. Valid values: 1 and 2. The value 1 indicates the logical level. The value 2 indicates the physical level.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder levelType(Integer levelType) {
                this.levelType = levelType;
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
             * <p>The ID of the DataWorks workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public LevelList build() {
                return new LevelList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTableLevelResponseBody} extends {@link TeaModel}
     *
     * <p>ListTableLevelResponseBody</p>
     */
    public static class TableLevelInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LevelList")
        private java.util.List<LevelList> levelList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private TableLevelInfo(Builder builder) {
            this.levelList = builder.levelList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableLevelInfo create() {
            return builder().build();
        }

        /**
         * @return levelList
         */
        public java.util.List<LevelList> getLevelList() {
            return this.levelList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<LevelList> levelList; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(TableLevelInfo model) {
                this.levelList = model.levelList;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of table levels.</p>
             */
            public Builder levelList(java.util.List<LevelList> levelList) {
                this.levelList = levelList;
                return this;
            }

            /**
             * <p>The total number of table levels returned.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public TableLevelInfo build() {
                return new TableLevelInfo(this);
            } 

        } 

    }
}
