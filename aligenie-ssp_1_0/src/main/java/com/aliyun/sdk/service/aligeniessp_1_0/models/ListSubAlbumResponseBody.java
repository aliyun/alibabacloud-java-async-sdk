// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link ListSubAlbumResponseBody} extends {@link TeaModel}
 *
 * <p>ListSubAlbumResponseBody</p>
 */
public class ListSubAlbumResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private ListSubAlbumResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubAlbumResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(ListSubAlbumResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Status code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Additional information</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>CB13B8D7-37FB-1B3E-8EB9-65BB413267E1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Result</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListSubAlbumResponseBody build() {
            return new ListSubAlbumResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSubAlbumResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubAlbumResponseBody</p>
     */
    public static class ScheduleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DaysOfWeek")
        private java.util.List<Integer> daysOfWeek;

        @com.aliyun.core.annotation.NameInMap("Hour")
        private Integer hour;

        @com.aliyun.core.annotation.NameInMap("Minute")
        private Integer minute;

        @com.aliyun.core.annotation.NameInMap("ScheduleId")
        private Long scheduleId;

        private ScheduleInfo(Builder builder) {
            this.daysOfWeek = builder.daysOfWeek;
            this.hour = builder.hour;
            this.minute = builder.minute;
            this.scheduleId = builder.scheduleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleInfo create() {
            return builder().build();
        }

        /**
         * @return daysOfWeek
         */
        public java.util.List<Integer> getDaysOfWeek() {
            return this.daysOfWeek;
        }

        /**
         * @return hour
         */
        public Integer getHour() {
            return this.hour;
        }

        /**
         * @return minute
         */
        public Integer getMinute() {
            return this.minute;
        }

        /**
         * @return scheduleId
         */
        public Long getScheduleId() {
            return this.scheduleId;
        }

        public static final class Builder {
            private java.util.List<Integer> daysOfWeek; 
            private Integer hour; 
            private Integer minute; 
            private Long scheduleId; 

            private Builder() {
            } 

            private Builder(ScheduleInfo model) {
                this.daysOfWeek = model.daysOfWeek;
                this.hour = model.hour;
                this.minute = model.minute;
                this.scheduleId = model.scheduleId;
            } 

            /**
             * <p>trigger epoch</p>
             */
            public Builder daysOfWeek(java.util.List<Integer> daysOfWeek) {
                this.daysOfWeek = daysOfWeek;
                return this;
            }

            /**
             * <p>trigger hour</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder hour(Integer hour) {
                this.hour = hour;
                return this;
            }

            /**
             * <p>trigger minute</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder minute(Integer minute) {
                this.minute = minute;
                return this;
            }

            /**
             * <p>scheduled task ID</p>
             */
            public Builder scheduleId(Long scheduleId) {
                this.scheduleId = scheduleId;
                return this;
            }

            public ScheduleInfo build() {
                return new ScheduleInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubAlbumResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubAlbumResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlbumId")
        private String albumId;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Integer categoryId;

        @com.aliyun.core.annotation.NameInMap("CoverUrl")
        private String coverUrl;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsAdded")
        private Boolean isAdded;

        @com.aliyun.core.annotation.NameInMap("ScheduleInfo")
        private ScheduleInfo scheduleInfo;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private Long sequence;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("TotalEpisode")
        private Integer totalEpisode;

        private DataList(Builder builder) {
            this.albumId = builder.albumId;
            this.categoryId = builder.categoryId;
            this.coverUrl = builder.coverUrl;
            this.id = builder.id;
            this.isAdded = builder.isAdded;
            this.scheduleInfo = builder.scheduleInfo;
            this.sequence = builder.sequence;
            this.title = builder.title;
            this.totalEpisode = builder.totalEpisode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return albumId
         */
        public String getAlbumId() {
            return this.albumId;
        }

        /**
         * @return categoryId
         */
        public Integer getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isAdded
         */
        public Boolean getIsAdded() {
            return this.isAdded;
        }

        /**
         * @return scheduleInfo
         */
        public ScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        /**
         * @return sequence
         */
        public Long getSequence() {
            return this.sequence;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return totalEpisode
         */
        public Integer getTotalEpisode() {
            return this.totalEpisode;
        }

        public static final class Builder {
            private String albumId; 
            private Integer categoryId; 
            private String coverUrl; 
            private Long id; 
            private Boolean isAdded; 
            private ScheduleInfo scheduleInfo; 
            private Long sequence; 
            private String title; 
            private Integer totalEpisode; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.albumId = model.albumId;
                this.categoryId = model.categoryId;
                this.coverUrl = model.coverUrl;
                this.id = model.id;
                this.isAdded = model.isAdded;
                this.scheduleInfo = model.scheduleInfo;
                this.sequence = model.sequence;
                this.title = model.title;
                this.totalEpisode = model.totalEpisode;
            } 

            /**
             * <p>Album ID</p>
             * 
             * <strong>example:</strong>
             * <p>4476001</p>
             */
            public Builder albumId(String albumId) {
                this.albumId = albumId;
                return this;
            }

            /**
             * <p>Album category ID</p>
             * 
             * <strong>example:</strong>
             * <p>80011</p>
             */
            public Builder categoryId(Integer categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>Album thumbnail</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ailabs.alibabausercontent.com/images/17825/jknoamc2.jpg">https://ailabs.alibabausercontent.com/images/17825/jknoamc2.jpg</a></p>
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * <p>Record ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Is subscribed</p>
             */
            public Builder isAdded(Boolean isAdded) {
                this.isAdded = isAdded;
                return this;
            }

            /**
             * <p>Schedule information</p>
             */
            public Builder scheduleInfo(ScheduleInfo scheduleInfo) {
                this.scheduleInfo = scheduleInfo;
                return this;
            }

            /**
             * <p>Sorting</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sequence(Long sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * <p>Album title</p>
             * 
             * <strong>example:</strong>
             * <p>睡前故事</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>Total number of episodes</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder totalEpisode(Integer totalEpisode) {
                this.totalEpisode = totalEpisode;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubAlbumResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubAlbumResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataList")
        private java.util.List<DataList> dataList;

        @com.aliyun.core.annotation.NameInMap("HasNext")
        private Boolean hasNext;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalPageCount")
        private Integer totalPageCount;

        private Result(Builder builder) {
            this.dataList = builder.dataList;
            this.hasNext = builder.hasNext;
            this.totalCount = builder.totalCount;
            this.totalPageCount = builder.totalPageCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return dataList
         */
        public java.util.List<DataList> getDataList() {
            return this.dataList;
        }

        /**
         * @return hasNext
         */
        public Boolean getHasNext() {
            return this.hasNext;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPageCount
         */
        public Integer getTotalPageCount() {
            return this.totalPageCount;
        }

        public static final class Builder {
            private java.util.List<DataList> dataList; 
            private Boolean hasNext; 
            private Integer totalCount; 
            private Integer totalPageCount; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.dataList = model.dataList;
                this.hasNext = model.hasNext;
                this.totalCount = model.totalCount;
                this.totalPageCount = model.totalPageCount;
            } 

            /**
             * <p>Album List</p>
             */
            public Builder dataList(java.util.List<DataList> dataList) {
                this.dataList = dataList;
                return this;
            }

            /**
             * <p>Indicates whether there is a next page.</p>
             */
            public Builder hasNext(Boolean hasNext) {
                this.hasNext = hasNext;
                return this;
            }

            /**
             * <p>total number of entries</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>Total number of pages</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalPageCount(Integer totalPageCount) {
                this.totalPageCount = totalPageCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
