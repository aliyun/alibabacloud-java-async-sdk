// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConversationDetailByContactIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetConversationDetailByContactIdResponseBody</p>
 */
public class GetConversationDetailByContactIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DataList")
    private DataList dataList;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

    public static class QualityCheckPhrase extends TeaModel {
        @NameInMap("Begin")
        private Long begin;

        @NameInMap("End")
        private Long end;

        @NameInMap("Identity")
        private String identity;

        @NameInMap("Role")
        private String role;

        @NameInMap("Words")
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
    public static class List extends TeaModel {
        @NameInMap("QualityCheckPhrase")
        private java.util.List < QualityCheckPhrase> qualityCheckPhrase;

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
        public java.util.List < QualityCheckPhrase> getQualityCheckPhrase() {
            return this.qualityCheckPhrase;
        }

        public static final class Builder {
            private java.util.List < QualityCheckPhrase> qualityCheckPhrase; 

            /**
             * QualityCheckPhrase.
             */
            public Builder qualityCheckPhrase(java.util.List < QualityCheckPhrase> qualityCheckPhrase) {
                this.qualityCheckPhrase = qualityCheckPhrase;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class DataList extends TeaModel {
        @NameInMap("List")
        private List list;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
