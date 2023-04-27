// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspEventQuaraFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSuspEventQuaraFilesResponseBody</p>
 */
public class DescribeSuspEventQuaraFilesResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("QuaraFiles")
    private java.util.List < QuaraFiles> quaraFiles;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSuspEventQuaraFilesResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.quaraFiles = builder.quaraFiles;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspEventQuaraFilesResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return quaraFiles
     */
    public java.util.List < QuaraFiles> getQuaraFiles() {
        return this.quaraFiles;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private Integer pageSize; 
        private java.util.List < QuaraFiles> quaraFiles; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The ID of the cloud desktop.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The name of the alert.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder quaraFiles(java.util.List < QuaraFiles> quaraFiles) {
            this.quaraFiles = quaraFiles;
            return this;
        }

        /**
         * The quarantined files.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the quarantined file. Valid values:
         * <p>
         * 
         * *   quaraFailed: The file failed to be quarantined.
         * *   quaraDone: The file is quarantined.
         * *   quaraing: The file is being quarantined.
         * *   rollbackFailed: Quarantine for the file failed to be canceled.
         * *   rollbackDone: Quarantine for the file is canceled.
         * *   rollbacking: Quarantine for the file is being canceled.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSuspEventQuaraFilesResponseBody build() {
            return new DescribeSuspEventQuaraFilesResponseBody(this);
        } 

    } 

    public static class QuaraFiles extends TeaModel {
        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("DesktopName")
        private String desktopName;

        @NameInMap("EventName")
        private String eventName;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("Md5")
        private String md5;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("Path")
        private String path;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tag")
        private String tag;

        private QuaraFiles(Builder builder) {
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.eventName = builder.eventName;
            this.eventType = builder.eventType;
            this.id = builder.id;
            this.md5 = builder.md5;
            this.modifyTime = builder.modifyTime;
            this.path = builder.path;
            this.status = builder.status;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuaraFiles create() {
            return builder().build();
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String desktopId; 
            private String desktopName; 
            private String eventName; 
            private String eventType; 
            private Integer id; 
            private String md5; 
            private String modifyTime; 
            private String path; 
            private String status; 
            private String tag; 

            /**
             * DesktopId.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * The number of the page to return.
             * <p>
             * 
             * Pages start from page 1.
             * 
             * Default value: 1.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * The maximum number of entries returned per page.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * DescribeSuspEventQuaraFiles
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The tag of the alert.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The ID of the quarantined file.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public QuaraFiles build() {
                return new QuaraFiles(this);
            } 

        } 

    }
}
