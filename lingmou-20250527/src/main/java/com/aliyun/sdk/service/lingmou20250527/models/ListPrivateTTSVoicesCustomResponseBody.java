// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lingmou20250527.models;

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
 * {@link ListPrivateTTSVoicesCustomResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrivateTTSVoicesCustomResponseBody</p>
 */
public class ListPrivateTTSVoicesCustomResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListPrivateTTSVoicesCustomResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateTTSVoicesCustomResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Integer httpStatusCode; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListPrivateTTSVoicesCustomResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListPrivateTTSVoicesCustomResponseBody build() {
            return new ListPrivateTTSVoicesCustomResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrivateTTSVoicesCustomResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrivateTTSVoicesCustomResponseBody</p>
     */
    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("audioURL")
        private String audioURL;

        @com.aliyun.core.annotation.NameInMap("censorStatus")
        private String censorStatus;

        @com.aliyun.core.annotation.NameInMap("common")
        private Boolean common;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("errorDetail")
        private String errorDetail;

        @com.aliyun.core.annotation.NameInMap("gender")
        private String gender;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("modifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("remainSeconds")
        private Long remainSeconds;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("voiceKey")
        private String voiceKey;

        private DataData(Builder builder) {
            this.audioURL = builder.audioURL;
            this.censorStatus = builder.censorStatus;
            this.common = builder.common;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.errorDetail = builder.errorDetail;
            this.gender = builder.gender;
            this.id = builder.id;
            this.language = builder.language;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.remainSeconds = builder.remainSeconds;
            this.status = builder.status;
            this.text = builder.text;
            this.voiceKey = builder.voiceKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return audioURL
         */
        public String getAudioURL() {
            return this.audioURL;
        }

        /**
         * @return censorStatus
         */
        public String getCensorStatus() {
            return this.censorStatus;
        }

        /**
         * @return common
         */
        public Boolean getCommon() {
            return this.common;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return errorDetail
         */
        public String getErrorDetail() {
            return this.errorDetail;
        }

        /**
         * @return gender
         */
        public String getGender() {
            return this.gender;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return remainSeconds
         */
        public Long getRemainSeconds() {
            return this.remainSeconds;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return voiceKey
         */
        public String getVoiceKey() {
            return this.voiceKey;
        }

        public static final class Builder {
            private String audioURL; 
            private String censorStatus; 
            private Boolean common; 
            private String createTime; 
            private String description; 
            private String errorDetail; 
            private String gender; 
            private String id; 
            private String language; 
            private String modifiedTime; 
            private String name; 
            private Long remainSeconds; 
            private String status; 
            private String text; 
            private String voiceKey; 

            private Builder() {
            } 

            private Builder(DataData model) {
                this.audioURL = model.audioURL;
                this.censorStatus = model.censorStatus;
                this.common = model.common;
                this.createTime = model.createTime;
                this.description = model.description;
                this.errorDetail = model.errorDetail;
                this.gender = model.gender;
                this.id = model.id;
                this.language = model.language;
                this.modifiedTime = model.modifiedTime;
                this.name = model.name;
                this.remainSeconds = model.remainSeconds;
                this.status = model.status;
                this.text = model.text;
                this.voiceKey = model.voiceKey;
            } 

            /**
             * audioURL.
             */
            public Builder audioURL(String audioURL) {
                this.audioURL = audioURL;
                return this;
            }

            /**
             * censorStatus.
             */
            public Builder censorStatus(String censorStatus) {
                this.censorStatus = censorStatus;
                return this;
            }

            /**
             * common.
             */
            public Builder common(Boolean common) {
                this.common = common;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * errorDetail.
             */
            public Builder errorDetail(String errorDetail) {
                this.errorDetail = errorDetail;
                return this;
            }

            /**
             * gender.
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * modifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * remainSeconds.
             */
            public Builder remainSeconds(Long remainSeconds) {
                this.remainSeconds = remainSeconds;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * voiceKey.
             */
            public Builder voiceKey(String voiceKey) {
                this.voiceKey = voiceKey;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPrivateTTSVoicesCustomResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrivateTTSVoicesCustomResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<DataData> data;

        @com.aliyun.core.annotation.NameInMap("page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("pages")
        private Integer pages;

        @com.aliyun.core.annotation.NameInMap("size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("total")
        private Long total;

        private Data(Builder builder) {
            this.data = builder.data;
            this.page = builder.page;
            this.pages = builder.pages;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<DataData> getData() {
            return this.data;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pages
         */
        public Integer getPages() {
            return this.pages;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<DataData> data; 
            private Integer page; 
            private Integer pages; 
            private Integer size; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.data = model.data;
                this.page = model.page;
                this.pages = model.pages;
                this.size = model.size;
                this.total = model.total;
            } 

            /**
             * data.
             */
            public Builder data(java.util.List<DataData> data) {
                this.data = data;
                return this;
            }

            /**
             * page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * pages.
             */
            public Builder pages(Integer pages) {
                this.pages = pages;
                return this;
            }

            /**
             * size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
