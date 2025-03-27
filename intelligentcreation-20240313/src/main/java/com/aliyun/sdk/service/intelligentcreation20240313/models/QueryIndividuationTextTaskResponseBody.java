// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link QueryIndividuationTextTaskResponseBody} extends {@link TeaModel}
 *
 * <p>QueryIndividuationTextTaskResponseBody</p>
 */
public class QueryIndividuationTextTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("textList")
    private java.util.List<TextList> textList;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    private QueryIndividuationTextTaskResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.textList = builder.textList;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryIndividuationTextTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return textList
     */
    public java.util.List<TextList> getTextList() {
        return this.textList;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String createTime; 
        private String requestId; 
        private Integer status; 
        private java.util.List<TextList> textList; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(QueryIndividuationTextTaskResponseBody model) {
            this.createTime = model.createTime;
            this.requestId = model.requestId;
            this.status = model.status;
            this.textList = model.textList;
            this.updateTime = model.updateTime;
        } 

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>56AC346B-AF40-5E4F-AFFE-FD8BA5E6FB3A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * textList.
         */
        public Builder textList(java.util.List<TextList> textList) {
            this.textList = textList;
            return this;
        }

        /**
         * updateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public QueryIndividuationTextTaskResponseBody build() {
            return new QueryIndividuationTextTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryIndividuationTextTaskResponseBody} extends {@link TeaModel}
     *
     * <p>QueryIndividuationTextTaskResponseBody</p>
     */
    public static class TextList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("textId")
        private String textId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private TextList(Builder builder) {
            this.status = builder.status;
            this.textId = builder.textId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextList create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return textId
         */
        public String getTextId() {
            return this.textId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Integer status; 
            private String textId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(TextList model) {
                this.status = model.status;
                this.textId = model.textId;
                this.userId = model.userId;
            } 

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * textId.
             */
            public Builder textId(String textId) {
                this.textId = textId;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public TextList build() {
                return new TextList(this);
            } 

        } 

    }
}
