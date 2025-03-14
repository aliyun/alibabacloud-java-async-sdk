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
 * {@link ListHoneypotResponseBody} extends {@link TeaModel}
 *
 * <p>ListHoneypotResponseBody</p>
 */
public class ListHoneypotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListHoneypotResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.list = builder.list;
        this.message = builder.message;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHoneypotResponseBody create() {
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
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
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
        private Integer httpStatusCode; 
        private java.util.List<List> list; 
        private String message; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListHoneypotResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.list = model.list;
            this.message = model.message;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>An array that consists of the information about the honeypots.</p>
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>C80AFF1F-CC20-502C-A4D4-F5433E529B69</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListHoneypotResponseBody build() {
            return new ListHoneypotResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHoneypotResponseBody} extends {@link TeaModel}
     *
     * <p>ListHoneypotResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ControlNodeName")
        private String controlNodeName;

        @com.aliyun.core.annotation.NameInMap("HoneypotId")
        private String honeypotId;

        @com.aliyun.core.annotation.NameInMap("HoneypotImageDisplayName")
        private String honeypotImageDisplayName;

        @com.aliyun.core.annotation.NameInMap("HoneypotImageId")
        private String honeypotImageId;

        @com.aliyun.core.annotation.NameInMap("HoneypotImageName")
        private String honeypotImageName;

        @com.aliyun.core.annotation.NameInMap("HoneypotName")
        private String honeypotName;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("PresetId")
        private String presetId;

        @com.aliyun.core.annotation.NameInMap("State")
        private java.util.List<String> state;

        private List(Builder builder) {
            this.controlNodeName = builder.controlNodeName;
            this.honeypotId = builder.honeypotId;
            this.honeypotImageDisplayName = builder.honeypotImageDisplayName;
            this.honeypotImageId = builder.honeypotImageId;
            this.honeypotImageName = builder.honeypotImageName;
            this.honeypotName = builder.honeypotName;
            this.nodeId = builder.nodeId;
            this.presetId = builder.presetId;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return controlNodeName
         */
        public String getControlNodeName() {
            return this.controlNodeName;
        }

        /**
         * @return honeypotId
         */
        public String getHoneypotId() {
            return this.honeypotId;
        }

        /**
         * @return honeypotImageDisplayName
         */
        public String getHoneypotImageDisplayName() {
            return this.honeypotImageDisplayName;
        }

        /**
         * @return honeypotImageId
         */
        public String getHoneypotImageId() {
            return this.honeypotImageId;
        }

        /**
         * @return honeypotImageName
         */
        public String getHoneypotImageName() {
            return this.honeypotImageName;
        }

        /**
         * @return honeypotName
         */
        public String getHoneypotName() {
            return this.honeypotName;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return presetId
         */
        public String getPresetId() {
            return this.presetId;
        }

        /**
         * @return state
         */
        public java.util.List<String> getState() {
            return this.state;
        }

        public static final class Builder {
            private String controlNodeName; 
            private String honeypotId; 
            private String honeypotImageDisplayName; 
            private String honeypotImageId; 
            private String honeypotImageName; 
            private String honeypotName; 
            private String nodeId; 
            private String presetId; 
            private java.util.List<String> state; 

            private Builder() {
            } 

            private Builder(List model) {
                this.controlNodeName = model.controlNodeName;
                this.honeypotId = model.honeypotId;
                this.honeypotImageDisplayName = model.honeypotImageDisplayName;
                this.honeypotImageId = model.honeypotImageId;
                this.honeypotImageName = model.honeypotImageName;
                this.honeypotName = model.honeypotName;
                this.nodeId = model.nodeId;
                this.presetId = model.presetId;
                this.state = model.state;
            } 

            /**
             * <p>The name of the management node.</p>
             * 
             * <strong>example:</strong>
             * <p>0804-pre</p>
             */
            public Builder controlNodeName(String controlNodeName) {
                this.controlNodeName = controlNodeName;
                return this;
            }

            /**
             * <p>The ID of the honeypot.</p>
             * 
             * <strong>example:</strong>
             * <p>76c2a1c72ef259777d96d55a7834e5f5d98f85666c49f76ad9caa447d8b7****</p>
             */
            public Builder honeypotId(String honeypotId) {
                this.honeypotId = honeypotId;
                return this;
            }

            /**
             * <p>The display name of the honeypot image.</p>
             * 
             * <strong>example:</strong>
             * <p>MongoDB</p>
             */
            public Builder honeypotImageDisplayName(String honeypotImageDisplayName) {
                this.honeypotImageDisplayName = honeypotImageDisplayName;
                return this;
            }

            /**
             * <p>The ID of the honeypot image.</p>
             * 
             * <strong>example:</strong>
             * <p>sha256:eca5ced3757e46c24701e9ced4e652f2d730262d5685a4e001da22c4fb418fd4</p>
             */
            public Builder honeypotImageId(String honeypotImageId) {
                this.honeypotImageId = honeypotImageId;
                return this;
            }

            /**
             * <p>The name of the honeypot image.</p>
             * 
             * <strong>example:</strong>
             * <p>tcp_proxy</p>
             */
            public Builder honeypotImageName(String honeypotImageName) {
                this.honeypotImageName = honeypotImageName;
                return this;
            }

            /**
             * <p>The name of the honeypot.</p>
             * 
             * <strong>example:</strong>
             * <p>mx-rouyi</p>
             */
            public Builder honeypotName(String honeypotName) {
                this.honeypotName = honeypotName;
                return this;
            }

            /**
             * <p>The ID of the management node.</p>
             * 
             * <strong>example:</strong>
             * <p>c94eff5b-ea48-4805-8b7f-e04d3509b117</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The ID of the custom configuration for the honeypot.</p>
             * 
             * <strong>example:</strong>
             * <p>a882e590-b87b-45a6-87b9-d0a3e5a0****</p>
             */
            public Builder presetId(String presetId) {
                this.presetId = presetId;
                return this;
            }

            /**
             * <p>An array that consists of the status information about the honeypot.</p>
             */
            public Builder state(java.util.List<String> state) {
                this.state = state;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHoneypotResponseBody} extends {@link TeaModel}
     *
     * <p>ListHoneypotResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
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
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
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
             * <p>69</p>
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
}
