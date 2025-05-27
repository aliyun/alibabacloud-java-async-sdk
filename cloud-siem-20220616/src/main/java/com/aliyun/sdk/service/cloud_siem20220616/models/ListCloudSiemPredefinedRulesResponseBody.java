// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link ListCloudSiemPredefinedRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudSiemPredefinedRulesResponseBody</p>
 */
public class ListCloudSiemPredefinedRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCloudSiemPredefinedRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudSiemPredefinedRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListCloudSiemPredefinedRulesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCloudSiemPredefinedRulesResponseBody build() {
            return new ListCloudSiemPredefinedRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCloudSiemPredefinedRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudSiemPredefinedRulesResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
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
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCloudSiemPredefinedRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudSiemPredefinedRulesResponseBody</p>
     */
    public static class ResponseData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertType")
        private String alertType;

        @com.aliyun.core.annotation.NameInMap("AttCk")
        private String attCk;

        @com.aliyun.core.annotation.NameInMap("EventTransferType")
        private String eventTransferType;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("RuleDescMds")
        private String ruleDescMds;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleNameCn")
        private String ruleNameCn;

        @com.aliyun.core.annotation.NameInMap("RuleNameEn")
        private String ruleNameEn;

        @com.aliyun.core.annotation.NameInMap("RuleNameMds")
        private String ruleNameMds;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("ThreatLevel")
        private String threatLevel;

        private ResponseData(Builder builder) {
            this.alertType = builder.alertType;
            this.attCk = builder.attCk;
            this.eventTransferType = builder.eventTransferType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.ruleDescMds = builder.ruleDescMds;
            this.ruleName = builder.ruleName;
            this.ruleNameCn = builder.ruleNameCn;
            this.ruleNameEn = builder.ruleNameEn;
            this.ruleNameMds = builder.ruleNameMds;
            this.source = builder.source;
            this.status = builder.status;
            this.threatLevel = builder.threatLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseData create() {
            return builder().build();
        }

        /**
         * @return alertType
         */
        public String getAlertType() {
            return this.alertType;
        }

        /**
         * @return attCk
         */
        public String getAttCk() {
            return this.attCk;
        }

        /**
         * @return eventTransferType
         */
        public String getEventTransferType() {
            return this.eventTransferType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ruleDescMds
         */
        public String getRuleDescMds() {
            return this.ruleDescMds;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleNameCn
         */
        public String getRuleNameCn() {
            return this.ruleNameCn;
        }

        /**
         * @return ruleNameEn
         */
        public String getRuleNameEn() {
            return this.ruleNameEn;
        }

        /**
         * @return ruleNameMds
         */
        public String getRuleNameMds() {
            return this.ruleNameMds;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return threatLevel
         */
        public String getThreatLevel() {
            return this.threatLevel;
        }

        public static final class Builder {
            private String alertType; 
            private String attCk; 
            private String eventTransferType; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String ruleDescMds; 
            private String ruleName; 
            private String ruleNameCn; 
            private String ruleNameEn; 
            private String ruleNameMds; 
            private String source; 
            private Integer status; 
            private String threatLevel; 

            private Builder() {
            } 

            private Builder(ResponseData model) {
                this.alertType = model.alertType;
                this.attCk = model.attCk;
                this.eventTransferType = model.eventTransferType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.ruleDescMds = model.ruleDescMds;
                this.ruleName = model.ruleName;
                this.ruleNameCn = model.ruleNameCn;
                this.ruleNameEn = model.ruleNameEn;
                this.ruleNameMds = model.ruleNameMds;
                this.source = model.source;
                this.status = model.status;
                this.threatLevel = model.threatLevel;
            } 

            /**
             * <p>The type of the risk.</p>
             * 
             * <strong>example:</strong>
             * <p>WEBSHELL</p>
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * <p>The alert additional field for ATT&amp;CK.</p>
             * 
             * <strong>example:</strong>
             * <p>T1595.002 Vulnerability Scanning</p>
             */
            public Builder attCk(String attCk) {
                this.attCk = attCk;
                return this;
            }

            /**
             * <p>The method that is used to generate an event. Valid values:</p>
             * <ul>
             * <li>default: built-in method.</li>
             * <li>singleToSingle: The system generates an event for each alert.</li>
             * <li>allToSingle: The system generates an event for alerts within a period of time.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>allToSingle</p>
             */
            public Builder eventTransferType(String eventTransferType) {
                this.eventTransferType = eventTransferType;
                return this;
            }

            /**
             * <p>The time when the rule was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the rule was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the predefined rule.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The internal code of the rule description.</p>
             * 
             * <strong>example:</strong>
             * <p>${siem_rule_description_siem_cfw-attack-count-level-up_cfw-attack}</p>
             */
            public Builder ruleDescMds(String ruleDescMds) {
                this.ruleDescMds = ruleDescMds;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>siem_base64-command-exec_aegis-proc</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The rule name in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>siem_base64-command-exec_aegis-proc</p>
             */
            public Builder ruleNameCn(String ruleNameCn) {
                this.ruleNameCn = ruleNameCn;
                return this;
            }

            /**
             * <p>The rule name in English.</p>
             * 
             * <strong>example:</strong>
             * <p>siem_base64-command-exec_aegis-proc</p>
             */
            public Builder ruleNameEn(String ruleNameEn) {
                this.ruleNameEn = ruleNameEn;
                return this;
            }

            /**
             * <p>The internal code of the rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>${siem_rule_name_siem_cfw-attack-count-level-up_cfw-attack}</p>
             */
            public Builder ruleNameMds(String ruleNameMds) {
                this.ruleNameMds = ruleNameMds;
                return this;
            }

            /**
             * <p>The log source of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_siem_aegis_proc</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The status of the predefined rule. Valid values:</p>
             * <ul>
             * <li>0: The rule is in the initial state.</li>
             * <li>100: The rule takes effect.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li>serious: high.</li>
             * <li>suspicious: medium.</li>
             * <li>remind: low.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>remind</p>
             */
            public Builder threatLevel(String threatLevel) {
                this.threatLevel = threatLevel;
                return this;
            }

            public ResponseData build() {
                return new ResponseData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCloudSiemPredefinedRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudSiemPredefinedRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageInfo")
        private PageInfo pageInfo;

        @com.aliyun.core.annotation.NameInMap("ResponseData")
        private java.util.List<ResponseData> responseData;

        private Data(Builder builder) {
            this.pageInfo = builder.pageInfo;
            this.responseData = builder.responseData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageInfo
         */
        public PageInfo getPageInfo() {
            return this.pageInfo;
        }

        /**
         * @return responseData
         */
        public java.util.List<ResponseData> getResponseData() {
            return this.responseData;
        }

        public static final class Builder {
            private PageInfo pageInfo; 
            private java.util.List<ResponseData> responseData; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageInfo = model.pageInfo;
                this.responseData = model.responseData;
            } 

            /**
             * <p>The pagination information.</p>
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            /**
             * <p>The detailed data.</p>
             */
            public Builder responseData(java.util.List<ResponseData> responseData) {
                this.responseData = responseData;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
