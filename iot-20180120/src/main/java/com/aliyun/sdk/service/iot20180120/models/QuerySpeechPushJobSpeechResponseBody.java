// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QuerySpeechPushJobSpeechResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySpeechPushJobSpeechResponseBody</p>
 */
public class QuerySpeechPushJobSpeechResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QuerySpeechPushJobSpeechResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySpeechPushJobSpeechResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QuerySpeechPushJobSpeechResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QuerySpeechPushJobSpeechResponseBody build() {
            return new QuerySpeechPushJobSpeechResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySpeechPushJobSpeechResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySpeechPushJobSpeechResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Voice")
        private String voice;

        private Items(Builder builder) {
            this.bizCode = builder.bizCode;
            this.text = builder.text;
            this.voice = builder.voice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return voice
         */
        public String getVoice() {
            return this.voice;
        }

        public static final class Builder {
            private String bizCode; 
            private String text; 
            private String voice; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.bizCode = model.bizCode;
                this.text = model.text;
                this.voice = model.voice;
            } 

            /**
             * BizCode.
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Voice.
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySpeechPushJobSpeechResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySpeechPushJobSpeechResponseBody</p>
     */
    public static class SpeechList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        private SpeechList(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpeechList create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List<Items> items; 

            private Builder() {
            } 

            private Builder(SpeechList model) {
                this.items = model.items;
            } 

            /**
             * Items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            public SpeechList build() {
                return new SpeechList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySpeechPushJobSpeechResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySpeechPushJobSpeechResponseBody</p>
     */
    public static class ListItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        @com.aliyun.core.annotation.NameInMap("SpeechList")
        private SpeechList speechList;

        @com.aliyun.core.annotation.NameInMap("SpeechType")
        private String speechType;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Voice")
        private String voice;

        private ListItems(Builder builder) {
            this.bizCode = builder.bizCode;
            this.speechList = builder.speechList;
            this.speechType = builder.speechType;
            this.text = builder.text;
            this.voice = builder.voice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListItems create() {
            return builder().build();
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return speechList
         */
        public SpeechList getSpeechList() {
            return this.speechList;
        }

        /**
         * @return speechType
         */
        public String getSpeechType() {
            return this.speechType;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return voice
         */
        public String getVoice() {
            return this.voice;
        }

        public static final class Builder {
            private String bizCode; 
            private SpeechList speechList; 
            private String speechType; 
            private String text; 
            private String voice; 

            private Builder() {
            } 

            private Builder(ListItems model) {
                this.bizCode = model.bizCode;
                this.speechList = model.speechList;
                this.speechType = model.speechType;
                this.text = model.text;
                this.voice = model.voice;
            } 

            /**
             * BizCode.
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * SpeechList.
             */
            public Builder speechList(SpeechList speechList) {
                this.speechList = speechList;
                return this;
            }

            /**
             * SpeechType.
             */
            public Builder speechType(String speechType) {
                this.speechType = speechType;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Voice.
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            public ListItems build() {
                return new ListItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySpeechPushJobSpeechResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySpeechPushJobSpeechResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<ListItems> items;

        private List(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<ListItems> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List<ListItems> items; 

            private Builder() {
            } 

            private Builder(List model) {
                this.items = model.items;
            } 

            /**
             * Items.
             */
            public Builder items(java.util.List<ListItems> items) {
                this.items = items;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySpeechPushJobSpeechResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySpeechPushJobSpeechResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private List list;

        @com.aliyun.core.annotation.NameInMap("PageId")
        private Integer pageId;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageId = builder.pageId;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public List getList() {
            return this.list;
        }

        /**
         * @return pageId
         */
        public Integer getPageId() {
            return this.pageId;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private List list; 
            private Integer pageId; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageId = model.pageId;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * List.
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * PageId.
             */
            public Builder pageId(Integer pageId) {
                this.pageId = pageId;
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
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
