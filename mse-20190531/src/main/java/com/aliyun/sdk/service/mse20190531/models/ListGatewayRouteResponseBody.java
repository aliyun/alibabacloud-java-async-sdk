// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewayRouteResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayRouteResponseBody</p>
 */
public class ListGatewayRouteResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListGatewayRouteResponseBody(Builder builder) {
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

    public static ListGatewayRouteResponseBody create() {
        return builder().build();
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
        private Integer code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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
         * Id of the request
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

        public ListGatewayRouteResponseBody build() {
            return new ListGatewayRouteResponseBody(this);
        } 

    } 

    public static class Comment extends TeaModel {
        @NameInMap("Status")
        private String status;

        private Comment(Builder builder) {
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Comment create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String status; 

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Comment build() {
                return new Comment(this);
            } 

        } 

    }
    public static class DirectResponse extends TeaModel {
        @NameInMap("Body")
        private String body;

        @NameInMap("Code")
        private Integer code;

        private DirectResponse(Builder builder) {
            this.body = builder.body;
            this.code = builder.code;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DirectResponse create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public String getBody() {
            return this.body;
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        public static final class Builder {
            private String body; 
            private Integer code; 

            /**
             * Body.
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            public DirectResponse build() {
                return new DirectResponse(this);
            } 

        } 

    }
    public static class Redirect extends TeaModel {
        @NameInMap("Code")
        private Integer code;

        @NameInMap("Host")
        private String host;

        @NameInMap("Path")
        private String path;

        private Redirect(Builder builder) {
            this.code = builder.code;
            this.host = builder.host;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Redirect create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private Integer code; 
            private String host; 
            private String path; 

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public Redirect build() {
                return new Redirect(this);
            } 

        } 

    }
    public static class HeaderPredicates extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private HeaderPredicates(Builder builder) {
            this.key = builder.key;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeaderPredicates create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String type; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public HeaderPredicates build() {
                return new HeaderPredicates(this);
            } 

        } 

    }
    public static class PathPredicates extends TeaModel {
        @NameInMap("IgnoreCase")
        private Boolean ignoreCase;

        @NameInMap("Path")
        private String path;

        @NameInMap("Type")
        private String type;

        private PathPredicates(Builder builder) {
            this.ignoreCase = builder.ignoreCase;
            this.path = builder.path;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PathPredicates create() {
            return builder().build();
        }

        /**
         * @return ignoreCase
         */
        public Boolean getIgnoreCase() {
            return this.ignoreCase;
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
            private Boolean ignoreCase; 
            private String path; 
            private String type; 

            /**
             * IgnoreCase.
             */
            public Builder ignoreCase(Boolean ignoreCase) {
                this.ignoreCase = ignoreCase;
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

            public PathPredicates build() {
                return new PathPredicates(this);
            } 

        } 

    }
    public static class QueryPredicates extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private QueryPredicates(Builder builder) {
            this.key = builder.key;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryPredicates create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String type; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public QueryPredicates build() {
                return new QueryPredicates(this);
            } 

        } 

    }
    public static class RoutePredicates extends TeaModel {
        @NameInMap("HeaderPredicates")
        private java.util.List < HeaderPredicates> headerPredicates;

        @NameInMap("MethodPredicates")
        private java.util.List < String > methodPredicates;

        @NameInMap("PathPredicates")
        private PathPredicates pathPredicates;

        @NameInMap("QueryPredicates")
        private java.util.List < QueryPredicates> queryPredicates;

        private RoutePredicates(Builder builder) {
            this.headerPredicates = builder.headerPredicates;
            this.methodPredicates = builder.methodPredicates;
            this.pathPredicates = builder.pathPredicates;
            this.queryPredicates = builder.queryPredicates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoutePredicates create() {
            return builder().build();
        }

        /**
         * @return headerPredicates
         */
        public java.util.List < HeaderPredicates> getHeaderPredicates() {
            return this.headerPredicates;
        }

        /**
         * @return methodPredicates
         */
        public java.util.List < String > getMethodPredicates() {
            return this.methodPredicates;
        }

        /**
         * @return pathPredicates
         */
        public PathPredicates getPathPredicates() {
            return this.pathPredicates;
        }

        /**
         * @return queryPredicates
         */
        public java.util.List < QueryPredicates> getQueryPredicates() {
            return this.queryPredicates;
        }

        public static final class Builder {
            private java.util.List < HeaderPredicates> headerPredicates; 
            private java.util.List < String > methodPredicates; 
            private PathPredicates pathPredicates; 
            private java.util.List < QueryPredicates> queryPredicates; 

            /**
             * HeaderPredicates.
             */
            public Builder headerPredicates(java.util.List < HeaderPredicates> headerPredicates) {
                this.headerPredicates = headerPredicates;
                return this;
            }

            /**
             * MethodPredicates.
             */
            public Builder methodPredicates(java.util.List < String > methodPredicates) {
                this.methodPredicates = methodPredicates;
                return this;
            }

            /**
             * PathPredicates.
             */
            public Builder pathPredicates(PathPredicates pathPredicates) {
                this.pathPredicates = pathPredicates;
                return this;
            }

            /**
             * QueryPredicates.
             */
            public Builder queryPredicates(java.util.List < QueryPredicates> queryPredicates) {
                this.queryPredicates = queryPredicates;
                return this;
            }

            public RoutePredicates build() {
                return new RoutePredicates(this);
            } 

        } 

    }
    public static class RouteServices extends TeaModel {
        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Percent")
        private Integer percent;

        @NameInMap("ServiceId")
        private Long serviceId;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("Version")
        private String version;

        private RouteServices(Builder builder) {
            this.groupName = builder.groupName;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.percent = builder.percent;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.sourceType = builder.sourceType;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteServices create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return percent
         */
        public Integer getPercent() {
            return this.percent;
        }

        /**
         * @return serviceId
         */
        public Long getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String groupName; 
            private String name; 
            private String namespace; 
            private Integer percent; 
            private Long serviceId; 
            private String serviceName; 
            private String sourceType; 
            private String version; 

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
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
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * ServiceId.
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public RouteServices build() {
                return new RouteServices(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Comment")
        private Comment comment;

        @NameInMap("DefaultServiceId")
        private Long defaultServiceId;

        @NameInMap("DefaultServiceName")
        private String defaultServiceName;

        @NameInMap("DestinationType")
        private String destinationType;

        @NameInMap("DirectResponse")
        private DirectResponse directResponse;

        @NameInMap("DomainId")
        private Long domainId;

        @NameInMap("DomainIdList")
        private java.util.List < Long > domainIdList;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("DomainNameList")
        private java.util.List < String > domainNameList;

        @NameInMap("EnableWaf")
        private String enableWaf;

        @NameInMap("GatewayId")
        private Long gatewayId;

        @NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Predicates")
        private String predicates;

        @NameInMap("Redirect")
        private Redirect redirect;

        @NameInMap("RouteOrder")
        private Integer routeOrder;

        @NameInMap("RoutePredicates")
        private RoutePredicates routePredicates;

        @NameInMap("RouteServices")
        private java.util.List < RouteServices> routeServices;

        @NameInMap("Services")
        private String services;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Type")
        private String type;

        private Result(Builder builder) {
            this.comment = builder.comment;
            this.defaultServiceId = builder.defaultServiceId;
            this.defaultServiceName = builder.defaultServiceName;
            this.destinationType = builder.destinationType;
            this.directResponse = builder.directResponse;
            this.domainId = builder.domainId;
            this.domainIdList = builder.domainIdList;
            this.domainName = builder.domainName;
            this.domainNameList = builder.domainNameList;
            this.enableWaf = builder.enableWaf;
            this.gatewayId = builder.gatewayId;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.predicates = builder.predicates;
            this.redirect = builder.redirect;
            this.routeOrder = builder.routeOrder;
            this.routePredicates = builder.routePredicates;
            this.routeServices = builder.routeServices;
            this.services = builder.services;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public Comment getComment() {
            return this.comment;
        }

        /**
         * @return defaultServiceId
         */
        public Long getDefaultServiceId() {
            return this.defaultServiceId;
        }

        /**
         * @return defaultServiceName
         */
        public String getDefaultServiceName() {
            return this.defaultServiceName;
        }

        /**
         * @return destinationType
         */
        public String getDestinationType() {
            return this.destinationType;
        }

        /**
         * @return directResponse
         */
        public DirectResponse getDirectResponse() {
            return this.directResponse;
        }

        /**
         * @return domainId
         */
        public Long getDomainId() {
            return this.domainId;
        }

        /**
         * @return domainIdList
         */
        public java.util.List < Long > getDomainIdList() {
            return this.domainIdList;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainNameList
         */
        public java.util.List < String > getDomainNameList() {
            return this.domainNameList;
        }

        /**
         * @return enableWaf
         */
        public String getEnableWaf() {
            return this.enableWaf;
        }

        /**
         * @return gatewayId
         */
        public Long getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return predicates
         */
        public String getPredicates() {
            return this.predicates;
        }

        /**
         * @return redirect
         */
        public Redirect getRedirect() {
            return this.redirect;
        }

        /**
         * @return routeOrder
         */
        public Integer getRouteOrder() {
            return this.routeOrder;
        }

        /**
         * @return routePredicates
         */
        public RoutePredicates getRoutePredicates() {
            return this.routePredicates;
        }

        /**
         * @return routeServices
         */
        public java.util.List < RouteServices> getRouteServices() {
            return this.routeServices;
        }

        /**
         * @return services
         */
        public String getServices() {
            return this.services;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Comment comment; 
            private Long defaultServiceId; 
            private String defaultServiceName; 
            private String destinationType; 
            private DirectResponse directResponse; 
            private Long domainId; 
            private java.util.List < Long > domainIdList; 
            private String domainName; 
            private java.util.List < String > domainNameList; 
            private String enableWaf; 
            private Long gatewayId; 
            private String gatewayUniqueId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String name; 
            private String predicates; 
            private Redirect redirect; 
            private Integer routeOrder; 
            private RoutePredicates routePredicates; 
            private java.util.List < RouteServices> routeServices; 
            private String services; 
            private Integer status; 
            private String type; 

            /**
             * Comment.
             */
            public Builder comment(Comment comment) {
                this.comment = comment;
                return this;
            }

            /**
             * DefaultServiceId.
             */
            public Builder defaultServiceId(Long defaultServiceId) {
                this.defaultServiceId = defaultServiceId;
                return this;
            }

            /**
             * DefaultServiceName.
             */
            public Builder defaultServiceName(String defaultServiceName) {
                this.defaultServiceName = defaultServiceName;
                return this;
            }

            /**
             * DestinationType.
             */
            public Builder destinationType(String destinationType) {
                this.destinationType = destinationType;
                return this;
            }

            /**
             * DirectResponse.
             */
            public Builder directResponse(DirectResponse directResponse) {
                this.directResponse = directResponse;
                return this;
            }

            /**
             * DomainId.
             */
            public Builder domainId(Long domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * DomainIdList.
             */
            public Builder domainIdList(java.util.List < Long > domainIdList) {
                this.domainIdList = domainIdList;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * DomainNameList.
             */
            public Builder domainNameList(java.util.List < String > domainNameList) {
                this.domainNameList = domainNameList;
                return this;
            }

            /**
             * EnableWaf.
             */
            public Builder enableWaf(String enableWaf) {
                this.enableWaf = enableWaf;
                return this;
            }

            /**
             * GatewayId.
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * GatewayUniqueId.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
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
             * Predicates.
             */
            public Builder predicates(String predicates) {
                this.predicates = predicates;
                return this;
            }

            /**
             * Redirect.
             */
            public Builder redirect(Redirect redirect) {
                this.redirect = redirect;
                return this;
            }

            /**
             * RouteOrder.
             */
            public Builder routeOrder(Integer routeOrder) {
                this.routeOrder = routeOrder;
                return this;
            }

            /**
             * RoutePredicates.
             */
            public Builder routePredicates(RoutePredicates routePredicates) {
                this.routePredicates = routePredicates;
                return this;
            }

            /**
             * RouteServices.
             */
            public Builder routeServices(java.util.List < RouteServices> routeServices) {
                this.routeServices = routeServices;
                return this;
            }

            /**
             * Services.
             */
            public Builder services(String services) {
                this.services = services;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Result")
        private java.util.List < Result> result;

        @NameInMap("TotalSize")
        private Long totalSize;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.result = builder.result;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < Result> result; 
            private Long totalSize; 

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
             * Result.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * TotalSize.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
