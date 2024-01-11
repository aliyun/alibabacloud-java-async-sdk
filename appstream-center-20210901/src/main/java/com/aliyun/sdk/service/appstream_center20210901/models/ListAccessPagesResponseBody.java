// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccessPagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccessPagesResponseBody</p>
 */
public class ListAccessPagesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Count")
    private String count;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private String pageNumber;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private ListAccessPagesResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessPagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public String getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String count; 
        private java.util.List < Data> data; 
        private String message; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(String count) {
            this.count = count;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
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
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public ListAccessPagesResponseBody build() {
            return new ListAccessPagesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AccessMode")
        private String accessMode;

        @NameInMap("AccessPageId")
        private String accessPageId;

        @NameInMap("AccessPageName")
        private String accessPageName;

        @NameInMap("AccessPageState")
        private String accessPageState;

        @NameInMap("AccessUrl")
        private String accessUrl;

        @NameInMap("ContentId")
        private String contentId;

        @NameInMap("ContentName")
        private String contentName;

        @NameInMap("EffectTime")
        private Integer effectTime;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("ProjectName")
        private String projectName;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("UrlExpireTime")
        private String urlExpireTime;

        private Data(Builder builder) {
            this.accessMode = builder.accessMode;
            this.accessPageId = builder.accessPageId;
            this.accessPageName = builder.accessPageName;
            this.accessPageState = builder.accessPageState;
            this.accessUrl = builder.accessUrl;
            this.contentId = builder.contentId;
            this.contentName = builder.contentName;
            this.effectTime = builder.effectTime;
            this.gmtCreate = builder.gmtCreate;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.unit = builder.unit;
            this.urlExpireTime = builder.urlExpireTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessMode
         */
        public String getAccessMode() {
            return this.accessMode;
        }

        /**
         * @return accessPageId
         */
        public String getAccessPageId() {
            return this.accessPageId;
        }

        /**
         * @return accessPageName
         */
        public String getAccessPageName() {
            return this.accessPageName;
        }

        /**
         * @return accessPageState
         */
        public String getAccessPageState() {
            return this.accessPageState;
        }

        /**
         * @return accessUrl
         */
        public String getAccessUrl() {
            return this.accessUrl;
        }

        /**
         * @return contentId
         */
        public String getContentId() {
            return this.contentId;
        }

        /**
         * @return contentName
         */
        public String getContentName() {
            return this.contentName;
        }

        /**
         * @return effectTime
         */
        public Integer getEffectTime() {
            return this.effectTime;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return urlExpireTime
         */
        public String getUrlExpireTime() {
            return this.urlExpireTime;
        }

        public static final class Builder {
            private String accessMode; 
            private String accessPageId; 
            private String accessPageName; 
            private String accessPageState; 
            private String accessUrl; 
            private String contentId; 
            private String contentName; 
            private Integer effectTime; 
            private String gmtCreate; 
            private String projectId; 
            private String projectName; 
            private String unit; 
            private String urlExpireTime; 

            /**
             * AccessMode.
             */
            public Builder accessMode(String accessMode) {
                this.accessMode = accessMode;
                return this;
            }

            /**
             * AccessPageId.
             */
            public Builder accessPageId(String accessPageId) {
                this.accessPageId = accessPageId;
                return this;
            }

            /**
             * AccessPageName.
             */
            public Builder accessPageName(String accessPageName) {
                this.accessPageName = accessPageName;
                return this;
            }

            /**
             * AccessPageState.
             */
            public Builder accessPageState(String accessPageState) {
                this.accessPageState = accessPageState;
                return this;
            }

            /**
             * AccessUrl.
             */
            public Builder accessUrl(String accessUrl) {
                this.accessUrl = accessUrl;
                return this;
            }

            /**
             * ContentId.
             */
            public Builder contentId(String contentId) {
                this.contentId = contentId;
                return this;
            }

            /**
             * ContentName.
             */
            public Builder contentName(String contentName) {
                this.contentName = contentName;
                return this;
            }

            /**
             * EffectTime.
             */
            public Builder effectTime(Integer effectTime) {
                this.effectTime = effectTime;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * UrlExpireTime.
             */
            public Builder urlExpireTime(String urlExpireTime) {
                this.urlExpireTime = urlExpireTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
