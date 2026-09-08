// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.notifications20241225.models;

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
 * {@link ReadMessageContentResponseBody} extends {@link TeaModel}
 *
 * <p>ReadMessageContentResponseBody</p>
 */
public class ReadMessageContentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ReadMessageContentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadMessageContentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ReadMessageContentResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned when the call fails. For more information, refer to error codes.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The execution result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned when the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>成功</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A5F62766-1C2F-1F56-A39D-63E3D30F0633</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: The call was successful.</li>
         * <li>false: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ReadMessageContentResponseBody build() {
            return new ReadMessageContentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ReadMessageContentResponseBody} extends {@link TeaModel}
     *
     * <p>ReadMessageContentResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("ClassId")
        private Long classId;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Integer deleted;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private Long gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtUpdate")
        private Long gmtUpdate;

        @com.aliyun.core.annotation.NameInMap("MassId")
        private Long massId;

        @com.aliyun.core.annotation.NameInMap("Memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("MsgId")
        private Long msgId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Item(Builder builder) {
            this.categoryName = builder.categoryName;
            this.classId = builder.classId;
            this.content = builder.content;
            this.deleted = builder.deleted;
            this.gmtCreated = builder.gmtCreated;
            this.gmtUpdate = builder.gmtUpdate;
            this.massId = builder.massId;
            this.memo = builder.memo;
            this.msgId = builder.msgId;
            this.status = builder.status;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return classId
         */
        public Long getClassId() {
            return this.classId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return deleted
         */
        public Integer getDeleted() {
            return this.deleted;
        }

        /**
         * @return gmtCreated
         */
        public Long getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtUpdate
         */
        public Long getGmtUpdate() {
            return this.gmtUpdate;
        }

        /**
         * @return massId
         */
        public Long getMassId() {
            return this.massId;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return msgId
         */
        public Long getMsgId() {
            return this.msgId;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String categoryName; 
            private Long classId; 
            private String content; 
            private Integer deleted; 
            private Long gmtCreated; 
            private Long gmtUpdate; 
            private Long massId; 
            private String memo; 
            private Long msgId; 
            private Long status; 
            private String title; 

            private Builder() {
            } 

            private Builder(Item model) {
                this.categoryName = model.categoryName;
                this.classId = model.classId;
                this.content = model.content;
                this.deleted = model.deleted;
                this.gmtCreated = model.gmtCreated;
                this.gmtUpdate = model.gmtUpdate;
                this.massId = model.massId;
                this.memo = model.memo;
                this.msgId = model.msgId;
                this.status = model.status;
                this.title = model.title;
            } 

            /**
             * <p>The message category name.</p>
             * 
             * <strong>example:</strong>
             * <p>活动消息</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The message class ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder classId(Long classId) {
                this.classId = classId;
                return this;
            }

            /**
             * <p>The message content.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;消息内容示例“</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The deletion flag.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder deleted(Integer deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * <p>The time when the message was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1729758903000</p>
             */
            public Builder gmtCreated(Long gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The time when the message was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1729758903000</p>
             */
            public Builder gmtUpdate(Long gmtUpdate) {
                this.gmtUpdate = gmtUpdate;
                return this;
            }

            /**
             * <p>A reserved field.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder massId(Long massId) {
                this.massId = massId;
                return this;
            }

            /**
             * <p>A reserved field.</p>
             * 
             * <strong>example:</strong>
             * <p>385ad715-4139-41f9-ba59-246a00bb46e0.jpg</p>
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * <p>The message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>AC14C11F1FF801EE00054518C220EF2C</p>
             */
            public Builder msgId(Long msgId) {
                this.msgId = msgId;
                return this;
            }

            /**
             * <p>The read status. Valid values:</p>
             * <ul>
             * <li>0: unread</li>
             * <li>1: read.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>not_installed</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The message title.</p>
             * 
             * <strong>example:</strong>
             * <p>Endless</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReadMessageContentResponseBody} extends {@link TeaModel}
     *
     * <p>ReadMessageContentResponseBody</p>
     */
    public static class LastItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("ClassId")
        private Long classId;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Integer deleted;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private Long gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtUpdate")
        private Long gmtUpdate;

        @com.aliyun.core.annotation.NameInMap("MassId")
        private Long massId;

        @com.aliyun.core.annotation.NameInMap("Memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("MsgId")
        private Long msgId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private LastItem(Builder builder) {
            this.categoryName = builder.categoryName;
            this.classId = builder.classId;
            this.content = builder.content;
            this.deleted = builder.deleted;
            this.gmtCreated = builder.gmtCreated;
            this.gmtUpdate = builder.gmtUpdate;
            this.massId = builder.massId;
            this.memo = builder.memo;
            this.msgId = builder.msgId;
            this.status = builder.status;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LastItem create() {
            return builder().build();
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return classId
         */
        public Long getClassId() {
            return this.classId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return deleted
         */
        public Integer getDeleted() {
            return this.deleted;
        }

        /**
         * @return gmtCreated
         */
        public Long getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtUpdate
         */
        public Long getGmtUpdate() {
            return this.gmtUpdate;
        }

        /**
         * @return massId
         */
        public Long getMassId() {
            return this.massId;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return msgId
         */
        public Long getMsgId() {
            return this.msgId;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String categoryName; 
            private Long classId; 
            private String content; 
            private Integer deleted; 
            private Long gmtCreated; 
            private Long gmtUpdate; 
            private Long massId; 
            private String memo; 
            private Long msgId; 
            private Long status; 
            private String title; 

            private Builder() {
            } 

            private Builder(LastItem model) {
                this.categoryName = model.categoryName;
                this.classId = model.classId;
                this.content = model.content;
                this.deleted = model.deleted;
                this.gmtCreated = model.gmtCreated;
                this.gmtUpdate = model.gmtUpdate;
                this.massId = model.massId;
                this.memo = model.memo;
                this.msgId = model.msgId;
                this.status = model.status;
                this.title = model.title;
            } 

            /**
             * <p>The message category name.</p>
             * 
             * <strong>example:</strong>
             * <p>活动消息</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The message class ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder classId(Long classId) {
                this.classId = classId;
                return this;
            }

            /**
             * <p>The message content.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;消息内容示例“</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The deletion flag.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder deleted(Integer deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * <p>The time when the message was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1729758903000</p>
             */
            public Builder gmtCreated(Long gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The time when the message was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1729758903000</p>
             */
            public Builder gmtUpdate(Long gmtUpdate) {
                this.gmtUpdate = gmtUpdate;
                return this;
            }

            /**
             * <p>A reserved field.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder massId(Long massId) {
                this.massId = massId;
                return this;
            }

            /**
             * <p>A reserved field.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * <p>The message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3727683838</p>
             */
            public Builder msgId(Long msgId) {
                this.msgId = msgId;
                return this;
            }

            /**
             * <p>The read status. Valid values:</p>
             * <ul>
             * <li>0: unread</li>
             * <li>1: read.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The message title.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;标题示例“</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public LastItem build() {
                return new LastItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReadMessageContentResponseBody} extends {@link TeaModel}
     *
     * <p>ReadMessageContentResponseBody</p>
     */
    public static class NextItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("ClassId")
        private Long classId;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Integer deleted;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private Long gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtUpdate")
        private Long gmtUpdate;

        @com.aliyun.core.annotation.NameInMap("MassId")
        private Long massId;

        @com.aliyun.core.annotation.NameInMap("Memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("MsgId")
        private Long msgId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private NextItem(Builder builder) {
            this.categoryName = builder.categoryName;
            this.classId = builder.classId;
            this.content = builder.content;
            this.deleted = builder.deleted;
            this.gmtCreated = builder.gmtCreated;
            this.gmtUpdate = builder.gmtUpdate;
            this.massId = builder.massId;
            this.memo = builder.memo;
            this.msgId = builder.msgId;
            this.status = builder.status;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextItem create() {
            return builder().build();
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return classId
         */
        public Long getClassId() {
            return this.classId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return deleted
         */
        public Integer getDeleted() {
            return this.deleted;
        }

        /**
         * @return gmtCreated
         */
        public Long getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtUpdate
         */
        public Long getGmtUpdate() {
            return this.gmtUpdate;
        }

        /**
         * @return massId
         */
        public Long getMassId() {
            return this.massId;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return msgId
         */
        public Long getMsgId() {
            return this.msgId;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String categoryName; 
            private Long classId; 
            private String content; 
            private Integer deleted; 
            private Long gmtCreated; 
            private Long gmtUpdate; 
            private Long massId; 
            private String memo; 
            private Long msgId; 
            private Long status; 
            private String title; 

            private Builder() {
            } 

            private Builder(NextItem model) {
                this.categoryName = model.categoryName;
                this.classId = model.classId;
                this.content = model.content;
                this.deleted = model.deleted;
                this.gmtCreated = model.gmtCreated;
                this.gmtUpdate = model.gmtUpdate;
                this.massId = model.massId;
                this.memo = model.memo;
                this.msgId = model.msgId;
                this.status = model.status;
                this.title = model.title;
            } 

            /**
             * <p>The message category name.</p>
             * 
             * <strong>example:</strong>
             * <p>活动消息</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The message class ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder classId(Long classId) {
                this.classId = classId;
                return this;
            }

            /**
             * <p>The message content.</p>
             * 
             * <strong>example:</strong>
             * <p>”消息内容示例“</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The deletion flag.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder deleted(Integer deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * <p>The time when the message was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1663809374000</p>
             */
            public Builder gmtCreated(Long gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The time when the message was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1663809374000</p>
             */
            public Builder gmtUpdate(Long gmtUpdate) {
                this.gmtUpdate = gmtUpdate;
                return this;
            }

            /**
             * <p>A reserved field.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder massId(Long massId) {
                this.massId = massId;
                return this;
            }

            /**
             * <p>A reserved field.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * <p>The message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3727683838</p>
             */
            public Builder msgId(Long msgId) {
                this.msgId = msgId;
                return this;
            }

            /**
             * <p>The read status. Valid values:</p>
             * <ul>
             * <li>0: unread</li>
             * <li>1: read.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The message title.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;标题示例“</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public NextItem build() {
                return new NextItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReadMessageContentResponseBody} extends {@link TeaModel}
     *
     * <p>ReadMessageContentResponseBody</p>
     */
    public static class Datas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List<Item> item;

        @com.aliyun.core.annotation.NameInMap("LastItem")
        private java.util.List<LastItem> lastItem;

        @com.aliyun.core.annotation.NameInMap("NextItem")
        private java.util.List<NextItem> nextItem;

        private Datas(Builder builder) {
            this.item = builder.item;
            this.lastItem = builder.lastItem;
            this.nextItem = builder.nextItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datas create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List<Item> getItem() {
            return this.item;
        }

        /**
         * @return lastItem
         */
        public java.util.List<LastItem> getLastItem() {
            return this.lastItem;
        }

        /**
         * @return nextItem
         */
        public java.util.List<NextItem> getNextItem() {
            return this.nextItem;
        }

        public static final class Builder {
            private java.util.List<Item> item; 
            private java.util.List<LastItem> lastItem; 
            private java.util.List<NextItem> nextItem; 

            private Builder() {
            } 

            private Builder(Datas model) {
                this.item = model.item;
                this.lastItem = model.lastItem;
                this.nextItem = model.nextItem;
            } 

            /**
             * <p>The data item.</p>
             */
            public Builder item(java.util.List<Item> item) {
                this.item = item;
                return this;
            }

            /**
             * <p>/</p>
             */
            public Builder lastItem(java.util.List<LastItem> lastItem) {
                this.lastItem = lastItem;
                return this;
            }

            /**
             * <p>/</p>
             */
            public Builder nextItem(java.util.List<NextItem> nextItem) {
                this.nextItem = nextItem;
                return this;
            }

            public Datas build() {
                return new Datas(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReadMessageContentResponseBody} extends {@link TeaModel}
     *
     * <p>ReadMessageContentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Datas")
        private Datas datas;

        private Data(Builder builder) {
            this.datas = builder.datas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return datas
         */
        public Datas getDatas() {
            return this.datas;
        }

        public static final class Builder {
            private Datas datas; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.datas = model.datas;
            } 

            /**
             * <p>The list of degradation rules.</p>
             */
            public Builder datas(Datas datas) {
                this.datas = datas;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
