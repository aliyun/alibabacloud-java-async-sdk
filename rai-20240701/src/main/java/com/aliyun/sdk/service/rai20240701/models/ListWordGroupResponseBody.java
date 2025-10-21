// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link ListWordGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListWordGroupResponseBody</p>
 */
public class ListWordGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("WordGroupInfoList")
    private java.util.List<WordGroupInfoList> wordGroupInfoList;

    private ListWordGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.wordGroupInfoList = builder.wordGroupInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWordGroupResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return wordGroupInfoList
     */
    public java.util.List<WordGroupInfoList> getWordGroupInfoList() {
        return this.wordGroupInfoList;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 
        private java.util.List<WordGroupInfoList> wordGroupInfoList; 

        private Builder() {
        } 

        private Builder(ListWordGroupResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
            this.wordGroupInfoList = model.wordGroupInfoList;
        } 

        /**
         * <p>Status code, 00000 indicates success; other values indicate failure.</p>
         * 
         * <strong>example:</strong>
         * <p>00000</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>If an error occurs, returns the error message.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Page size, the maximum number of results returned per page.
         * Maximum limit: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BE2558EC-A9EA-5276-ADB5-107B09CF3D11</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful: true means the call was successful; false means the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>List of keyword group objects.</p>
         */
        public Builder wordGroupInfoList(java.util.List<WordGroupInfoList> wordGroupInfoList) {
            this.wordGroupInfoList = wordGroupInfoList;
            return this;
        }

        public ListWordGroupResponseBody build() {
            return new ListWordGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWordGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListWordGroupResponseBody</p>
     */
    public static class PolicyInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private Long policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyIdentifier")
        private String policyIdentifier;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        private PolicyInfoList(Builder builder) {
            this.policyId = builder.policyId;
            this.policyIdentifier = builder.policyIdentifier;
            this.policyName = builder.policyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyInfoList create() {
            return builder().build();
        }

        /**
         * @return policyId
         */
        public Long getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyIdentifier
         */
        public String getPolicyIdentifier() {
            return this.policyIdentifier;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        public static final class Builder {
            private Long policyId; 
            private String policyIdentifier; 
            private String policyName; 

            private Builder() {
            } 

            private Builder(PolicyInfoList model) {
                this.policyId = model.policyId;
                this.policyIdentifier = model.policyIdentifier;
                this.policyName = model.policyName;
            } 

            /**
             * <p>Detection policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder policyId(Long policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>Policy identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>mai934jhuekf</p>
             */
            public Builder policyIdentifier(String policyIdentifier) {
                this.policyIdentifier = policyIdentifier;
                return this;
            }

            /**
             * <p>Detection policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>testPoliy</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            public PolicyInfoList build() {
                return new PolicyInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWordGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListWordGroupResponseBody</p>
     */
    public static class WordGroupInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("PolicyInfoList")
        private java.util.List<PolicyInfoList> policyInfoList;

        private WordGroupInfoList(Builder builder) {
            this.gmtModified = builder.gmtModified;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.policyInfoList = builder.policyInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WordGroupInfoList create() {
            return builder().build();
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return policyInfoList
         */
        public java.util.List<PolicyInfoList> getPolicyInfoList() {
            return this.policyInfoList;
        }

        public static final class Builder {
            private Long gmtModified; 
            private Long groupId; 
            private String groupName; 
            private java.util.List<PolicyInfoList> policyInfoList; 

            private Builder() {
            } 

            private Builder(WordGroupInfoList model) {
                this.gmtModified = model.gmtModified;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.policyInfoList = model.policyInfoList;
            } 

            /**
             * <p>Policy modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1673578650000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Keyword group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>Keyword group name.</p>
             * 
             * <strong>example:</strong>
             * <p>testGroup</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>List of associated policy objects.</p>
             */
            public Builder policyInfoList(java.util.List<PolicyInfoList> policyInfoList) {
                this.policyInfoList = policyInfoList;
                return this;
            }

            public WordGroupInfoList build() {
                return new WordGroupInfoList(this);
            } 

        } 

    }
}
