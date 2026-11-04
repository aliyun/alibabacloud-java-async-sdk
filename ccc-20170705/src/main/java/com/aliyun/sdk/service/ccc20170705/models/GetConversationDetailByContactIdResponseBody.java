// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link GetConversationDetailByContactIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetConversationDetailByContactIdResponseBody</p>
 */
public class GetConversationDetailByContactIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DataList")
    private DataList dataList;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetConversationDetailByContactIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.dataList = builder.dataList;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConversationDetailByContactIdResponseBody create() {
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
     * @return dataList
     */
    public DataList getDataList() {
        return this.dataList;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private DataList dataList; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetConversationDetailByContactIdResponseBody model) {
            this.code = model.code;
            this.dataList = model.dataList;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
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
         * DataList.
         */
        public Builder dataList(DataList dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetConversationDetailByContactIdResponseBody build() {
            return new GetConversationDetailByContactIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConversationDetailByContactIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetConversationDetailByContactIdResponseBody</p>
     */
    public static class QualityCheckPhrase extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Begin")
        private Long begin;

        @com.aliyun.core.annotation.NameInMap("End")
        private Long end;

        @com.aliyun.core.annotation.NameInMap("Identity")
        private String identity;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Words")
        private String words;

        private QualityCheckPhrase(Builder builder) {
            this.begin = builder.begin;
            this.end = builder.end;
            this.identity = builder.identity;
            this.role = builder.role;
            this.words = builder.words;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityCheckPhrase create() {
            return builder().build();
        }

        /**
         * @return begin
         */
        public Long getBegin() {
            return this.begin;
        }

        /**
         * @return end
         */
        public Long getEnd() {
            return this.end;
        }

        /**
         * @return identity
         */
        public String getIdentity() {
            return this.identity;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return words
         */
        public String getWords() {
            return this.words;
        }

        public static final class Builder {
            private Long begin; 
            private Long end; 
            private String identity; 
            private String role; 
            private String words; 

            private Builder() {
            } 

            private Builder(QualityCheckPhrase model) {
                this.begin = model.begin;
                this.end = model.end;
                this.identity = model.identity;
                this.role = model.role;
                this.words = model.words;
            } 

            /**
             * Begin.
             */
            public Builder begin(Long begin) {
                this.begin = begin;
                return this;
            }

            /**
             * End.
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * Identity.
             */
            public Builder identity(String identity) {
                this.identity = identity;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Words.
             */
            public Builder words(String words) {
                this.words = words;
                return this;
            }

            public QualityCheckPhrase build() {
                return new QualityCheckPhrase(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetConversationDetailByContactIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetConversationDetailByContactIdResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QualityCheckPhrase")
        private java.util.List<QualityCheckPhrase> qualityCheckPhrase;

        private List(Builder builder) {
            this.qualityCheckPhrase = builder.qualityCheckPhrase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return qualityCheckPhrase
         */
        public java.util.List<QualityCheckPhrase> getQualityCheckPhrase() {
            return this.qualityCheckPhrase;
        }

        public static final class Builder {
            private java.util.List<QualityCheckPhrase> qualityCheckPhrase; 

            private Builder() {
            } 

            private Builder(List model) {
                this.qualityCheckPhrase = model.qualityCheckPhrase;
            } 

            /**
             * QualityCheckPhrase.
             */
            public Builder qualityCheckPhrase(java.util.List<QualityCheckPhrase> qualityCheckPhrase) {
                this.qualityCheckPhrase = qualityCheckPhrase;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetConversationDetailByContactIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetConversationDetailByContactIdResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private List list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private DataList(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public List getList() {
            return this.list;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private List list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * List.
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

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
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
