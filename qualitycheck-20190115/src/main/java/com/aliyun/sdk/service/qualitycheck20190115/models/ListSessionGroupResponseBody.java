// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link ListSessionGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListSessionGroupResponseBody</p>
 */
public class ListSessionGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("LastDataId")
    private String lastDataId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Messages")
    private Messages messages;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCountId")
    private String resultCountId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListSessionGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.lastDataId = builder.lastDataId;
        this.message = builder.message;
        this.messages = builder.messages;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resultCountId = builder.resultCountId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSessionGroupResponseBody create() {
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
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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
     * @return lastDataId
     */
    public String getLastDataId() {
        return this.lastDataId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return messages
     */
    public Messages getMessages() {
        return this.messages;
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
     * @return resultCountId
     */
    public String getResultCountId() {
        return this.resultCountId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer count; 
        private Integer currentPage; 
        private Data data; 
        private Integer httpStatusCode; 
        private String lastDataId; 
        private String message; 
        private Messages messages; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private String resultCountId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListSessionGroupResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.lastDataId = model.lastDataId;
            this.message = model.message;
            this.messages = model.messages;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.resultCountId = model.resultCountId;
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
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * LastDataId.
         */
        public Builder lastDataId(String lastDataId) {
            this.lastDataId = lastDataId;
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
         * Messages.
         */
        public Builder messages(Messages messages) {
            this.messages = messages;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultCountId.
         */
        public Builder resultCountId(String resultCountId) {
            this.resultCountId = resultCountId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListSessionGroupResponseBody build() {
            return new ListSessionGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSessionGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListSessionGroupResponseBody</p>
     */
    public static class CallerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallerList")
        private java.util.List<String> callerList;

        private CallerList(Builder builder) {
            this.callerList = builder.callerList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallerList create() {
            return builder().build();
        }

        /**
         * @return callerList
         */
        public java.util.List<String> getCallerList() {
            return this.callerList;
        }

        public static final class Builder {
            private java.util.List<String> callerList; 

            private Builder() {
            } 

            private Builder(CallerList model) {
                this.callerList = model.callerList;
            } 

            /**
             * CallerList.
             */
            public Builder callerList(java.util.List<String> callerList) {
                this.callerList = callerList;
                return this;
            }

            public CallerList build() {
                return new CallerList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSessionGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListSessionGroupResponseBody</p>
     */
    public static class CustomerIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerIdList")
        private java.util.List<String> customerIdList;

        private CustomerIdList(Builder builder) {
            this.customerIdList = builder.customerIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerIdList create() {
            return builder().build();
        }

        /**
         * @return customerIdList
         */
        public java.util.List<String> getCustomerIdList() {
            return this.customerIdList;
        }

        public static final class Builder {
            private java.util.List<String> customerIdList; 

            private Builder() {
            } 

            private Builder(CustomerIdList model) {
                this.customerIdList = model.customerIdList;
            } 

            /**
             * CustomerIdList.
             */
            public Builder customerIdList(java.util.List<String> customerIdList) {
                this.customerIdList = customerIdList;
                return this;
            }

            public CustomerIdList build() {
                return new CustomerIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSessionGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListSessionGroupResponseBody</p>
     */
    public static class CustomerNameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerNameList")
        private java.util.List<String> customerNameList;

        private CustomerNameList(Builder builder) {
            this.customerNameList = builder.customerNameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerNameList create() {
            return builder().build();
        }

        /**
         * @return customerNameList
         */
        public java.util.List<String> getCustomerNameList() {
            return this.customerNameList;
        }

        public static final class Builder {
            private java.util.List<String> customerNameList; 

            private Builder() {
            } 

            private Builder(CustomerNameList model) {
                this.customerNameList = model.customerNameList;
            } 

            /**
             * CustomerNameList.
             */
            public Builder customerNameList(java.util.List<String> customerNameList) {
                this.customerNameList = customerNameList;
                return this;
            }

            public CustomerNameList build() {
                return new CustomerNameList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSessionGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListSessionGroupResponseBody</p>
     */
    public static class CustomerServiceIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerServiceIdList")
        private java.util.List<String> customerServiceIdList;

        private CustomerServiceIdList(Builder builder) {
            this.customerServiceIdList = builder.customerServiceIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerServiceIdList create() {
            return builder().build();
        }

        /**
         * @return customerServiceIdList
         */
        public java.util.List<String> getCustomerServiceIdList() {
            return this.customerServiceIdList;
        }

        public static final class Builder {
            private java.util.List<String> customerServiceIdList; 

            private Builder() {
            } 

            private Builder(CustomerServiceIdList model) {
                this.customerServiceIdList = model.customerServiceIdList;
            } 

            /**
             * CustomerServiceIdList.
             */
            public Builder customerServiceIdList(java.util.List<String> customerServiceIdList) {
                this.customerServiceIdList = customerServiceIdList;
                return this;
            }

            public CustomerServiceIdList build() {
                return new CustomerServiceIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSessionGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListSessionGroupResponseBody</p>
     */
    public static class CustomerServiceNameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerServiceNameList")
        private java.util.List<String> customerServiceNameList;

        private CustomerServiceNameList(Builder builder) {
            this.customerServiceNameList = builder.customerServiceNameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerServiceNameList create() {
            return builder().build();
        }

        /**
         * @return customerServiceNameList
         */
        public java.util.List<String> getCustomerServiceNameList() {
            return this.customerServiceNameList;
        }

        public static final class Builder {
            private java.util.List<String> customerServiceNameList; 

            private Builder() {
            } 

            private Builder(CustomerServiceNameList model) {
                this.customerServiceNameList = model.customerServiceNameList;
            } 

            /**
             * CustomerServiceNameList.
             */
            public Builder customerServiceNameList(java.util.List<String> customerServiceNameList) {
                this.customerServiceNameList = customerServiceNameList;
                return this;
            }

            public CustomerServiceNameList build() {
                return new CustomerServiceNameList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSessionGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListSessionGroupResponseBody</p>
     */
    public static class ReviewerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReviewerList")
        private java.util.List<String> reviewerList;

        private ReviewerList(Builder builder) {
            this.reviewerList = builder.reviewerList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReviewerList create() {
            return builder().build();
        }

        /**
         * @return reviewerList
         */
        public java.util.List<String> getReviewerList() {
            return this.reviewerList;
        }

        public static final class Builder {
            private java.util.List<String> reviewerList; 

            private Builder() {
            } 

            private Builder(ReviewerList model) {
                this.reviewerList = model.reviewerList;
            } 

            /**
             * ReviewerList.
             */
            public Builder reviewerList(java.util.List<String> reviewerList) {
                this.reviewerList = reviewerList;
                return this;
            }

            public ReviewerList build() {
                return new ReviewerList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSessionGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListSessionGroupResponseBody</p>
     */
    public static class SkillGroupNameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SkillGroupNameList")
        private java.util.List<String> skillGroupNameList;

        private SkillGroupNameList(Builder builder) {
            this.skillGroupNameList = builder.skillGroupNameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillGroupNameList create() {
            return builder().build();
        }

        /**
         * @return skillGroupNameList
         */
        public java.util.List<String> getSkillGroupNameList() {
            return this.skillGroupNameList;
        }

        public static final class Builder {
            private java.util.List<String> skillGroupNameList; 

            private Builder() {
            } 

            private Builder(SkillGroupNameList model) {
                this.skillGroupNameList = model.skillGroupNameList;
            } 

            /**
             * SkillGroupNameList.
             */
            public Builder skillGroupNameList(java.util.List<String> skillGroupNameList) {
                this.skillGroupNameList = skillGroupNameList;
                return this;
            }

            public SkillGroupNameList build() {
                return new SkillGroupNameList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSessionGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListSessionGroupResponseBody</p>
     */
    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssignStatus")
        private Integer assignStatus;

        @com.aliyun.core.annotation.NameInMap("CallStartTime")
        private String callStartTime;

        @com.aliyun.core.annotation.NameInMap("CallerList")
        private CallerList callerList;

        @com.aliyun.core.annotation.NameInMap("CustomerIdList")
        private CustomerIdList customerIdList;

        @com.aliyun.core.annotation.NameInMap("CustomerNameList")
        private CustomerNameList customerNameList;

        @com.aliyun.core.annotation.NameInMap("CustomerServiceIdList")
        private CustomerServiceIdList customerServiceIdList;

        @com.aliyun.core.annotation.NameInMap("CustomerServiceNameList")
        private CustomerServiceNameList customerServiceNameList;

        @com.aliyun.core.annotation.NameInMap("HitSessionCount")
        private Integer hitSessionCount;

        @com.aliyun.core.annotation.NameInMap("LastDataId")
        private String lastDataId;

        @com.aliyun.core.annotation.NameInMap("ReviewStatus")
        private Integer reviewStatus;

        @com.aliyun.core.annotation.NameInMap("ReviewerList")
        private ReviewerList reviewerList;

        @com.aliyun.core.annotation.NameInMap("SchemeTaskConfigId")
        private Long schemeTaskConfigId;

        @com.aliyun.core.annotation.NameInMap("SchemeTaskConfigName")
        private String schemeTaskConfigName;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Long score;

        @com.aliyun.core.annotation.NameInMap("SessionCount")
        private Integer sessionCount;

        @com.aliyun.core.annotation.NameInMap("SessionGroupId")
        private String sessionGroupId;

        @com.aliyun.core.annotation.NameInMap("SessionGroupReviewedOrComplained")
        private Boolean sessionGroupReviewedOrComplained;

        @com.aliyun.core.annotation.NameInMap("SkillGroupNameList")
        private SkillGroupNameList skillGroupNameList;

        private DataData(Builder builder) {
            this.assignStatus = builder.assignStatus;
            this.callStartTime = builder.callStartTime;
            this.callerList = builder.callerList;
            this.customerIdList = builder.customerIdList;
            this.customerNameList = builder.customerNameList;
            this.customerServiceIdList = builder.customerServiceIdList;
            this.customerServiceNameList = builder.customerServiceNameList;
            this.hitSessionCount = builder.hitSessionCount;
            this.lastDataId = builder.lastDataId;
            this.reviewStatus = builder.reviewStatus;
            this.reviewerList = builder.reviewerList;
            this.schemeTaskConfigId = builder.schemeTaskConfigId;
            this.schemeTaskConfigName = builder.schemeTaskConfigName;
            this.score = builder.score;
            this.sessionCount = builder.sessionCount;
            this.sessionGroupId = builder.sessionGroupId;
            this.sessionGroupReviewedOrComplained = builder.sessionGroupReviewedOrComplained;
            this.skillGroupNameList = builder.skillGroupNameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return assignStatus
         */
        public Integer getAssignStatus() {
            return this.assignStatus;
        }

        /**
         * @return callStartTime
         */
        public String getCallStartTime() {
            return this.callStartTime;
        }

        /**
         * @return callerList
         */
        public CallerList getCallerList() {
            return this.callerList;
        }

        /**
         * @return customerIdList
         */
        public CustomerIdList getCustomerIdList() {
            return this.customerIdList;
        }

        /**
         * @return customerNameList
         */
        public CustomerNameList getCustomerNameList() {
            return this.customerNameList;
        }

        /**
         * @return customerServiceIdList
         */
        public CustomerServiceIdList getCustomerServiceIdList() {
            return this.customerServiceIdList;
        }

        /**
         * @return customerServiceNameList
         */
        public CustomerServiceNameList getCustomerServiceNameList() {
            return this.customerServiceNameList;
        }

        /**
         * @return hitSessionCount
         */
        public Integer getHitSessionCount() {
            return this.hitSessionCount;
        }

        /**
         * @return lastDataId
         */
        public String getLastDataId() {
            return this.lastDataId;
        }

        /**
         * @return reviewStatus
         */
        public Integer getReviewStatus() {
            return this.reviewStatus;
        }

        /**
         * @return reviewerList
         */
        public ReviewerList getReviewerList() {
            return this.reviewerList;
        }

        /**
         * @return schemeTaskConfigId
         */
        public Long getSchemeTaskConfigId() {
            return this.schemeTaskConfigId;
        }

        /**
         * @return schemeTaskConfigName
         */
        public String getSchemeTaskConfigName() {
            return this.schemeTaskConfigName;
        }

        /**
         * @return score
         */
        public Long getScore() {
            return this.score;
        }

        /**
         * @return sessionCount
         */
        public Integer getSessionCount() {
            return this.sessionCount;
        }

        /**
         * @return sessionGroupId
         */
        public String getSessionGroupId() {
            return this.sessionGroupId;
        }

        /**
         * @return sessionGroupReviewedOrComplained
         */
        public Boolean getSessionGroupReviewedOrComplained() {
            return this.sessionGroupReviewedOrComplained;
        }

        /**
         * @return skillGroupNameList
         */
        public SkillGroupNameList getSkillGroupNameList() {
            return this.skillGroupNameList;
        }

        public static final class Builder {
            private Integer assignStatus; 
            private String callStartTime; 
            private CallerList callerList; 
            private CustomerIdList customerIdList; 
            private CustomerNameList customerNameList; 
            private CustomerServiceIdList customerServiceIdList; 
            private CustomerServiceNameList customerServiceNameList; 
            private Integer hitSessionCount; 
            private String lastDataId; 
            private Integer reviewStatus; 
            private ReviewerList reviewerList; 
            private Long schemeTaskConfigId; 
            private String schemeTaskConfigName; 
            private Long score; 
            private Integer sessionCount; 
            private String sessionGroupId; 
            private Boolean sessionGroupReviewedOrComplained; 
            private SkillGroupNameList skillGroupNameList; 

            private Builder() {
            } 

            private Builder(DataData model) {
                this.assignStatus = model.assignStatus;
                this.callStartTime = model.callStartTime;
                this.callerList = model.callerList;
                this.customerIdList = model.customerIdList;
                this.customerNameList = model.customerNameList;
                this.customerServiceIdList = model.customerServiceIdList;
                this.customerServiceNameList = model.customerServiceNameList;
                this.hitSessionCount = model.hitSessionCount;
                this.lastDataId = model.lastDataId;
                this.reviewStatus = model.reviewStatus;
                this.reviewerList = model.reviewerList;
                this.schemeTaskConfigId = model.schemeTaskConfigId;
                this.schemeTaskConfigName = model.schemeTaskConfigName;
                this.score = model.score;
                this.sessionCount = model.sessionCount;
                this.sessionGroupId = model.sessionGroupId;
                this.sessionGroupReviewedOrComplained = model.sessionGroupReviewedOrComplained;
                this.skillGroupNameList = model.skillGroupNameList;
            } 

            /**
             * AssignStatus.
             */
            public Builder assignStatus(Integer assignStatus) {
                this.assignStatus = assignStatus;
                return this;
            }

            /**
             * CallStartTime.
             */
            public Builder callStartTime(String callStartTime) {
                this.callStartTime = callStartTime;
                return this;
            }

            /**
             * CallerList.
             */
            public Builder callerList(CallerList callerList) {
                this.callerList = callerList;
                return this;
            }

            /**
             * CustomerIdList.
             */
            public Builder customerIdList(CustomerIdList customerIdList) {
                this.customerIdList = customerIdList;
                return this;
            }

            /**
             * CustomerNameList.
             */
            public Builder customerNameList(CustomerNameList customerNameList) {
                this.customerNameList = customerNameList;
                return this;
            }

            /**
             * CustomerServiceIdList.
             */
            public Builder customerServiceIdList(CustomerServiceIdList customerServiceIdList) {
                this.customerServiceIdList = customerServiceIdList;
                return this;
            }

            /**
             * CustomerServiceNameList.
             */
            public Builder customerServiceNameList(CustomerServiceNameList customerServiceNameList) {
                this.customerServiceNameList = customerServiceNameList;
                return this;
            }

            /**
             * HitSessionCount.
             */
            public Builder hitSessionCount(Integer hitSessionCount) {
                this.hitSessionCount = hitSessionCount;
                return this;
            }

            /**
             * LastDataId.
             */
            public Builder lastDataId(String lastDataId) {
                this.lastDataId = lastDataId;
                return this;
            }

            /**
             * ReviewStatus.
             */
            public Builder reviewStatus(Integer reviewStatus) {
                this.reviewStatus = reviewStatus;
                return this;
            }

            /**
             * ReviewerList.
             */
            public Builder reviewerList(ReviewerList reviewerList) {
                this.reviewerList = reviewerList;
                return this;
            }

            /**
             * SchemeTaskConfigId.
             */
            public Builder schemeTaskConfigId(Long schemeTaskConfigId) {
                this.schemeTaskConfigId = schemeTaskConfigId;
                return this;
            }

            /**
             * SchemeTaskConfigName.
             */
            public Builder schemeTaskConfigName(String schemeTaskConfigName) {
                this.schemeTaskConfigName = schemeTaskConfigName;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Long score) {
                this.score = score;
                return this;
            }

            /**
             * SessionCount.
             */
            public Builder sessionCount(Integer sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * SessionGroupId.
             */
            public Builder sessionGroupId(String sessionGroupId) {
                this.sessionGroupId = sessionGroupId;
                return this;
            }

            /**
             * SessionGroupReviewedOrComplained.
             */
            public Builder sessionGroupReviewedOrComplained(Boolean sessionGroupReviewedOrComplained) {
                this.sessionGroupReviewedOrComplained = sessionGroupReviewedOrComplained;
                return this;
            }

            /**
             * SkillGroupNameList.
             */
            public Builder skillGroupNameList(SkillGroupNameList skillGroupNameList) {
                this.skillGroupNameList = skillGroupNameList;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSessionGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListSessionGroupResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<DataData> data;

        private Data(Builder builder) {
            this.data = builder.data;
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

        public static final class Builder {
            private java.util.List<DataData> data; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.data = model.data;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<DataData> data) {
                this.data = data;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSessionGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListSessionGroupResponseBody</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private java.util.List<String> message;

        private Messages(Builder builder) {
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public java.util.List<String> getMessage() {
            return this.message;
        }

        public static final class Builder {
            private java.util.List<String> message; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.message = model.message;
            } 

            /**
             * Message.
             */
            public Builder message(java.util.List<String> message) {
                this.message = message;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
