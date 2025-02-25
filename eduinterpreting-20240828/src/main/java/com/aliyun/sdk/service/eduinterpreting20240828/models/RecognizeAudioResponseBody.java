// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eduinterpreting20240828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RecognizeAudioResponseBody} extends {@link TeaModel}
 *
 * <p>RecognizeAudioResponseBody</p>
 */
public class RecognizeAudioResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ItemList")
    private java.util.List < ItemList> itemList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private RecognizeAudioResponseBody(Builder builder) {
        this.itemList = builder.itemList;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeAudioResponseBody create() {
        return builder().build();
    }

    /**
     * @return itemList
     */
    public java.util.List < ItemList> getItemList() {
        return this.itemList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private java.util.List < ItemList> itemList; 
        private String requestId; 
        private String taskId; 

        /**
         * ItemList.
         */
        public Builder itemList(java.util.List < ItemList> itemList) {
            this.itemList = itemList;
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public RecognizeAudioResponseBody build() {
            return new RecognizeAudioResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RecognizeAudioResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeAudioResponseBody</p>
     */
    public static class ItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private ItemList(Builder builder) {
            this.beginTime = builder.beginTime;
            this.endTime = builder.endTime;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemList create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String beginTime; 
            private String endTime; 
            private String text; 

            /**
             * BeginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public ItemList build() {
                return new ItemList(this);
            } 

        } 

    }
}
