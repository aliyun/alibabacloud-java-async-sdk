// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetDataServiceApiDocumentResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataServiceApiDocumentResponseBody</p>
 */
public class GetDataServiceApiDocumentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDataServiceApiDocumentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataServiceApiDocumentResponseBody create() {
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDataServiceApiDocumentResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
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

        public GetDataServiceApiDocumentResponseBody build() {
            return new GetDataServiceApiDocumentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataServiceApiDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataServiceApiDocumentResponseBody</p>
     */
    public static class ApiRegisterInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("DatasourceId")
        private String datasourceId;

        @com.aliyun.core.annotation.NameInMap("DatasourceName")
        private String datasourceName;

        @com.aliyun.core.annotation.NameInMap("HttpMethod")
        private Integer httpMethod;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private Integer mode;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private ApiRegisterInfo(Builder builder) {
            this.authType = builder.authType;
            this.datasourceId = builder.datasourceId;
            this.datasourceName = builder.datasourceName;
            this.httpMethod = builder.httpMethod;
            this.mode = builder.mode;
            this.path = builder.path;
            this.protocol = builder.protocol;
            this.timeout = builder.timeout;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiRegisterInfo create() {
            return builder().build();
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return datasourceId
         */
        public String getDatasourceId() {
            return this.datasourceId;
        }

        /**
         * @return datasourceName
         */
        public String getDatasourceName() {
            return this.datasourceName;
        }

        /**
         * @return httpMethod
         */
        public Integer getHttpMethod() {
            return this.httpMethod;
        }

        /**
         * @return mode
         */
        public Integer getMode() {
            return this.mode;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String authType; 
            private String datasourceId; 
            private String datasourceName; 
            private Integer httpMethod; 
            private Integer mode; 
            private String path; 
            private String protocol; 
            private Integer timeout; 
            private String url; 

            private Builder() {
            } 

            private Builder(ApiRegisterInfo model) {
                this.authType = model.authType;
                this.datasourceId = model.datasourceId;
                this.datasourceName = model.datasourceName;
                this.httpMethod = model.httpMethod;
                this.mode = model.mode;
                this.path = model.path;
                this.protocol = model.protocol;
                this.timeout = model.timeout;
                this.url = model.url;
            } 

            /**
             * AuthType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * DatasourceId.
             */
            public Builder datasourceId(String datasourceId) {
                this.datasourceId = datasourceId;
                return this;
            }

            /**
             * DatasourceName.
             */
            public Builder datasourceName(String datasourceName) {
                this.datasourceName = datasourceName;
                return this;
            }

            /**
             * HttpMethod.
             */
            public Builder httpMethod(Integer httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
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
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ApiRegisterInfo build() {
                return new ApiRegisterInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataServiceApiDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataServiceApiDocumentResponseBody</p>
     */
    public static class PublicParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IsRequired")
        private Boolean isRequired;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Sample")
        private String sample;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private PublicParamList(Builder builder) {
            this.description = builder.description;
            this.isRequired = builder.isRequired;
            this.name = builder.name;
            this.sample = builder.sample;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicParamList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return isRequired
         */
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sample
         */
        public String getSample() {
            return this.sample;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private Boolean isRequired; 
            private String name; 
            private String sample; 
            private String type; 

            private Builder() {
            } 

            private Builder(PublicParamList model) {
                this.description = model.description;
                this.isRequired = model.isRequired;
                this.name = model.name;
                this.sample = model.sample;
                this.type = model.type;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IsRequired.
             */
            public Builder isRequired(Boolean isRequired) {
                this.isRequired = isRequired;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Sample.
             */
            public Builder sample(String sample) {
                this.sample = sample;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PublicParamList build() {
                return new PublicParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataServiceApiDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataServiceApiDocumentResponseBody</p>
     */
    public static class RequestParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IsRequired")
        private Boolean isRequired;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Sample")
        private String sample;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RequestParamList(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.isRequired = builder.isRequired;
            this.name = builder.name;
            this.sample = builder.sample;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestParamList create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return isRequired
         */
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sample
         */
        public String getSample() {
            return this.sample;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String defaultValue; 
            private String description; 
            private Boolean isRequired; 
            private String name; 
            private String sample; 
            private String type; 

            private Builder() {
            } 

            private Builder(RequestParamList model) {
                this.defaultValue = model.defaultValue;
                this.description = model.description;
                this.isRequired = model.isRequired;
                this.name = model.name;
                this.sample = model.sample;
                this.type = model.type;
            } 

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IsRequired.
             */
            public Builder isRequired(Boolean isRequired) {
                this.isRequired = isRequired;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Sample.
             */
            public Builder sample(String sample) {
                this.sample = sample;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RequestParamList build() {
                return new RequestParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataServiceApiDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataServiceApiDocumentResponseBody</p>
     */
    public static class ResponseParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Sample")
        private String sample;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ResponseParamList(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.sample = builder.sample;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseParamList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sample
         */
        public String getSample() {
            return this.sample;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String sample; 
            private String type; 

            private Builder() {
            } 

            private Builder(ResponseParamList model) {
                this.description = model.description;
                this.name = model.name;
                this.sample = model.sample;
                this.type = model.type;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Sample.
             */
            public Builder sample(String sample) {
                this.sample = sample;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ResponseParamList build() {
                return new ResponseParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataServiceApiDocumentResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataServiceApiDocumentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private Long apiId;

        @com.aliyun.core.annotation.NameInMap("ApiRegisterInfo")
        private ApiRegisterInfo apiRegisterInfo;

        @com.aliyun.core.annotation.NameInMap("ApiTimeout")
        private Integer apiTimeout;

        @com.aliyun.core.annotation.NameInMap("BizUnitName")
        private String bizUnitName;

        @com.aliyun.core.annotation.NameInMap("CacheTime")
        private String cacheTime;

        @com.aliyun.core.annotation.NameInMap("CreateType")
        private Integer createType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DirectDatasourceId")
        private Long directDatasourceId;

        @com.aliyun.core.annotation.NameInMap("DirectDatasourceName")
        private String directDatasourceName;

        @com.aliyun.core.annotation.NameInMap("Env")
        private Integer env;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Integer groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("IsLogicalTable")
        private Boolean isLogicalTable;

        @com.aliyun.core.annotation.NameInMap("IsPagedQuery")
        private Boolean isPagedQuery;

        @com.aliyun.core.annotation.NameInMap("IsSpecialSql")
        private Boolean isSpecialSql;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private Integer mode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OpenCache")
        private Boolean openCache;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Integer projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private Integer protocol;

        @com.aliyun.core.annotation.NameInMap("PublicParamList")
        private java.util.List<PublicParamList> publicParamList;

        @com.aliyun.core.annotation.NameInMap("RequestMethod")
        private Integer requestMethod;

        @com.aliyun.core.annotation.NameInMap("RequestParamList")
        private java.util.List<RequestParamList> requestParamList;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("ResponseParamList")
        private java.util.List<ResponseParamList> responseParamList;

        @com.aliyun.core.annotation.NameInMap("ResultSample")
        private String resultSample;

        @com.aliyun.core.annotation.NameInMap("ReturnLimit")
        private Integer returnLimit;

        @com.aliyun.core.annotation.NameInMap("ReturnType")
        private Integer returnType;

        @com.aliyun.core.annotation.NameInMap("ScriptType")
        private String scriptType;

        @com.aliyun.core.annotation.NameInMap("Sql")
        private String sql;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private String timeout;

        @com.aliyun.core.annotation.NameInMap("UpdateRate")
        private Integer updateRate;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Data(Builder builder) {
            this.apiId = builder.apiId;
            this.apiRegisterInfo = builder.apiRegisterInfo;
            this.apiTimeout = builder.apiTimeout;
            this.bizUnitName = builder.bizUnitName;
            this.cacheTime = builder.cacheTime;
            this.createType = builder.createType;
            this.description = builder.description;
            this.directDatasourceId = builder.directDatasourceId;
            this.directDatasourceName = builder.directDatasourceName;
            this.env = builder.env;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.isLogicalTable = builder.isLogicalTable;
            this.isPagedQuery = builder.isPagedQuery;
            this.isSpecialSql = builder.isSpecialSql;
            this.mode = builder.mode;
            this.name = builder.name;
            this.openCache = builder.openCache;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.protocol = builder.protocol;
            this.publicParamList = builder.publicParamList;
            this.requestMethod = builder.requestMethod;
            this.requestParamList = builder.requestParamList;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceGroupName = builder.resourceGroupName;
            this.responseParamList = builder.responseParamList;
            this.resultSample = builder.resultSample;
            this.returnLimit = builder.returnLimit;
            this.returnType = builder.returnType;
            this.scriptType = builder.scriptType;
            this.sql = builder.sql;
            this.tableName = builder.tableName;
            this.timeout = builder.timeout;
            this.updateRate = builder.updateRate;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public Long getApiId() {
            return this.apiId;
        }

        /**
         * @return apiRegisterInfo
         */
        public ApiRegisterInfo getApiRegisterInfo() {
            return this.apiRegisterInfo;
        }

        /**
         * @return apiTimeout
         */
        public Integer getApiTimeout() {
            return this.apiTimeout;
        }

        /**
         * @return bizUnitName
         */
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        /**
         * @return cacheTime
         */
        public String getCacheTime() {
            return this.cacheTime;
        }

        /**
         * @return createType
         */
        public Integer getCreateType() {
            return this.createType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return directDatasourceId
         */
        public Long getDirectDatasourceId() {
            return this.directDatasourceId;
        }

        /**
         * @return directDatasourceName
         */
        public String getDirectDatasourceName() {
            return this.directDatasourceName;
        }

        /**
         * @return env
         */
        public Integer getEnv() {
            return this.env;
        }

        /**
         * @return groupId
         */
        public Integer getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return isLogicalTable
         */
        public Boolean getIsLogicalTable() {
            return this.isLogicalTable;
        }

        /**
         * @return isPagedQuery
         */
        public Boolean getIsPagedQuery() {
            return this.isPagedQuery;
        }

        /**
         * @return isSpecialSql
         */
        public Boolean getIsSpecialSql() {
            return this.isSpecialSql;
        }

        /**
         * @return mode
         */
        public Integer getMode() {
            return this.mode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return openCache
         */
        public Boolean getOpenCache() {
            return this.openCache;
        }

        /**
         * @return projectId
         */
        public Integer getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return protocol
         */
        public Integer getProtocol() {
            return this.protocol;
        }

        /**
         * @return publicParamList
         */
        public java.util.List<PublicParamList> getPublicParamList() {
            return this.publicParamList;
        }

        /**
         * @return requestMethod
         */
        public Integer getRequestMethod() {
            return this.requestMethod;
        }

        /**
         * @return requestParamList
         */
        public java.util.List<RequestParamList> getRequestParamList() {
            return this.requestParamList;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return responseParamList
         */
        public java.util.List<ResponseParamList> getResponseParamList() {
            return this.responseParamList;
        }

        /**
         * @return resultSample
         */
        public String getResultSample() {
            return this.resultSample;
        }

        /**
         * @return returnLimit
         */
        public Integer getReturnLimit() {
            return this.returnLimit;
        }

        /**
         * @return returnType
         */
        public Integer getReturnType() {
            return this.returnType;
        }

        /**
         * @return scriptType
         */
        public String getScriptType() {
            return this.scriptType;
        }

        /**
         * @return sql
         */
        public String getSql() {
            return this.sql;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return timeout
         */
        public String getTimeout() {
            return this.timeout;
        }

        /**
         * @return updateRate
         */
        public Integer getUpdateRate() {
            return this.updateRate;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long apiId; 
            private ApiRegisterInfo apiRegisterInfo; 
            private Integer apiTimeout; 
            private String bizUnitName; 
            private String cacheTime; 
            private Integer createType; 
            private String description; 
            private Long directDatasourceId; 
            private String directDatasourceName; 
            private Integer env; 
            private Integer groupId; 
            private String groupName; 
            private Boolean isLogicalTable; 
            private Boolean isPagedQuery; 
            private Boolean isSpecialSql; 
            private Integer mode; 
            private String name; 
            private Boolean openCache; 
            private Integer projectId; 
            private String projectName; 
            private Integer protocol; 
            private java.util.List<PublicParamList> publicParamList; 
            private Integer requestMethod; 
            private java.util.List<RequestParamList> requestParamList; 
            private String resourceGroupId; 
            private String resourceGroupName; 
            private java.util.List<ResponseParamList> responseParamList; 
            private String resultSample; 
            private Integer returnLimit; 
            private Integer returnType; 
            private String scriptType; 
            private String sql; 
            private String tableName; 
            private String timeout; 
            private Integer updateRate; 
            private String version; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiId = model.apiId;
                this.apiRegisterInfo = model.apiRegisterInfo;
                this.apiTimeout = model.apiTimeout;
                this.bizUnitName = model.bizUnitName;
                this.cacheTime = model.cacheTime;
                this.createType = model.createType;
                this.description = model.description;
                this.directDatasourceId = model.directDatasourceId;
                this.directDatasourceName = model.directDatasourceName;
                this.env = model.env;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.isLogicalTable = model.isLogicalTable;
                this.isPagedQuery = model.isPagedQuery;
                this.isSpecialSql = model.isSpecialSql;
                this.mode = model.mode;
                this.name = model.name;
                this.openCache = model.openCache;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.protocol = model.protocol;
                this.publicParamList = model.publicParamList;
                this.requestMethod = model.requestMethod;
                this.requestParamList = model.requestParamList;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceGroupName = model.resourceGroupName;
                this.responseParamList = model.responseParamList;
                this.resultSample = model.resultSample;
                this.returnLimit = model.returnLimit;
                this.returnType = model.returnType;
                this.scriptType = model.scriptType;
                this.sql = model.sql;
                this.tableName = model.tableName;
                this.timeout = model.timeout;
                this.updateRate = model.updateRate;
                this.version = model.version;
            } 

            /**
             * ApiId.
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * ApiRegisterInfo.
             */
            public Builder apiRegisterInfo(ApiRegisterInfo apiRegisterInfo) {
                this.apiRegisterInfo = apiRegisterInfo;
                return this;
            }

            /**
             * ApiTimeout.
             */
            public Builder apiTimeout(Integer apiTimeout) {
                this.apiTimeout = apiTimeout;
                return this;
            }

            /**
             * BizUnitName.
             */
            public Builder bizUnitName(String bizUnitName) {
                this.bizUnitName = bizUnitName;
                return this;
            }

            /**
             * CacheTime.
             */
            public Builder cacheTime(String cacheTime) {
                this.cacheTime = cacheTime;
                return this;
            }

            /**
             * CreateType.
             */
            public Builder createType(Integer createType) {
                this.createType = createType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DirectDatasourceId.
             */
            public Builder directDatasourceId(Long directDatasourceId) {
                this.directDatasourceId = directDatasourceId;
                return this;
            }

            /**
             * DirectDatasourceName.
             */
            public Builder directDatasourceName(String directDatasourceName) {
                this.directDatasourceName = directDatasourceName;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(Integer env) {
                this.env = env;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(Integer groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * IsLogicalTable.
             */
            public Builder isLogicalTable(Boolean isLogicalTable) {
                this.isLogicalTable = isLogicalTable;
                return this;
            }

            /**
             * IsPagedQuery.
             */
            public Builder isPagedQuery(Boolean isPagedQuery) {
                this.isPagedQuery = isPagedQuery;
                return this;
            }

            /**
             * IsSpecialSql.
             */
            public Builder isSpecialSql(Boolean isSpecialSql) {
                this.isSpecialSql = isSpecialSql;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OpenCache.
             */
            public Builder openCache(Boolean openCache) {
                this.openCache = openCache;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Integer projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(Integer protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * PublicParamList.
             */
            public Builder publicParamList(java.util.List<PublicParamList> publicParamList) {
                this.publicParamList = publicParamList;
                return this;
            }

            /**
             * RequestMethod.
             */
            public Builder requestMethod(Integer requestMethod) {
                this.requestMethod = requestMethod;
                return this;
            }

            /**
             * RequestParamList.
             */
            public Builder requestParamList(java.util.List<RequestParamList> requestParamList) {
                this.requestParamList = requestParamList;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ResourceGroupName.
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * ResponseParamList.
             */
            public Builder responseParamList(java.util.List<ResponseParamList> responseParamList) {
                this.responseParamList = responseParamList;
                return this;
            }

            /**
             * ResultSample.
             */
            public Builder resultSample(String resultSample) {
                this.resultSample = resultSample;
                return this;
            }

            /**
             * ReturnLimit.
             */
            public Builder returnLimit(Integer returnLimit) {
                this.returnLimit = returnLimit;
                return this;
            }

            /**
             * ReturnType.
             */
            public Builder returnType(Integer returnType) {
                this.returnType = returnType;
                return this;
            }

            /**
             * ScriptType.
             */
            public Builder scriptType(String scriptType) {
                this.scriptType = scriptType;
                return this;
            }

            /**
             * Sql.
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(String timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * UpdateRate.
             */
            public Builder updateRate(Integer updateRate) {
                this.updateRate = updateRate;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
