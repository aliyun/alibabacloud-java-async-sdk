// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryChildDivisionCodeByIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryChildDivisionCodeByIdResponseBody</p>
 */
public class QueryChildDivisionCodeByIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LogsId")
    private String logsId;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private Model model;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubCode")
    private String subCode;

    @NameInMap("SubMessage")
    private String subMessage;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private QueryChildDivisionCodeByIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.model = builder.model;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryChildDivisionCodeByIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String logsId; 
        private String message; 
        private Model model; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryChildDivisionCodeByIdResponseBody build() {
            return new QueryChildDivisionCodeByIdResponseBody(this);
        } 

    } 

    public static class DivisionList extends TeaModel {
        @NameInMap("DivisionCode")
        private Long divisionCode;

        @NameInMap("DivisionLevel")
        private Long divisionLevel;

        @NameInMap("DivisionName")
        private String divisionName;

        @NameInMap("ParentId")
        private Long parentId;

        @NameInMap("Pinyin")
        private String pinyin;

        private DivisionList(Builder builder) {
            this.divisionCode = builder.divisionCode;
            this.divisionLevel = builder.divisionLevel;
            this.divisionName = builder.divisionName;
            this.parentId = builder.parentId;
            this.pinyin = builder.pinyin;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DivisionList create() {
            return builder().build();
        }

        /**
         * @return divisionCode
         */
        public Long getDivisionCode() {
            return this.divisionCode;
        }

        /**
         * @return divisionLevel
         */
        public Long getDivisionLevel() {
            return this.divisionLevel;
        }

        /**
         * @return divisionName
         */
        public String getDivisionName() {
            return this.divisionName;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        /**
         * @return pinyin
         */
        public String getPinyin() {
            return this.pinyin;
        }

        public static final class Builder {
            private Long divisionCode; 
            private Long divisionLevel; 
            private String divisionName; 
            private Long parentId; 
            private String pinyin; 

            /**
             * DivisionCode.
             */
            public Builder divisionCode(Long divisionCode) {
                this.divisionCode = divisionCode;
                return this;
            }

            /**
             * DivisionLevel.
             */
            public Builder divisionLevel(Long divisionLevel) {
                this.divisionLevel = divisionLevel;
                return this;
            }

            /**
             * DivisionName.
             */
            public Builder divisionName(String divisionName) {
                this.divisionName = divisionName;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * Pinyin.
             */
            public Builder pinyin(String pinyin) {
                this.pinyin = pinyin;
                return this;
            }

            public DivisionList build() {
                return new DivisionList(this);
            } 

        } 

    }
    public static class Model extends TeaModel {
        @NameInMap("DivisionList")
        private java.util.List < DivisionList> divisionList;

        private Model(Builder builder) {
            this.divisionList = builder.divisionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return divisionList
         */
        public java.util.List < DivisionList> getDivisionList() {
            return this.divisionList;
        }

        public static final class Builder {
            private java.util.List < DivisionList> divisionList; 

            /**
             * DivisionList.
             */
            public Builder divisionList(java.util.List < DivisionList> divisionList) {
                this.divisionList = divisionList;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
