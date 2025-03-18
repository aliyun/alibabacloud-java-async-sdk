// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link CreateDatasetRequest} extends {@link RequestModel}
 *
 * <p>CreateDatasetRequest</p>
 */
public class CreateDatasetRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetConfig")
    private DatasetConfig datasetConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetDescription")
    private String datasetDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetType")
    private String datasetType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocumentHandleConfig")
    private DocumentHandleConfig documentHandleConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchDatasetEnable")
    private Integer searchDatasetEnable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateDatasetRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasetConfig = builder.datasetConfig;
        this.datasetDescription = builder.datasetDescription;
        this.datasetName = builder.datasetName;
        this.datasetType = builder.datasetType;
        this.documentHandleConfig = builder.documentHandleConfig;
        this.searchDatasetEnable = builder.searchDatasetEnable;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return datasetConfig
     */
    public DatasetConfig getDatasetConfig() {
        return this.datasetConfig;
    }

    /**
     * @return datasetDescription
     */
    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return datasetType
     */
    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * @return documentHandleConfig
     */
    public DocumentHandleConfig getDocumentHandleConfig() {
        return this.documentHandleConfig;
    }

    /**
     * @return searchDatasetEnable
     */
    public Integer getSearchDatasetEnable() {
        return this.searchDatasetEnable;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateDatasetRequest, Builder> {
        private String regionId; 
        private DatasetConfig datasetConfig; 
        private String datasetDescription; 
        private String datasetName; 
        private String datasetType; 
        private DocumentHandleConfig documentHandleConfig; 
        private Integer searchDatasetEnable; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatasetRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.datasetConfig = request.datasetConfig;
            this.datasetDescription = request.datasetDescription;
            this.datasetName = request.datasetName;
            this.datasetType = request.datasetType;
            this.documentHandleConfig = request.documentHandleConfig;
            this.searchDatasetEnable = request.searchDatasetEnable;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * DatasetConfig.
         */
        public Builder datasetConfig(DatasetConfig datasetConfig) {
            String datasetConfigShrink = shrink(datasetConfig, "DatasetConfig", "json");
            this.putBodyParameter("DatasetConfig", datasetConfigShrink);
            this.datasetConfig = datasetConfig;
            return this;
        }

        /**
         * DatasetDescription.
         */
        public Builder datasetDescription(String datasetDescription) {
            this.putBodyParameter("DatasetDescription", datasetDescription);
            this.datasetDescription = datasetDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>businessDataset</p>
         */
        public Builder datasetName(String datasetName) {
            this.putBodyParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * DatasetType.
         */
        public Builder datasetType(String datasetType) {
            this.putBodyParameter("DatasetType", datasetType);
            this.datasetType = datasetType;
            return this;
        }

        /**
         * DocumentHandleConfig.
         */
        public Builder documentHandleConfig(DocumentHandleConfig documentHandleConfig) {
            String documentHandleConfigShrink = shrink(documentHandleConfig, "DocumentHandleConfig", "json");
            this.putBodyParameter("DocumentHandleConfig", documentHandleConfigShrink);
            this.documentHandleConfig = documentHandleConfig;
            return this;
        }

        /**
         * SearchDatasetEnable.
         */
        public Builder searchDatasetEnable(Integer searchDatasetEnable) {
            this.putBodyParameter("SearchDatasetEnable", searchDatasetEnable);
            this.searchDatasetEnable = searchDatasetEnable;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateDatasetRequest build() {
            return new CreateDatasetRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("ValueFormat")
        private String valueFormat;

        @com.aliyun.core.annotation.NameInMap("ValueType")
        private String valueType;

        private Headers(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
            this.valueFormat = builder.valueFormat;
            this.valueType = builder.valueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueFormat
         */
        public String getValueFormat() {
            return this.valueFormat;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private String name; 
            private String value; 
            private String valueFormat; 
            private String valueType; 

            private Builder() {
            } 

            private Builder(Headers model) {
                this.name = model.name;
                this.value = model.value;
                this.valueFormat = model.valueFormat;
                this.valueType = model.valueType;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * ValueFormat.
             */
            public Builder valueFormat(String valueFormat) {
                this.valueFormat = valueFormat;
                return this;
            }

            /**
             * ValueType.
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("ValueFormat")
        private String valueFormat;

        @com.aliyun.core.annotation.NameInMap("ValueType")
        private String valueType;

        private Params(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
            this.valueFormat = builder.valueFormat;
            this.valueType = builder.valueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueFormat
         */
        public String getValueFormat() {
            return this.valueFormat;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private String name; 
            private String value; 
            private String valueFormat; 
            private String valueType; 

            private Builder() {
            } 

            private Builder(Params model) {
                this.name = model.name;
                this.value = model.value;
                this.valueFormat = model.valueFormat;
                this.valueType = model.valueType;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * ValueFormat.
             */
            public Builder valueFormat(String valueFormat) {
                this.valueFormat = valueFormat;
                return this;
            }

            /**
             * ValueType.
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class SearchSourceRequestConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private String body;

        @com.aliyun.core.annotation.NameInMap("ConnectTimeout")
        private Integer connectTimeout;

        @com.aliyun.core.annotation.NameInMap("Headers")
        private java.util.List<Headers> headers;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("Params")
        private java.util.List<Params> params;

        @com.aliyun.core.annotation.NameInMap("PathParamsEnable")
        private Boolean pathParamsEnable;

        @com.aliyun.core.annotation.NameInMap("SocketTimeout")
        private Integer socketTimeout;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private SearchSourceRequestConfig(Builder builder) {
            this.body = builder.body;
            this.connectTimeout = builder.connectTimeout;
            this.headers = builder.headers;
            this.method = builder.method;
            this.params = builder.params;
            this.pathParamsEnable = builder.pathParamsEnable;
            this.socketTimeout = builder.socketTimeout;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchSourceRequestConfig create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public String getBody() {
            return this.body;
        }

        /**
         * @return connectTimeout
         */
        public Integer getConnectTimeout() {
            return this.connectTimeout;
        }

        /**
         * @return headers
         */
        public java.util.List<Headers> getHeaders() {
            return this.headers;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return params
         */
        public java.util.List<Params> getParams() {
            return this.params;
        }

        /**
         * @return pathParamsEnable
         */
        public Boolean getPathParamsEnable() {
            return this.pathParamsEnable;
        }

        /**
         * @return socketTimeout
         */
        public Integer getSocketTimeout() {
            return this.socketTimeout;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String body; 
            private Integer connectTimeout; 
            private java.util.List<Headers> headers; 
            private String method; 
            private java.util.List<Params> params; 
            private Boolean pathParamsEnable; 
            private Integer socketTimeout; 
            private String url; 

            private Builder() {
            } 

            private Builder(SearchSourceRequestConfig model) {
                this.body = model.body;
                this.connectTimeout = model.connectTimeout;
                this.headers = model.headers;
                this.method = model.method;
                this.params = model.params;
                this.pathParamsEnable = model.pathParamsEnable;
                this.socketTimeout = model.socketTimeout;
                this.url = model.url;
            } 

            /**
             * Body.
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * ConnectTimeout.
             */
            public Builder connectTimeout(Integer connectTimeout) {
                this.connectTimeout = connectTimeout;
                return this;
            }

            /**
             * Headers.
             */
            public Builder headers(java.util.List<Headers> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * Params.
             */
            public Builder params(java.util.List<Params> params) {
                this.params = params;
                return this;
            }

            /**
             * PathParamsEnable.
             */
            public Builder pathParamsEnable(Boolean pathParamsEnable) {
                this.pathParamsEnable = pathParamsEnable;
                return this;
            }

            /**
             * SocketTimeout.
             */
            public Builder socketTimeout(Integer socketTimeout) {
                this.socketTimeout = socketTimeout;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public SearchSourceRequestConfig build() {
                return new SearchSourceRequestConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class JqNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private JqNodes(Builder builder) {
            this.key = builder.key;
            this.path = builder.path;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JqNodes create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String key; 
            private String path; 
            private String type; 

            private Builder() {
            } 

            private Builder(JqNodes model) {
                this.key = model.key;
                this.path = model.path;
                this.type = model.type;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public JqNodes build() {
                return new JqNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class JqNodesJqNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JqNodes")
        private java.util.List<JqNodes> jqNodes;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private JqNodesJqNodes(Builder builder) {
            this.jqNodes = builder.jqNodes;
            this.key = builder.key;
            this.path = builder.path;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JqNodesJqNodes create() {
            return builder().build();
        }

        /**
         * @return jqNodes
         */
        public java.util.List<JqNodes> getJqNodes() {
            return this.jqNodes;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<JqNodes> jqNodes; 
            private String key; 
            private String path; 
            private String type; 

            private Builder() {
            } 

            private Builder(JqNodesJqNodes model) {
                this.jqNodes = model.jqNodes;
                this.key = model.key;
                this.path = model.path;
                this.type = model.type;
            } 

            /**
             * JqNodes.
             */
            public Builder jqNodes(java.util.List<JqNodes> jqNodes) {
                this.jqNodes = jqNodes;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public JqNodesJqNodes build() {
                return new JqNodesJqNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class SearchSourceResponseConfigJqNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JqNodes")
        private java.util.List<JqNodesJqNodes> jqNodes;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private SearchSourceResponseConfigJqNodes(Builder builder) {
            this.jqNodes = builder.jqNodes;
            this.key = builder.key;
            this.path = builder.path;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchSourceResponseConfigJqNodes create() {
            return builder().build();
        }

        /**
         * @return jqNodes
         */
        public java.util.List<JqNodesJqNodes> getJqNodes() {
            return this.jqNodes;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<JqNodesJqNodes> jqNodes; 
            private String key; 
            private String path; 
            private String type; 

            private Builder() {
            } 

            private Builder(SearchSourceResponseConfigJqNodes model) {
                this.jqNodes = model.jqNodes;
                this.key = model.key;
                this.path = model.path;
                this.type = model.type;
            } 

            /**
             * JqNodes.
             */
            public Builder jqNodes(java.util.List<JqNodesJqNodes> jqNodes) {
                this.jqNodes = jqNodes;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SearchSourceResponseConfigJqNodes build() {
                return new SearchSourceResponseConfigJqNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class SearchSourceResponseConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JqNodes")
        private java.util.List<SearchSourceResponseConfigJqNodes> jqNodes;

        private SearchSourceResponseConfig(Builder builder) {
            this.jqNodes = builder.jqNodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchSourceResponseConfig create() {
            return builder().build();
        }

        /**
         * @return jqNodes
         */
        public java.util.List<SearchSourceResponseConfigJqNodes> getJqNodes() {
            return this.jqNodes;
        }

        public static final class Builder {
            private java.util.List<SearchSourceResponseConfigJqNodes> jqNodes; 

            private Builder() {
            } 

            private Builder(SearchSourceResponseConfig model) {
                this.jqNodes = model.jqNodes;
            } 

            /**
             * JqNodes.
             */
            public Builder jqNodes(java.util.List<SearchSourceResponseConfigJqNodes> jqNodes) {
                this.jqNodes = jqNodes;
                return this;
            }

            public SearchSourceResponseConfig build() {
                return new SearchSourceResponseConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class SearchSourceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DemoQuery")
        private String demoQuery;

        @com.aliyun.core.annotation.NameInMap("SearchSourceRequestConfig")
        private SearchSourceRequestConfig searchSourceRequestConfig;

        @com.aliyun.core.annotation.NameInMap("SearchSourceResponseConfig")
        private SearchSourceResponseConfig searchSourceResponseConfig;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private SearchSourceConfigs(Builder builder) {
            this.demoQuery = builder.demoQuery;
            this.searchSourceRequestConfig = builder.searchSourceRequestConfig;
            this.searchSourceResponseConfig = builder.searchSourceResponseConfig;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchSourceConfigs create() {
            return builder().build();
        }

        /**
         * @return demoQuery
         */
        public String getDemoQuery() {
            return this.demoQuery;
        }

        /**
         * @return searchSourceRequestConfig
         */
        public SearchSourceRequestConfig getSearchSourceRequestConfig() {
            return this.searchSourceRequestConfig;
        }

        /**
         * @return searchSourceResponseConfig
         */
        public SearchSourceResponseConfig getSearchSourceResponseConfig() {
            return this.searchSourceResponseConfig;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private String demoQuery; 
            private SearchSourceRequestConfig searchSourceRequestConfig; 
            private SearchSourceResponseConfig searchSourceResponseConfig; 
            private Integer size; 

            private Builder() {
            } 

            private Builder(SearchSourceConfigs model) {
                this.demoQuery = model.demoQuery;
                this.searchSourceRequestConfig = model.searchSourceRequestConfig;
                this.searchSourceResponseConfig = model.searchSourceResponseConfig;
                this.size = model.size;
            } 

            /**
             * DemoQuery.
             */
            public Builder demoQuery(String demoQuery) {
                this.demoQuery = demoQuery;
                return this;
            }

            /**
             * SearchSourceRequestConfig.
             */
            public Builder searchSourceRequestConfig(SearchSourceRequestConfig searchSourceRequestConfig) {
                this.searchSourceRequestConfig = searchSourceRequestConfig;
                return this;
            }

            /**
             * SearchSourceResponseConfig.
             */
            public Builder searchSourceResponseConfig(SearchSourceResponseConfig searchSourceResponseConfig) {
                this.searchSourceResponseConfig = searchSourceResponseConfig;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public SearchSourceConfigs build() {
                return new SearchSourceConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class DatasetConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SearchSourceConfigs")
        private java.util.List<SearchSourceConfigs> searchSourceConfigs;

        private DatasetConfig(Builder builder) {
            this.searchSourceConfigs = builder.searchSourceConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatasetConfig create() {
            return builder().build();
        }

        /**
         * @return searchSourceConfigs
         */
        public java.util.List<SearchSourceConfigs> getSearchSourceConfigs() {
            return this.searchSourceConfigs;
        }

        public static final class Builder {
            private java.util.List<SearchSourceConfigs> searchSourceConfigs; 

            private Builder() {
            } 

            private Builder(DatasetConfig model) {
                this.searchSourceConfigs = model.searchSourceConfigs;
            } 

            /**
             * SearchSourceConfigs.
             */
            public Builder searchSourceConfigs(java.util.List<SearchSourceConfigs> searchSourceConfigs) {
                this.searchSourceConfigs = searchSourceConfigs;
                return this;
            }

            public DatasetConfig build() {
                return new DatasetConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDatasetRequest} extends {@link TeaModel}
     *
     * <p>CreateDatasetRequest</p>
     */
    public static class DocumentHandleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisableHandleMultimodalMedia")
        private Boolean disableHandleMultimodalMedia;

        private DocumentHandleConfig(Builder builder) {
            this.disableHandleMultimodalMedia = builder.disableHandleMultimodalMedia;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DocumentHandleConfig create() {
            return builder().build();
        }

        /**
         * @return disableHandleMultimodalMedia
         */
        public Boolean getDisableHandleMultimodalMedia() {
            return this.disableHandleMultimodalMedia;
        }

        public static final class Builder {
            private Boolean disableHandleMultimodalMedia; 

            private Builder() {
            } 

            private Builder(DocumentHandleConfig model) {
                this.disableHandleMultimodalMedia = model.disableHandleMultimodalMedia;
            } 

            /**
             * DisableHandleMultimodalMedia.
             */
            public Builder disableHandleMultimodalMedia(Boolean disableHandleMultimodalMedia) {
                this.disableHandleMultimodalMedia = disableHandleMultimodalMedia;
                return this;
            }

            public DocumentHandleConfig build() {
                return new DocumentHandleConfig(this);
            } 

        } 

    }
}
