// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListUserSayResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserSayResponseBody</p>
 */
public class ListUserSayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("UserSays")
    private java.util.List < UserSays> userSays;

    private ListUserSayResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.userSays = builder.userSays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserSayResponseBody create() {
        return builder().build();
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

    /**
     * @return userSays
     */
    public java.util.List < UserSays> getUserSays() {
        return this.userSays;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < UserSays> userSays; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * UserSays.
         */
        public Builder userSays(java.util.List < UserSays> userSays) {
            this.userSays = userSays;
            return this;
        }

        public ListUserSayResponseBody build() {
            return new ListUserSayResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserSayResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserSayResponseBody</p>
     */
    public static class SlotInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndIndex")
        private Integer endIndex;

        @com.aliyun.core.annotation.NameInMap("SlotId")
        private String slotId;

        @com.aliyun.core.annotation.NameInMap("StartIndex")
        private Integer startIndex;

        private SlotInfos(Builder builder) {
            this.endIndex = builder.endIndex;
            this.slotId = builder.slotId;
            this.startIndex = builder.startIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlotInfos create() {
            return builder().build();
        }

        /**
         * @return endIndex
         */
        public Integer getEndIndex() {
            return this.endIndex;
        }

        /**
         * @return slotId
         */
        public String getSlotId() {
            return this.slotId;
        }

        /**
         * @return startIndex
         */
        public Integer getStartIndex() {
            return this.startIndex;
        }

        public static final class Builder {
            private Integer endIndex; 
            private String slotId; 
            private Integer startIndex; 

            /**
             * EndIndex.
             */
            public Builder endIndex(Integer endIndex) {
                this.endIndex = endIndex;
                return this;
            }

            /**
             * SlotId.
             */
            public Builder slotId(String slotId) {
                this.slotId = slotId;
                return this;
            }

            /**
             * StartIndex.
             */
            public Builder startIndex(Integer startIndex) {
                this.startIndex = startIndex;
                return this;
            }

            public SlotInfos build() {
                return new SlotInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserSayResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserSayResponseBody</p>
     */
    public static class UserSays extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("IntentId")
        private Long intentId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("SlotInfos")
        private java.util.List < SlotInfos> slotInfos;

        @com.aliyun.core.annotation.NameInMap("UserSayId")
        private Long userSayId;

        private UserSays(Builder builder) {
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.intentId = builder.intentId;
            this.modifyTime = builder.modifyTime;
            this.slotInfos = builder.slotInfos;
            this.userSayId = builder.userSayId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserSays create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return intentId
         */
        public Long getIntentId() {
            return this.intentId;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return slotInfos
         */
        public java.util.List < SlotInfos> getSlotInfos() {
            return this.slotInfos;
        }

        /**
         * @return userSayId
         */
        public Long getUserSayId() {
            return this.userSayId;
        }

        public static final class Builder {
            private String content; 
            private String createTime; 
            private Long intentId; 
            private String modifyTime; 
            private java.util.List < SlotInfos> slotInfos; 
            private Long userSayId; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * IntentId.
             */
            public Builder intentId(Long intentId) {
                this.intentId = intentId;
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
             * SlotInfos.
             */
            public Builder slotInfos(java.util.List < SlotInfos> slotInfos) {
                this.slotInfos = slotInfos;
                return this;
            }

            /**
             * UserSayId.
             */
            public Builder userSayId(Long userSayId) {
                this.userSayId = userSayId;
                return this;
            }

            public UserSays build() {
                return new UserSays(this);
            } 

        } 

    }
}
