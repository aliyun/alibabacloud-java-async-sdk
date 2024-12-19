// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link ListItemActivitiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListItemActivitiesResponseBody</p>
 */
public class ListItemActivitiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LmItemActivityModelList")
    private LmItemActivityModelList lmItemActivityModelList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListItemActivitiesResponseBody(Builder builder) {
        this.code = builder.code;
        this.lmItemActivityModelList = builder.lmItemActivityModelList;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListItemActivitiesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return lmItemActivityModelList
     */
    public LmItemActivityModelList getLmItemActivityModelList() {
        return this.lmItemActivityModelList;
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
        private LmItemActivityModelList lmItemActivityModelList; 
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
         * LmItemActivityModelList.
         */
        public Builder lmItemActivityModelList(LmItemActivityModelList lmItemActivityModelList) {
            this.lmItemActivityModelList = lmItemActivityModelList;
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

        public ListItemActivitiesResponseBody build() {
            return new ListItemActivitiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListItemActivitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListItemActivitiesResponseBody</p>
     */
    public static class LmActivityPopModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("DisplayDate")
        private String displayDate;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("ExtInfo")
        private java.util.Map<String, ?> extInfo;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private String startDate;

        @com.aliyun.core.annotation.NameInMap("SubBizCode")
        private String subBizCode;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private LmActivityPopModel(Builder builder) {
            this.bizId = builder.bizId;
            this.displayDate = builder.displayDate;
            this.endDate = builder.endDate;
            this.extInfo = builder.extInfo;
            this.id = builder.id;
            this.startDate = builder.startDate;
            this.subBizCode = builder.subBizCode;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmActivityPopModel create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
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
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String bizId; 
            private String displayDate; 
            private String endDate; 
            private java.util.Map<String, ?> extInfo; 
            private Long id; 
            private String startDate; 
            private String subBizCode; 
            private String title; 

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
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
            public Builder extInfo(java.util.Map<String, ?> extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
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

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public LmActivityPopModel build() {
                return new LmActivityPopModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListItemActivitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListItemActivitiesResponseBody</p>
     */
    public static class LmItemActivityModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("LmActivityPopModel")
        private LmActivityPopModel lmActivityPopModel;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        private LmItemActivityModel(Builder builder) {
            this.itemId = builder.itemId;
            this.lmActivityPopModel = builder.lmActivityPopModel;
            this.lmItemId = builder.lmItemId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmItemActivityModel create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return lmActivityPopModel
         */
        public LmActivityPopModel getLmActivityPopModel() {
            return this.lmActivityPopModel;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        public static final class Builder {
            private Long itemId; 
            private LmActivityPopModel lmActivityPopModel; 
            private String lmItemId; 

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * LmActivityPopModel.
             */
            public Builder lmActivityPopModel(LmActivityPopModel lmActivityPopModel) {
                this.lmActivityPopModel = lmActivityPopModel;
                return this;
            }

            /**
             * LmItemId.
             */
            public Builder lmItemId(String lmItemId) {
                this.lmItemId = lmItemId;
                return this;
            }

            public LmItemActivityModel build() {
                return new LmItemActivityModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListItemActivitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListItemActivitiesResponseBody</p>
     */
    public static class LmItemActivityModelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LmItemActivityModel")
        private java.util.List<LmItemActivityModel> lmItemActivityModel;

        private LmItemActivityModelList(Builder builder) {
            this.lmItemActivityModel = builder.lmItemActivityModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmItemActivityModelList create() {
            return builder().build();
        }

        /**
         * @return lmItemActivityModel
         */
        public java.util.List<LmItemActivityModel> getLmItemActivityModel() {
            return this.lmItemActivityModel;
        }

        public static final class Builder {
            private java.util.List<LmItemActivityModel> lmItemActivityModel; 

            /**
             * LmItemActivityModel.
             */
            public Builder lmItemActivityModel(java.util.List<LmItemActivityModel> lmItemActivityModel) {
                this.lmItemActivityModel = lmItemActivityModel;
                return this;
            }

            public LmItemActivityModelList build() {
                return new LmItemActivityModelList(this);
            } 

        } 

    }
}
