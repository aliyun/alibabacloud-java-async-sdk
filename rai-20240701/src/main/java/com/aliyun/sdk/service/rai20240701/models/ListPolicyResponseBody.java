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
 * {@link ListPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ListPolicyResponseBody</p>
 */
public class ListPolicyResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("PolicyInfoList")
    private java.util.List<PolicyInfoList> policyInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListPolicyResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.policyInfoList = builder.policyInfoList;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicyResponseBody create() {
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
     * @return policyInfoList
     */
    public java.util.List<PolicyInfoList> getPolicyInfoList() {
        return this.policyInfoList;
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

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<PolicyInfoList> policyInfoList; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListPolicyResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.policyInfoList = model.policyInfoList;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
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
         * <p>HTTP status code description.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>If there is an error, returns the error message.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Page number, consistent with the PageNumber in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Page size, the maximum number of results returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>List of policy objects.</p>
         */
        public Builder policyInfoList(java.util.List<PolicyInfoList> policyInfoList) {
            this.policyInfoList = policyInfoList;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Possible values are:</p>
         * <ul>
         * <li>True: Call succeeded.</li>
         * <li>False: Call failed.</li>
         * </ul>
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

        public ListPolicyResponseBody build() {
            return new ListPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListPolicyResponseBody</p>
     */
    public static class PolicyInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("IsSidecarPolicy")
        private Integer isSidecarPolicy;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private Long policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyIdentifier")
        private String policyIdentifier;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("SceneType")
        private Integer sceneType;

        private PolicyInfoList(Builder builder) {
            this.gmtModified = builder.gmtModified;
            this.isSidecarPolicy = builder.isSidecarPolicy;
            this.policyId = builder.policyId;
            this.policyIdentifier = builder.policyIdentifier;
            this.policyName = builder.policyName;
            this.sceneType = builder.sceneType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyInfoList create() {
            return builder().build();
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return isSidecarPolicy
         */
        public Integer getIsSidecarPolicy() {
            return this.isSidecarPolicy;
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

        /**
         * @return sceneType
         */
        public Integer getSceneType() {
            return this.sceneType;
        }

        public static final class Builder {
            private Long gmtModified; 
            private Integer isSidecarPolicy; 
            private Long policyId; 
            private String policyIdentifier; 
            private String policyName; 
            private Integer sceneType; 

            private Builder() {
            } 

            private Builder(PolicyInfoList model) {
                this.gmtModified = model.gmtModified;
                this.isSidecarPolicy = model.isSidecarPolicy;
                this.policyId = model.policyId;
                this.policyIdentifier = model.policyIdentifier;
                this.policyName = model.policyName;
                this.sceneType = model.sceneType;
            } 

            /**
             * <p>Modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1731204769000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * IsSidecarPolicy.
             */
            public Builder isSidecarPolicy(Integer isSidecarPolicy) {
                this.isSidecarPolicy = isSidecarPolicy;
                return this;
            }

            /**
             * <p>Tag policy ID.</p>
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
             * <p>x1bc5xgs4uhx</p>
             */
            public Builder policyIdentifier(String policyIdentifier) {
                this.policyIdentifier = policyIdentifier;
                return this;
            }

            /**
             * <p>Permission policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>testPolicy</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * SceneType.
             */
            public Builder sceneType(Integer sceneType) {
                this.sceneType = sceneType;
                return this;
            }

            public PolicyInfoList build() {
                return new PolicyInfoList(this);
            } 

        } 

    }
}
