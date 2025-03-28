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
 * {@link DsgWhiteListQueryListResponseBody} extends {@link TeaModel}
 *
 * <p>DsgWhiteListQueryListResponseBody</p>
 */
public class DsgWhiteListQueryListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("PageData")
    private PageData pageData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DsgWhiteListQueryListResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.pageData = builder.pageData;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgWhiteListQueryListResponseBody create() {
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
     * @return pageData
     */
    public PageData getPageData() {
        return this.pageData;
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
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private PageData pageData; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DsgWhiteListQueryListResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.pageData = model.pageData;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>1029030003</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>param error</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageData(PageData pageData) {
            this.pageData = pageData;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>102400001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DsgWhiteListQueryListResponseBody build() {
            return new DsgWhiteListQueryListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DsgWhiteListQueryListResponseBody} extends {@link TeaModel}
     *
     * <p>DsgWhiteListQueryListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private Long sceneId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UserGroups")
        private java.util.List<String> userGroups;

        private Data(Builder builder) {
            this.endTime = builder.endTime;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.ruleId = builder.ruleId;
            this.sceneId = builder.sceneId;
            this.startTime = builder.startTime;
            this.type = builder.type;
            this.userGroups = builder.userGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return sceneId
         */
        public Long getSceneId() {
            return this.sceneId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userGroups
         */
        public java.util.List<String> getUserGroups() {
            return this.userGroups;
        }

        public static final class Builder {
            private String endTime; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Long ruleId; 
            private Long sceneId; 
            private String startTime; 
            private String type; 
            private java.util.List<String> userGroups; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.endTime = model.endTime;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.ruleId = model.ruleId;
                this.sceneId = model.sceneId;
                this.startTime = model.startTime;
                this.type = model.type;
                this.userGroups = model.userGroups;
            } 

            /**
             * <p>The expiration time of the data masking whitelist cannot be earlier than the time when the data masking whitelist takes effect. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-10 15:46:20</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The time when the whitelist was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-09 15:46:20</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the whitelist was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-09 15:46:20</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the data masking whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the data masking rule.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The ID of the level-2 data masking scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder sceneId(Long sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>The time when the data masking whitelist takes effect cannot be earlier than the current time. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-09 15:46:20</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The sensitive field type.</p>
             * 
             * <strong>example:</strong>
             * <p>phone</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>A collection of user group names.</p>
             */
            public Builder userGroups(java.util.List<String> userGroups) {
                this.userGroups = userGroups;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link DsgWhiteListQueryListResponseBody} extends {@link TeaModel}
     *
     * <p>DsgWhiteListQueryListResponseBody</p>
     */
    public static class PageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageData(Builder builder) {
            this.data = builder.data;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageData create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageData model) {
                this.data = model.data;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>A collection of whitelists.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of data masking whitelists.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageData build() {
                return new PageData(this);
            } 

        } 

    }
}
