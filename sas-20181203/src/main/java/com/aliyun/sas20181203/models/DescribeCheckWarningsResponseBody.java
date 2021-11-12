// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeCheckWarningsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCheckWarningsResponseBody</p>
 */
public class DescribeCheckWarningsResponseBody extends TeaModel {
    @NameInMap("CheckWarnings")
    private java.util.List < CheckWarnings> checkWarnings;

    @NameInMap("Count")
    private Integer count;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;


    private DescribeCheckWarningsResponseBody(Builder builder) {
        this.checkWarnings = builder.checkWarnings;
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCheckWarningsResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkWarnings
     */
    public java.util.List < CheckWarnings> getCheckWarnings() {
        return this.checkWarnings;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
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
        private java.util.List < CheckWarnings> checkWarnings; 
        private Integer count; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>CheckWarnings.</p>
         */
        public Builder checkWarnings(java.util.List < CheckWarnings> checkWarnings) {
            this.checkWarnings = checkWarnings;
            return this;
        }

        /**
         * <p>Count.</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>CurrentPage.</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>PageSize.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>TotalCount.</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCheckWarningsResponseBody build() {
            return new DescribeCheckWarningsResponseBody(this);
        } 

    } 

    public static class CheckWarnings extends TeaModel {
        @NameInMap("CheckId")
        private Long checkId;

        @NameInMap("CheckWarningId")
        private Long checkWarningId;

        @NameInMap("Item")
        private String item;

        @NameInMap("Level")
        private String level;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Type")
        private String type;

        @NameInMap("Uuid")
        private String uuid;


        private CheckWarnings(Builder builder) {
            this.checkId = builder.checkId;
            this.checkWarningId = builder.checkWarningId;
            this.item = builder.item;
            this.level = builder.level;
            this.status = builder.status;
            this.type = builder.type;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckWarnings create() {
            return builder().build();
        }

        /**
         * @return checkId
         */
        public Long getCheckId() {
            return this.checkId;
        }

        /**
         * @return checkWarningId
         */
        public Long getCheckWarningId() {
            return this.checkWarningId;
        }

        /**
         * @return item
         */
        public String getItem() {
            return this.item;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Long checkId; 
            private Long checkWarningId; 
            private String item; 
            private String level; 
            private Integer status; 
            private String type; 
            private String uuid; 

            /**
             * <p>CheckId.</p>
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * <p>CheckWarningId.</p>
             */
            public Builder checkWarningId(Long checkWarningId) {
                this.checkWarningId = checkWarningId;
                return this;
            }

            /**
             * <p>Item.</p>
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * <p>Level.</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>Status.</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Type.</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Uuid.</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public CheckWarnings build() {
                return new CheckWarnings(this);
            } 

        } 

    }
}
