// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListApiPluginsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApiPluginsResponseBody</p>
 */
public class ListApiPluginsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiPlugins")
    private java.util.List<ApiPlugins> apiPlugins;

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
    private Long totalCount;

    private ListApiPluginsResponseBody(Builder builder) {
        this.apiPlugins = builder.apiPlugins;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApiPluginsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiPlugins
     */
    public java.util.List<ApiPlugins> getApiPlugins() {
        return this.apiPlugins;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ApiPlugins> apiPlugins; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListApiPluginsResponseBody model) {
            this.apiPlugins = model.apiPlugins;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>API plugin list</p>
         */
        public Builder apiPlugins(java.util.List<ApiPlugins> apiPlugins) {
            this.apiPlugins = apiPlugins;
            return this;
        }

        /**
         * <p>API status code</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>HTTP status code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>API prompt message</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Number of entries displayed per page</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates success</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Total number of entries</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApiPluginsResponseBody build() {
            return new ListApiPluginsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApiPluginsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApiPluginsResponseBody</p>
     */
    public static class ApiPlugins extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DraftedConfigJson")
        private String draftedConfigJson;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PublishedConfigJson")
        private String publishedConfigJson;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private ApiPlugins(Builder builder) {
            this.description = builder.description;
            this.draftedConfigJson = builder.draftedConfigJson;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.publishedConfigJson = builder.publishedConfigJson;
            this.status = builder.status;
            this.type = builder.type;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiPlugins create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return draftedConfigJson
         */
        public String getDraftedConfigJson() {
            return this.draftedConfigJson;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return publishedConfigJson
         */
        public String getPublishedConfigJson() {
            return this.publishedConfigJson;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String description; 
            private String draftedConfigJson; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String instanceId; 
            private String name; 
            private String publishedConfigJson; 
            private String status; 
            private String type; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(ApiPlugins model) {
                this.description = model.description;
                this.draftedConfigJson = model.draftedConfigJson;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.publishedConfigJson = model.publishedConfigJson;
                this.status = model.status;
                this.type = model.type;
                this.uuid = model.uuid;
            } 

            /**
             * <p>Description.</p>
             * 
             * <strong>example:</strong>
             * <p>这个插件是用来xxx.....</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Draft configuration</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;description&quot;: &quot;测试-2&quot;,
             *     &quot;functionMeta&quot;: {
             *         &quot;failoverRegionWeight&quot;: 0.5,
             *         &quot;functionMetaId&quot;: &quot;a9127136087e4172b31b8f400430d63b&quot;,
             *         &quot;functionName&quot;: &quot;yongyu-stream-2&quot;,
             *         &quot;regionId&quot;: &quot;cn-hangzhou&quot;
             *     },
             *     &quot;inputParams&quot;: [{
             *         &quot;debugValue&quot;: &quot;1112&quot;,
             *         &quot;description&quot;: &quot;测试&quot;,
             *         &quot;name&quot;: &quot;test&quot;,
             *         &quot;required&quot;: false,
             *         &quot;type&quot;: &quot;String&quot;,
             *         &quot;valueSource&quot;: &quot;Var&quot;
             *     }],
             *     &quot;name&quot;: &quot;测试插件01&quot;,
             *     &quot;outputParams&quot;: [{
             *         &quot;description&quot;: &quot;直接返回API结果，并作为提示词输入给模型&quot;,
             *         &quot;name&quot;: &quot;result&quot;,
             *         &quot;type&quot;: &quot;String&quot;
             *     }],
             *     &quot;timeout&quot;: 5,
             *     &quot;transitionContent&quot;: &quot;稍等，和您确认下信息。&quot;,
             *     &quot;type&quot;: &quot;Function&quot;
             * }</p>
             */
            public Builder draftedConfigJson(String draftedConfigJson) {
                this.draftedConfigJson = draftedConfigJson;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1666230851000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Update time</p>
             * 
             * <strong>example:</strong>
             * <p>1641891940000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>7c0e5b5e-a839-4999-8301-2c7d07a1f16f</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Plugin name</p>
             * 
             * <strong>example:</strong>
             * <p>这是一个插件</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Published configuration</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;description&quot;: &quot;发布-2&quot;,
             *     &quot;functionMeta&quot;: {
             *         &quot;failoverRegionWeight&quot;: 0.5,
             *         &quot;functionMetaId&quot;: &quot;c4af5815daaa485bb8118be6b2f14058&quot;,
             *         &quot;functionName&quot;: &quot;yongyu-stream-2&quot;,
             *         &quot;regionId&quot;: &quot;cn-hangzhou&quot;
             *     },
             *     &quot;inputParams&quot;: [{
             *         &quot;debugValue&quot;: &quot;111&quot;,
             *         &quot;description&quot;: &quot;发布&quot;,
             *         &quot;name&quot;: &quot;test&quot;,
             *         &quot;required&quot;: false,
             *         &quot;type&quot;: &quot;String&quot;,
             *         &quot;valueSource&quot;: &quot;Var&quot;
             *     }],
             *     &quot;name&quot;: &quot;发布插件&quot;,
             *     &quot;outputParams&quot;: [{
             *         &quot;description&quot;: &quot;直接返回API结果，并作为提示词输入给模型&quot;,
             *         &quot;name&quot;: &quot;result&quot;,
             *         &quot;type&quot;: &quot;String&quot;
             *     }],
             *     &quot;timeout&quot;: 5,
             *     &quot;transitionContent&quot;: &quot;稍等，和您确认下信息。&quot;,
             *     &quot;type&quot;: &quot;Function&quot;
             * }</p>
             */
            public Builder publishedConfigJson(String publishedConfigJson) {
                this.publishedConfigJson = publishedConfigJson;
                return this;
            }

            /**
             * <p>Status.</p>
             * <ul>
             * <li><p>Drafted</p>
             * </li>
             * <li><p>Published</p>
             * </li>
             * <li><p>PublishedAndEdited</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Drafted</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Type</p>
             * 
             * <strong>example:</strong>
             * <p>Function</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Unique plugin identifier</p>
             * 
             * <strong>example:</strong>
             * <p>e1a3c448-20cf-4586-8aa2-4cdca75f7c20</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public ApiPlugins build() {
                return new ApiPlugins(this);
            } 

        } 

    }
}
