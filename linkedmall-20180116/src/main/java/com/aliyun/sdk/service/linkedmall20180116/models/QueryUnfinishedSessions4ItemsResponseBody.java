// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUnfinishedSessions4ItemsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUnfinishedSessions4ItemsResponseBody</p>
 */
public class QueryUnfinishedSessions4ItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LmItemActivitySessionModelListList")
    private LmItemActivitySessionModelListList lmItemActivitySessionModelListList;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryUnfinishedSessions4ItemsResponseBody(Builder builder) {
        this.code = builder.code;
        this.lmItemActivitySessionModelListList = builder.lmItemActivitySessionModelListList;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUnfinishedSessions4ItemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return lmItemActivitySessionModelListList
     */
    public LmItemActivitySessionModelListList getLmItemActivitySessionModelListList() {
        return this.lmItemActivitySessionModelListList;
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

    public static final class Builder {
        private String code; 
        private LmItemActivitySessionModelListList lmItemActivitySessionModelListList; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LmItemActivitySessionModelListList.
         */
        public Builder lmItemActivitySessionModelListList(LmItemActivitySessionModelListList lmItemActivitySessionModelListList) {
            this.lmItemActivitySessionModelListList = lmItemActivitySessionModelListList;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryUnfinishedSessions4ItemsResponseBody build() {
            return new QueryUnfinishedSessions4ItemsResponseBody(this);
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
    public static class LmItemActivitySessionModelList extends TeaModel {
        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("LmActivitySessionModels")
        private LmActivitySessionModels lmActivitySessionModels;

        @NameInMap("LmItemId")
        private String lmItemId;

        private LmItemActivitySessionModelList(Builder builder) {
            this.itemId = builder.itemId;
            this.lmActivitySessionModels = builder.lmActivitySessionModels;
            this.lmItemId = builder.lmItemId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmItemActivitySessionModelList create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return lmActivitySessionModels
         */
        public LmActivitySessionModels getLmActivitySessionModels() {
            return this.lmActivitySessionModels;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        public static final class Builder {
            private Long itemId; 
            private LmActivitySessionModels lmActivitySessionModels; 
            private String lmItemId; 

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
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
             * LmItemId.
             */
            public Builder lmItemId(String lmItemId) {
                this.lmItemId = lmItemId;
                return this;
            }

            public LmItemActivitySessionModelList build() {
                return new LmItemActivitySessionModelList(this);
            } 

        } 

    }
    public static class LmItemActivitySessionModelListList extends TeaModel {
        @NameInMap("LmItemActivitySessionModelList")
        private java.util.List < LmItemActivitySessionModelList> lmItemActivitySessionModelList;

        private LmItemActivitySessionModelListList(Builder builder) {
            this.lmItemActivitySessionModelList = builder.lmItemActivitySessionModelList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmItemActivitySessionModelListList create() {
            return builder().build();
        }

        /**
         * @return lmItemActivitySessionModelList
         */
        public java.util.List < LmItemActivitySessionModelList> getLmItemActivitySessionModelList() {
            return this.lmItemActivitySessionModelList;
        }

        public static final class Builder {
            private java.util.List < LmItemActivitySessionModelList> lmItemActivitySessionModelList; 

            /**
             * LmItemActivitySessionModelList.
             */
            public Builder lmItemActivitySessionModelList(java.util.List < LmItemActivitySessionModelList> lmItemActivitySessionModelList) {
                this.lmItemActivitySessionModelList = lmItemActivitySessionModelList;
                return this;
            }

            public LmItemActivitySessionModelListList build() {
                return new LmItemActivitySessionModelListList(this);
            } 

        } 

    }
}
