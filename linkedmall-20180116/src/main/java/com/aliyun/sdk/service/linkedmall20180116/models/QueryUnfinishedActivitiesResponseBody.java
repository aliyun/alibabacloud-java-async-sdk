// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUnfinishedActivitiesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUnfinishedActivitiesResponseBody</p>
 */
public class QueryUnfinishedActivitiesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LmActivityModelExtList")
    private LmActivityModelExtList lmActivityModelExtList;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private QueryUnfinishedActivitiesResponseBody(Builder builder) {
        this.code = builder.code;
        this.lmActivityModelExtList = builder.lmActivityModelExtList;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUnfinishedActivitiesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return lmActivityModelExtList
     */
    public LmActivityModelExtList getLmActivityModelExtList() {
        return this.lmActivityModelExtList;
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
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private LmActivityModelExtList lmActivityModelExtList; 
        private String message; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LmActivityModelExtList.
         */
        public Builder lmActivityModelExtList(LmActivityModelExtList lmActivityModelExtList) {
            this.lmActivityModelExtList = lmActivityModelExtList;
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
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryUnfinishedActivitiesResponseBody build() {
            return new QueryUnfinishedActivitiesResponseBody(this);
        } 

    } 

    public static class LmActivitySessionModel extends TeaModel {
        @NameInMap("BizId")
        private String bizId;

        @NameInMap("Description")
        private String description;

        @NameInMap("DisplayDate")
        private String displayDate;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("ExtInfo")
        private java.util.Map < String, ? > extInfo;

        @NameInMap("LmActivityId")
        private Long lmActivityId;

        @NameInMap("LmSessionId")
        private Long lmSessionId;

        @NameInMap("Name")
        private String name;

        @NameInMap("StartDate")
        private String startDate;

        @NameInMap("SubBizCode")
        private String subBizCode;

        private LmActivitySessionModel(Builder builder) {
            this.bizId = builder.bizId;
            this.description = builder.description;
            this.displayDate = builder.displayDate;
            this.endDate = builder.endDate;
            this.extInfo = builder.extInfo;
            this.lmActivityId = builder.lmActivityId;
            this.lmSessionId = builder.lmSessionId;
            this.name = builder.name;
            this.startDate = builder.startDate;
            this.subBizCode = builder.subBizCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmActivitySessionModel create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayDate
         */
        public String getDisplayDate() {
            return this.displayDate;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return extInfo
         */
        public java.util.Map < String, ? > getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return lmActivityId
         */
        public Long getLmActivityId() {
            return this.lmActivityId;
        }

        /**
         * @return lmSessionId
         */
        public Long getLmSessionId() {
            return this.lmSessionId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return subBizCode
         */
        public String getSubBizCode() {
            return this.subBizCode;
        }

        public static final class Builder {
            private String bizId; 
            private String description; 
            private String displayDate; 
            private String endDate; 
            private java.util.Map < String, ? > extInfo; 
            private Long lmActivityId; 
            private Long lmSessionId; 
            private String name; 
            private String startDate; 
            private String subBizCode; 

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayDate.
             */
            public Builder displayDate(String displayDate) {
                this.displayDate = displayDate;
                return this;
            }

            /**
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * ExtInfo.
             */
            public Builder extInfo(java.util.Map < String, ? > extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * LmActivityId.
             */
            public Builder lmActivityId(Long lmActivityId) {
                this.lmActivityId = lmActivityId;
                return this;
            }

            /**
             * LmSessionId.
             */
            public Builder lmSessionId(Long lmSessionId) {
                this.lmSessionId = lmSessionId;
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
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * SubBizCode.
             */
            public Builder subBizCode(String subBizCode) {
                this.subBizCode = subBizCode;
                return this;
            }

            public LmActivitySessionModel build() {
                return new LmActivitySessionModel(this);
            } 

        } 

    }
    public static class LmActivitySessionModels extends TeaModel {
        @NameInMap("LmActivitySessionModel")
        private java.util.List < LmActivitySessionModel> lmActivitySessionModel;

        private LmActivitySessionModels(Builder builder) {
            this.lmActivitySessionModel = builder.lmActivitySessionModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmActivitySessionModels create() {
            return builder().build();
        }

        /**
         * @return lmActivitySessionModel
         */
        public java.util.List < LmActivitySessionModel> getLmActivitySessionModel() {
            return this.lmActivitySessionModel;
        }

        public static final class Builder {
            private java.util.List < LmActivitySessionModel> lmActivitySessionModel; 

            /**
             * LmActivitySessionModel.
             */
            public Builder lmActivitySessionModel(java.util.List < LmActivitySessionModel> lmActivitySessionModel) {
                this.lmActivitySessionModel = lmActivitySessionModel;
                return this;
            }

            public LmActivitySessionModels build() {
                return new LmActivitySessionModels(this);
            } 

        } 

    }
    public static class LmActivityModelV2Ext extends TeaModel {
        @NameInMap("ActivityPicUrl")
        private String activityPicUrl;

        @NameInMap("BizId")
        private String bizId;

        @NameInMap("Description")
        private String description;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("LmActivityId")
        private Long lmActivityId;

        @NameInMap("LmActivitySessionModels")
        private LmActivitySessionModels lmActivitySessionModels;

        @NameInMap("Name")
        private String name;

        @NameInMap("StartDate")
        private String startDate;

        private LmActivityModelV2Ext(Builder builder) {
            this.activityPicUrl = builder.activityPicUrl;
            this.bizId = builder.bizId;
            this.description = builder.description;
            this.endDate = builder.endDate;
            this.lmActivityId = builder.lmActivityId;
            this.lmActivitySessionModels = builder.lmActivitySessionModels;
            this.name = builder.name;
            this.startDate = builder.startDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmActivityModelV2Ext create() {
            return builder().build();
        }

        /**
         * @return activityPicUrl
         */
        public String getActivityPicUrl() {
            return this.activityPicUrl;
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return lmActivityId
         */
        public Long getLmActivityId() {
            return this.lmActivityId;
        }

        /**
         * @return lmActivitySessionModels
         */
        public LmActivitySessionModels getLmActivitySessionModels() {
            return this.lmActivitySessionModels;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        public static final class Builder {
            private String activityPicUrl; 
            private String bizId; 
            private String description; 
            private String endDate; 
            private Long lmActivityId; 
            private LmActivitySessionModels lmActivitySessionModels; 
            private String name; 
            private String startDate; 

            /**
             * ActivityPicUrl.
             */
            public Builder activityPicUrl(String activityPicUrl) {
                this.activityPicUrl = activityPicUrl;
                return this;
            }

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * LmActivityId.
             */
            public Builder lmActivityId(Long lmActivityId) {
                this.lmActivityId = lmActivityId;
                return this;
            }

            /**
             * LmActivitySessionModels.
             */
            public Builder lmActivitySessionModels(LmActivitySessionModels lmActivitySessionModels) {
                this.lmActivitySessionModels = lmActivitySessionModels;
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
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            public LmActivityModelV2Ext build() {
                return new LmActivityModelV2Ext(this);
            } 

        } 

    }
    public static class LmActivityModelExtList extends TeaModel {
        @NameInMap("LmActivityModelV2Ext")
        private java.util.List < LmActivityModelV2Ext> lmActivityModelV2Ext;

        private LmActivityModelExtList(Builder builder) {
            this.lmActivityModelV2Ext = builder.lmActivityModelV2Ext;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmActivityModelExtList create() {
            return builder().build();
        }

        /**
         * @return lmActivityModelV2Ext
         */
        public java.util.List < LmActivityModelV2Ext> getLmActivityModelV2Ext() {
            return this.lmActivityModelV2Ext;
        }

        public static final class Builder {
            private java.util.List < LmActivityModelV2Ext> lmActivityModelV2Ext; 

            /**
             * LmActivityModelV2Ext.
             */
            public Builder lmActivityModelV2Ext(java.util.List < LmActivityModelV2Ext> lmActivityModelV2Ext) {
                this.lmActivityModelV2Ext = lmActivityModelV2Ext;
                return this;
            }

            public LmActivityModelExtList build() {
                return new LmActivityModelExtList(this);
            } 

        } 

    }
}
