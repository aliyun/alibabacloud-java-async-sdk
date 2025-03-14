// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeImageEventOperationPageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageEventOperationPageResponseBody</p>
 */
public class DescribeImageEventOperationPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeImageEventOperationPageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageEventOperationPageResponseBody create() {
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeImageEventOperationPageResponseBody model) {
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
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A3D7C47D-3F11-57BB-90E8-E5C20C61****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeImageEventOperationPageResponseBody build() {
            return new DescribeImageEventOperationPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageEventOperationPageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageEventOperationPageResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Conditions")
        private String conditions;

        @com.aliyun.core.annotation.NameInMap("EventKey")
        private String eventKey;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Note")
        private String note;

        @com.aliyun.core.annotation.NameInMap("OperationCode")
        private String operationCode;

        @com.aliyun.core.annotation.NameInMap("Scenarios")
        private String scenarios;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        private List(Builder builder) {
            this.conditions = builder.conditions;
            this.eventKey = builder.eventKey;
            this.eventName = builder.eventName;
            this.eventType = builder.eventType;
            this.id = builder.id;
            this.note = builder.note;
            this.operationCode = builder.operationCode;
            this.scenarios = builder.scenarios;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public String getConditions() {
            return this.conditions;
        }

        /**
         * @return eventKey
         */
        public String getEventKey() {
            return this.eventKey;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return operationCode
         */
        public String getOperationCode() {
            return this.operationCode;
        }

        /**
         * @return scenarios
         */
        public String getScenarios() {
            return this.scenarios;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private String conditions; 
            private String eventKey; 
            private String eventName; 
            private String eventType; 
            private Long id; 
            private String note; 
            private String operationCode; 
            private String scenarios; 
            private String source; 

            private Builder() {
            } 

            private Builder(List model) {
                this.conditions = model.conditions;
                this.eventKey = model.eventKey;
                this.eventName = model.eventName;
                this.eventType = model.eventType;
                this.id = model.id;
                this.note = model.note;
                this.operationCode = model.operationCode;
                this.scenarios = model.scenarios;
                this.source = model.source;
            } 

            /**
             * <p>The rule conditions. The value is in the JSON format. Valid values of keys:</p>
             * <ul>
             * <li><strong>condition</strong>: the matching condition.</li>
             * <li><strong>type</strong>: the matching type.</li>
             * <li><strong>value</strong>: the matching value.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;condition&quot;: &quot;MD5&quot;, &quot;type&quot;: &quot;equals&quot;, &quot;value&quot;: &quot;0083a31cc0083a31ccf7c10367a6e783e&quot;}]</p>
             */
            public Builder conditions(String conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>The keyword of the alert item.</p>
             * 
             * <strong>example:</strong>
             * <p>PEM</p>
             */
            public Builder eventKey(String eventKey) {
                this.eventKey = eventKey;
                return this;
            }

            /**
             * <p>The name of the alert item.</p>
             * 
             * <strong>example:</strong>
             * <p>PEM</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The alert type.</p>
             * <ul>
             * <li>Only <strong>sensitiveFile</strong> may be returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sensitiveFile</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The primary key of the alert handling rule.</p>
             * 
             * <strong>example:</strong>
             * <p>2646624</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * <p>The operation code.</p>
             * <ul>
             * <li>Only <strong>whitelist</strong> may be returned, which means that the alert item is added to the whitelist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>whitelist</p>
             */
            public Builder operationCode(String operationCode) {
                this.operationCode = operationCode;
                return this;
            }

            /**
             * <p>The application scope of the rule. The value is in the JSON format. Valid values of keys:</p>
             * <ul>
             * <li><strong>type</strong></li>
             * <li><strong>value</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;: &quot;repo&quot;, &quot;value&quot;: &quot;test-aaa/shenzhen-repo-01&quot;}</p>
             */
            public Builder scenarios(String scenarios) {
                this.scenarios = scenarios;
                return this;
            }

            /**
             * <p>The source of the whitelist. Valid values:</p>
             * <ul>
             * <li><strong>image</strong>: image.</li>
             * <li><strong>agentless</strong>: agentless detection.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>agentless</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImageEventOperationPageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageEventOperationPageResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

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
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The page number.</p>
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
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>109</p>
             */
            public Builder totalCount(Integer totalCount) {
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
     * {@link DescribeImageEventOperationPageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageEventOperationPageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageInfo")
        private PageInfo pageInfo;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageInfo = builder.pageInfo;
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
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageInfo
         */
        public PageInfo getPageInfo() {
            return this.pageInfo;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private PageInfo pageInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageInfo = model.pageInfo;
            } 

            /**
             * <p>The alert handling rules.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The pagination information.</p>
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
