// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeUniRecoverableListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUniRecoverableListResponseBody</p>
 */
public class DescribeUniRecoverableListResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("Database")
    private String database;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RecoverableInfoList")
    private java.util.List < RecoverableInfoList> recoverableInfoList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;


    private DescribeUniRecoverableListResponseBody(Builder builder) {
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.database = builder.database;
        this.pageSize = builder.pageSize;
        this.recoverableInfoList = builder.recoverableInfoList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUniRecoverableListResponseBody create() {
        return builder().build();
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
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return recoverableInfoList
     */
    public java.util.List < RecoverableInfoList> getRecoverableInfoList() {
        return this.recoverableInfoList;
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
        private Integer count; 
        private Integer currentPage; 
        private String database; 
        private Integer pageSize; 
        private java.util.List < RecoverableInfoList> recoverableInfoList; 
        private String requestId; 
        private Integer totalCount; 

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
         * <p>Database.</p>
         */
        public Builder database(String database) {
            this.database = database;
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
         * <p>RecoverableInfoList.</p>
         */
        public Builder recoverableInfoList(java.util.List < RecoverableInfoList> recoverableInfoList) {
            this.recoverableInfoList = recoverableInfoList;
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

        public DescribeUniRecoverableListResponseBody build() {
            return new DescribeUniRecoverableListResponseBody(this);
        } 

    } 

    public static class RecoverableInfoList extends TeaModel {
        @NameInMap("FirstTime")
        private Long firstTime;

        @NameInMap("LastTime")
        private Long lastTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("ResetScn")
        private String resetScn;

        @NameInMap("ResetTime")
        private Long resetTime;

        @NameInMap("RestoreInfo")
        private java.util.Map < String, ? > restoreInfo;


        private RecoverableInfoList(Builder builder) {
            this.firstTime = builder.firstTime;
            this.lastTime = builder.lastTime;
            this.name = builder.name;
            this.resetScn = builder.resetScn;
            this.resetTime = builder.resetTime;
            this.restoreInfo = builder.restoreInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecoverableInfoList create() {
            return builder().build();
        }

        /**
         * @return firstTime
         */
        public Long getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return lastTime
         */
        public Long getLastTime() {
            return this.lastTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resetScn
         */
        public String getResetScn() {
            return this.resetScn;
        }

        /**
         * @return resetTime
         */
        public Long getResetTime() {
            return this.resetTime;
        }

        /**
         * @return restoreInfo
         */
        public java.util.Map < String, ? > getRestoreInfo() {
            return this.restoreInfo;
        }

        public static final class Builder {
            private Long firstTime; 
            private Long lastTime; 
            private String name; 
            private String resetScn; 
            private Long resetTime; 
            private java.util.Map < String, ? > restoreInfo; 

            /**
             * <p>FirstTime.</p>
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * <p>LastTime.</p>
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * <p>Name.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>ResetScn.</p>
             */
            public Builder resetScn(String resetScn) {
                this.resetScn = resetScn;
                return this;
            }

            /**
             * <p>ResetTime.</p>
             */
            public Builder resetTime(Long resetTime) {
                this.resetTime = resetTime;
                return this;
            }

            /**
             * <p>RestoreInfo.</p>
             */
            public Builder restoreInfo(java.util.Map < String, ? > restoreInfo) {
                this.restoreInfo = restoreInfo;
                return this;
            }

            public RecoverableInfoList build() {
                return new RecoverableInfoList(this);
            } 

        } 

    }
}
