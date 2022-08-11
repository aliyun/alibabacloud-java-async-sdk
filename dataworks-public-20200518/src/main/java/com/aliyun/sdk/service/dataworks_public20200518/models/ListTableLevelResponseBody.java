// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTableLevelResponseBody} extends {@link TeaModel}
 *
 * <p>ListTableLevelResponseBody</p>
 */
public class ListTableLevelResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TableLevelInfo")
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        /**
         * TableLevelInfo.
         */
        public Builder tableLevelInfo(TableLevelInfo tableLevelInfo) {
            this.tableLevelInfo = tableLevelInfo;
            return this;
        }

        public ListTableLevelResponseBody build() {
            return new ListTableLevelResponseBody(this);
        } 

    } 

    public static class LevelList extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("LevelId")
        private Long levelId;

        @NameInMap("LevelType")
        private Integer levelType;

        @NameInMap("Name")
        private String name;

        @NameInMap("ProjectId")
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

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * LevelId.
             */
            public Builder levelId(Long levelId) {
                this.levelId = levelId;
                return this;
            }

            /**
             * LevelType.
             */
            public Builder levelType(Integer levelType) {
                this.levelType = levelType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProjectId.
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
    public static class TableLevelInfo extends TeaModel {
        @NameInMap("LevelList")
        private java.util.List < LevelList> levelList;

        @NameInMap("TotalCount")
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
        public java.util.List < LevelList> getLevelList() {
            return this.levelList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < LevelList> levelList; 
            private Long totalCount; 

            /**
             * LevelList.
             */
            public Builder levelList(java.util.List < LevelList> levelList) {
                this.levelList = levelList;
                return this;
            }

            /**
             * TotalCount.
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
